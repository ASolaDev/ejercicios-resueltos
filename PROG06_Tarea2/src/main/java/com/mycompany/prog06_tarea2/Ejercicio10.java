/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.prog06_tarea2;
/**
 *
 * @author isabel
 */
public class Ejercicio10 {

    /**Introducir un vector de 10 elementos enteros por teclado.
     *  a. Mostrar cual es el menor de todos y la posición que ocupa.
     *  b. Mostrar cual es el mayor de todos y las veces que se repite.
     * */
    public static void main(String[] args) {
       int v[]=new int[10];
        System.out.println("Introducción de 10 números enteros por teclado ....");
        v=Vectores.introducir_array_unidimensional(10);
        
        //a. Cálculo del menor y su posición
        int menor=v[0], indMenor=1;
        for (int i = 1; i < v.length; i++) {
            if (v[i] < menor) {
                menor=v[i];
                indMenor=i;
            }
        }
        System.out.println("El valor menor de todos es "+menor+" y ocupa la posición "+(indMenor+1));
        
        //b. Cálculo del mayor y las veces que se repite
        int mayor=v[0], aparece=1;
        for (int i = 1; i < v.length; i++) {
            if (v[i] > mayor){
                mayor=v[i];
                aparece=1;
            }else if (v[i]==mayor) aparece++;
        }
        System.out.println("El valor mayor es "+mayor+" y aparece "+aparece+" veces");
    }
    
}
