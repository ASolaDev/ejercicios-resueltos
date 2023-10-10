/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria9octubre;

/**
 *
 * @author isabel
 */
public class BucleWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Muestra por pantalla 10 veces "Bienvenido Mr Marshall"
       
       int contador = 0;
       while (contador < 10){
           System.out.println(" Bienvenido Mr Marshall");
           contador = contador + 1;
       }
       
        System.out.println("Contador ="+contador);
        
       //Alternativa
       contador = 1;
       while (contador <= 10){
           System.out.println(contador+"- Bienvenido Mr Marshall");
           contador = contador + 1;
       }
       
        System.out.println("Contador ="+contador);
       
    }
    
}
