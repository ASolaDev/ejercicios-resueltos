/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutoria14noviembre;

/**
 *
 * @author isabel
 */
public class Vectores {
    public static void mostrar_array_unidimensional(int array[]){  
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");   
        }
          
          System.out.println("");
    }
    
    public static int [] generar_array_unidimensional_aleatorio(int elementos){
        int array[]=new int[elementos];
        final int LIMITE_INFERIOR=0;
        final int LIMITE_SUPERIOR=10;
        
        for (int i = 0; i < elementos; i++) {
            double numDouble=Math.random();
            int aleatorio=(int)(numDouble*(LIMITE_SUPERIOR - LIMITE_INFERIOR +1)+ LIMITE_INFERIOR);
            array[i]=aleatorio;
        }
        
        return array;
    }
    
    
     public static int[] introducir_array_unidimensional(int elementos){
         int array[]=new int[elementos];
         
         for (int i = 0; i < array.length; i++) {
             array[i]=Leer.entero("Dime un numero entero: ");
         }
         
         
         return array;
     }
     
     
     public static void fill_array_unidimensional(int array[], int x){
         for (int i = 0; i < array.length; i++) {
             array[i]=x;
         }
     }
     
    
}
