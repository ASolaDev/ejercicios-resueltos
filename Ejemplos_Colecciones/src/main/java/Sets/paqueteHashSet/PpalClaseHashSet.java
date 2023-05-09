/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sets.paqueteHashSet;

import JerarquiaAlumno.Alumno;
import JerarquiaAlumno.AlumnoBecario;
import JerarquiaAlumno.AlumnoMayorEdad;
import java.util.HashSet;
import java.util.Iterator;

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
        
        HashSet <Alumno> claseBecarios = new HashSet<Alumno>();
        claseBecarios.add(ab1);
        claseBecarios.add(ab1);
        claseBecarios.add(ab2);
        claseBecarios.add(aMy1);
        
        System.out.println("--BECARIOS--");
        for(Alumno a: claseBecarios){
            System.out.println(" -"+a);
        }
        
       
        HashSet <Alumno> claseMayores = new HashSet<Alumno>();
        claseMayores.add(aMy1);
        claseMayores.add(aMy2);
        claseMayores.add(ab1);
        System.out.println("\n--MAYORES DE EDAD--");
        //Con iterador
        Iterator <Alumno> iterador = claseMayores.iterator();
        while (iterador.hasNext()){
            System.out.println(" -"+iterador.next());
        }
       
        
    }
    
}
