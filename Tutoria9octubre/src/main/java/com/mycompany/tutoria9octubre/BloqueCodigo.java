/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria9octubre;

/**
 *
 * @author isabel
 */
public class BloqueCodigo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=5;
        
        {
            System.out.println("Dentro del Bloque de Codigo");
            System.out.println("x="+x);
            int y=6;
            System.out.println("y="+y);
        }
        
        System.out.println("Fuera del Bloque de Codigo");
        System.out.println("x="+x);
       // System.out.println("y="+y);
    }
    
}
