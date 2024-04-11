/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete_LIST;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import paquete_SET.Persona;

/**
 *
 * @author isabel
 */
public class Clase9_ArrayList_2OrderBy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //--LIST SI permite valores repetidos
           //-- Permite la busqueda por posicionamiento
           //-- Se respeta el orden de insercion
           //-- Se pueden extraer sublistas
        
        //ArrayList  
        ArrayList <PersonaComparator> personas=new ArrayList<PersonaComparator>();
        personas.add(new PersonaComparator("Susana",23));
        personas.add(new PersonaComparator("Pablo",89));
        personas.add(new PersonaComparator("Susana",23));
        personas.add(new PersonaComparator("Fernando",45));
        personas.add(new PersonaComparator("Luis",89));
        
        System.out.println("PRIMER LISTADO--");
        for(PersonaComparator n: personas){
            System.out.println(n);
        }
                
        Collections.sort(personas, new ComparadorPorNombre ());
        System.out.println("SEGUNDO LISTADO (orden ascendente por NOMBRE--");
        for(PersonaComparator n: personas){
            System.out.println(n);
        }
        
        Collections.sort(personas, new ComparadorPorEdadNombre ());
        System.out.println("TERCER LISTADO (orden ascendente por EDAD + NOMBRE--");
        for(PersonaComparator n: personas){
            System.out.println(n);
        }
        

    }
    
}
