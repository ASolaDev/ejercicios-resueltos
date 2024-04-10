/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteJerarquia;

import java.time.LocalDate;
import paqueteExcepciones.IdException;
import paqueteExcepciones.VentasException;
import paqueteInterfaces.Incentivable;

/**
 *
 * @author isabel
 */
public class EmpleadoComisiones extends Empleado implements Incentivable{
    protected float ventas;
    protected static int COMISION_VENTAS=10;
    protected boolean incentivado = false;

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

    public static int getCOMISION_VENTAS() {
        return COMISION_VENTAS;
    }

    public static void setCOMISION_VENTAS(int COMISION_VENTAS) {
        EmpleadoComisiones.COMISION_VENTAS = COMISION_VENTAS;
    }

    
    public boolean isIncentivado() {
        return incentivado;
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
    
    @Override
    public void premiar(){
        System.out.println("\nGRAN PREMIO POR VENTAS CONSEGUIDAS a "+this.nombre+" "+this.apellidos);    
    }
    
    @Override
    public void incentivar(float x){ //aquellos cuyo valor de ventas superen a x, se incrementa 3% su sueldo
       if (this.ventas > x){
        this.sueldo *=  1.03f;               
        this.incentivado=true;    
       } 
    }
    
}
