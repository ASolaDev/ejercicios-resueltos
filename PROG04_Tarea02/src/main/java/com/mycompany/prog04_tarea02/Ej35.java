/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
PROGRAMA EJ35
ENTORNO
  personas contador del bucle. Número entero
  edad número entero 
  ninos4, ninos4_12, adultos contadores de niños con edad inferior a 4 años, de 4 a 12 años y adultos
  caja número entero
ALGORITMO
   caja <- 0
   ninos4 <-0
   ninos4_12 <-0
   adultos <- 0
   personas <- 0

   Leer edad 
   Mientras edad != -1 Hacer
    Si (edad > - 1) entonces
     Si (edad<4) entonces
        ninos4 <- ninos4 +1
     SiNo Si (edad < 12) entonces
            ninos4_12 <- ninos4_12 +1
            caja <- caja + 20
     SiNo 
         adultos <- adultos + 1
         caja <- caja + 40
     FinSi
     personas <- personas + 1
     Leer edad
    SiNo 
       edad <- -1
    FinSi
   FinMientras

   Mostrar "Caja: "+caja
   Mostrar "Personas que han entrado "+personas
   Mostrar "Niños cuya edad es inferior a 4 años "+ ninos4
   Mostrar "Niños cuya edad está entre 4 y 12 años "+ ninos4_12
   Mostrar "Adultos "+ adultos

 */
package com.mycompany.prog04_tarea02;

import java.util.Scanner;

public class Ej35 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner teclado=new Scanner(System.in);
        int caja, ninos4, ninos4_12, adultos, personas, edad;
        caja=ninos4=ninos4_12=adultos=personas=0;
        
        System.out.println("Dime tu edad :");
        edad=teclado.nextInt();
        
        while (edad != -1){
            if (edad < -1 ) edad=-1;
            else{
                if (edad<4) ninos4++;
                else if (edad<12) {ninos4_12++; caja+=20;}
                else {adultos++; caja+=40;}
                
                personas++;
            
                System.out.println("Dime tu edad :");
                edad=teclado.nextInt();
            }
        }
        
        System.out.println("Caja: "+caja);
        System.out.println("Personas: "+personas);
        System.out.println("Niños con edad inferior a 4 años: "+ninos4);
        System.out.println("Niños con edad entre 4 y 12 años: "+ninos4_12);
        System.out.println("Adultos: "+adultos);
      
    }
    
}
