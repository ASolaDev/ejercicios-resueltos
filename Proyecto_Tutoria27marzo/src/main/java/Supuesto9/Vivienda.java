/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supuesto9;

import java.time.LocalDate;

/**
 *
 * @author isabel
 */
public class Vivienda implements Alquilable{
    private String numReferenciaCatastral;
    private String municipio;
    private String provincia;    
    private boolean alquilado=false;
    private LocalDate fechaAlquiler;
    private LocalDate fechaDevolucion;
    private float precioAlquiler=0;

    public Vivienda(String numReferenciaCatastral, String municipio, String provincia) {
        this.numReferenciaCatastral = numReferenciaCatastral;
        this.municipio = municipio;
        this.provincia = provincia;
    }

    public String getNumReferenciaCatastral() {
        return numReferenciaCatastral;
    }

    @Override
    public String toString() {
        return "Vivienda{" + "numReferenciaCatastral=" + numReferenciaCatastral + ", municipio=" + municipio + ", provincia=" + provincia + ", alquilado=" + alquilado + ", fechaAlquiler=" + fechaAlquiler + ", fechaDevolucion=" + fechaDevolucion + ", precioAlquiler=" + precioAlquiler + '}';
    }
    
    @Override
    public void alquilar()throws IllegalArgumentException{
        if (this.alquilado) throw new IllegalArgumentException("Ya alquilado");
        System.out.println("Alquilando vivienda: "+this.numReferenciaCatastral);
    }
    
    @Override
    public void saludo(){
        System.out.println("CIAO BENVENUTO");
    }
}
