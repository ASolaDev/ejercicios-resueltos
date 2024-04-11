/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Lists.ArrayList;


import JerarquiaAlumno.Alumno;
import JerarquiaAlumno.AlumnoBecario;
import JerarquiaAlumno.AlumnoMayorEdad;
import java.util.ArrayList;
import java.util.ListIterator;



/**
 *
 * @author isabel
 */
public class PpalArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Permite duplicados
                
        
        AlumnoBecario ab1= new AlumnoBecario("Pepe",18,true);
        AlumnoBecario ab2= new AlumnoBecario("Paco",17,true);
        AlumnoBecario ab3= new AlumnoBecario("Juan",18, true);
        
        AlumnoMayorEdad aMy1 = new AlumnoMayorEdad("Susana",25,true);
        AlumnoMayorEdad aMy2= new AlumnoMayorEdad("Angel",21,false);  
        
        //ArrayList puede utilizar ListIterator
        ArrayList <Alumno> alumnos=new ArrayList <Alumno>();
        alumnos.add(ab1);
        alumnos.add(ab2);
        alumnos.add(ab3);
        alumnos.add(aMy1);
         
        for(Alumno a: alumnos){
          System.out.println(" -"+a); 
        }
         
        
        
        //Con ListIterator
        System.out.println("--- LISTADO DE ALUMNOS POR ORDEN DE INSERCION DESDE EL PRIMER ALUMNO AL ULTIMO ----");
        ListIterator <Alumno> iterador = alumnos.listIterator();
        while(iterador.hasNext()){
            System.out.println("- "+iterador.next());
        }
        
        
        System.out.println("\n--- LISTADO DE ALUMNOS POR ORDEN DE INSERCION DESDE EL ULTIMO ALUMNO AL PRIMERO ----");
        while(iterador.hasPrevious()){
            System.out.println("- "+iterador.previous());
        }
        
        /*  ORDENACION DE ARRAYLIST */
        ClaseArrayList claseBecarios = new ClaseArrayList();
        claseBecarios.addAlumno(ab1);
        claseBecarios.addAlumno(ab2);
        claseBecarios.addAlumno(ab3);
        claseBecarios.addAlumno(aMy1);
        
        claseBecarios.listado();
        claseBecarios.listadoOrdenadoPorNombre();
         claseBecarios.listado();
        claseBecarios.listadoOrdenadoPorEdadNombre();
         claseBecarios.listado();
       
        System.out.println("\nEl tercer alumno Becario es : "+claseBecarios.getAlumnoSegunIndice(2)); //Devuelve el 3er alumno
    
     
    } 
}
