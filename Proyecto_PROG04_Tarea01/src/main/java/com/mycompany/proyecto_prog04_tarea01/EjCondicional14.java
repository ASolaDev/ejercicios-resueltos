/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: AÑO BISIESTO
ENTORNO
 anio variable numérica entera
ALGORITMO:
 Escribir "Dime el año:"
 Leer anio
 Si (anio %4 ==0) entonces
    Si (anio%100!=0) || (anio%400==0) entonces
       Escribir "Es bisiesto"
    FinSi
  Sino
    Escribir "No es bisiesto"
 FinSi 
      
 */
package com.mycompany.proyecto_prog04_tarea01;

import java.util.Scanner;

public class EjCondicional14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String cadena;

        int anio;
               
        System.out.println("Dime el año: ");
        cadena=teclado.nextLine();
        anio=Integer.parseInt(cadena);
       
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	     System.out.println("El año es bisiesto");
        else
            System.out.println("El año no es bisiesto");
    }
    
}
