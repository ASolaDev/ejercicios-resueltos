/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria9octubre;

/**
 *
 * @author isabel
 */
public class for1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Muestra por pantalla 10 veces "Bienvenido Mr Marshall"
         
         for(int contador=1; contador <= 10; contador++){
             System.out.println(contador+"- Bienvenido Mr Marshall");
         }
         
         //A la estructura de for le puede faltar 1, 2 o las 3 partes         
         //Ej, sin la condicion de permanencia
         for(int contador=1; ; contador++){
             if (contador > 10) {break;}
             System.out.println(contador+"- Bienvenido Mr Marshall");
         }
         
          //Ej sin incremento
           for(int contador=1; contador <= 10; ){
             System.out.println(contador+"- Bienvenido Mr Marshall");
             contador ++;
         }
        
          //Sin inicializacion de variable
         int contador=1;
         for( ; contador <= 10 ; contador++){ //sin la primera partee
             System.out.println(contador+"- Bienvenido Mr Marshall");
         }
        
         //Sin inicializacion de variable, condicion de permanencia ni incremento
         contador = 1;
         for(;;){
             if (contador > 10) {break;}
             System.out.println(contador+"- Bienvenido Mr Marshall");
             contador ++;
         }
    }
    
}
