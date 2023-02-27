/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteJerarquia;

import java.time.LocalDate;
import paqueteOtros.Nie;
import paqueteOtros.Nif;

/**
 *
 * @author isabel
 */
public class EmpleadoComisiones extends Empleado{
    private float ventas;
    private final static int COMISION_VENTAS=10;

    public EmpleadoComisiones(float ventas, Nif nif, Nie nie, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IllegalArgumentException{
        super(nif, nie, nombre, apellidos, fechaNac, fechaTrabajo);
        if (ventas <= 0){
            throw new IllegalArgumentException("Error, las ventas han de ser 0 o positivas");
        }
        this.ventas = ventas;        
    }

    public EmpleadoComisiones(Nif nif, Nie nie, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo){
        super(nif, nie, nombre, apellidos, fechaNac, fechaTrabajo);        
        this.ventas = 0;        
    }
    
    public float getVentas() {
        return ventas;
    }

    public void setVentas(float ventas) throws IllegalArgumentException {
        if (ventas <= 0){
            throw new IllegalArgumentException("Error, las ventas han de ser 0 o positivas");
        }
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return super.toString()+ " Ventas=" + ventas;
    }
    
    @Override
    public float calculaSueldo(){
        return (this.ventas*EmpleadoComisiones.COMISION_VENTAS)/100.0f;
    }
    
    
    
}
