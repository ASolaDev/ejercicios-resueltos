/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_LIST;

import java.util.Comparator;

/**
 *
 * @author isabel
 */

     public class ComparadorPorEdadNombre implements Comparator <PersonaComparator>{       
        @Override
        public int compare(PersonaComparator p1, PersonaComparator p2) {
           if (p1.getEdad() == p2.getEdad()){
                return p1.getNombre().compareToIgnoreCase(p2.getNombre());
            }else{
                return p1.getEdad() - p2.getEdad();
            } 
        }
    }

