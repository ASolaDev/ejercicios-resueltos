/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: SALARIO
ENTORNO:
  horasTrabajadas, precioHora, salario variables numéricas variables
ALGORITMO:
     Escribir "Dime las horas trabajadas: "
     Leer horasTrabajadas
     Escribir "Dime el precio por hora: "
     Leer precioHora
    
    Si horasTrabajadas>40 entonces
       salario <- (horasTrabajadas - 40) * precioHora + 40*precioHora
    sino
       salario <- horasTrabajadas * precioHora;
    FinSi
    Escribir "El salario es: "+salario
*/
package org.openjfx.ejcondicionales_9_27;

import java.util.Scanner;
public class EjCondicional17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        String cadena;
        double horasTrabajadas, precioHora, salario;
               
        System.out.println("Dime las horas trabajadas: ");
        cadena=teclado.nextLine();
        horasTrabajadas=Double.parseDouble(cadena);
        
        System.out.println("Dime el precio por hora: ");
        cadena=teclado.nextLine();
        precioHora=Double.parseDouble(cadena);
                        
       if (horasTrabajadas>40){
          salario=40*precioHora + (horasTrabajadas - 40)*precioHora;
       }
       else{
          salario=horasTrabajadas*precioHora;
       }
        System.out.println("El salario es :"+salario);
    }
    
}
