/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: NEGATIVO, POSITIVO O CERO
ENTORNO
 n variable numérica entera
ALGORITMO
 Escribir "Dime un número:"
 Leer n
 Si (n<0) entonces
    Escribir "Negativo"
 Sino
    Si (n==0) entonces
       Escribir "Es cero"
    Sino
       Escribir "Es positivo"
    FinSi
 FinSi 
 */
package org.openjfx.ejcondicionales_9_27;

import java.util.Scanner;


public class EjCondicional18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado=new Scanner(System.in);
        String cadena;

        int n;
               
        System.out.println("Dime un número: ");
        cadena=teclado.nextLine();
        n=Integer.parseInt(cadena);
       
        if (n<0){
	     System.out.println("Es negativo");
        }  
        else if (n==0){
            System.out.println("Es cero");
        }
        else{
            System.out.println("Es positivo");
        }
    }
    
}
