/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea_4_3;

/**
 *
 * @author isabel
 */
public class Hoja_1_EJ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  Utilizando el vector {12,4,5,78,45,67,45,66,77,44}
        Comprueba si un número entero introducido por teclado se encuentra en el vector, utilizando el
        método de la búsqueda lineal
        
        SE utiliza el metodo sin usar break
      */
      
      int v[]={12,4,5,78,45,67,45,66,77,44}; 
      System.out.println("VECTOR ORIGINAL");
       Vectores.mostrar_array_unidimensional_entero(v);
      
       int x=Introducir.entero("Dime un numero y te dire si se encuentra... ");
       
       boolean encontrado=false; //Todavia no ha empezado la busqueda
       
        for (int i = 0; i < v.length && !encontrado; i++) {
            if (v[i] == x){
                encontrado=true;               
            }
        }
        
        
       System.out.println("El numero "+x+((encontrado)?" si ":" no ")+" esta en el array");
        
       
    }
    
}
