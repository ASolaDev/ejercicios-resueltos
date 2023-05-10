/*
 * Click nbfs://nbhost/SystemFileSystem/Eemplates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Eemplates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tarea9_2.Ejercicio2;

import java.lang.reflect.Array;
import java.util.Arrays;


public class Vector <E extends Number> {
   private E[] vector;
   
    public Vector(E[] vector){
        this.vector=vector;
    }
    
    public Vector(Class <E> vector, int tamanio) throws IllegalArgumentException{
        if (tamanio < 1)
             throw new IllegalArgumentException("Error");
        this.vector=(E[])Array.newInstance(vector, tamanio);        
    }
    
    public void set(E objeto, int index) throws IllegalArgumentException{
        if (index < 0 || index > this.elementos()) {
            throw new IllegalArgumentException("Error indice erroneo");
        }
        this.vector[index]=objeto;
    }
    
    public E get(int index) throws IllegalArgumentException, NullPointerException{
        if (index < 0 || index > this.vector.length){
            throw new IllegalArgumentException("Error indice erroneo");
        }
        return this.vector[index];
    }
    
    public int elementos(){
        return this.vector.length;
    }
    
    public void mostrar(){
        System.out.println("---LISTADO---");
        for(E objeto: this.vector){
            System.out.println("- "+objeto);
        }
    }
    
   
    public E maximo() throws IllegalArgumentException{
        if (this.elementos()==0){
            throw new IllegalArgumentException("Error, vector vacio");
        }
        E mayor = this.vector[0];
        for(E objeto: this.vector){
            if (objeto.doubleValue() > mayor.doubleValue()){            
                mayor = objeto;
            }
        }
        return mayor;
    } 

   
    public E minimo() throws IllegalArgumentException{
        if (this.elementos()==0){
            throw new IllegalArgumentException("Error, vector vacio");
        }
        E menor = this.vector[0];
        for(E objeto: this.vector){
            if (objeto.doubleValue() < menor.doubleValue()){            
                menor = objeto;
            }
        }
        return menor;
    } 

    public boolean estaX(E objeto){
        boolean encontrado=false;
        for(int i=0; i< this.elementos(); i++){
            if (objeto.equals(this.vector[i])){
                encontrado=true;
                break;
            }
        }
        return encontrado;
    }
    
    public double media(){
        double suma = 0.0d;
        for(E objeto: this.vector){
            suma+=objeto.doubleValue();
        }
        return suma/elementos();
    }
    
    public boolean comparaMedia(Vector<?> other)
    {
        return  (media()==other.media());        
    }
        
    public void ordenarASC()
    {
        Arrays.sort(this.vector);
    }  
}
