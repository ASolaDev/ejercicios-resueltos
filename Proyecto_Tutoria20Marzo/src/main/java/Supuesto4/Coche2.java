/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supuesto4;

import java.time.LocalDate;

public class Coche2 extends Vehiculo2 implements Alquilable{
    private int numPuertas;
    private boolean alquilado=false;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private float precioAlquiler=0;
    
    public Coche2(int numPuertas, String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
        this.numPuertas = numPuertas;
    }
    
    @Override
    public void alquilar()throws IllegalArgumentException{
        if (this.alquilado) throw new IllegalArgumentException("Ya alquilado");
        System.out.println("Alquilando coche: "+this.matricula+" con "+this.numPuertas+" puertas.");
    }    
}
