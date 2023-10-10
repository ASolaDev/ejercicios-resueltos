/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria9octubre;

/**
 *
 * @author isabel
 */
public class Azar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Genera 10 numeros enteros al azar entre el 5 al 20
        
        double azar;
        int limiteInferior, limiteSuperior;
        limiteInferior = 5;
        limiteSuperior = 20;
        
        int aleatorio;
        
        for (int i = 1; i <= 100; i++) {
            azar = Math.random() * (limiteSuperior - limiteInferior + 1) + limiteInferior;
            aleatorio=(int)azar;
            System.out.println(i+"- Numero generado: "+aleatorio);
        }
        
    }
    
}
