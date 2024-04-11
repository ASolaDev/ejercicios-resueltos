/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_SET;

/**
 *
 * @author isabel
 */
public class Persona implements Comparable <Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
    
    @Override
    public int compareTo(Persona p){        
        if (this.edad < p.edad) return -1;
        else if (this.edad==p.edad) return 0;
        else return 1;

       // return this.edad - p.edad;
                
    }
    
}
