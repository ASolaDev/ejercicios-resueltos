/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.prog06_tarea2;
/**
 *
 * @author isabel
 */
public class Ejercicio3 {
    /*
    Declarar, crear e inicializar un vector de 17 elementos de tipo entero
    con valores: 7,56,10,-23,0,9,-99,23,10,12,56,0,88,90,33, 2,287,56,10,-23,0,9,-99,23,10,12,56,0,88,90,33, 2,28.
        a. Contar las veces que se repite el valor 10 dentro del vector.
        b. Contar cuántos elementos poseen valores nulos, positivos y
            negativos.
    */
    public static void main(String[] args) {
        int v[]={7,56,10,-23,0,9,-99,23,10,12,56,0,88,90,33, 2,28};
        
        //a. Veces que se repite el número 10
        int cont10=0; //contador de las veces que aparece el 10
        for (int i = 0; i < v.length; i++) {
            if (v[i]==10) cont10++;
        }
        System.out.println("El número 10 aparece en el array "+cont10+" veces");
        
        //b. Cúantos elementos son nulos, + y - //son excluyentes, o eres + o eres - o 0
        int cont0=0, contPos=0, contNeg=0; 
        for (int i = 0; i < v.length; i++) {
            if (v[i]==0) cont0++;
            else if (v[i]>0) contPos++;
            else contNeg++;
        }
        System.out.println("En el array hay "+cont0+" valores nulos");
        System.out.println("En el array hay "+contPos+" valores positivos");
        System.out.println("En el array hay "+contNeg+" valores negativos");
    }
    
}
