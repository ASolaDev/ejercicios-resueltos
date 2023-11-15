/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.metodosarrays;

/**
 *
 * @author isabel
 */
public class Vectores {
    /*
    Objetivo: Mostrar dentro del método todos los elementos del array 
    Método: mostrar_array_unidimensional_entero
    Datos de entrada: el array unidimensional de enteros
    Datos de salida: NO tiene, los elementos salen por pantalla    
    */
    public static void mostrar_array_unidimensional_entero(int w[]){
        //Se recorre el array desde el primer elemento (indice 0) hasta el último
        for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }        
    }
    
    /*
    Objetivo: Introducción de elementos de tipo entero en un array unidimensional    
    Método: introducir_array_unidimensional_entero    
    Datos de entrada: el número de elementos
    Datos de salida: el array    
    */
    public static int [] introducir_array_unidimensional_entero(int n){
        int w[]=new int[n];
        
        for (int i = 0; i < w.length; i++) {
            w[i]=Introducir.entero("Dime el valor del elemento cuyo índice es "+i+" :");
        }  
        
        return w;
    }
    
    /*
    Objetivo: Rellenar el array unidimensional con el mismo valor entero  
    Método: fill_array_unidimensional_entero    
    Datos de entrada: el array + el número 
    Datos de salida: NO tiene, ya veremos por qué    
    */
    public static void fill_array_unidimensional_entero(int w[],int n){           
        for (int i = 0; i < w.length; i++) {
            w[i]=n;
        }       
    }
}
