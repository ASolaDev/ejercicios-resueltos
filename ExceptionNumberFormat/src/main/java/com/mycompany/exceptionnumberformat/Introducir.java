/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionnumberformat;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class Introducir {
    
    public static int entero(String mensaje){
        Scanner teclado=new Scanner (System.in);
        String cadena;
        int x=0;
        boolean correcto=false;
        
        do{
           try{
               System.out.print(mensaje);
               cadena=teclado.nextLine();
               x=Integer.parseInt(cadena);
               correcto=true;
           }
           catch(NumberFormatException ex){
            System.out.println("Te has equivocado, debe ser un numero entero...");
           }
        }while (!correcto);  
        
        return x;
    }
    
}
