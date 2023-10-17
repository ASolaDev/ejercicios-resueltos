/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
PROGRAMA EJ38
   ENTORNO
     i número entero
     suma número entero
   ALGORITMO
     i<-1 
     Mientras i <= 10 hacer
        suma <- suma + i
        i <- i + 1
     FinMientras

     Mostrar suma
 */
package com.mycompany.prog04_tarea02;

public class Ej38 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,suma;
        i=1;
        suma=0;
        while (i<=10){
            suma+=i;
            i=i+1;
        }
        System.out.println("La suma es "+suma);
    }
    
}
