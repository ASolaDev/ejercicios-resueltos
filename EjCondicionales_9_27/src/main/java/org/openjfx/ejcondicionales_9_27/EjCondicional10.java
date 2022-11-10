/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: PRECIO DE LLAMADA
   ENTORNO:
    duracion, coste variable numérica real

   ALGORITMO
    Escribir "Dime la duración de la llamada: "
    Leer duracion
    coste <- 0.25
    Si duracion > 3 entonces
       coste <- (duracion - 3) * 0.06 + 0.25    
    FinSi
    Escribir "Coste de la llamada: "+coste
 *
 */

package org.openjfx.ejcondicionales_9_27;

import java.util.Scanner;


public class EjCondicional10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
       String cadena;

        double duracion, coste;
               
        System.out.println("Dime la duración de la llamada: ");
        cadena=teclado.nextLine();
        duracion=Double.parseDouble(cadena);
       
        coste=0.25;
        if (duracion >3){
            coste=(duracion - 3) * 0.06 + 0.25;            
        }
        System.out.println("Coste de la llamada: "+coste);
    }
    
}
