/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

/**
 *
 * @author miry_
 */
public class EjC 
{
    public static void main(String[] args) 
    {
      System.out.println("El abecedario en español:");
      for (int i=97; i<=122; i++)
        {
            int mayuscula=i-32;
            if((char)i=='o') System.out.println("ñ Ñ");
            System.out.println((char)i+" "+(char)mayuscula);
        }
    }
    
}
