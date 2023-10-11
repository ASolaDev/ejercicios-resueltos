/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: NOTA EN NUEVA ZELANDA
ENTORNO:
nota variable carácter
ALGORITMO
  Escribir "Dime el valor de la nota: "
  Leer nota
  Dependiendo de nota
     si 'A': Esscribir "Sobresaliente"
     si 'B': Escribir "Notable"
     si 'C': Escribir "Entre el 6 y 5"
     si 'D': Escribir "Insuficiente"
     si 'E': Escribir "Nota de 0, 1 ó 2"
     por defecto:  "Nota incorrecta"
  FinDependiendo
 
 */

package com.mycompany.proyecto_prog04_tarea01;

import java.util.Scanner;


public class EjCondicional24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cadena;

        char nota;
               
        System.out.println("Dime tu nota: ");
        cadena=teclado.nextLine();
        nota=cadena.charAt(0);
        
        switch(nota){
            case 'A':  System.out.println("Sobresaliente");break;
            case 'B':  System.out.println("Notable");break;
            case 'C':  System.out.println("Entre 5 y 6");break;
            case 'D': System.out.println("Insuficiente");break;
            case 'E': System.out.println("Nota de 0,1 ó 2");break;            
            default: System.out.println("Error, nota incorrecta");   
            
        }
    }
    
}
