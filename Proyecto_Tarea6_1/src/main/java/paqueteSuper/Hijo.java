/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteSuper;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author isabel
 */
public class Hijo {
    private String nombre;
    private LocalDate fechaNac;
    
    //CONSTRUCTORES
    //Constructor Patron

    public Hijo(String nombre, LocalDate fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    public Hijo(String nombre) {
        this(nombre, LocalDate.now());
    }
    
    public Hijo(Hijo other){
        this(other.nombre, other.fechaNac);
    }
    
    //Metodos Getter
    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }
    
    //Metodos Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    //Metodo toString
    @Override
    public String toString() {
        return "[Nombre=" + this.nombre + " Fecha de Nacimiento=" + Fecha.fechaFormateada(this.fechaNac) + " Edad="+this.edad()+']';
    }
    
    //Metodo edad, devuelve la edad del hijo
    public int edad(){
       LocalDate ahora=LocalDate.now();
       Period p=Period.between(this.fechaNac,ahora);
       return p.getYears();      
    }
    
}
