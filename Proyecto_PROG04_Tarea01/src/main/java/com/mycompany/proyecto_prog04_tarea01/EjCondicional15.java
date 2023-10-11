/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 *PROGRAMA: NUMERO -10
ENTORNO
  n variable numérica entera
ALGORITMO
 Escribir "Dime un número:"
 Leer n
 Si (n==-10) entonces
    Escribir "Es -10"
 Sino
    Escribir "No es -10"
 FinSi 
 */
package com.mycompany.proyecto_prog04_tarea01;

import java.util.Scanner;


public class EjCondicional15 {

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
       
        if (n==-10)
	     System.out.println("Es -10");
        else
            System.out.println("No es -10");
    }
    
}
