/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteRopa;

/**
 *
 * @author isabel
 */
public class Ropa {
    private Marcas marca;
    private String lugarFabricacion;

    //Constructor sobrecargado
    public Ropa(Marcas marca, String lugarFabricacion) {
        this.marca = marca;
        this.lugarFabricacion = lugarFabricacion;
    }
    
    public Ropa(String marca, String lugarFabricacion) throws IllegalArgumentException{
        try{
            this.marca=Marcas.valueOf(marca);
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException("Error, NO existe la marca "+marca);
        }
        this.lugarFabricacion = lugarFabricacion;
    }
    
    public Ropa(){
        this(Marcas.CARBON,"Reyes Magos");
    }

    //Metodo setMarca sobrecargado
    public void setMarca(Marcas marca) {
        this.marca = marca;
    }
    
    public void setMarca(String marca) throws IllegalArgumentException {
        try{
            this.marca=Marcas.valueOf(marca);
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException("Error, NO existe la marca "+marca);
        }
    }

    public void setLugarFabricacion(String lugarFabricacion) {
        this.lugarFabricacion = lugarFabricacion;
    }

    
    public Marcas getMarca() {
        return marca;
    }

    public String getLugarFabricacion() {
        return lugarFabricacion;
    }

    @Override
    public String toString() {
        return "[Marca=" + marca + " Lugar de Fabricacion=" + lugarFabricacion + ']';
    }   
}
