/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: CALIFICACION 
ENTORNO:
  nota variable numérica real
ALGORITMO:
  Escribir "Dime tu nota: "
  Leer nota
  Si (nota <0 || nota>10) entonces
     Escribir "Nota incorrecta"
  Sino
    Si (nota<5) entonces
      Escribir "Suspenso"
    Sino 
      Si (nota<6) entonces
        Escribir "Aprobado"
      Sino
        Si (nota<7) entonces
          Escribir "Bien"
        Sino 
          Si (nota<9) entonces
             Escribir "Notable"
          Sino
             Escribir "Sobresaliente"
          Finsi
        FinSi
      FinSI
    FinSI
   FinSi
 */
package com.mycompany.proyecto_prog04_tarea01;

import java.util.Scanner;


public class EjCondicional21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        String cadena;

        double nota;
               
        System.out.println("Dime tu nota: ");
        cadena=teclado.nextLine();
        nota=Double.parseDouble(cadena);
       
        if (nota<0 || nota>10){
            System.out.println("Nota incorrecta");
        }
        else if (nota < 5){
            System.out.println("Suspenso");
        }
        else if (nota<6){
            System.out.println("Aprobado");
        }
        else if (nota<7){
            System.out.println("Bien");
        }
        else if (nota<9){
            System.out.println("Notable");
        }
        else {
            System.out.println("Sobresaliente");
        }
    }
    
}
