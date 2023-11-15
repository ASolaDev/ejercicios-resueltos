/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.prog06_tarea2;
import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class Vectores {
    /* Objetivo:Método para mostrar por pantalla un array unidimensional de enteros
     * Nombre del método: mostrar_array_unidimensional 
     * Dato de entrada: un array unidimensional de enteros miarray
     * Salida: No tiene, el método saca por pantalla
     *  
     * @param miarray[] 
    */
    public static void mostrar_array_unidimensional(int miarray[]){
        
        for (int i = 0; i < miarray.length; i++)
            System.out.print(miarray[i] + " ");
        }
    
    
    /* Objetivo:Método que genera un array unidimensional con elementos aleatorios
     * Nombre del método: generar_array_unidimensional_aleatorio
     * Dato de entrada: elementos de tipo entero
     * Salida: el array generado
     *  
     * @param elementos
     * @return miarray
    */
    public static int[] generar_arrray_unidimensional_aleatorio(int elementos){
        
        int miarray[];
        miarray = new int [elementos];
        
        for (int i = 0; i < elementos; i++)
            miarray[i] = (int) (Math.random()*10 + 1);
        
        return miarray;
    }
    
     /* Objetivo:Método que introduce por teclado un array unidimensional de enteros
     * Nombre del método: introducir_array_unidimensional
     * Dato de entrada: n de tipo entero
     * Salida: el array introducido
     *  
     * @param n
     * @return v
    */
    public static int[] introducir_array_unidimensional(int n){
        
        int v[]=new int[n];
        Scanner teclado=new Scanner(System.in);
        String cadena;
   
        for(int i=0;i<v.length;i++){
            System.out.print("Dime un número: ");
            cadena=teclado.nextLine();
            v[i]=Integer.parseInt(cadena);
        }
   
        return v;
    }
}
