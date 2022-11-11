/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.openjfx.martes_8_noviembre;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class Ppal_Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cadena;
        
        System.out.println("Dime el número: ");
        cadena=teclado.nextLine();
        int n= Integer.parseInt(cadena);
        
       
        int x=(int)MisMetodos.factorial(n);
        System.out.println("El factorial de "+n+" es "+x);
        
        
        System.out.println("El factorial del 7 es: "+MisMetodos.factorial(7));
        
        
        //Mostrar el factorial de 1, 2, 3, 4 y 5
        
        for (int i = 1; i <= 25; i++) {
            System.out.println("El factorial de "+i+" es "+MisMetodos.factorial(i));
        }
        
         
        
        
        
    }
    
}
