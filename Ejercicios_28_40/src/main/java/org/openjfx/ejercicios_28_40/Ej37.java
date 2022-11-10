/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
PROGRAMA EJ37
   ENTORNO     
     nota número real
     aprobados número entero
     suspensos número entero
     suma número real
   ALGORITMO
     
     suspensos <-0
     aprobados <-0
     suma <- 0.0

     Leer nota
     Mientras nota != -1 hacer
      //Hay que controlar que no sea inferior a -1 
        suma <- suma + nota
        Si (nota < 5) entonces
           suspensos <- suspensos + 1
        Sino
           aprobados <- aprobados + 1
        FinSi
        Leer nota
     FinMientras
     Mostrar "Hay" + suspensos + "suspensos"
     Mostrar "Hay" + aprobados + "aprobados"
     Mostrar "Media aritmética de notas: "+ (suma/(suspensos+aprobados))


 */
package org.openjfx.ejercicios_28_40;

import java.util.Scanner;

public class Ej37 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       int aprobados, suspensos;
       double nota, suma;
       
       aprobados=0;
       suspensos=0;
       suma=0.0f;
       
        System.out.println("Dime la nota: ");
        nota=teclado.nextInt();
       while (nota!=-1){
         if (nota < -1) nota=-1;
         else{
            suma+=nota;
           
           if (nota <5) suspensos=suspensos +1;
           else aprobados= aprobados +1;
           System.out.println("Dime tu nota: ");
           nota=teclado.nextDouble(); 
         }           
       }
        System.out.println("Hay "+suspensos+" suspensos");
        System.out.println("Hay "+aprobados+" aprobados");
        System.out.println("Media aritmética : "+ (suma/(suspensos+aprobados)));
    }
    
}
