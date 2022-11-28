/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea4_1;

/**
 *
 * @author isabel
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    
    /*
    Calculad el número de días transcurridos desde el 1 de Enero
    hasta el 30 de junio en un año NO bisiesto. Con TRUCO
    */
    public static void main(String[] args) {
       String meses[]={"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septbre","Octbre","Novbre","Dcbre"};
       int dias[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
       
       int diasTranscurridos=0;
        for (int i = 1; i < 7; i++) //Desde i=1 (enero) hasta i=6 (junio)
        {
            diasTranscurridos+=dias[i];
        }
       
        System.out.println("Los días transcurridos desde el 1 de enero hasta el 30 de junio en un año no bisiesto es: "+diasTranscurridos);
       
    }
    
}
