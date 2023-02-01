/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.paqueteStarWars1;

/**
 *
 * @author isabel
 */
public class Principal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //o.
        Personaje luke = new Personaje("Luke",500,300,100,2,1);
        Personaje darthVader = new Personaje("Darth Vader",500,200,500,3,4);
        Personaje yoda = new Personaje("Yoda",400,100,600,4,5);
        
        //p.
        System.out.println("luke ="+luke);
        System.out.println("darthVader="+darthVader);
        System.out.println("yoda="+yoda);
       
        //q.
        System.out.println("Numero total de personajes creados: "+Personaje.getContPersonajes());        
    }
    
}
