/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.prog06_tarea2;
/**
 *
 * @author isabel
 */
public class Ejercicio19 {

    /** * Utilizando el vector 7 56 89 23 58 9 99 23 44 22. Genera 2 arrays:
    * a.El primero se genera sumando 15 a los elementos que ocupan
    *las posiciones impares del vector original, dejando igual el
    *resto de los elementos (índices desde el 0 hasta el 8). 
    * b. El segundo, se crea calculando el resto de
    *elemento del vector original entre 3.
    *
    * @param args */
    
    public static void main(String[] args) {
       int v[]={7, 56, 89, 23, 58, 9, 99, 23, 44, 22}; 
       
       //a. Se genera otro array con el valor de los elementos que 
       //   ocupan posiciones impares incrementados en 15, dejando el resto
       //   igual
       int v2[]=new int[v.length];
        for (int i = 0; i < v.length; i++) {
            if (i%2 == 0) //el índice es par, la posición es impar
                v2[i]=v[i]+15;
            else
                v2[i]=v[i];
        }
        System.out.println("Primer array generado ... ");
        Vectores.mostrar_array_unidimensional(v2);
        
        //b. El segundo array se crea calculando el resto de dividir el elemento 
        //   entre 3
        int v3[]=new int[v.length];
        for (int i = 0; i < v.length; i++) {
            v3[i]=v[i]%3;            
        }
        System.out.println("Segundo array generado ... ");
        Vectores.mostrar_array_unidimensional(v3);      
    }
    
}
