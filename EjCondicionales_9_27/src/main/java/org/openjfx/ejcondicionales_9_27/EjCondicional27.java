/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * PROGRAMA: SALARIO
ENTORNO:
 salarioNeto, impuesto, salarioBruto variables numéricas reales
 numHoras, precioHora, tasa variables numéricas reales
ALGORITMO:
 Escribir "Dime el número de horas:"
 Leer numHoras
 Escribir "Dime el precio hora:"
 Leer precioHora
 
 salarioBruto <- numHoras * precioHora
 
 Si numHoras > 35 entonces 
    salarioBruto <- 35 * precioHora + (numHoras -35)* precioHora*1.5
 Finsi

 impuesto <- 0
 Si salarioBruto>100 entonces
    Si salarioBruto<=200 entonces
       impuesto <- (salarioBruto - 100) * 0.1
    Sino
       impuesto <- (200 -100) * 0.1 + (salarioBruto -200)*0.25
    FinSi
 FinSi

 Escribir "Salario bruto: " + salarioBruto
 Escribir "Impuestos a aplicar: "+impuesto
 Escribir "Salario neto: "+salarioNeto
 */

package org.openjfx.ejcondicionales_9_27;

import java.util.Scanner;


public class EjCondicional27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cadena;

        double salarioBruto, impuesto, salarioNeto;
        double numHoras, precioHora;
               
        System.out.println("Dime el número de horas: ");
        cadena=teclado.nextLine();
        numHoras=Double.parseDouble(cadena);
        
        System.out.println("Dime el precio por hora: ");
        cadena=teclado.nextLine();
        precioHora=Integer.parseInt(cadena);        
        
        if (numHoras<35) 
            salarioBruto=numHoras * precioHora;
        else
            salarioBruto=35*precioHora + (numHoras-35)*precioHora*1.5;
        
       impuesto=0;
       if (salarioBruto>100){
           if (salarioBruto<=200)
               impuesto=salarioBruto * 0.1;
           else
               impuesto=(200-100)*0.1 + (salarioBruto - 200)*0.25;         
       }
        
       salarioNeto = salarioBruto - impuesto;
       
        System.out.println("Salario Bruto: "+salarioBruto);
        System.out.println("Impuesto: "+impuesto);
        System.out.println("Salario Neto: "+salarioNeto);
        
    }
    
}
