/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetePrincipal;

import paqueteCoche.Coche;
import paqueteCoche.Colores;

/**
 *
 * @author isabel
 */
public class PruebaCoche {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea cochecito1 sin generar errores
        Coche cochecito1=null;
        try{
            cochecito1=new Coche("SEAT", Colores.ROJO,"MANUAL",3);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("cochecito1="+cochecito1);
        
        
        //Se intenta crear cochecito2 con marca erronea
        Coche cochecito2=null;
        try{
            cochecito2=new Coche("CITROEN", Colores.ROJO,"MANUAL",3);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("cochecito2="+cochecito2);
        
        //Se intenta crear cochecito3 con color erroneo
        Coche cochecito3=null;
        try{
            cochecito3=new Coche("SEAT", "AZUL","MANUAL",3);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("cochecito3="+cochecito3);
        
        //Se intenta crear cochecito4 con numero de puertas erroneo
        Coche cochecito4=null;
        try{
            cochecito4=new Coche("SEAT", Colores.AMARILLO,"MANUAL",-3);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("cochecito4="+cochecito4);
        
        //Se intenta crear cochecito5 con todo erroneo
        Coche cochecito5=null;
        try{
            cochecito5=new Coche("CITROEN", "AZUL","MANUAL",-3);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("cochecito5="+cochecito5);
        
        
    }
    
}
