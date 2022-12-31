/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_tarea_4_3;

import java.util.Arrays;

/**
 *
 * @author isabel
 */
public class Ej12 {

    public static void main(String[] args) {
       /*
Utilizando el vector {12,4,5,78,45,67,45,66,77,44}
Calcular cuál es el mayor elemento e intercambiarlo por el elemento que ocupa la última
posición.*/
       
       /*OBJETIVO:
       1. Calculo del valor mayor y la posicion que ocupa
       2. Intercambio del elemento que ocupa la ultima posicion con el mayor.
       
       ORIGINAL:   [12, 4, 5, 78, 45, 67, 45, 66, 77, 44]
       DEFINITIVO: [12, 4, 5, 44, 45, 67, 45, 66, 77, 78]

       El mayor es 78 y esta en el indice 3 o 4a posicion
       El valor ultimo es 44
       Al final, 78 esta en la ultima posicion y 44 en el indice 3
       */
       
       int v[]={12,4,5,78,45,67,45,66,77,44};
       
        System.out.println("VECTOR ORIGINAL");
        Vectores.mostrar_array_unidimensional_entero(v);
        
        int mayor=v[0], pos=0;
        for(int i=0; i<v.length; i++){
            
            if(v[i]>mayor) {
                mayor=v[i];
                pos=i;
            }
        }
        
        
        //intercambio:
        int aux=v[9]; //ultimo elemento
        v[9]=mayor;
        v[pos]=aux; 
        
        System.out.println("VECTOR DEFINITIVO");
        Vectores.mostrar_array_unidimensional_entero(v);
        
        
       
        
    }
}
