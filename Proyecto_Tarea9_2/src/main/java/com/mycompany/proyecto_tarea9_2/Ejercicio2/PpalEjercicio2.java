/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea9_2.Ejercicio2;

/**
 *
 * @author isabel
 */
public class PpalEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer array[]={1,2,3,4,5,6};
        Vector<Integer> w=new Vector<Integer>(array);
        
        
        
        Vector<Integer> v=new Vector(Integer.class,6);
        v.set(6,0);
        v.set(5,1);
        v.set(4,2);
        v.set(3,3);
        v.set(2,4);
        v.set(1,5);
        
        try{
            System.out.println("Elemento que ocupa el índice 3="+v.get(3));
        }catch(NullPointerException ex){
            System.out.println("Error "+ex.getMessage());
        }
        
        System.out.println("Numero de valores de v="+v.elementos());
        v.mostrar();
               
        System.out.println("Valor maximo de v = "+v.maximo());
        System.out.println("Valor minimo de v = "+v.minimo());
        
        System.out.println("3 "+((v.estaX(3)?"esta en v":"no esta en v")));
       
        System.out.println("La media de v es "+v.media());      
        
        
        System.out.println("Las medias de w y v son "+(v.comparaMedia(w)?"iguales":"distintas"));
        
        v.ordenarASC();
        v.mostrar();
    }
    
}
