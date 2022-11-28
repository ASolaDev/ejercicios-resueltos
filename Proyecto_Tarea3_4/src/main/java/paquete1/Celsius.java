/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package paquete1;

import java.util.Scanner;

/**
 *
 * @author miry_
 */
public class Celsius 
{

    public static void main(String[] args) 
    {
        Scanner teclado=new Scanner(System.in);
        String cadena;
        double celsius, fahrenheit, sumaCelsius=0, sumaFahrenheit=0;
        
       
        for (int i=1; i<=7; i++) 
        {
            System.out.println("Introduzca la temperatura el dia "+i+" de agosto en Cº: ");
            cadena=teclado.nextLine();
            celsius=Double.parseDouble(cadena);
            
            fahrenheit=(9.0/5.0)*celsius+32;
            System.out.println(celsius+" Cº equivalen a "+fahrenheit+" Fº");
            
            sumaCelsius+=celsius;
            sumaFahrenheit+=fahrenheit;  
        }
       
        System.out.println("La temperatura media de toda la semana es de: ");
        System.out.println(sumaCelsius/7+" Cº "+sumaFahrenheit/7+" Fº");
         
    }
}
