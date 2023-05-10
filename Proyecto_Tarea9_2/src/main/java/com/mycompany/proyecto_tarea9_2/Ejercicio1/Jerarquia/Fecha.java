/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tarea9_2.Ejercicio1.Jerarquia;

import java.time.LocalDate;

/**
 *
 * @author isabel
 */
public class Fecha {
    
    //Metodo estatico para mostrar formateada la fecha de Nacimiento
    public static String fechaFormateada(LocalDate fecha){
        String cadena;
           int year = fecha.getYear();
           int mes = fecha.getMonthValue();
           int dia = fecha.getDayOfMonth();
           cadena=String.valueOf(dia)+"/"+String.valueOf(mes)+"/"+String.valueOf(year);
        return cadena;
    } 
   
}
