/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutoria14noviembre;

/**
 *
 * @author isabel
 */
public class Ej1 {

    public static void main(String[] args) {
        int v[]={12,45,37,45,67,44,31,77,78};
                
        int w[]={0,0,1,1,0,1,1,1,1,0};
        
        
        System.out.println("Array unidimensional v:");        
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i]+"\t");   
        }
        
        
        System.out.println("\nArray unidimensional w:");
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i]+"\t");   
        }
        
        
        //1. v[8]=w[2] 
        v[8]=w[2];
       System.out.println("Array unidimensional v:");        
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i]+"\t");   
        }
        
        
        System.out.println("\nArray unidimensional w:");
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i]+"\t");   
        }

        
        //2. w[3]=v[2]+15;
        w[3]=v[2]+15;
        System.out.println("Array unidimensional v:");        
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i]+"\t");   
        }
        
        
        System.out.println("\nArray unidimensional w:");
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i]+"\t");   
        }

       //3 w=v;
        w=v;
        System.out.println("Array unidimensional v:");        
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i]+"\t");   
        }
        
        
        System.out.println("\nArray unidimensional w:");
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i]+"\t");   
        }
        
        
        //4.  v[0]?   w[0]???
        System.out.println("El valor de v[0] es :"+v[0]);
        System.out.println("El valor de w[0] es :"+w[0]); 
        
        //5. v[8]=w[2];
        v[8]=w[2];
        System.out.println("Array unidimensional v:");        
        for (int i = 0; i < 10; i++) {
            System.out.print(v[i]+"\t");   
        }
        
        
        System.out.println("\nArray unidimensional w:");
        for (int i = 0; i < w.length; i++) {
            System.out.print(w[i]+"\t");   
        }
        
    }
}
