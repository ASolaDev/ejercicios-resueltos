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
public class PROG02_Ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //El número de alumnos matriculados en Programación
       //, número de alumnos matriculados en Entornos de Desarrollo
       //y número de alumnos matriculados en Base de datos.
       //El programa deberá mostrar el % de alumnos matriculado en cada uno de los tres
       // módulos. Se supone que un alumno sólo puede estar matrículado en un módulo.
       //Trata de mostrar un solo decimal en los porcentajes.
       
         //ENTORNO
      Scanner teclado=new Scanner(System.in); //Recordad que hay que importar Scanner
      String cadena; 
      
      int numAlumnosPRG, numAlumnosED, numAlumnosBD; //Los he puesto int
      
     // Ahora, introducimos los valores 
      System.out.print("Introduce numero de alumnos matriculados en PROGRAMACION: "); 
        cadena=teclado.nextLine();
        numAlumnosPRG=Integer.parseInt(cadena);
     
      System.out.print("Introduce numero de alumnos matriculados en ENTORNOS DE DESARROLLO: "); 
        cadena=teclado.nextLine();
        numAlumnosED=Integer.parseInt(cadena);
     
      System.out.print("Introduce numero de alumnos matriculados en BASES DE DATOS: "); 
        cadena=teclado.nextLine();
        numAlumnosBD=Integer.parseInt(cadena);
       
      int sumaAlumnos= numAlumnosPRG + numAlumnosED + numAlumnosBD;
      
      float porcentajePRG, porcentajeED, porcentajeBD;
      
      porcentajePRG = numAlumnosPRG * 100 / (float) sumaAlumnos; //Con un valor que se transforme a float es suficiente
      porcentajeED =  numAlumnosED * 100 / (float) sumaAlumnos;//Con un valor que se transforme a float es suficiente
      porcentajeBD = numAlumnosBD * 100 / (float) sumaAlumnos; //Con un valor que se transforme a float es suficiente
      
        System.out.println("Hay un total de "+sumaAlumnos+" matriculados");
        System.out.println("De PRG hay "+numAlumnosPRG+" alumnos, que representa un "+porcentajePRG+"%");
        System.out.println("De ED hay "+numAlumnosED+" alumnos, que representa un "+porcentajeED+"%");
        System.out.println("De BD hay "+numAlumnosBD+" alumnos, que representa un "+porcentajeBD+"%");
      
        
      //Con 2 cifras decimales en el porcentaje
        System.out.println("\n\n----CON 2 CIFRAS DECIMALES EN EL PORCENTAJE-----");
      System.out.println("Hay un total de "+sumaAlumnos+" matriculados");
        System.out.print("De PRG hay "+numAlumnosPRG+" alumnos, que representa un ");
        System.out.printf("%.2f",porcentajePRG);
        System.out.println("%");
        System.out.print("De ED hay "+numAlumnosED+" alumnos, que representa un ");
        System.out.printf("%.2f",porcentajeED);
        System.out.println("%");
        System.out.print("De BD hay "+numAlumnosBD+" alumnos, que representa un ");
        System.out.printf("%.2f",porcentajeBD);
        System.out.println("%");      
        
    }
    
}
