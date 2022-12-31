/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea_4_3;

/**
 *
 * @author isabel
 */
public class EJ18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         /* Declarar un vector que posea 10 elementos de tipo entero
        Desplazar los elementos una posición a la derecha de tal forma que,el
        valor del primer elemento pase a la segunda posición, el segundo a la tercera
        posición, y así sucesivamente, ya el último pase a la primera posición
        
        
        */
         int v[]={7, 56, 89, 23, 58, 9, 99, 23, 44, 22};
         
        System.out.println("VECTOR ORIGINAL");
        Vectores.mostrar_array_unidimensional_entero(v);
        
        int aux=v[v.length - 1]; //se guarda el ultimo elemento del array en aux
        for (int i = v.length - 1; i > 0; i--) { 
            v[i]=v[i-1]; //desplazamiento a la derecha
        }
        
        v[0]=aux; //se recupera el ultimo elemento
        System.out.println("VECTOR DEFINITIVO");
        Vectores.mostrar_array_unidimensional_entero(v);
        
        
    }
    
}
