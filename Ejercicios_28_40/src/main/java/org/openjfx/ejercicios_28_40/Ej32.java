/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 *
PROGRAMA EJ31
   ENTORNO
     i número entero
     contador número entero
   ALGORITMO
     i<-45 
     contador <- 0
     Mientras i <= 59 hacer
        Mostrar i
        contador <- contador + 1        
        i <- i + 3        
     FinMientras
*/
package org.openjfx.ejercicios_28_40;


public class Ej32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, contador;
        i=45;
        contador=0;
        while (i<=59){
            System.out.println(i);
            contador=contador + 1;
            i=i+3;
        }
        System.out.println("Hay "+contador+" múltiplos de 3 entre 45 y 59");
    }
    
}
