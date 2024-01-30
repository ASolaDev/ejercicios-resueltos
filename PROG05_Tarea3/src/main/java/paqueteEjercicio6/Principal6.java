/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteEjercicio6;

/**
 *
 * @author isabel
 */
public class Principal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Clase6 obj1=new Clase6(7);// Clase6.prop=7
        Clase6 obj2=new Clase6(9);// Ahora Clase6.prop=9
        
        obj2=obj1; //Ahora obj2 apunta a obj1, pero como prop es estatica, su valor es 9
        System.out.println(obj1.getProp());// 9
        System.out.println(obj2.getProp());// 9
        
        //Si prop NO fuera estatica
        // obj2=obj2; obj2.prop=obj1.prop; y eso seria 7
    }
    
}
