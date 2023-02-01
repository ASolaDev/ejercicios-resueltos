/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteEjercicio4;

/**
 *
 * @author isabel
 */
public class Ppal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase2 obj1=new Clase2(5,4); //Creo obj1 con p1=5 y p2=4
        System.out.println(obj1.modificar(4)+" "); //obj1 p1=9 y p2=8, muestra p1 que es 9
        
        Clase2 obj2=new Clase2(5,4); //Creo obj1 con p1=5 y p2=4
        System.out.println(obj2.modificar(5)+" "); //obj2 p1=10 y p2=9, muestra p1 que es 10
        
        obj2=obj1; //obj2 apunta a obj1, p1=9 y p2=8
        System.out.println(obj2.modificar(5)+" "); //obj2 p1=14 y p2=13, muestra p1 que es 14        
    }
    
}
