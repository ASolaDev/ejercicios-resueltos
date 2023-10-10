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
public class MiPrimerProyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Scanner teclado=new Scanner(System.in);
        String cadena;
        
        System.out.print("Dime la base: ");
        cadena=teclado.nextLine();
        double base=Double.parseDouble(cadena);
                      
        System.out.print("Dime la altura: ");
        cadena=teclado.nextLine();
        double altura=Double.parseDouble(cadena);
        
        double area= base * altura;
        System.out.println("Area es: "+area);
        
    }
    
}
