/*
 * PROGRAMA: LONGITUD DE UNA CIRCUNFERENCIA Y AREA DE UN CÍRCULO
    ENTORNO:
       radio variables numéricas enteras
       longitud, area variables numéricas reales
    ALGORITMO:
        Escribir "Dime el valor del radio: "
        Leer radio
        longitud  <- 2 * Math.PI * radio
        area <- Math.PI * radio * radio
        Escribir "La longitud de la circunferencia es : "+ longitud
        Escribir "El área del círculo es : "+ area
 */
package org.openjfx.ejerciciossecuenciales;

import java.util.Scanner;

public class EjSecuencial5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
       int radio;
       double longitud, area;
       
        System.out.println("Dime el valor del radio: ");
        cadena=teclado.nextLine();
        radio=Integer.parseInt(cadena);
        
        longitud = 2 * Math.PI * radio;
        area = Math.PI * radio * radio;
        
        System.out.println("La longitud de la circunferencia es "+longitud);
        System.out.println("El área del círculo es: "+area);
    }
    
}
