/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqInterfaces;

import java.util.ArrayList;

/**
 *
 * @author isabel
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Alimentacion a1=new Alimentacion("Leche Pascual", 0.56);
        Alimentacion a2=new Alimentacion("Eko", 0.46);
        Alimentacion a3=new Alimentacion("Magdalenas La Colegiala", 1.23);
        
        Ropa r1=new Ropa("Bañador",23);
        Ropa r2=new Ropa("Toalla",5);
        
        Viaje viaje=new Viaje("Murcia","Jamaica",7, 2000);
        
        Carrito corteIngles=new Carrito();
        corteIngles.addCarrito(a1);
        corteIngles.addCarrito(a2);
        corteIngles.addCarrito(a3);
        corteIngles.addCarrito(r1);
        corteIngles.addCarrito(r2);
        corteIngles.addCarrito(viaje);
        
        corteIngles.mostrarCarrito();
        
        System.out.println("Precio Total a pagar es = "+corteIngles.precioTotalCarrito()+"€");
        
        corteIngles.mostrarViajes();
        
        System.out.println("");
        corteIngles.mostrarDestinoViajes();
        System.out.printf("%.1f",corteIngles.precioTotalCarrito()); 
    }
    
}
