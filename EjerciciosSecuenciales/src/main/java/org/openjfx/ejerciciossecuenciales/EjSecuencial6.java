/*
 * PROGRAMA: CALCULO DE LOS SEGUNDOS
    ENTORNO:
     h, m , s, total variables numéricas enteras
    ALGORITMO
        Escribir "Dime la hora: "
        Leer h
        Escribir "Dime los minutos: "
        Leer m
        Escribir "Dime los segundos: "
        Leer s
        total  <- h * 3600 + m * 60 + s
        Escribir "Total de segundos: "+ total
 */
package org.openjfx.ejerciciossecuenciales;

import java.util.Scanner;

public class EjSecuencial6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       String cadena;

        int h,m,s,total;
               
        System.out.println("Dime la hora: ");
        cadena=teclado.nextLine();
        h=Integer.parseInt(cadena);
        
        System.out.println("Dime los minutos: ");
        cadena=teclado.nextLine();
        m=Integer.parseInt(cadena);
        
        System.out.println("Dime los segundos: ");
        cadena=teclado.nextLine();
        s=Integer.parseInt(cadena);
        
        total = h * 3600 + m * 60 + s;
        
        System.out.println("Total de segundos: "+total);
    }
    
}
