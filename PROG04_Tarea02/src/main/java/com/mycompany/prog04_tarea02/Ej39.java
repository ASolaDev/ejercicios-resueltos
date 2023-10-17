/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
PROGRAMA EJ38
   ENTORNO
     i número entero
     factorial número entero
   ALGORITMO
     factorial <-1 
     Desde i=1 hasta 7 hacer
        factorial <- factorial * i        
     FinMientras

     Mostrar factorial
 */
package com.mycompany.prog04_tarea02;

public class Ej39 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int factorial=1;
        for(int i=1; i<=7; i++) factorial*=i;
        System.out.println("El factorial de 7 es "+factorial);
    }
    
}
