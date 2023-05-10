/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tarea9_2.Ejercicio1;

import com.mycompany.proyecto_tarea9_2.Ejercicio1.Jerarquia.Empleado;
import java.util.LinkedList;

/**
 *
 * @author isabel
 */
public class Generica <T> {
    private LinkedList <T> lista;
    
    public Generica(){
       this.lista= new LinkedList <T>();
    }
    
    public boolean isVacia(){
        return this.lista.isEmpty();
    }
    
    public void anadir(T objeto){
        this.lista.add(objeto);
    }
    
    public T primero() throws IllegalArgumentException{
        if (isVacia())
            throw new IllegalArgumentException("Error, la pila esta vacia");
        return this.lista.get(0);
    }
    
    public T extraer() throws IllegalArgumentException{
        return primero();
    }
    
    @Override
    public String toString(){
        String cadena="";
        if (isVacia()){
            cadena="Pila vacia";
        }else{
            for(T objeto: this.lista){
                cadena+="\n- "+objeto;
            }
        }
        return cadena;
    }
}
