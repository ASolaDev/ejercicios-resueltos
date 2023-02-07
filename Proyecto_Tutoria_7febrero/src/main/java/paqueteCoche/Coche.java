/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteCoche;

/**
 *
 * @author isabel
 */
public class Coche {
    private String marca;
    private Colores color;
    private String cambio;
    private int numPuertas;
    private static String marcas[]={"SEAT","FIAT","MERCEDES"};
    
    //Constructor sobrecargado
    //Puede generar errores (excepciones) en: marca y/o numero de Puertas 
    public Coche(String marca, Colores color, String cambio, int numPuertas) throws IllegalArgumentException{
        this.setMarca(marca);
        this.color = color;
        this.cambio = cambio;
        this.setNumPuertas(numPuertas);
    }
    
    //Puede generar errores (excepciones) en: marca, color y/o numero de Puertas 
    public Coche(String marca, String strColor, String cambio, int numPuertas)throws IllegalArgumentException {
        this.setMarca(marca);
        this.setColor(strColor);
        this.cambio = cambio;
        this.setNumPuertas(numPuertas);
    }

    public void setMarca(String marca) throws IllegalArgumentException{
        marca=marca.toUpperCase();
        boolean existe=false;
        for (int i = 0; i < Coche.marcas.length; i++) {
            if (marca.equals(marcas[i])){
                existe=true;
                break;
            }
        }
        
        if (!existe){
            throw new IllegalArgumentException("Error, la marca "+marca+" NO esta definida en el grupo");
        }
        this.marca = marca;
    }  
        
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public void setNumPuertas(int numPuertas) throws IllegalArgumentException{
        if (numPuertas!=3 && numPuertas!=5){
            throw new IllegalArgumentException("Error, el numero de puertas ha de ser 3 o 5");
        }
        this.numPuertas = numPuertas;
    }

    //Metodo setColor sobrecargado
    public void setColor(Colores color) {
        this.color = color;
    }

    public void setColor(String strColor) throws IllegalArgumentException{
        try{
            this.color = Colores.valueOf(strColor);            
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException("Error, el color "+strColor+" NO esta definido en Colores");
        }
    }
    
    
    public String getMarca() {
        return marca;
    }

    public Colores getColor() {
        return color;
    }

    public String getCambio() {
        return cambio;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    @Override
    public String toString() {
        return "[Marca=" + marca + " Color=" + color + " Cambio=" + cambio + " Numero de Puertas=" + numPuertas + ']';
    }    
}
