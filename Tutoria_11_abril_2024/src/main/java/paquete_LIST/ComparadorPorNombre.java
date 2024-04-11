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

    public class ComparadorPorNombre implements Comparator <PersonaComparator> {        
        @Override
        public int compare(PersonaComparator p1, PersonaComparator p2) {
            return p1.getNombre().compareToIgnoreCase(p2.getNombre());
        }       
    }
  

