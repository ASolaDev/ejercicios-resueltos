/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sets.paqueteTreeSet;

import java.util.TreeSet;

/**
 *
 * @author isabel
 */
public class PpalIntegerString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet <Integer> conjuntoEnteros = new TreeSet<Integer>();
        
        conjuntoEnteros.add(45);
        conjuntoEnteros.add(5);
        conjuntoEnteros.add(25);
        conjuntoEnteros.add(25);
        
        for(Integer i: conjuntoEnteros){
            System.out.println(" - "+i);
        }
        
        System.out.println("\n");
        
        TreeSet <String> conjuntoCadenas = new TreeSet<String>();
        
        conjuntoCadenas.add("Javier");
        conjuntoCadenas.add("Juan");
        conjuntoCadenas.add("Pedro");
        conjuntoCadenas.add("Angel");
        
        for(String i: conjuntoCadenas){
            System.out.println(" - "+i);
        }
        
    }
    
}
