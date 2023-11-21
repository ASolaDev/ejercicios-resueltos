/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prog06_tarea3;

/**
 *
 * @author isabel
 */
public class Hoja_1_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* Introduce un número entero por teclado, muestra su correspondiente
en binario (utiliza un vector inicial de un byte (8 elementos) */
       
       
       int x; //Numero decimal para pasar a binario
       
      
       x=Introducir.enteroPositivo("Dime un numero entero positivo y lo paso a binario ...");
       int aux=x; //conservo x
       
       int v[]=new int[8]; //Para guardarlo en 8 bits o 1 byte, si es posibleç
       
        for (int  i = v.length-1; i>=0 && x>0; i--) {   //mientras quepa el numero en 8 bits , si x>0 al salir es que necista mas bytes
            v[i]= x % 2; //obtiene el resto de dividir entre 2
            x/=2; //dividimos entre 2
        }
       
        if (x>0){
            System.out.println("El numero necesita mas bytes para su representacion en binario");
        }
        else
        {
            System.out.println(aux+" en binario es ");
            Vectores.mostrar_array_unidimensional_entero(v);
        }
    }
    
}
