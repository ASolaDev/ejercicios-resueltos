/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.openjfx.martes_8_noviembre;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class Introducir {
    //Va a contener métodos para introducir enteros, reales, String, char
    
    public static int entero(String msg){
        Scanner teclado=new Scanner(System.in);
        String cadena;
        int n=0;
        
        boolean numeroBien=false;
        
        do{
         try{
            System.out.println(msg);
            cadena=teclado.nextLine();
            n= Integer.parseInt(cadena); 
            numeroBien=true;              
           }catch(NumberFormatException e){
              System.out.println("Error, no has introducido un número...");           
           }
        }while(numeroBien==false);
        
        return n;
    }
    
    public static float  real(String msg){
        Scanner teclado=new Scanner(System.in);
        String cadena;
        
        System.out.println(msg);
        cadena=teclado.nextLine();
        float n= Float.parseFloat(cadena);   
        
        return n; 
    }
    
}
