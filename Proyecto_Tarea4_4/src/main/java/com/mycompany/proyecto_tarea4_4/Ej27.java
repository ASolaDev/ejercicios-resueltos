/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.jamatriza to edit this template
 */
package com.mycompany.proyecto_tarea4_4;

/**
 *
 * @author isabel
 */
public class Ej27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int matriz[][]={
            {12,34,56},
            {45,67,89,23,45},
            {67,89}
        };
        //A. CALCULAR LA SUMA TOTAL DE LOS VALORES DE LA MATRIZ
        int sumaTotal=0;
        for(int fila=0; fila<matriz.length; fila++){
            for(int columna=0; columna<matriz[fila].length; columna++){
                sumaTotal+=matriz[fila][columna];
            }
        }
        System.out.println("La suma total es: " + sumaTotal);
        
        //B. CALCULAR LA SUMA DE CADA FILA
                
        for(int fila=0; fila< matriz.length; fila++){
            
            int sumaFila=0;
            for(int columna=0; columna <matriz[fila].length; columna++){
                sumaFila+=matriz[fila][columna];
            }
            System.out.println("La suma de la fila " + (fila+1) + " es: " + sumaFila);
            
        }
        
        //C. GUARDAR EN UN VECTOR LA SUMA DE CADA FILA
                
        int v[]=new int[matriz.length];
        for(int fila=0; fila < v.length; fila++){
            
            int sumaFila=0;
            for(int columna=0; columna <matriz[fila].length; columna++){
                sumaFila+=matriz[fila][columna];
            }
            v[fila]=sumaFila;
            
        }
        Vectores.mostrar_array_unidimensional_entero(v);
        
        //D. ELEMENTO MAYOR DE LA MATRIZ Y SU POSICIÓN
        int mayor = matriz[0][0];
        int filaMy=0, columnaMy=0;
        
        for(int fila=0; fila <matriz.length; fila++){
            for(int columna=0; columna < matriz[fila].length; columna++){
                if (matriz[fila][columna] > mayor){
                        mayor=matriz[fila][columna];
                        filaMy=fila;
                        columnaMy=columna;                    
                }
            }
        }
        
        System.out.println("El nº mayor es: " + mayor);
        System.out.println("Se encuentra en la fila: "+(filaMy + 1) + " .Columna: "+ (columnaMy));

        
        //E. INDICAR SI UN NÚMERO INTRODUCIDO SE ENCUENTRA EN LA MATRIZ
        int num=Introducir.enteroPositivo("Introduzca un número: ");
        boolean seEncuentra=false;
        for(int fila=0; fila < matriz.length; fila++){
            for(int columna=0; columna < matriz[fila].length; columna++){
                if(num == matriz[fila][columna]){
                    seEncuentra=true;
                    break;
                } 
            }
            if(seEncuentra==true) break;
        }
        String solucion=(seEncuentra==true)?"Sí está en la matriz":"No está en la matriz";
        System.out.println(solucion);
    
    }
    
}
