/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteHerenciaAnimal_MultiNivel;

/**
 *
 * @author isabel
 */
public class Perro extends Mamifero{
        //Constructor
        public Perro(int numMamas,String nombre){super(numMamas, nombre);}
        
        //metodo sobreescrito
        @Override
        public void dormir(){System.out.println("Perro- Duerme en funcion del ejercicio que realiza");}
        
        //metodos a agrepar
        public void ladrar(){System.out.println("Perro - Ladrar es labor social de guardia");}
        public void grunir(){System.out.println("Perro - Gruñe: Grrrr....");}
}
