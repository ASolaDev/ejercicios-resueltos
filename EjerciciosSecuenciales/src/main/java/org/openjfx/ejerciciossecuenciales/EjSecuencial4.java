/*
 * PROGRAMA: IMC
    ENTORNO:
       peso, altura, imc variables numéricas reales
    ALGORITMO:
        Escribir "Dime tu altura (en metros)"
        Leer altura
        Escribir "Dime tu peso (en kgr)"
        Leer peso
        imc  <- peso/(altura * altura)
        Escribir "Tu imc es : "+ imc

 */
package org.openjfx.ejerciciossecuenciales;

import java.util.Scanner;

public class EjSecuencial4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
       double altura, peso, imc;
       
        System.out.println("Dime tu peso: ");
        cadena=teclado.nextLine();
        peso=Double.parseDouble(cadena);
        
        System.out.println("Dime el valor del cateto 2: ");
        cadena=teclado.nextLine();
        altura=Double.parseDouble(cadena);
        
        imc = peso /(altura * altura);
        
        System.out.println("El valor de tu índice de masa corporal es: "+imc);
    }
    
}
