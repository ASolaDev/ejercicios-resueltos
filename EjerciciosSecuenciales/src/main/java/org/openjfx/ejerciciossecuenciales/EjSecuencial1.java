/*PROGRAMA: AREA DE UN RECTÁNGULO
 *  ENTORNO
 *     base, altura, area variables numéricas enteras (pueden ser reales)
 *  ALGORITMO
 *      Escribir "Dime la base"
        Leer base
        Escribir "Dime la altura"
        Leer base
        area <- base * altura
        Escribir "El area es: "
        Escribir area
 *
 */
package org.openjfx.ejerciciossecuenciales;

import java.util.Scanner;

public class EjSecuencial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
       int base, altura, area;
       
        System.out.println("Dime la base: ");
        cadena=teclado.nextLine();
        base=Integer.parseInt(cadena);
        
        System.out.println("Dime la altura: ");
        cadena=teclado.nextLine();
        altura=Integer.parseInt(cadena);
        
        area = base * altura;
        
        System.out.println("El área del rectángulo es: "+area);
        
    }
    
}
