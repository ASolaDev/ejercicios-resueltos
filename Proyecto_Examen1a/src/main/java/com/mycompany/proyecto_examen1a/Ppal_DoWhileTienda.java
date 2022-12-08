/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_examen1a;

/**
 *
 * @author isabel
 */
public class Ppal_DoWhileTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("EXAMEN DE 1ª EVALUACIÓN 1º DAW A");
        
        System.out.println("EJERCICIO nº 1");
        int n=Introducir.entero("Dime un número para que itere en el Ejercicio nº 1");
        Ejercicios.ley_de_ohm(n);
        
        System.out.println("\nEJERCICIO nº 2 - Leer por teclado 10 enteros, generar 1 entero al azar, calcular el mayor de todos");
        int mayor=Ejercicios.numero_mayor();
        System.out.println("El número mayor resultado del Ejercicio nº 2 es "+mayor);
        
        System.out.println("\nEJERCICIO nº 3 - Del array que contiene los valores 10,20,30,40,50,60,70,80,90,100 ");
        System.out.println("Calcular cuántos de esos valores son múltiplos de un número introducido por teclado");
        int multiplos=Ejercicios.numero_en_array();
        System.out.println("Resultado de múltiplos: "+multiplos);
        
        
        System.out.println("EJERCICIO nº 4 - Calcular lo que debe pagar un cliente en su pedido. Si en el tipo de pieza se introduce 0, fin del pedido");
        double pago=Ejercicios.tienda_de_repuestos_DoWhile();
        System.out.println("El cliente en la tienda debe pagar "+pago+"€"); 
    }    
    
}
