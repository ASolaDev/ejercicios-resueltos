/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.paqueteStarWars1;

/**
 *
 * @author isabel
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //a.
        Personaje luke = new Personaje();
        Personaje darthVader = new Personaje();
        Personaje yoda = new Personaje();
        
        System.out.println("--------------------------------------------");
        System.out.println("No hemos visto todavia Constructores.");
        System.out.println("Uso el constructor por defecto, Propiedades numericas a 0 y String a null.");
        System.out.println("--------------------------------------------");
        System.out.println();
        //"Luke", 500, 300, 100, 2, 1
        luke.setNombre("Luke"); luke.setSalud(500); luke.setFisico(300);luke.setFuerza(100);luke.setNivel(2);luke.setPh(1);
        //"Darth Vader", 500, 200, 500, 3, 4)
        darthVader.setNombre("Darth Vader"); darthVader.setSalud(500); darthVader.setFisico(200);darthVader.setFuerza(500);darthVader.setNivel(3);darthVader.setPh(4);
        //"Yoda", 400, 100, 600, 4, 5
        yoda.setNombre("Yoda"); yoda.setSalud(400); yoda.setFisico(100);yoda.setFuerza(600);yoda.setNivel(4);yoda.setPh(5);
        
        //b.
        System.out.println("--------------------------------------------");
        System.out.println("Valores de los atributos de los 3 personajes");
        System.out.println("--------------------------------------------");
        System.out.println(luke);
        System.out.println(darthVader);
        System.out.println(yoda);
        System.out.println();
        
        //c.
        System.out.println("Cambia fisico de Luke a 55");
        luke.setFisico(55);
        System.out.println("Muestra atributos de Luke despues del cambio");
        System.out.println(luke);
        System.out.println();
        
        //d.
        System.out.println("Daña salud de Luke con 10");
        luke.defensa(10);
        System.out.println("Muestra atributos de Luke despues del cambio");
        System.out.println(luke);
        System.out.println();
        
        //e.
        System.out.println("Luke ataca a Darth Vader y daña su salud");
        darthVader.defensa(luke.ataqueFisico());
        
        //f.
        System.out.println("Muestra la salud de Darth Vader despues del ataque");
        System.out.println(darthVader.getSalud());
        System.out.println();
        
        //g.
        System.out.println("Cambia fuerza de Darth Vader a 600");
        darthVader.setFuerza(600); 
        System.out.println();
        
        //h.
        System.out.println("--------------------------------------------");
        System.out.println("Valores de los atributos de los 3 personajes");
        System.out.println("--------------------------------------------");
        System.out.println(luke);
        System.out.println(darthVader);
        System.out.println(yoda);
        System.out.println();
        
        //i.
        System.out.println("Darth Vader ataca a Yoda");
        yoda.defensa(darthVader.ataqueFuerza());
        
        //j.
        System.out.println("Muestra la salud de Yoda despues del ataque");
        System.out.println(yoda.getSalud());
        
        //k.
        if (yoda.isVivo()) {
           System.out.println("Yoda esta vivo"); 
        } else {
            System.out.println("Yoda esta muerto");
        }
        System.out.println();
        
        //l.
        System.out.println("--------------------------------------------");
        System.out.println("Valores de los atributos de los 3 personajes");
        System.out.println("--------------------------------------------");
        System.out.println(luke);
        System.out.println(darthVader);
        System.out.println(yoda);        
    }
    
}
