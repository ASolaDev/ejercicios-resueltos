/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria14noviembre;

/**
 *
 * @author isabel
 */
public class Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           int v[]={12,45,37,45,67,44,31,77,78};
                
        int w[]={0,0,1,1,0,1,1,1,1,0};
        
        
        System.out.println("Array unidimensional v:");        
        Vectores.mostrar_array_unidimensional(v);        
        
        System.out.println("\nArray unidimensional w:");
        Vectores.mostrar_array_unidimensional(w);
        
        
        //1. v[8]=w[2] 
        v[8]=w[2];
        System.out.println("Array unidimensional v:");        
        Vectores.mostrar_array_unidimensional(v);        
        
        System.out.println("\nArray unidimensional w:");
        Vectores.mostrar_array_unidimensional(w);
                
        //2. w[3]=v[2]+15;
        w[3]=v[2]+15;
        System.out.println("Array unidimensional v:");        
        Vectores.mostrar_array_unidimensional(v);        
        
        System.out.println("\nArray unidimensional w:");
        Vectores.mostrar_array_unidimensional(w);
        
       //3 w=v;
       w=v;         
        System.out.println("Array unidimensional v:");        
        Vectores.mostrar_array_unidimensional(v);        
        
        System.out.println("\nArray unidimensional w:");
        Vectores.mostrar_array_unidimensional(w);
        
        
        //4.  v[0]?   w[0]???
        System.out.println("El valor de v[0] es :"+v[0]);
        System.out.println("El valor de w[0] es :"+w[0]); 
        
        //5. v[8]=w[2];
        v[8]=w[2];
        System.out.println("Array unidimensional v:");        
        Vectores.mostrar_array_unidimensional(v);        
        
        System.out.println("\nArray unidimensional w:");
        Vectores.mostrar_array_unidimensional(w);
        
    }
    
}
