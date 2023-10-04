/*
 * PROGRAMA: EUROS A DOLARES
    ENTORNO: 
     euros, cotizacion, dolares variables numéricas reales
    ALGORITMO:
        Escribir "Dime el valor de los euros: "
        Leer euros
        Escribir "Dime la cotización actual de euros a dólares: "
        Leer cotizacion
        dolares <- euros * cotizacion
        Escribir "Total de dólares: "+ dolares

 */
package org.openjfx.ejerciciossecuenciales;

import java.util.Scanner;

public class EjSecuencial7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
       String cadena;

        double euros, cotizacion, dolares;
               
        System.out.println("Dime los euros: ");
        cadena=teclado.nextLine();
        euros=Double.parseDouble(cadena);
        
        System.out.println("Dime la cotización actual de euros a dólares: ");
        cadena=teclado.nextLine();
        cotizacion=Double.parseDouble(cadena);
        
        dolares = euros * cotizacion;
        
        System.out.println("Total de dólares: "+dolares+"$");
    }
    
}
