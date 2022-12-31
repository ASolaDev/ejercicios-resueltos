/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tarea_4_3;

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
            System.out.print(w[i]+"\t");
        }        
        System.out.println("");
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
    
    
    //Metodo que busca un elemento int key en un array de enteros vector
    //Si lo encuentra, devuelve su indice
    //Si no lo encuentra, devuelve -1
    public static int binarySearch(int vector[], int key){
        int posicion;       
        int izq=0, drcha=vector.length-1;
        int centro=(izq+drcha)/2;
        boolean encontrado=false;
        while(!encontrado && izq<=drcha){
            if (key==vector[centro]) {
                encontrado=true;
            }
            else if (key>vector[centro]) izq=centro+1;
            else drcha=centro-1;      
            centro=(izq+drcha)/2;
        }
        posicion=(encontrado==true)?centro:-1;      
        return posicion;
    }
    
}
