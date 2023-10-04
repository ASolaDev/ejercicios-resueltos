/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prog02_tarea02;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class PROG02_Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Resolver una ecuación de primer grado con una incógnita (x), suponiendo que los
        //coeficientes de la ecuación son C1 y C2 se inicializan por teclado
        //C1x + C2 = 0
        
        //No hemos dado todavia los condicionales en Java, por lo que, c1 y c2 son distintos a 0
        
        //ENTORNO
      Scanner teclado=new Scanner(System.in); //Recordad que hay que importar Scanner
      String cadena; 
      
      float c1, c2; //Los he puesto float, para que cuando -c2/c1 obtenga parte decimal
      
     // Ahora, introducimos los valores de c1 y c2  por teclado
      System.out.print("Introduce c1: "); 
        cadena=teclado.nextLine();
        c1=Float.parseFloat(cadena);
     
      System.out.print("Introduce c2: "); 
        cadena=teclado.nextLine();
        c2=Float.parseFloat(cadena);
       
      float x= -c2/c1;
      
        System.out.println("La solucion es: "+x);  
        
      //* IMPORTANTE: ¿Como representar 4 cifras decimales? 
      //https://puntocomnoesunlenguaje.blogspot.com/2012/08/java-printf.html
        System.out.printf("Resultado con 4 cifras decimales: %.4f",x);
        
      //* IMPORTANTE ¿Que pasa si c1 y c2 son enteros int?
      // Por ej, c1 = 3 y c2 = -7, la solucion deberia de ser
      // x = 7 / 3; -> x = 2.3333
      // Si lo ejecutas, veras que sale 2.0000 
      
      //Eso significa que al ser c1 y c2 enteros, la division / se hace entre enteros
      // y devuelve un entero
      
      //Hay 2 soluciones:
      //1. c1 y c2 se declaran como float (reales) aunque se pueden introducir enteros,
      //                       y la division / devolvera un real con decimales
      
      //2. c1 y c2 se declaran como int (enteros), no tienen decimales
      //                       , entonces se deberia poner
      // x = (float)-c2 / (float)c1; ¿Por que?
      // (float) -c2 transforma -c2 con decimales, aunque sean .00000000
      // (float) c1 transforma c1 con decimales
      // La division entre reales, devolvera reales. ¡¡¡Haz la prueba!!!  
      
    }
    
}
