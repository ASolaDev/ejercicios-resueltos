/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteHerenciaAnimal_MultiNivel;

/**
 *
 * @author isabel
 */
public class Mamifero extends Animal{
        int numMamas;
        
        //Constructor
        public Mamifero(int numMamas, String nombre){ super(nombre); this.numMamas=numMamas;}
        //metodos sobreescritos
        @Override
        public void reproducir(){ System.out.println("Mamifero -Reproduccion vivipara");}
        @Override
        public String toString(){ return "["+super.toString()+" Numero de mamas: "+this.numMamas+"]";}
        //metodo sobreCargado
        public boolean equals(Mamifero other){
            return super.equals(other) && this.numMamas==other.numMamas;
        }
}
