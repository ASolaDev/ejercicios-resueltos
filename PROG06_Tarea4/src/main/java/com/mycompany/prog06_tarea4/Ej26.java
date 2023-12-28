/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog06_tarea4;

/**
 *
 * @author isabel
 */
public class Ej26 {

    public static void main(String[] args) {
       /*Mostrar los elementos de una matriz de 3x3 que pertenecen a
la diagonal principal y la inversa, cuyos valores son:
 int matriz[][]={
            {7,14,24},
            {13,9,19},
            {32,22,25}
        };*/
       
       
        int matriz[][]={
            {7,14,24},
            {13,9,19},
            {32,22,25}
        };
       
        /* DIAGONAL PRINCIPAL */
        System.out.println("--ELEMENTOS DE LA DIAGONAL PRINCIPAL--");
        for (int i = 0; i < matriz.length; i++) {
            System.out.print(matriz[i][i]+"\t");
        }
        System.out.println("");
        /* DIAGONAL INVERSA */
        System.out.println("--ELEMENTOS DE LA DIAGONAL INVERSA--");
        for (int fila = 0, columna=matriz.length -1 ; fila < matriz.length; fila++,columna--) {
            System.out.print(matriz[fila][columna]+"\t");
        }

        
    }
}
