/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paqueteTriangulo;

/**
 *
 * @author isabel
 */
public class Triangulo {
    private int altura;
    private int base;

    //Operaciones
    // No hay Constructor, por lo que se utilizara el de por defecto, es decir
    // Las propiedades numericas son 0
    
    //1. Métodos getter --nos permiten devolver el valor de las propiedades privadas
    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

     //2. Métodos: setter --son métodos que nos permiten acceder desde fuera a las propiedades privadas
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
    //3.Metodo toString-> Devolver los valores del triangulo en formato String
    @Override
    public String toString() {
        String cadena="[Altura="+this.altura+"\tBase="+this.base+"\tHipotenusa="+this.hipotenusa()+"]";
        return cadena;    
    }    

    //4. Metodo equals (No pedido en el ejercicio)
    public boolean equals(Triangulo other) {
       boolean es=false;
       if (this.altura == other.altura && this.base == other.base)
           es=true;
       return es;
    }
    
    //5. Metodos propios 
    public double area() {
        return (this.base * this.altura) / 2.0;
    }
    
    //!!!! Cuidado!!! El metodo es privado
    private double hipotenusa() {
        double h;
        //h=Math.sqrt(Math.pow(this.altura, 2) + Math.pow(this.base, 2);
        h=Math.hypot(this.altura, this.base);
        return h;
    }
    
    public double perimetro() {
        return this.altura + this.base + this.hipotenusa();
    }

    public void duplicaTamano() {
        this.altura*=2;
        this.base*=2;
    }
    
    public void ampliaTamano(int ampliacion) {
        this.altura+=ampliacion;
        this.base+=ampliacion;
    }
}
