/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteCirculo;

/**
 *
 * @author isabel
 */
public class Circulo {
    private Punto centro;
    private int radio;
    
    
    //Constructores
    //Patron
    public Circulo(Punto centro, int radio) throws IllegalArgumentException {
        this.setRadio(radio);
        /*
        if (radio < 0){
            throw new IllegalArgumentException("NO puedo crear un circulo cuyo radio sea negativo");
        }*/
        this.centro = centro;
        this.radio = radio;
    }
    
    public Circulo(int x, int y, int radio) throws IllegalArgumentException{
        this(new Punto(x,y),radio);
    }
    
    public Circulo(int radio) throws IllegalArgumentException {
        this(new Punto(0,0),radio);
    }
    
    public Circulo() throws IllegalArgumentException{
        this(new Punto(0,0),0);
    }
    
    public Circulo(Circulo other) throws IllegalArgumentException {
        this(other.centro,other.radio);
    }
    
    //Metodos Getter y Setter

    public Punto getCentro() {
        return centro;
    }

    public int getRadio() {
        return radio;
    }

    public void setCentro(Punto centro) {
        this.centro = centro;
    }

    //setCentro sobrecargado
    public void setCentro(int x, int y){
        this.centro=new Punto(x,y);
    }
    
    public void setRadio(int radio) throws IllegalArgumentException {   
        if (radio < 0){           
            throw new IllegalArgumentException("Error, radio negativo");
        }
        
        this.radio = radio;
    }
    
    //Metodos propios

    @Override
    public String toString() {
        return "[" + this.centro.toString() + ", Radio=" + this.radio + ']';
    }    
    
    public double longitud(){
        return 2*Math.PI*this.radio;
    }
    
    public double area(){
        return Math.PI*Math.pow(this.radio,2);
    }
    
    //Metodos sobrecargados distancia
    //distancia entre un circulo y otro circulo: other 
    // en realidad calcula la distancia del 
    // punto centro del circulo actual y el punto centro de other
    public double distancia(Circulo other){
        return this.centro.distancia(other.centro);
    }
    
    //distancia entre un punto considerado como dato de entrada y 
    // el punto centro del circulo actual
    public double distancia(Punto pto){
        return this.centro.distancia(pto);
    }
    
    //distancia entre dos coordenadas que conforman un punto como dato de entrada
    //  con el punto centro del circulo actual
    //uso como metodo patron el de arriba
    public double distancia(int x, int y){
        return this.distancia(new Punto(x,y));
    }
    
    
    
    //Metodos sobrecargados equals
    // comprobacion de si un circulo other considerado como dato de entrada
    // es igual al circulo actual
    public boolean equals(Circulo other){
        if (this.centro.equals(other.centro) && this.radio==other.radio)
            return true;
        else
            return false;
    }
    
    
    //comprobacion si un radio considerado como dato de entrada y un punto forman 
    // un circulo igual al circulo actual
    // llama al metodo equals de arriba
    public boolean equals(Punto pto, int r){
        return this.equals(new Circulo(pto, r));
    }
    
    //comprobacion si un radio considerado como dato de entrada y dos enteros que forman un punto
    // dan lugar a un circulo que es igual al circulo actual
    // llama al metodo equals primero
    public boolean equals(int x, int y, int r){
        return this.equals(new Circulo(new Punto(x,y),r));
    }
            
}
