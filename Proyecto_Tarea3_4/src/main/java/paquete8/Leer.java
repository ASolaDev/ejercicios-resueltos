/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class Leer {
    public static int enteroPositivo(String mensaje){
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
            if (x>0)        
               fallo = false;
          }
          catch(NumberFormatException ne){
            System.out.println("Error, no es un número entero, vuelve a introducir ");
          }
          
        }
        return x;        
    }
   
     public static double realDoblePositivo(String mensaje){
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
            if (x>0)
                fallo = false;
          }
          catch(NumberFormatException ne){
            System.out.println("Error, no es un número real, vuelve a introducir ");
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
