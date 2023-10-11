/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: APROBADO O SUSPENSO
    ENTORNO:
      nota variable numérica entera
    ALGORITMO:
      Escribir "Dime tu nota:"
      Leer nota
      Si (nota < 0 || nota > 10) entonces
         Escribir "Nota incorrecta"
      Sino
         Si (nota<5) entonces
           Escribir "Suspenso"
         Sino
           Escribir "Aprobado"
         FinSi
      FinSi
 */

package com.mycompany.proyecto_prog04_tarea01;

import java.util.Scanner;


public class EjCondicional11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String cadena;

        int nota;
               
        System.out.print("Dime tu nota: ");
        cadena=teclado.nextLine();
        nota=Integer.parseInt(cadena);
       
        if (nota<0 || nota>10){
            System.out.println("Nota incorrecta");
        }
        else if (nota <5){
             System.out.println("Suspenso");
        }
        else{
        System.out.println("Aprobado");
        }
    }
    
}
