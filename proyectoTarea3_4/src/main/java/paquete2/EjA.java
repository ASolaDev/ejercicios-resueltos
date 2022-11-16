/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author miry_
 */
public class EjA 
{
    public static void main(String[] args) 
    {
        Scanner teclado;
        teclado=new Scanner(System.in);
        
        System.out.println("Introduce una letra: ");
        String cadena=teclado.nextLine();
        char c=cadena.charAt(0);        
       
        System.out.println("El Unicode para el carácter "+cadena+" es "+(int)c);       
    }    
}
