/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
PROGRAMA: MAYOR DE DOS O IGUALES
ENTORNO
 a,b variable numérica entera
ALGORITMO
 Escribir "Dime un número:"
 Leer a
 Escribir "Dime otro número:"
 Leer b
 Si (a==b) entonces
    Escribir "Iguales"
 Sino
    Si (a>b) entonces
       Escribir "Es mayor:"+a
    Sino
       Escribir "Es mayor: "+b
    FinSi
 FinSi

 * 
*/
package com.mycompany.proyecto_prog04_tarea01;

import java.util.Scanner;

public class EjCondicional19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String cadena;

        int a,b;
               
        System.out.println("Dime un número: ");
        cadena=teclado.nextLine();
        a=Integer.parseInt(cadena);
        
        System.out.println("Dime otro número: ");
        cadena=teclado.nextLine();
        b=Integer.parseInt(cadena);
       
        if (a==b){
	     System.out.println("Son iguales");
        }  
        else if (a>b){
            System.out.println("Es mayor: "+a);
        }
        else{
            System.out.println("Es mayor: "+b);
        }
    }
    
}
