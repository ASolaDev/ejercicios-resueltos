/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sets.paqueteTreeSet.Clase;



import java.util.TreeSet;

/**
 *
 * @author isabel
 */
public class ClaseTreeSet{
   private TreeSet <Alumno> alumnos; //Los Set NO admite duplicados 

    public ClaseTreeSet() {
        this.alumnos=new TreeSet<Alumno>();
    }
   
    public void addAlumno(Alumno a){
       this.alumnos.add(a);
    }
    
    public void listado(){
        if (!this.alumnos.isEmpty()){
            System.out.println("-----LISTADO POR TREESET DE ALUMNOS DE LA CLASE-----");
            for(Alumno a: this.alumnos){
                System.out.println(" - "+a);
            }
        }
    }
}
