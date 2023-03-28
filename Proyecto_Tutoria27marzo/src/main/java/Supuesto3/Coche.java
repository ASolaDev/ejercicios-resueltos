/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supuesto3;

import java.time.LocalDate;

public class Coche extends Vehiculo{
    private int numPuertas;
    
    public Coche(int numPuertas, String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
        this.numPuertas = numPuertas;
    }   
    @Override
    public void alquilar()throws IllegalArgumentException{
        if (this.alquilado) throw new IllegalArgumentException("Ya alquilado");
        System.out.println("Alquilando coche: "+this.matricula+" con "+this.numPuertas+" puertas.");
    }
}
