/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea9_2.Ejercicio1;

import com.mycompany.proyecto_tarea9_2.Ejercicio1.Jerarquia.*;
import java.time.LocalDate;

/**
 *
 * @author isabel
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Generica <Empleado> ej1 = new Generica <Empleado>();
        
       EmpleadoFijo rai=new EmpleadoFijo(new Nif("00000001-R"),null, "Raimundo","Muñoz", LocalDate.of(1999,4,20),LocalDate.of(2020,4,20) );
       EmpleadoHoras tomas=new EmpleadoHoras(35,null, new Nie("X-0000001-R"), "Tomas","Escobar", LocalDate.of(1978,5,20),LocalDate.of(2021,8,21) );
       EmpleadoComisiones kevin=new EmpleadoComisiones(4000,null, new Nie("X-0000002-W"), "Kevin","Costa", LocalDate.of(1983,12,21),LocalDate.of(2017,12,21) );
       EmpleadoFijo pedro=new EmpleadoFijo(new Nif("12345678-Z"),null, "Pedro","Martinez", LocalDate.of(2000,5,1),LocalDate.of(2022,5,23) );
       EmpleadoHoras manuel=new EmpleadoHoras(49,new Nif("12345679-S"),null, "Manuel","Mosquera", LocalDate.of(2000,2,11),LocalDate.of(2022,5,23) );
       EmpleadoComisiones raquel=new EmpleadoComisiones(4500,new Nif("22345679-Y"),null, "Raquel","Vergara", LocalDate.of(2001,6,13),LocalDate.of(2021,5,21) );
       //anadir
       ej1.anadir(rai);
       ej1.anadir(tomas);
       ej1.anadir(kevin);
       ej1.anadir(pedro);
       ej1.anadir(manuel);
       ej1.anadir(raquel);
       //mostrar 
        System.out.println("\nGENERICA: "+ej1);
       //extraer
        System.out.println("Primer elemento a extraer: "+ej1.primero());
        
        
    }
    
}
