/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prog06_tarea2;
/**
 *
 * @author isabel
 */
public class Ejercicio20 {

    /**Calcular la media aritmética de una lista de x elementos del vector,
     *   donde x se introduce previamente por teclado.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x=Introducir.enteroPositivo("Dime el número de elementos que va a tener el array: ");
       
       int v[]=new int[x];
       v=Vectores.introducir_array_unidimensional(x);
       
       float suma=0.0f;
        for (int i = 0; i < v.length; i++) {
            suma+=v[i];
        }
        
        System.out.println("Media es: "+suma/v.length);
    }
    
}
