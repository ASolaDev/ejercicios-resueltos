/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sets.paqueteLinkedHashSet;


import JerarquiaAlumno.AlumnoBecario;
import JerarquiaAlumno.AlumnoMayorEdad;

/**
 *
 * @author isabel
 */
public class PpalClaseLinkedSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoBecario ab1= new AlumnoBecario("Pepe",18,true);
        AlumnoBecario ab2= new AlumnoBecario("Paco",17,true);
        
        AlumnoMayorEdad aMy1 = new AlumnoMayorEdad("Susana",25,true);
        AlumnoMayorEdad aMy2= new AlumnoMayorEdad("Angel",21,false);        
        
        ClaseLinkedHashSet claseBecarios = new ClaseLinkedHashSet();
        claseBecarios.addAlumno(ab1);
        claseBecarios.addAlumno(ab1);
        claseBecarios.addAlumno(ab2);
        
        claseBecarios.listado();
        
        ClaseLinkedHashSet claseMayores = new ClaseLinkedHashSet();
        claseMayores.addAlumno(aMy1);
        claseMayores.addAlumno(aMy2);
        
        claseMayores.listado();
        
        
    }
    
}
