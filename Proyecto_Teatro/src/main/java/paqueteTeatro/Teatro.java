/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteTeatro;

import java.util.ArrayList;

/**
 *
 * @author isabel
 */
public class Teatro {
   
    private String nombre;    
    private ArrayList <Funcion> listaFunciones;
    //private ArrayList <Funcion> listaFunciones=new ArrayList <>(); 
    //Me corrige netBeans como redudante la 2ª: <Funcion>
    //Lo veremos en el tema de Genericos el por que? 
    
    public Teatro(String nombre){
        this.nombre=nombre;
        this.listaFunciones=new ArrayList <Funcion>();
    }
    
    public Teatro(String nombre, ArrayList <Funcion> listaFunciones){
        this.nombre=nombre;
        this.listaFunciones=listaFunciones;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    public ArrayList <Funcion> getFunciones(){
        return this.listaFunciones;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setFunciones(ArrayList <Funcion> listaFunciones){
        this.listaFunciones=listaFunciones;
    }
    
    @Override
    public String toString(){
        return "Nombre del teatro: "+this.nombre+" \nFunciones: "+this.listaFunciones;
    }
    
    public void addFuncion(Funcion f){
        this.listaFunciones.add(f);
    }
    
    public boolean containsFuncion(Funcion f){
        return this.listaFunciones.contains(f);
    }
    
    public void removeFuncion(Funcion f)throws IllegalArgumentException{
        if(listaFunciones.contains(f)){
            listaFunciones.remove(f);
        }else{
            throw new IllegalArgumentException("La función "+f+"NO se encuentra en el array");
        }
    }
}

