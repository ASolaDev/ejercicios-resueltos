/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePrincipal;

import paqueteSuperClase.Caja;




/**
 *
 * @author isabel
 */
public class CajaColor extends Caja{
    protected String color;
    
    public CajaColor(String color, int alto, int ancho, int profundo) {
        super(alto, ancho, profundo);
        this.color = color;
    }

    public CajaColor(String color, int x) {
        super(x);
        this.color = color;
    }

    public CajaColor(String color) {
        super();
        this.color = color;
    }

    public CajaColor(String color, Caja other) {
        super(other);
        this.color = color;
    }

    public CajaColor(CajaColor other){
        this(other.color, other.alto, other.ancho, other.profundo);
    }
    
           

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }    

    
    @Override
    public String toString() {
        return "[" + super.toString()+" Color=" + color + ']';
    }
    
    
}
