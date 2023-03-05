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
public class EmpleadoHoras extends Empleado{
    protected int numHoras;
    protected final static int PAGO_HORA=10;
    protected final static int PAGO_EXTRA=20;

    public EmpleadoHoras(int numHoras, Nif nif, Nie nie, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IllegalArgumentException{
        super(nif, nie, nombre, apellidos, fechaNac, fechaTrabajo);
        if (numHoras <= 0){
            throw new IllegalArgumentException("Error, las horas han de ser positivas");
        }
        this.numHoras = numHoras;
    }
    
    //Getter
    public int getNumHoras() {
        return numHoras;
    }

    public static int getPAGO_HORA() {
        return PAGO_HORA;
    }

    public static int getPAGO_EXTRA() {
        return PAGO_EXTRA;
    }
    
    //Setter
    public void setNumHoras(int numHoras) throws IllegalArgumentException{
        if (numHoras <= 0){
            throw new IllegalArgumentException("Error en el numero de horas, ha de ser positivas");
        }
        this.numHoras = numHoras;
    }

    //10€ hora normal, 20€ hora extra
    @Override
    public float calculaSueldo() {
        if (this.numHoras > 40){
            this.sueldo= EmpleadoHoras.PAGO_HORA*40 + EmpleadoHoras.PAGO_EXTRA*(this.numHoras-40);
        }
        else{
            this.sueldo= this.numHoras*EmpleadoHoras.PAGO_HORA;
        }
        return this.sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+" Numero de Horas=" + this.numHoras;
    }        
}
