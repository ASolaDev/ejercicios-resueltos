/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteSuper;

import java.time.LocalDate;

/**
 *
 * @author isabel
 */
public class Animal {
    protected int peso;
    protected LocalDate fechaNac;

    //CONSTRUCTORES
    // Constructor Patron
    public Animal(int peso, LocalDate fechaNac) throws IllegalArgumentException{
        this.setPeso(peso);
        this.fechaNac = fechaNac;
    }

    public Animal(int peso) throws IllegalArgumentException{
        this(peso,LocalDate.now());
    }
    
    public Animal(Animal other) throws IllegalArgumentException{
        this(other.peso, other.fechaNac);
    }

    //Metodos Getter
    public int getPeso() {
        return peso;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    //Metodos Setter
    public void setPeso(int peso) throws IllegalArgumentException{
        if (peso < 0 || peso > 5000){
            throw new IllegalArgumentException("Error, peso incorrecto...");
        }
        this.peso = peso;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "[Peso=" + this.peso + " Fecha de Nacimiento=" + this.fechaNac + ']';
    }    
    
}
