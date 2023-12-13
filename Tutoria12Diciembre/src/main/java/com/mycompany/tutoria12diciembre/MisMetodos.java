/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tutoria12diciembre;

/**
 *
 * @author isabel
 */
public class MisMetodos {
    public static void mostrarMatriz(int matriz[][]){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length; columna++) {
                System.out.print(matriz[fila][columna]+" | ");
            }
            System.out.println("");
        }
    }
    
    
    public static int[][] introducirMatriz(int filas, int columnas){
         int matriz[][]=new int[filas][columnas];
         
         for (int fila = 0; fila < matriz.length; fila++) {
             System.out.println("Fila nº "+fila);
             for (int columna = 0; columna < matriz[fila].length; columna++) {
                 matriz[fila][columna]=Introducir.entero("Dime el valor de matriz["+fila+"]["+columna+"]: ");
             }
        }
         
        return matriz; 
    }
    
    
}
