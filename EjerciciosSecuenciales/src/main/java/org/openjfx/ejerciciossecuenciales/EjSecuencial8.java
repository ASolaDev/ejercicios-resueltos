/*
 * PROGRAMA: Salario neto
    ENTORNO:
      nombre variable cadena
      salario, horas, precioHora variables reales
ALGORITMO:
        Escribir "Dime tu nombre: "
        Leer nombre
        Escribir "Dime las horas que has trabajado: "
        Leer horas
        Escribir "Dime el precio por hora: "
        Leer precioHora
        salario <- (horas * precioHora) * 0.9
        Escribir "El salario es: "+ salario

 */
package org.openjfx.ejerciciossecuenciales;

import java.util.Scanner;


public class EjSecuencial8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cadena;
       
       String nombre;
       double salario, horas, precioHora;
       
        System.out.println("Dime tu nombre: ");
        nombre=teclado.nextLine();
                
        System.out.println("Dime el valor de las horas trabajadas: ");
        cadena=teclado.nextLine();
        horas=Double.parseDouble(cadena);
        
        System.out.println("Dime el valor del precio por hora: ");
        cadena=teclado.nextLine();
        precioHora=Double.parseDouble(cadena);
        
        salario = (horas * precioHora)* 0.9;
        
        System.out.println("El salario neto es : "+salario);
    }
    
}
