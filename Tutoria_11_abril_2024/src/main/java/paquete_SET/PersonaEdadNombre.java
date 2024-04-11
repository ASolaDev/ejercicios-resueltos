/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_SET;

/**
 *
 * @author isabel
 */
public class PersonaEdadNombre implements Comparable <PersonaEdadNombre>{
    private String nombre;
    private int edad;

    public PersonaEdadNombre(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    @Override
    public int compareTo(PersonaEdadNombre p){        
        if (this.edad == p.edad){
           return this.nombre.compareToIgnoreCase(p.nombre);
        }
        else 
           return this.edad - p.edad;                
    }
 
}
