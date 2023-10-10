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
public class ifElse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Determinar si un numero introducido por teclado es par o impar
        Scanner teclado=new Scanner(System.in);
        String cadena;
        
        System.out.print("Dime un numero: ");
        cadena=teclado.nextLine();
        int x=Integer.parseInt(cadena);
       
        
        if (x%2 == 0){
            System.out.println(x+" es par");
        }
        else{
            System.out.println(x+" es impar");
        }
        
        //Con operador ternario        
        cadena = (x%2 == 0)? " es par": " es impar";
        System.out.println(cadena);
         //--Alternativa
        System.out.println(((x%2==0)?" es par":" es impar"));
        
        //Tambien
        cadena = (x%2 == 0)? " es par": " es impar";
        System.out.println(x+cadena);
           //--Alternativa
        System.out.println(x+((x%2==0)?" es par":" es impar"));        
        
    }
    
}
