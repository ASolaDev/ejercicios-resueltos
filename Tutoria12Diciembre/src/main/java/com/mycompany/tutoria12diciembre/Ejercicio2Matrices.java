/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria12diciembre;

/**
 *
 * @author isabel
 */
public class Ejercicio2Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int m[][]={{1,2}, {11,12,13}};
        
        System.out.println("----------------MUESTRO EL VALOR DE LA MATRIZ M---------");
        MisMetodos.mostrarMatriz(m);
        
        System.out.println("----------------INTRODUZCO POR TECLADO EL VALOR DE LA MATRIZ MM---------");
        int mm[][]=new int[2][2];
        mm=MisMetodos.introducirMatriz(2, 2);
        
        System.out.println("----------------MUESTRO EL VALOR DE LA MATRIZ MM---------");
        MisMetodos.mostrarMatriz(mm);
        
    }
    
}
