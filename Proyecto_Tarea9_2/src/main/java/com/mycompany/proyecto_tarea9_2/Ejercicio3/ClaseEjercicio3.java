/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tarea9_2.Ejercicio3;

/**
 *
 * @author isabel
 */

/* En este ejemplo, se ha implementado la interfaz Operable para números Double.
Si deseas implementar la interfaz para otros tipos numéricos, como Integer, Float, Long, Short o Byte, 
puedes crear clases similares a ClaseEjercicio3 implementen la interfaz Operable con el tipo numérico correspondiente.
*/

public class ClaseEjercicio3 implements Operable <Double>{  //En esta clase se elige el tipo de dato Double, aunque puede ser cualquiera por debajo de Number
    private Double value;

    public ClaseEjercicio3(Double value) {
        this.value = value;
    }

    Double getValue(){
        return this.value;
    }
    
    @Override
    public Double suma(Double num) {
        return value + num;
    }

    @Override
    public Double resta(Double num) {
        return value - num;
    }

    @Override
    public Double producto(Double num) {
        return value * num;
    }

    @Override
    public Double division(Double num) throws  ArithmeticException {
        if (num == 0) {
            throw new ArithmeticException("División por cero");
        }
        return value / num;
    }
}
    

