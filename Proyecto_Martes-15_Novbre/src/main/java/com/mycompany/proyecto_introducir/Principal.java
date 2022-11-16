/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_introducir;

/**
 *
 * @author isabel
 */
public class Principal {

    public static void main(String[] args) {
        
      
        int tren[]=new int[5];
        
        //El array tren se acaba de crear, digamos que es nuevo, por tanto, sus vagones están vacíos, con 0 personas
        for (int i = 0; i < 5; i++) {
            System.out.println("Vagón: "+i+" con "+tren[i]+" personas");            
        }
        
        for (int i = 0; i < tren.length; i++) { //tren.length indica los elementos que tiene el array tren (5 elementos)
            System.out.println("Vagón: "+i+" con "+tren[i]+" personas");            
        }
        
        //Voy poniendo los pasajeros en cada vagón, donde tren[0] es el primer vagon, tren[1] es el segundo vagón,.....
        tren[0]=49;
        tren[1]=32;
        tren[2]=90;
        tren[3]=35;
        tren[4]=943;
        
        //Muestro ahora el estado actual del tren, vagón a vagón, tren[i]
        for (int i = 0; i < 5; i++) {
            System.out.println("Vagón: "+i+" con "+tren[i]+" personas");            
        }
       
      
        //Otra forma de crear un array e inicializarlo a la vez
        // v contiene valores enteros y tiene 5 elementos
        int v[]={4,6,7,12,3};
        
        //Cambio el cuarto elemento, v[3] de valor, ahora v[3]=34
        v[3]=34;
        
        
        System.out.println("Introducción de 5 valores para el array v");
        for (int i = 0; i < v.length; i++) { //Para introducir enteros por teclado, utilizo la clase Introducir, método: entero
            /* int n=Introducir.entero("Dime el valor de v["+i+"]");            
               v[i]=n;
            */
            v[i]=Introducir.entero("Dime el valor de v["+i+"]");            
        }
        
        System.out.println("Array introducido de forma completa: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("v["+i+"]="+v[i]);
        }     
        
    }
}
