/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
PROGRAMA EJ40
   ENTORNO     
     nota número real
     hay10 boolean
   ALGORITMO
     hay10 <-false
     
     Leer nota
     Mientras nota != -1 hacer
      //Hay que controlar que no sea inferior a -1 
        
        Si (nota == 10) entonces
           hay10 <- true
        FinSi
        Leer nota
     FinMientras
     
     Si (hay10==true) entonces
        Mostrar "Sí, hay al menos un 10"
     sino
        Mostar "No hay 10"
     FinSi

 */
package org.openjfx.ejercicios_28_40;

import java.util.Scanner;

public class Ej40 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
       double nota;
       boolean hay10=false;
       
       System.out.println("Dime la nota: ");
       nota=teclado.nextInt();
       while (nota!=-1){
         if (nota < -1) nota=-1;
         else{           
           if (nota == 10) hay10=true;
           
           System.out.println("Dime tu nota: ");
           nota=teclado.nextDouble(); 
         }           
       }
        
        System.out.println((hay10)?"Sí, al menos hay un 10":"No hay 10"); 
    }
    
}
