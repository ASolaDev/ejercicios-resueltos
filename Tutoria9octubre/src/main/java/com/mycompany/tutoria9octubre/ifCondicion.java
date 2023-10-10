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
public class ifCondicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Determinar si un numero introducido por teclado es 5
        Scanner teclado=new Scanner(System.in);
        String cadena;
        
        System.out.print("Dime un numero: ");
        cadena=teclado.nextLine();
        int x=Integer.parseInt(cadena);
        
        if (x==5){ //tambien se puede poner if ( !(x != 5) )
            System.out.println("En efecto, el numero es=5");
        }
    }
    
}
