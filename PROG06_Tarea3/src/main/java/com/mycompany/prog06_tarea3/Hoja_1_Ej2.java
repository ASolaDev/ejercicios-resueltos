/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prog06_tarea3;

/**
 *
 * @author isabel
 */
public class Hoja_1_Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Utilizando el vector ORIGINAL:   [12, 4, 5, 78, 45, 67, 45, 66, 77, 44]
        Llevar el mayor elemento al último a base de intercambios.*/
        
        int v[]={12,4,5,78,45,67,45,66,77,44};
         System.out.println("VECTOR ORIGINAL");
        Vectores.mostrar_array_unidimensional_entero(v);
     
        
        
        for (int i = 0; i < v.length-1; i++) 
        {
            if(v[i]>v[i+1])
            {
            int aux=v[i];
            v[i]=v[i+1];
            v[i+1]=aux;
                
            }
           
            
        }
        
         System.out.println("VECTOR DEFINITIVO");
        Vectores.mostrar_array_unidimensional_entero(v);  

    }
    
}
