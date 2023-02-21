/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteHerenciaAnimal_MultiNivel;

/**
 *
 * @author isabel
 */
public class Gato extends Mamifero{
    //Constructor
    public Gato(int numMamas, String nombre){ super(numMamas, nombre);}
    
    //Metodos sobreEscritos
    @Override
    public void comer(){System.out.println("Gato - Su comida preferida: pescado");}
    
    //Metos propios
    public void ronronea(){System.out.println("Gato - Esta feliz");}
    
}
