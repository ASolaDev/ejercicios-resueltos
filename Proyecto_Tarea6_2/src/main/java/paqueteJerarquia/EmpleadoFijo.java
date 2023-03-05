/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteJerarquia;

import java.time.LocalDate;
import java.time.Period;
import paqueteOtros.Nie;
import paqueteOtros.Nif;

/**
 *
 * @author isabel
 */
//Los empleados fijos, reciben un sueldo semanal fijo, sin importar el número de horas trabajadas.
//Dicho salario es 500€.
//Por cada trienio se incrementa en 20€
public class EmpleadoFijo extends Empleado{
    protected static int SALARIO_SEMANAL=500;
    protected static int INCREMENTO_TRIENIO=20;

   
    public EmpleadoFijo(Nif nif, Nie nie, String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IllegalArgumentException{
        super(nif, nie, nombre, apellidos, fechaNac, fechaTrabajo);
    }
        
    public int trienios(){
       LocalDate ahora=LocalDate.now();
       Period p=Period.between(this.fechaTrabajo,ahora);
       return (p.getYears()/3);
    }

    public static int getSALARIO_SEMANAL() {
        return SALARIO_SEMANAL;
    }

    public static int getINCREMENTO_TRIENIO() {
        return INCREMENTO_TRIENIO;
    }
    
     public static void setSALARIO_SEMANAL(int SALARIO_SEMANAL) {
        EmpleadoFijo.SALARIO_SEMANAL = SALARIO_SEMANAL;
    }

    public static void setINCREMENTO_TRIENIO(int INCREMENTO_TRIENIO) {
        EmpleadoFijo.INCREMENTO_TRIENIO = INCREMENTO_TRIENIO;
    }

    
    @Override
    public float calculaSueldo(){
        return this.sueldo=EmpleadoFijo.SALARIO_SEMANAL + EmpleadoFijo.INCREMENTO_TRIENIO * this.trienios();
    }  

}
