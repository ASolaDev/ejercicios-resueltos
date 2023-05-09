/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.genericosservivo;

/**
 *
 * @author isabel
 */
public class Animal extends Servivo{

    public Animal(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Animal{" +this.nombre+ '}';
    }
    
    
    
}
