/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteJerarquia;

import java.time.LocalDate;
import paqueteExcepciones.IdException;
import paqueteExcepciones.VentasException;

/**
 *
 * @author isabel
 */
public class EmpleadoComisiones extends Empleado{
    protected float ventas;
    protected static int COMISION_VENTAS=10;
    
    /*Al ser IdException superclase de NieException y NifException no es necesario poner las
      dos últimas ya que IdException engloba a sus excepciones hijas
    */ 
    public EmpleadoComisiones(float ventas, Object object, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IdException, VentasException{
        super(object, nombre, apellidos, fechaNac, fechaTrabajo);
        if (ventas <= 0){
            throw new VentasException("Error, las ventas han de ser 0 o positivas");
        }
        this.ventas = ventas;        
    }

    public EmpleadoComisiones(Object object, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IdException{
        super(object, nombre, apellidos, fechaNac, fechaTrabajo);        
        this.ventas = 0;        
    }
        
    public final float getVentas() {
        return ventas;
    }

    public final void setVentas(float ventas) throws VentasException {
        if (ventas <= 0){
            throw new VentasException("Error, las ventas han de ser 0 o positivas");
        }
        this.ventas = ventas;
    }

    @Override
    public String toString() {
        return super.toString()+ " Ventas=" + ventas;
    }
    
    @Override
    public float calculaSueldo(){       
        this.sueldo = (this.ventas*EmpleadoComisiones.COMISION_VENTAS)/100.0f;
        return this.sueldo;
    }
       
}
