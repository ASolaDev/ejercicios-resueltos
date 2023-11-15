/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


package com.mycompany.prog06_tarea1;

/**
 *
 * @author isabel
 */

/*
    Mostrad los nombres de aquellos meses que tengas días pares
*/
public class Ejercicio1 {

    public static void main(String[] args) {
       String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septbre","Octbre","Novbre","Dcbre"};
       int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
       
        System.out.println("Los meses que tienen días par son: ");
        for (int i = 0; i < meses.length; i++) {
            if (dias[i]%2 == 0) //el número de días es par?
                System.out.println(meses[i]);
        }
       
    }
}
