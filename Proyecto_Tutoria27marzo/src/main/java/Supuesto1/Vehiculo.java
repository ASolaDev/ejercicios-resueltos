/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supuesto1;

import java.time.LocalDate;

/**
 *
 * @author isabel
 */
public class Vehiculo implements Alquilable{
    protected String marca;
    protected String modelo;
    protected String matricula;    
    protected boolean alquilado=false;
    protected LocalDate fechaAlquiler;
    protected LocalDate fechaDevolucion;
    protected float precioAlquiler=0;

    public Vehiculo(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

        @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + ", alquilado=" + alquilado + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", precioAlquiler=" + precioAlquiler + '}';
    }
    
    @Override
    public void alquilar()throws IllegalArgumentException{
        if (this.alquilado) throw new IllegalArgumentException("Ya alquilado");
        System.out.println("Alquilando vehiculo: "+this.matricula);
    }    
}
