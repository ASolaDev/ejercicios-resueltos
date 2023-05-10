/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea9_2.Ejercicio3;

/**
 *
 * @author isabel
 */
public class PpalEj3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ClaseEjercicio3 num1 = new ClaseEjercicio3(10.0);
        ClaseEjercicio3 num2 = new ClaseEjercicio3(5.0);

        System.out.println("Valor de num1 ="+num1.getValue());
         System.out.println("Valor de num2 ="+num2.getValue());
        System.out.println("Suma: " + num1.suma(num2.getValue()));
        System.out.println("Resta: " + num1.resta(num2.getValue()));
        System.out.println("Producto: " + num1.producto(num2.getValue()));
        System.out.println("División: " + num1.division(num2.getValue()));   
    }
    
}
