/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: PAR O IMPAR
ENTORNO:
 n variable numérica entera
ALGORITMO:
 Escribir "Dime un número:"
 Leer n
 Si (n%2==0) entonces
    Escribir n + "es par"
 Sino
    Escribir n + "es impar"
 FinSi
 */

package com.mycompany.proyecto_prog04_tarea01;

import java.util.Scanner;


public class EjCondicional12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String cadena;

        int n;
               
        System.out.println("Dime un número: ");
        cadena=teclado.nextLine();
        n=Integer.parseInt(cadena);
       
        if (n%2 == 0){
            System.out.println(n+ " es par");
        }
        else {
             System.out.println(n+ " es impar");
        }
    }
    
}
