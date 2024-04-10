/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqInterfaces;

/**
 *
 * @author isabel
 */
public class Alimentacion extends Producto {
    protected static double iva=0.04;

    public Alimentacion(String nombre, double precio) {
        super(nombre, precio);        
    }

    public static double getIva() {
        return Alimentacion.iva;
    }

    @Override
    public String toString() {
        return super.toString()+ "Alimentacion {" + "iva=" + Alimentacion.iva + '}';
    }
    
    @Override
    public double precioIva(){
        return this.precio*1.04;
    }
    
    
    
    
}
