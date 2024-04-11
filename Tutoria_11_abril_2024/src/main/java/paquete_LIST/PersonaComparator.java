/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_LIST;

import java.util.Comparator;

/**
 *
 * @author isabel
 */
public class PersonaComparator {
    
  private String nombre;
    private int edad;

    public PersonaComparator(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    
    

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
      
}
