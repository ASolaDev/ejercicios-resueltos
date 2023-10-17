/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
PROGRAMA EJ33
   ENTORNO
     i número entero
     nota número real
     aprobados número entero
     suspensos número entero
   ALGORITMO
     i<-1 
     suspensos <-0
     aprobados <-0
     Mientras i <= 15 hacer
        Pedir nota
        Si (nota < 5) entonces
           suspensos <- suspensos + 1
        Sino
           aprobados <- aprobados + 1
        FinSi
        i <- i + 1
     FinMientras
     Mostrar "Hay" + suspensos + "suspensos, siendo un porcentaje de "+ (suspensos*100)/15.0
     Mostrar "Hay" + aprobados + "aprobados, siendo un porcentaje de "+ (aprobados*100)/15.0
 */
package com.mycompany.prog04_tarea02;

import java.util.Scanner;

public class Ej33 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int i, aprobados, suspensos;
       double nota;
       
       aprobados=0;
       suspensos=0;
       i=1;
       while (i<=15){
           System.out.println("Dime tu nota: ");
           nota=teclado.nextDouble();
           
           if (nota <5) suspensos=suspensos +1;
           else aprobados= aprobados +1;
           i=i+1;
       }
        System.out.println("Hay "+suspensos+" suspensos y representan un "+(suspensos*100)/15.0+"%");
        System.out.println("Hay "+aprobados+" aprobados y representan un "+(aprobados*100)/15.0+"%");
    }
    
}
