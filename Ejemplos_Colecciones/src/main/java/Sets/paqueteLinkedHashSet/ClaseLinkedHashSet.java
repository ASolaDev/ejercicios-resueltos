/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sets.paqueteLinkedHashSet;


import JerarquiaAlumno.Alumno;
import java.util.LinkedHashSet;


/**
 *
 * @author isabel
 */
public class ClaseLinkedHashSet {
   private LinkedHashSet <Alumno> alumnos; //Los Set NO admite duplicados, no permite null
                                           //Respeta el orden de insercion
    public ClaseLinkedHashSet() {
        this.alumnos=new LinkedHashSet<Alumno>();
    }
   
    public void addAlumno(Alumno a){
        this.alumnos.add(a);        
    }
    
    public void listado(){
        if (!this.alumnos.isEmpty()){
            System.out.println("-----LISTADO POR LINKEDHASHSET DE ALUMNOS DE LA CLASE-----");
            for(Alumno a: this.alumnos){
                System.out.println(" - "+a);
            }
        }
    }
}
