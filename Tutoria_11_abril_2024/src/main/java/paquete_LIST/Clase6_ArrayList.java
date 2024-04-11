/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete_LIST;


import java.util.ArrayList;
import java.util.ListIterator;

/**
 *
 * @author isabel
 */
public class Clase6_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //--LIST SI permite valores repetidos
          //-- Permite la busqueda por posicionamiento
          //-- Se respeta el orden de insercion
          //-- Se pueden extraer sublistas
        
        //ArrayList Cuando se van a realizar muchas consultas
        ArrayList <Integer>numeros=new ArrayList<Integer>();
        numeros.add(23);
        numeros.add(89);
        numeros.add(23);
        numeros.add(45);
        numeros.add(39);
        
        
        System.out.println("PRIMER LISTADO--");
        for(Integer n: numeros){
            System.out.println(n);
        }
        
        
        System.out.println("SEGUNDO LISTADO ---");
        ListIterator <Integer> i= numeros.listIterator();
        while(i.hasNext()){
            System.out.println(i.next());
        } 
        
        System.out.println("TERCER LISTADO (HACIA ATRAS)---");
        //ListIterator <Integer> J= numeros.listIterator();
        while(i.hasPrevious()){
            System.out.println(i.previous());
        } 
        
        System.out.println("CUARTO LISTADO CON SIZE Y GET ---");
        for (int j = 0; j < numeros.size(); j++) {
            System.out.println(numeros.get(j));
        }
      
    }
    
}
