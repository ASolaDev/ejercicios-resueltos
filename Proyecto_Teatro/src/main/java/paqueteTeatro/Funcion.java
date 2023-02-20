/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteTeatro;

/**
 *
 * @author isabel
 */
public class Funcion {   
    private String nombre;
    private int precio;
    
    public Funcion(String nombre, int precio)throws IllegalArgumentException{
        this.nombre=nombre;
        if(precio<0) throw new IllegalArgumentException("Precio negativo");
        this.precio=precio;
    }
    public Funcion(){
        this("",0);
    }
    public Funcion(Funcion f)throws IllegalArgumentException{
        this(f.nombre,f.precio);
    }
    public String getNombreFuncion(){
        return this.nombre;
    }
    public int getPrecioFuncion(){
        return this.precio;
    }
    public void setNombreFuncion(String nombre){
        this.nombre=nombre;
    }
    public void setPrecioFuncion(int precio)throws IllegalArgumentException{
        if(precio<0) throw new IllegalArgumentException("Precio negativo");
        this.precio=precio;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.nombre+"\nPrecio: "+precio;
    }
}

