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
public class switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Determinar en funcion de un numero introducido por teclado el nombre 
        // la nota que has sacado
        //Indica el caso de que la nota sea incorrecta
        Scanner teclado=new Scanner(System.in);
        String cadena;
        
        System.out.print("Dime un numero de la semana en el que nos encontramos: ");
        cadena=teclado.nextLine();
        int x=Integer.parseInt(cadena);
       
        switch (x){
            case 1 :
            case 2: 
            case 3: 
            case 4: System.out.println("Suspenso");break;
            case 5: System.out.println("Aprobado");break;
            case 6: System.out.println("Bien");break;
            case 7: case 8: System.out.println("Notable");break; 
            case 9: case 10: System.out.println("Sobresaliente");break;
            default: System.out.println("Nota incorrecta");
           }
    }
    
}
