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
public class Clase5_TreeSet_OrdenEdadNombre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //--SET NO permite valores repetidos
        
        //TreeSet Ordena por edad + nombre
        TreeSet <PersonaEdadNombre> personas=new TreeSet<PersonaEdadNombre>();
        personas.add(new PersonaEdadNombre("Susana",23));
        personas.add(new PersonaEdadNombre("Pablo",89));
        personas.add(new PersonaEdadNombre("Susana",23));
        personas.add(new PersonaEdadNombre("Fernando",45));
        personas.add(new PersonaEdadNombre("luis",89));
        
        System.out.println("PRIMER LISTADO--");
        for(PersonaEdadNombre n: personas){
            System.out.println(n);
        }
        
        System.out.println("SEGUNDO LISTADO ---");
        Iterator <PersonaEdadNombre> i= personas.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        } 
        
        
    }
    
    }
    

