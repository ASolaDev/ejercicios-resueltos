/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetePrincipal;

import paqueteCoche.Colores;

/**
 *
 * @author isabel
 */
public class PruebaEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Colores colorRojo = Colores.ROJO;    // Instancia de un enum de la clase Colores
       
String strColorRojo = colorRojo.name();    // Devuelve un String con el nombre de la constante (ROJO)
System.out.println("Name ="+strColorRojo);

//colorRojo.toString();    // Devuelve un String con el nombre de la constante (ROJO)
        System.out.println("Color Rojo "+colorRojo.toString());

        
//colorRojo.ordinal();    // Devuelve un entero con la posición del enum según está declarada (2).
System.out.println("Indice de ROJO en Colores ="+colorRojo.ordinal());

//colorRojo.compareTo(Enum otro);// Compara el enum con el parámetro según el orden en el que están declarados lo enum
                                 //si es +, el indice de colorRojo es mayor
                                 //si es 0, son iguales
                                 //si es -, el indice de colorRojo es menor                                 
Colores colorRosa = Colores.ROSA;
System.out.println("Indice de ROSA en Colores ="+colorRosa.ordinal());
System.out.println(colorRojo.compareTo(colorRosa));

        
//Colores.values();    // Devuelve un array que contiene todos los enum, metodo estatico
//Colores arrayColor[] = Colores.values();
for (Colores color: Colores.values()) {
            System.out.print("-"+color);
}
        System.out.println("");
        
 //Colores.valueOf(String str); //devuelve un enum equivalente a str
                                // si str NO corresponde a ningun enum lanza una
                                // excepcion del tipo IllegalArgumentException
    String strColor="NEGRO";
    Colores colorCorrecto;
    try{
        colorCorrecto= Colores.valueOf(strColor);
        System.out.println(strColor+" esta definido en Colores");
    }catch(IllegalArgumentException ex){
        System.out.println("Error, el color "+strColor+" NO esta definido en Colores");   
    }
        
    }    
}
