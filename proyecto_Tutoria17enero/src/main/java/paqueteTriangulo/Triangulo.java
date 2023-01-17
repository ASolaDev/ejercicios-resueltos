/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteTriangulo;

/**
 *
 * @author isabel
 */
public class Triangulo {
    private int base;
    private int altura;

    //Constructor base
    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //Constructor por defecto
    public Triangulo(){
        this.base=this.altura=0;
    }
    
    //Constructor 2 catetos iguales a x
    public Triangulo (int x){
        this.base=this.altura=x;
    }
    
    //Constructor por Copia
    public Triangulo(Triangulo other){
        this.base=other.base;
        this.altura=other.altura;
    }
    
    //Metodos getter

    public int getBase() {
        return this.base;
    }

    public int getAltura() {
        return this.altura;
    }
    
    
    //Metodos setter

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //Metodo toString --- Llama al metodo hipotenusa() 

    @Override
    public String toString() {
        return "[" + "Base=" + this.base + " Altura=" + this.altura + " Hipotenusa="+this.hipotenusa()+']';
    }
    
    //Metodos propios
    public double hipotenusa(){
        return Math.hypot(this.base,this.altura);
    }
    
    public double perimetro(){
        return this.base+this.altura+this.hipotenusa();
    }
    
    public double area(){
        return (this.base*this.altura)/2.0;
    }
    
    //Metodo que aceptan como dato de entrada un objeto de tipo Triangulo
    
    //Metodo equals --- boolean equals(Triangulo other)
    // Esta sobrecargado y elijo como metodo base o patron
    public boolean equals (Triangulo other){
        boolean eq=false;
        if (this.base==other.base && this.altura==other.altura)
            eq=true;
        return eq;
    }
    
    //Metodo sobrecargado equals --- boolean equals(int base, int altura)
    //Lama al metodo equals patron -de arriba- 
    public boolean equals (int base, int altura){
        /*
        boolean eq=false;
        if (this.base==base && this.altura==altura)
            eq=true;
        return eq;
        */
        /*Una forma para llamar al metodo patron
        Triangulo aux=new Triangulo(base, altura);
        return this.equals(aux);
        */
        //Otra forma de llamar al metodo equals base seria:
        return this.equals(new Triangulo(base, altura));        
    }
    
    //Metodo que devuelve un objeto de tipo Triangulo
    // Triangulo clonar() --- devuelve un Triangulo con la misma base y altura 
    //           triangulo actual
    public Triangulo clonar(){
        Triangulo aux=new Triangulo(this.base, this.altura);
        return aux;
    }
    
    
}
