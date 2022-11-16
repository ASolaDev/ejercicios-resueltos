/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

/**
 *
 * @author miry_
 */
public class EjB 
{
    public static void main(String[] args) 
    {
        System.out.println("El abecedario en español en mayúsculas:");
        for(char i='A'; i<='Z'; i++) 
        {
            if(i=='O') System.out.println("Ñ");
            System.out.println(i);
        }
        
        
        /*
        También:
        for(char i=65; i<=90; i++) 
        {
            if(i==79) {System.out.println("Ñ");
            System.out.println((char)i);
        }
        */
    }
    
}
