/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lists.LinkedList;


import JerarquiaAlumno.Alumno;
import JerarquiaAlumno.AlumnoBecario;
import JerarquiaAlumno.AlumnoMayorEdad;
import java.util.LinkedList;

/**
 *
 * @author isabel
 */
public class PpalLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Permite duplicados LinkedList es mas rapido cuando hay muchas altas y bajas               
        
        AlumnoBecario ab1= new AlumnoBecario("Pepe",18,true);
        AlumnoBecario ab2= new AlumnoBecario("Paco",17,true);
        
        AlumnoMayorEdad aMy1 = new AlumnoMayorEdad("Susana",25,true);
        AlumnoMayorEdad aMy2= new AlumnoMayorEdad("Angel",21,false);        
        
        LinkedList <Alumno> claseBecariosCola = new LinkedList <Alumno>();//COLA ES FIFO (First Input -> First Output)
        claseBecariosCola.add(ab1); //tambien puede ser offer(Alumno a)
        claseBecariosCola.add(ab2);
        claseBecariosCola.add(aMy1);
        
        System.out.println("--- DEL PRIMER BECARO AL ULTIMO BECARIO POR ORDEN DE INSERCION Y BORRANDO----");
        int numElementosCola = claseBecariosCola.size();
        for (int i = 0; i < numElementosCola; i++) {
            Alumno a=claseBecariosCola.poll();// si se pone peek() NO elimina el objeto
            System.out.println("- "+a);
        }
        
        LinkedList <Alumno> claseBecariosPila = new LinkedList <Alumno>();//PILA ES LIFO (Last Input -> First Output)
        claseBecariosPila.push(ab1);  
        claseBecariosPila.push(ab2);
        claseBecariosPila.push(aMy1);     
        
        
        System.out.println("\n--- DEL ULTIMO BECARO AL PRIMERO BECARIO POR ORDEN DE INSERCION Y BORRANDO----");
        
        int numElementosPila = claseBecariosPila.size();
        for (int i = 0; i < numElementosPila; i++) {
            Alumno a=claseBecariosPila.pop();  
            System.out.println("- "+a);
        }
    }
    
}
