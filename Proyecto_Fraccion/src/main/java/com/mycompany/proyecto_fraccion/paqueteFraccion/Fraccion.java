/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_fraccion.paqueteFraccion;

/**
 *
 * @author isabel
 */
public class Fraccion {
    private int num, den;

    //Constructor patron
    //La fraccion se reduce
    public Fraccion(int num, int den) {
        this.num = num;
        this.den = den;
        this.reducir();
    }

    public Fraccion(){
        this(1,1);
    }
    
    public Fraccion(Fraccion other){
        this(other.num, other.den);
    }
    
    
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getDen() {
        return den;
    }

    public void setDen(int den) {
        this.den = den;
    }
    
    //Metodos propios 
    //Reducir una fraccion
    private void reducir(){
        Fraccion.mcd(this.num,this.den);
    }
    
    //metodo estatico de la Fraccion, calcula 
    // el minimo comun divisor
    private static int mcd(int num1, int num2){
        int a = Math.max(num1, num2);
        int b = Math.min(num1, num2);
 
        int resultado = 0;
        do {
            resultado = b;
            b = a % b;
            a = resultado;
        } while (b != 0);
 
    return resultado;
    }
    
    //No se puede hacer porque en un metodo estatico nunca
    // se pueden utilizar objetos
    /*
    private static int mcd(Fraccion other){
        return this.mcd(other.num, other.den);
    }
    */

    @Override
    public String toString() {
        return "{" +  num + "/" + den + '}';
    }
    
    //Metodo sobrecargado equals - Patron
    public boolean equals(Fraccion other){
        if (this.num==other.num && this.den==other.den)
            return true;
        return false;
    }
    
    public boolean equals(int x, int y){
        return this.equals(new Fraccion(x,y));
    }
    
    //Metodo sobrecargado fraccionSuma
    //Metodo patron
    public Fraccion fraccionSuma(Fraccion other){
        Fraccion aux=new Fraccion();
        aux.num= this.num*other.den + this.den*other.num;
        aux.den= this.den*other.den;
        return aux;       
    }
    
    public Fraccion fraccionSuma(int x, int y){
        Fraccion aux=new Fraccion(x,y);
        return this.fraccionSuma(aux);
    }
    
    //Metodo sobrecargado fraccionResta
    //Metodo patron    
    public Fraccion fraccionResta(Fraccion other){
        Fraccion aux=new Fraccion(this.num*other.den - this.den*other.num, this.den*other.den);
        return aux;
    }
    
    public Fraccion fraccionResta(int x, int y){
        return this.fraccionResta(new Fraccion(x,y));
    }
    
    //Metodo sobrecargado fraccionProducto
    //Metodo patron
    public Fraccion fraccionProducto(int x, int y){
        Fraccion aux=new Fraccion(this.num*x,this.den*y);
        return aux;
    }

    public Fraccion fraccionProducto(Fraccion other){
        return this.fraccionProducto(other.num, other.den);
    }
    
    //Metodo sobrecargado fraccionCociente
    //Metodo patron
    public Fraccion fraccionCociente(int x, int y){        
        return new Fraccion(this.num*y,this.den*x);
    }

    public Fraccion fraccionCociente(Fraccion other){
        return this.fraccionCociente(other.num, other.den);
    }   
    
}
