/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prog02_tarea02;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class PROG02_Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Dado un número de segundos, muestre en pantalla cuántos minutos, horas y días contiene//
       
        //ENTORNO
      Scanner teclado=new Scanner(System.in); //Recordad que hay que importar Scanner
      String cadena; 
      
      int sg;
      
     // Ahora, introducimos los segundos por teclado
      System.out.print("Introduce los segundos: "); 
        cadena=teclado.nextLine();
        sg=Integer.parseInt(cadena);
      
      // Un minuto tiene 60 sg, una hora: 3600 sg y un dia: 86400 sg
      int dias = sg / 86400;  
      int restoSg = sg % 86400; 
      
      int horas= restoSg / 3600;
      restoSg = restoSg % 3600;
      
      int minutos = restoSg / 60;
      restoSg = restoSg % 60;
      
        System.out.print("Los segundos introducidos corresponden a "+dias+" dias, "+horas+" horas, ");
        System.out.println(minutos+" minutos y "+restoSg+" segundos");
      
        //1. Probadlo con 60sg -> 1 minutos y 0 segundos
        //2. Con 61sg -> 1 minuto y 1 segundos
        //3. Con 3600sg -> 1 horas, 0 minutos y 0 segundos
        //4. Con 3660sg -> 1 horas, 1 minutos y 0 segundos
        //5. Con 3661sg -> 1 horas, 1 minutos y 1 segundos
        //6. Con 86400sg -> 1 dias, 0 horas, 0 minutos y 0 segundos 
        //7. Con 87000sg -> 1 dias, 1 horas, 0 minutos y 0 segundos
        // ....
      
     
    }
    
}
