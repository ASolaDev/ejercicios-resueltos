/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supuesto6;

/**
 *
 * @author isabel
 */
public class Moto2 extends Vehiculo2 implements Vendible{
    private int cilindrada;
    private float precioVenta;
    private boolean vendido=false;

    public Moto2(int cilindrada, String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto2{" +super.toString()+ "cilindrada=" + cilindrada +'}';
    }   
    
    @Override
    public void vender(float precio) throws IllegalArgumentException{
        if (this.vendido) throw new IllegalArgumentException("Error, la moto ya esta vendida");
        System.out.println("Vendiendo la motor " +this.matricula+" .... por "+precio+"€");
    }
    
}
