/*
 * PROGRAMA: HIPOTENUSA DE UN TRIÁNGULO RECTÁNGULO
    ENTORNO:
       cateto1, cateto2 variables numéricas enteras
       hipotenusa variable numérica real
    ALGORITMO
        Escribir "Dime el valor del cateto 1"
        Leer cateto1
        Escribir "Dime el valor del cateto 2"
        Leer cateto2
        hipotenusa  <- Math.hypot(base,altura)
        Escribir "El valor de la hipotenusa es: "+ hipotenusa
 */
package org.openjfx.ejerciciossecuenciales;

import java.util.Scanner;
public class EjSecuencial3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
       int cateto1, cateto2;
       double hipotenusa;
       
        System.out.println("Dime el valor del cateto 1: ");
        cadena=teclado.nextLine();
        cateto1=Integer.parseInt(cadena);
        
        System.out.println("Dime el valor del cateto 2: ");
        cadena=teclado.nextLine();
        cateto2=Integer.parseInt(cadena);
        
        hipotenusa = Math.hypot(cateto1, cateto2);
        
        System.out.println("El valor de la hipotenusa es: "+hipotenusa);
    }
    
}
