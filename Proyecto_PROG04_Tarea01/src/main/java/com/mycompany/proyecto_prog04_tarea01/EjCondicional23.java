/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: DIA DE LA SEMANA
ENTORNO:
 n variable numérica entera
ALGORITMO:
  Escribir "Dime el número de día: "
  Leer n
  Dependiendo de n
     si 1: Esscribir "Lunes"
     si 2: Escribir "Martes"
     si 3: Escribir "Miércoles"
     si 4: Escribir "Jueves"
     si 5: Escribir "Viernes"
     si 6: Escribir "Sábado"
     si 7: Escribir "Domingo"
     por defecto:  "Día incorrecto"
  FinDependiendo
 */

package com.mycompany.proyecto_prog04_tarea01;

import java.util.Scanner;

public class EjCondicional23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado=new Scanner(System.in);
        String cadena;

        int n;
               
        System.out.println("Dime un número: ");
        cadena=teclado.nextLine();
        n=Integer.parseInt(cadena);
        
        switch(n){
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miércoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Error, día incorrecto");   
            
        }
    }
    
}
