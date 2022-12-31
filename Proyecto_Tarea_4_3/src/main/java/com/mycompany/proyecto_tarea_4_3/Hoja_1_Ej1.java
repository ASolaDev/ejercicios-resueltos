/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea_4_3;

/**
 *
 * @author isabel
 */
public class Hoja_1_Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     /*  Introducir un vector de 10 elementos de tipo entero por teclado.
Generar a partir de éste, otro vector que contenga los valores de los
elementos que ocupen las posiciones pares del primero (índices
impares (1,3,5,7 y 9). Mostrar el vector generado.*/
     
     int v[]=new int[10];
        System.out.println("Introduccion de 10 valores enteros en un array ");
        v=Vectores.introducir_array_unidimensional_entero(10);
        
        
        int w[]=new int[5];
        for (int i = 0, j=0 ; i < v.length; i++) {
            if (i % 2 != 0){
                w[j]=v[i];
                j++;
            }            
        }
        
        System.out.println("VECTOR ORIGINAL ");
        Vectores.mostrar_array_unidimensional_entero(v);
        
        System.out.println("VECTOR GENERADO");
        Vectores.mostrar_array_unidimensional_entero(w);
    }
    
}
