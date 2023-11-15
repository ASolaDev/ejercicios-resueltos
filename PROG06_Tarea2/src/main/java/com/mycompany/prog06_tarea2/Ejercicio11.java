/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.prog06_tarea2;
/**
 *
 * @author isabel
 */
public class Ejercicio11 {

    /**Declarar un vector que posea 10 elementos de tipo entero. Los
    * valores de éstos son 12,4,5,78,45,67,45,66,77,44 (del primer al
    * último elemento).Introducir un número entero por teclado (x). Indicar
    * cuántos elementos del vector son mayores, menores o iguales a  x.
    * */
    public static void main(String[] args) {
      int v[]={12,4,5,78,45,67,45,66,77,44};
      
      int x=Introducir.entero("Dime un número entero: ");
      
      int contIg=0, contMy=0, contMn=0;
        for (int i = 0; i < v.length; i++) {
           if (v[i]==x) contIg++;
           else if (v[i]>x) contMy++;
           else contMn++;
        }
        System.out.println("Hay "+contIg+" valores en el array iguales a "+x);
        System.out.println("Hay "+contMy+" valores en el array mayores a "+x);
        System.out.println("Hay "+contMn+" valores en el array menores a "+x);
    }
    
}
