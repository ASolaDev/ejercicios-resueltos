/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: CALIFICACION
ENTORNO:
  nota variable numérica entera
ALGORITMO
  Escribir "Dime tu nota: "
  Leer nota
  Dependiendo de nota
     si 1, 2, 3, 4: Escribir "Suspenso"
     si 5: Escribir "Aprobado"
     si 6: Escribir "Bien"
     si 7,8: Escribir "Notable"
     si 9,10: Escribir "Sobresaliente"
     por defecto: Escribir "Nota incorrecta"
  FinDependiendo
*/

package org.openjfx.ejcondicionales_9_27;

import java.util.Scanner;


public class EjCondicional22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String cadena;

        int nota;
               
        System.out.println("Dime tu nota: ");
        cadena=teclado.nextLine();
        nota=Integer.parseInt(cadena);
        
        switch(nota){
            case 0: case 1: case 2: case 3: case 4: System.out.println("Suspenso");break;
            case 5: System.out.println("Aprobado");break;
            case 6: System.out.println("Bien");break;
            case 7: case 8: System.out.println("Notable");break;
            case 9: case 10: System.out.println("Sobresaliente");break;
            default: System.out.println("Error, nota incorrecta");   
            
        }
    }
    
}
