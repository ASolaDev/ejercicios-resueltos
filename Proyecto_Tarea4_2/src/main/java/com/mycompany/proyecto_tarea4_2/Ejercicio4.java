/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea4_2;

/**
 *
 * @author isabel
 */
public class Ejercicio4 {

    /**
     * Diseñar un programa que pida por teclado 10 elementos de tipo real.
     *   Calcular la media aritmética de todas las notas, y además indicar
     *   cuántas notas son superiores, inferiores o iguales a la media.
     */
    public static void main(String[] args) {
       float v[]=new float[10]; //10 reales
       
        System.out.println("Introducción de los elementos reales....");
        for (int i = 0; i < v.length; i++) {
            v[i]=Introducir.realSimple("Dime v["+i+"]: ");            
        }
        
        //Cálculo de la suma
        float suma=0.0f;
        for (int i = 0; i < v.length; i++) {
            suma+=v[i];
        }
        float media=suma/v.length;
        System.out.println("La media de los 10 valores es "+media);
        
        //Una vez se sabe cuál es la media, contar los valores iguales
        // menores o mayores a la media
        int contIg, contMay, contMen;
        contIg=contMay=contMen=0; //todos los valores toman 0
        for (int i = 0; i < v.length; i++) {
           if (v[i]==media) contIg++; //contador de iguales a la media se incrementa
           else if (v[i]>media) contMay++;
           else contMen++;
        }
        
        System.out.println("Hay "+contIg+" valores en el array iguales a la media");
        System.out.println("Hay "+contMay+" valores en el array mayores a la media");
        System.out.println("Hay "+contMen+" valores en el array menores a la media");
    }
    
}
