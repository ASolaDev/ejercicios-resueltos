/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteHerenciaAnimal_MultiNivel;

/**
 *
 * @author isabel
 */
public class Animal {
        String nombre;
        
        //Constructor
        public Animal(String nombre){this.nombre=nombre;}
        
        //metodos propios
        public void comer(){ System.out.println("Animal -Necesita comer para sobrevivir");}
        public void dormir(){System.out.println("Animal - Es indispensable para descansar");}
        public void reproducir(){System.out.println("Animal -Origina nuevos seres vivos");}
        //metodo sobreescrito
        @Override
        public String toString(){ return "[Nombre ="+this.nombre+"]";}
        //metodo sobreCargado
        public boolean equals(Animal other){
            return this.nombre.equals(other.nombre);                
        }
}



