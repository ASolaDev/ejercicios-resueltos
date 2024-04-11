/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Sets.paqueteTreeSet.Clase;

/**
 *
 * @author isabel
 */
public class PpalClaseTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoBecario ab1= new AlumnoBecario("Pepe",18,true);
        AlumnoBecario ab2= new AlumnoBecario("Paco",17,true);
        
        AlumnoMayorEdad aMy1 = new AlumnoMayorEdad("Susana",25,true);
        AlumnoMayorEdad aMy2= new AlumnoMayorEdad("Angel",21,false);        
        
        ClaseTreeSet claseBecarios = new ClaseTreeSet();
        claseBecarios.addAlumno(ab1);
        claseBecarios.addAlumno(ab1);
        claseBecarios.addAlumno(ab2);
        
        //Salen ordenados de menor a mayor
        claseBecarios.listado();
        System.out.println("");
        
        ClaseTreeSet claseMayores = new ClaseTreeSet();
        claseMayores.addAlumno(aMy1);
        claseMayores.addAlumno(aMy2);
        //Salen ordenados de menor a mayor
        claseMayores.listado();       
    }
    
}
