/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericosservivo;

/**
 *
 * @author isabel
 */
public class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Perro{" +this.nombre+ '}';
    }
    
    
}
