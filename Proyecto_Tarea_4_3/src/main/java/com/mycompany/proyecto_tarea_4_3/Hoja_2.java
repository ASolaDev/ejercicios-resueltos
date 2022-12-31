/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea_4_3;

/**
 *
 * @author isabel
 */
public class Hoja_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        //Aplicacion de la busqueda binaria
        //Es obligatorio que el array este ordenado
        
        int v[]={4,5,12,44,45,45,46,66,67,77,78};
        
        
        int x=Introducir.entero("Dime un numero entero y te dire si esta en el array :");
        
        int solucion=Vectores.binarySearch(v, x);
        if (solucion == -1 ){
            System.out.println("Lo siento ... "+x+" no esta en el array");
        }
        else
        {
            System.out.println("Exito, el numero "+x+" ocupa el indice "+solucion+" o posicion "+(solucion+1)+" en el array");
        }
    }
    
}
