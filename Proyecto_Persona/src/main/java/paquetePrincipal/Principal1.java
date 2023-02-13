/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paquetePrincipal;

import paquetePersona.Introducir;
import paquetePersona.Nie;
import paquetePersona.Nif;

/**
 *
 * @author isabel
 */
public class Principal1 {

    public static void main(String[] args) {
         //EJERCICIO 2
        
        
        //a. Introduce el dni sin letra
        //b. Si ese numero tiene mas de 8 digitos genera una Excepcion y muestra el error
        //   Si el numero tiene 8 o menos digitos genera el NIF y lo muestra
        Nif jose=null;
        try {
            jose= new Nif(Introducir.entero("Dime tus digitos del DNI (maximo 8 digitos)"));
            System.out.println("El NIF de jose es: "+jose);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            jose=new Nif(1); //Genera por defecto un NIF el 1
        }
        
        //d,e,f
        Nif maria=null;
        try {
            maria=new Nif(Introducir.cadena("Introduzca su NIF (formato al menos 8 digitos - letra):"));
            System.out.println("El NIF de maria es correcto: "+maria);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
            maria=new Nif(1);//Genera por defecto un NIF el 1
        }
        
        //Aqui tanto si jose como maria tienen valor para poder compararse
        // Ya que si alguno es null, daria error
        String comprb=(jose.equals(maria)==true)?"IGUALES":"NO IGUALES";
        System.out.println("Los NIF de jose y de maria son: "+comprb);
        
        //EJERCICIO 3
        Nie mamadu=null;
        try{
            mamadu=new Nie(Introducir.cadena("Introduzca su NIE: (letra - 7 digitos - letra"));
            System.out.println("El NIE de mamadu es "+mamadu);
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
}
