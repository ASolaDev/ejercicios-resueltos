/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lists.ArrayList;


import JerarquiaAlumno.Alumno;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author isabel
 */
public class ClaseArrayList {
   private ArrayList <Alumno> alumnos; //admite duplicados, consultas y listados - Mas rapido ArrayList que LinkedList

    public ClaseArrayList() {
        this.alumnos=new ArrayList<Alumno>();
    }
   
    public void addAlumno(Alumno a){
        if (!this.alumnos.contains(a)){
           this.alumnos.add(a);    
        }else System.out.println("El alumno "+a.getNombre()+" ya existe");
    }
    
    public void listado(){
        if (!this.alumnos.isEmpty()){
            System.out.println("-----LISTADO POR ARRAYLIST DE ALUMNOS DE LA CLASE-----");
            for(Alumno a: this.alumnos){
                System.out.println(" - "+a);
            }
        }
    }
     
    public Alumno getAlumnoSegunIndice(int index) {
        if (index < 0 || index >= this.alumnos.size()){
            System.out.println("Error, indice fuera de rango");
            return null;
        }else
            return this.alumnos.get(index);
    }
    //Se desea que ArrayList este ordenado por nombre y tambien otra ordenacion: edad, nombre (los alumnos que tengan la misma eda, se ordenan por nombre)
    
    //Se crean clases internas que implementen Comparator
    
    public class ComparadorPorNombre implements Comparator <Alumno> {        
        @Override
        public int compare(Alumno o1, Alumno o2) {
            return o1.getNombre().compareToIgnoreCase(o2.getNombre());
        }       
    }
    
    public class ComparadorPorEdadNombre implements Comparator <Alumno>{       
        @Override
        public int compare(Alumno o1, Alumno o2) {
           if (o1.getEdad() == o2.getEdad()){
                return o1.getNombre().compareToIgnoreCase(o2.getNombre());
            }else{
                return o1.getEdad() - o2.getEdad();
            } 
        }
    }
    
    public void listadoOrdenadoPorNombre(){ //Tambien se puede usar ListIterator 
        List <Alumno> lista= new ArrayList<Alumno>(this.alumnos);
        // Collections.sort(List list, Comparator <? super Alumno>);
        Collections.sort(lista, new ComparadorPorNombre());   
        
        System.out.println("\n------ALUMNOS ORDENADOS POR NOMBRE EN ORDEN CRECIENTE");
        for(Alumno a: lista){
            System.out.println("- "+a);
        }        
        
        System.out.println("\n------ALUMNOS ORDENADOS POR NOMBRE EN ORDEN DECRECIENTE");    
        Collections.reverse(lista);
        for(Alumno a: lista){
            System.out.println("- "+a);
        }
       
    }
    
     public void listadoOrdenadoPorEdadNombre(){ //Tambien se puede usar ListIterator 
        List <Alumno> lista= new ArrayList<Alumno>(this.alumnos);               
        Collections.sort(lista, new ComparadorPorEdadNombre());   
        System.out.println("\n------ALUMNOS ORDENADOS POR EDAD,NOMBRE EN ORDEN CRECIENTE");
        for(Alumno a: lista){
            System.out.println("- "+a);
        }        
        
        System.out.println("\n------ALUMNOS ORDENADOS POR EDAD,NOMBRE EN ORDEN DECRECIENTE");    
        Collections.reverse(lista);
        for(Alumno a: lista){
            System.out.println("- "+a);
        }  
    }
        
}
