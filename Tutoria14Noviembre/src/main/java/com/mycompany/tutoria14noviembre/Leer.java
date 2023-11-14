/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutoria14noviembre;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class Leer {
    public static int entero(String mensaje){
        Scanner teclado = new Scanner(System.in);
        String cadena;
        
        int x=0;
        boolean fallo = true;
        
        while (fallo)
        {
          try{
            System.out.println(mensaje);
            cadena=teclado.nextLine();
            x=Integer.parseInt(cadena);
            fallo = false;
          }
          catch(NumberFormatException ne){
            System.out.println("Error, no es un número entero positivo, vuelve a introducir ");
          }
          
        }
        return x;        
    }
   
     public static double realDoble(String mensaje){
        Scanner teclado = new Scanner(System.in);
        String cadena;
        
        double x=0;
        boolean fallo = true;
        
        while (fallo)
        {
          try{
            System.out.println(mensaje);
            cadena=teclado.nextLine();
            x=Double.parseDouble(cadena);
            fallo = false;
          }
          catch(NumberFormatException ne){
            System.out.println("Error, no es un número real positivo, vuelve a introducir ");
          }
        }
        return x;        
    }
     
     
     public static String cadena(String mensaje){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println(mensaje);
        String cadena = teclado.nextLine();
        
        return cadena;
     } 
    
}
