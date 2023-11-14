/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria14noviembre;

/**
 *
 * @author isabel
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int v[]=new int[10];
      
        System.out.println("Introduccion de los elementos de un array unidimensional de 10 enteros");
        v=Vectores.introducir_array_unidimensional(10);
        
        System.out.println("Los valores introducidos del array son:");
        Vectores.mostrar_array_unidimensional(v);
      
    }
    
}
