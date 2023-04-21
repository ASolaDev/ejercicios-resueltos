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
public class Carrito {
    private ArrayList <Vendible> listaCarrito;
    

    public Carrito() {
        this.listaCarrito=new ArrayList();
    }

    public ArrayList<Vendible> getListaCarrito() {
        return listaCarrito;
    }
    
    public void addCarrito(Vendible v){ //v=viaje;
        this.listaCarrito.add(v);
    }
    
    public void mostrarCarrito(){
        System.out.println("LISTA DE CARRITO");
        for(Vendible v: this.listaCarrito)
            System.out.println(v);
    }
    
    
    public double precioTotalCarrito(){
        double sumaPrecios=0;
        for(Vendible v: this.listaCarrito)
            sumaPrecios = sumaPrecios + v.precioIva();
        
        return sumaPrecios;
    }
    
    public void mostrarViajes(){
        System.out.println("LISTADO DE VIAJES");
        for(Vendible v: this.listaCarrito){
            if (v instanceof Viaje){
                System.out.println(v);
            }
        }        
    }
    
    
    public void mostrarDestinoViajes(){
        System.out.println("Destino de mis viajes -----------");
        
        for(Vendible v: this.listaCarrito)
        {
            if (v instanceof Viaje){
                System.out.println(((Viaje)v).getDestino());
            }
        }
    }
}
