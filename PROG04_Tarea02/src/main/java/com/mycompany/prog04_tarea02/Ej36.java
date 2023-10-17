/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
PROGRAMA EJ36
   ENTORNO
     i número entero
     nota número real
     aprobados número entero
     suspensos número entero
     suma número real
   ALGORITMO
     i<-1 
     suspensos <-0
     aprobados <-0
     suma <- 0.0
     Mientras i <= 15 hacer
        Pedir nota
        suma <- suma + nota
        Si (nota < 5) entonces
           suspensos <- suspensos + 1
        Sino
           aprobados <- aprobados + 1
        FinSi
        i <- i + 1
     FinMientras
     Mostrar "Hay" + suspensos + "suspensos"
     Mostrar "Hay" + aprobados + "aprobados"
     Mostrar "Media aritmética de notas: "+ (suma/15)

 */
package com.mycompany.prog04_tarea02;

import java.util.Scanner;

public class Ej36 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int i, aprobados, suspensos;
       double nota, suma;
       
       aprobados=0;
       suspensos=0;
       suma=0.0f;
       i=1;
       while (i<=15){
           System.out.println("Dime tu nota: ");
           nota=teclado.nextDouble();
           suma+=nota;
           
           if (nota <5) suspensos=suspensos +1;
           else aprobados= aprobados +1;
           i=i+1;
       }
        System.out.println("Hay "+suspensos+" suspensos");
        System.out.println("Hay "+aprobados+" aprobados");
        System.out.println("Media aritmética : "+ (suma/15));
    }
    
}
