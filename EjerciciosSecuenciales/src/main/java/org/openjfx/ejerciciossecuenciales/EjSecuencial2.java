/* PROGRAMA: DOBLE DE UN NÚMERO
 * ENTORNO:
      n, doble variables numéricas enteras (podrían ser reales)
   ALGORITMO
      Escribir "Dime un número"
      Leer n
      doble  <- n * 2
      Escribir "El doble de "+n+" es "+doble
     
 */
package org.openjfx.ejerciciossecuenciales;

import java.util.Scanner;


public class EjSecuencial2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
       int n, doble;
       
        System.out.println("Dime un número: ");
        cadena=teclado.nextLine();
        n=Integer.parseInt(cadena);
        
        doble = n * 2;
        
        System.out.println("El doble de "+n+" es "+doble);
    }
    
}
