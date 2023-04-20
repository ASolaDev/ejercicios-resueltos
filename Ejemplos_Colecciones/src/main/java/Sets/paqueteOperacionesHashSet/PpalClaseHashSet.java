/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sets.paqueteOperacionesHashSet;

import JerarquiaAlumno.Alumno;
import JerarquiaAlumno.AlumnoBecario;
import JerarquiaAlumno.AlumnoMayorEdad;
import java.util.HashSet;

/**
 *
 * @author isabel
 */
public class PpalClaseHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoBecario ab1= new AlumnoBecario("Pepe",18,true);
        AlumnoBecario ab2= new AlumnoBecario("Paco",17,true);
        
        AlumnoMayorEdad aMy1 = new AlumnoMayorEdad("Susana",25,true);
        AlumnoMayorEdad aMy2= new AlumnoMayorEdad("Angel",21,false);        
        
        HashSet <Alumno> claseBecarios = new HashSet <Alumno>();
        claseBecarios.add(ab1);
        claseBecarios.add(ab2);
        claseBecarios.add(aMy1);
        
        
        for(Alumno a: claseBecarios){
            System.out.println("- "+a);
        }
        
        System.out.println("");        
        HashSet <Alumno> claseMayores = new HashSet<Alumno>();
        claseMayores.add(aMy1);
        claseMayores.add(aMy2);
        claseMayores.add(ab1);
        
        for(Alumno a: claseMayores){
            System.out.println("- "+a);
        }
        
        System.out.println("");
        //interseccion 
        claseBecarios.retainAll(claseMayores);
        System.out.println("----INTERSECCION: BECARIOS MAYORES DE EDAD ---");
        for(Alumno a: claseBecarios){
            System.out.println("- "+a);
        }
        System.out.println("");
        
        /*------------------------------- DIFERENCIA: BECARIOS MENORES --------------*/
        claseBecarios.clear();
        System.out.println("-----DIFERENCIA: BECARIOS MENORES ---");
        claseBecarios.add(ab1);
        claseBecarios.add(ab2);
        claseBecarios.add(aMy1);
        
        claseBecarios.removeAll(claseMayores);
        for(Alumno a: claseBecarios){
            System.out.println("- "+a);
        }
                
    }
    
}
