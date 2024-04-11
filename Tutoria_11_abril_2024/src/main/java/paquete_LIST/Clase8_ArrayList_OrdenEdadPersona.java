/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

import paquete_SET.Persona;

/**
 *
 * @author isabel
 */
public class Clase8_ArrayList_OrdenEdadPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //--LIST SI permite valores repetidos
           //-- Permite la busqueda por posicionamiento
           //-- Se respeta el orden de insercion
           //-- Se pueden extraer sublistas
        
        //ArrayList  Ordena por edad (atributo de Persona)
        ArrayList <Persona> personas=new ArrayList<Persona>();
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
        ListIterator <Persona> i= personas.listIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        } 
        
         System.out.println("TERCER LISTADO (HACIA ATRAS)---");
        
        while(i.hasPrevious()){
            System.out.println(i.previous());
        } 
        
        System.out.println("CUARTO LISTADO CON SIZE Y GET ---");
        for (int j = 0; j < personas.size(); j++) {
            System.out.println(personas.get(j));
        }
      
        Collections.sort(personas);
        System.out.println("QUINTO LISTADO (orden ascendente por EDAD)--");
        for(Persona n: personas){
            System.out.println(n);
        }
        
        Collections.reverse(personas);
        System.out.println("SEXTO LISTADO (orden descendente por EDAD)--");
        for(Persona n: personas){
            System.out.println(n);
        }
    }
    
}
