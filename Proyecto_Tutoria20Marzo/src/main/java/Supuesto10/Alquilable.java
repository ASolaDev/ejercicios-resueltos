/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Supuesto10;

/**
 *
 * @author isabel
 */
public interface Alquilable {
    String EMPRESA = "LA EMPRENDEDORA, SA"; //nombre es una constante 
    
    void alquilar() throws IllegalArgumentException; //es un metodo abstracto
    default void saludo(){
        System.out.println("BIENVENIDOS, WELCOME!!!");
    }
}
