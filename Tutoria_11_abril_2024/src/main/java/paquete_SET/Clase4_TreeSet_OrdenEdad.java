/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete_SET;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @author isabel
 */

public class Clase4_TreeSet_OrdenEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //--SET NO permite valores repetidos
        
        //TreeSet Ordena por edad (atributo de Persona)
        TreeSet <Persona> personas=new TreeSet<Persona>();
        personas.add(new Persona("Susana",23));
        personas.add(new Persona("Pablo",89));
        personas.add(new Persona("Susana",23));
        personas.add(new Persona("Fernando",45));
        personas.add(new Persona("Luis",89));
        
        System.out.println("PRIMER LISTADO--");
        for(Persona n: personas){
            System.out.println(n);
        }
        
        System.out.println("SEGUNDO LISTADO ---");
        Iterator <Persona> i= personas.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        } 
        
        
    }
    
}
