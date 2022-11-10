/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: SIGUIENTE SEGUNDO
ENTORNO:
h,m,s variables numéricas enteras
ALGORITMO:
  Escribir "Dime la hora:"
  Leer h
  Escribir "Dime los minutos:"
  Leer m
  Escribir "Dime los segundos:"
  Leer s

  s <- s+1
  Si (s==60) entonces
     s <- 0
     m <- m +1
     Si (m==60) entonces
         m <- 0
         h <- h + 1
         Si (h==24) entonces
             h <-0
         FinSi
     FinSi
   FinSi
   
   Escribir h + m + s

 */

package org.openjfx.ejcondicionales_9_27;

import java.util.Scanner;


public class EjCondicional25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        String cadena;

        int h,m,s;
               
        System.out.println("Dime la hora: ");
        cadena=teclado.nextLine();
        h=Integer.parseInt(cadena);
        
        System.out.println("Dime los minutos: ");
        cadena=teclado.nextLine();
        m=Integer.parseInt(cadena);
        
        System.out.println("Dime los segundos: ");
        cadena=teclado.nextLine();
        s=Integer.parseInt(cadena);
                
        s=s+1;
        if (s==60){
            s=0;
            m=m+1;
            if (m==60){
                m=0;
                h=h+1;
                if (h==24){
                    h=0;
                }
            }
        }
        
        System.out.println(h+":"+m+":"+s);
    }
    
}
