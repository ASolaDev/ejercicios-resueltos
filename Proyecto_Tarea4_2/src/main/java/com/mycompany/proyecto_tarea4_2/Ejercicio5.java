/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea4_2;

/**
 *
 * @author isabel
 */
public class Ejercicio5 {

    /**
     * Diseñar un programa clase que calcule la desviación estándar de 6 números
     */
    public static void main(String[] args) {
       //Se introducen por teclado 6 números enteros y se guardan en un array
       
       int v[]=new int[6];
       System.out.println("Introducción de los 6 números enteros....");
       v=Vectores.introducir_array_unidimensional(6);
       
       //Cálculo de la fórmula
       //1. Cálculo de la media de los 6 números
       float suma=0.0f;
        for (int i = 0; i < v.length; i++) {
            suma+=v[i];
        }
        float media=suma/v.length;
        
        //Sumatorio de (v[i] - media) elevado a 2
        suma=0.0f;
        for (int i = 0; i < v.length; i++) {
            suma+=Math.pow(v[i]-media, 2);
        }
        
        double desviacion=Math.sqrt(1.0/v.length * suma);
        System.out.println("La desviación estándard es "+desviacion);
    }
    
}
