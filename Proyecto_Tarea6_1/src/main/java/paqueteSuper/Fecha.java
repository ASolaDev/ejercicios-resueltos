/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteSuper;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author isabel
 */
public class Fecha {
    //Metodo estatico para mostrar formateada la fecha de Nacimiento
    public static String fechaFormateada(LocalDate fecha){
        DateTimeFormatter mascaraFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String cadena = fecha.format(mascaraFecha);
        
        return cadena;
    }   
}
