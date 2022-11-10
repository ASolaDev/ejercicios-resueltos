/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 *PROGRAMA: SUMA DE DOS NUMEROS = TERCER NUMERO
ENTORNO
 a,b,c variables numéricas enteras
ALGORITMO
 Escribir "Dime un número:"
 Leer a
Escribir "Dime un número:"
 Leer b
Escribir "Dime un número:"
 Leer c
 Si ((a+b==c) || (a+c==b) || (b+c==a)) entonces
    Escribir "Uno de los números es igual a la suma de los otros dos números"
 Sino
    Escribir "Ningún número coincide con la suma de los otros dos números"
 FinSi 

 */

package org.openjfx.ejcondicionales_9_27;

import java.util.Scanner;

public class EjCondicional16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner teclado=new Scanner(System.in);
        String cadena;

        int a,b,c;
               
        System.out.println("Dime un número: ");
        cadena=teclado.nextLine();
        a=Integer.parseInt(cadena);
        
        System.out.println("Dime un número: ");
        cadena=teclado.nextLine();
        b=Integer.parseInt(cadena);
        
        System.out.println("Dime un número: ");
        cadena=teclado.nextLine();
        c=Integer.parseInt(cadena);
        
       if (((a+b==c) || (a+c==b) || (b+c==a))){
           System.out.println("Uno de los números es igual a la suma de los otros dos números");
       }
       else{
           System.out.println("Ningún número coincide con la suma de los otros dos números");
       }
    }
    
}
