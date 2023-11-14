/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria14noviembre;

/**
 *
 * @author isabel
 */
public class Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int v[]=new int[10];
        
        System.out.println("Array v recien creado.");
        Vectores.mostrar_array_unidimensional(v);
        
        System.out.println("\nArray v se rellena con un 7");
        Vectores.fill_array_unidimensional(v, 7);
        
        System.out.println("Mostrar el resultado del array v");
        Vectores.mostrar_array_unidimensional(v);
        
    }
    
}
