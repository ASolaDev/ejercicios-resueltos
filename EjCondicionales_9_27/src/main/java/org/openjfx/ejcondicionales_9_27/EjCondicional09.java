/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.openjfx.ejcondicionales_9_27;

/*
 * PROGRAMA: EDAD ERRÓNEA
   ENTORNO:
    edad variable numérica entera
   ALGORITMO
    Escribir "Dime tu edad: "
    Leer edad
    Si edad <0 OR edad>130 entonces //supongamos que la edad máxima es 130
       Escribir "Edad errónea"
    FinSi
 */


import java.util.Scanner;


public class EjCondicional09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       String cadena;

        int edad;
               
        System.out.println("Dime tu edad: ");
        cadena=teclado.nextLine();
        edad=Integer.parseInt(cadena);
       
        if (edad <0 || edad>130){
            System.out.println("Edad errónea");
        }
    }
    
}
