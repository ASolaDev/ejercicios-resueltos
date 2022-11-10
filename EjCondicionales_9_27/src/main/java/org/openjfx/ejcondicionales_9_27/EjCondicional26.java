/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: MENOR DE TRES NUMEROS
ENTORNO:
 a,b,c variables numéricas enteras
ALGORITMO:
 Escribir "Dime un número:"
 Leer a
 Escribir "Dime un número:"
 Leer b
 Escribir "Dime un número:"
 Leer c

 Si (a<b) entonces
    Si (b<c) entonces
       Escribir "Menor es: "+a
    Sino
      Si (a<c) entonces
        Escribir "Menor es: "+a
      Sino
        Escribir "Menor es: "+ c
    FinSi
 SiNo
   Si (b<c) entonces
      Escribir "Menor es: "+b
   Sino
      Escribir "Menor es: "+c
   FinSI
 FinSI
 */
package org.openjfx.ejcondicionales_9_27;

import java.util.Scanner;


public class EjCondicional26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado=new Scanner(System.in);
        String cadena;

        int a,b,c;
               
        System.out.println("Dime un número: ");
        cadena=teclado.nextLine();
        a=Integer.parseInt(cadena);
        
        System.out.println("Dime otro número: ");
        cadena=teclado.nextLine();
        b=Integer.parseInt(cadena);
        
        System.out.println("Dime otro número: ");
        cadena=teclado.nextLine();
        c=Integer.parseInt(cadena);
       
        if (a<b){
	     if (b<c) System.out.println("Menor es: "+a);
             else if (a<c) System.out.println("Menor es "+a);
             else System.out.println("Menor es "+c);
        }  
        else if (b<c) System.out.println("Menor es "+b);
        else System.out.println("Menor es "+c);
       
    }
    
}
