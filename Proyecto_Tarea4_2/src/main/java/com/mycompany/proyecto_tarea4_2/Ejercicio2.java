/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_tarea4_2;

/**
 *
 * @author isabel
 */
public class Ejercicio2 {
    /*
    Declarar y crear un vector de 10 elementos de tipo entero.
    Generar un vector que almacene los valores de la tabla de multiplicar
    del 5. Mostrar los valores del array.
    */
    public static void main(String[] args) {
        int v[]=new int[10];
        System.out.println("Generación de la tabla de multiplicar del 5.....");
        for (int i = 0; i < v.length; i++) {
            v[i]=5*(i+1);
        }
        
        System.out.println("Array generado:");
        Vectores.mostrar_array_unidimensional(v);
    }
}
