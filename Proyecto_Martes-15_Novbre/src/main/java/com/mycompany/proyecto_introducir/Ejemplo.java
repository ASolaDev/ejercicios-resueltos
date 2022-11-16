/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_introducir;

/**
 *
 * @author isabel * 
 * 
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      /* Uso de 2 arrays unidimensionales: meses y dias
        el array meses contiene 12 elementos de tipo String, no puede ampliarse a 13 ó más, o reducirse. Se crea así
        el array dias contiene 12 elementos de tipo int. Guarda los días de cada mes
        Recordad siempre que meses[0] guarda el primer elemento del array meses
        y dias[0] guarda el valor del primer elemento del array dias
        */  
       String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septbre","Octbre","Novbre","Dcbre"};
       int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
       
       //El ejercicio consiste en calcular el total de días que tiene un año cualquiera, NO bisiesto
       int totalDias=0;
       
        for (int i = 0; i < meses.length; i++) {
            System.out.println("El mes "+meses[i]+" tiene "+dias[i]+" días");
            totalDias+=dias[i];            
        }
        
        System.out.println("Total de días que tiene un año no bisiesto: "+totalDias);
    }
    
}
