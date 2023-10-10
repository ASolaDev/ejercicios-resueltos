/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria9octubre;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class BucleWhile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Introduce una serie de notas y para de introducir cuando hay un aprobado
        // Indica el numero de notas suspensas que se han introducido
        
        Scanner teclado=new Scanner(System.in);
        String cadena;
        int nota;
        
        System.out.print("Dime tu nota (0 a 10): ");
        cadena=teclado.nextLine();
        nota=Integer.parseInt(cadena);
        
        int contadorSuspensos = 0;
        while (nota < 5){ //la nota es suspenso
            System.out.println("Suspenso!!!");
            contadorSuspensos ++;// contadorSuspensos = contadorSuspensos +1; 
                                 // ++ contadorSuspensos; //contadorSuspensos += 1;
            
            System.out.print("Dime tu nota: ");
            cadena=teclado.nextLine();
            nota=Integer.parseInt(cadena);                     
        }
        
        System.out.println("Se han introducido "+contadorSuspensos+" suspensos antes de un aprobado");
    }
    
}
