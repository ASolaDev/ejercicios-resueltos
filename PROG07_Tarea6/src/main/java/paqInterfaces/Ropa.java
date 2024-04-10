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
public class Ropa extends Producto {
    protected static double iva=0.1;

    public Ropa(String nombre, double precio) {
        super(nombre, precio);
    }

    public static double getIva() {
        return Ropa.iva;
    }

    @Override
    public String toString() {
        return super.toString()+"Ropa {" + "iva=" + Ropa.iva + '}';
    }
    
    @Override
    public double precioIva(){
        return this.precio*1.1;
    }
    
}
