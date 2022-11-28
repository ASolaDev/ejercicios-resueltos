/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea4_2;

/**
 *
 * @author isabel
 */
public class Ejercicio7 {
    /**
     * Realizar un programa que pida el día, mes y año, y nos diga cuántos
     *   días han transcurrido desde el 1 de Enero hasta esa fecha
     *   introducida. (Controlar también si el año es bisiesto).
     */
    public static void main(String[] args) {
       String meses[]={"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septbre","Octbre","Novbre","Dcbre"};
       int dias[]={0,31,28,31,30,31,30,31,31,30,31,30,31};       
       
       int dia=Introducir.enteroPositivo("Dime el día:");
       int mes=Introducir.enteroPositivo("Dime el mes: ");       
       int anio=Introducir.enteroPositivo("Dime el año: "); 
       
       while (!Fecha.fechaCorrecta(anio, mes, dia)){ 
           /*también se puede poner while(Fecha.fechaCorrecta(anio, mes, dia)==false) */
           System.out.println("Error.... Fecha incorrecta, vuelva  a introducirla ");
           dia=Introducir.enteroPositivo("Dime el día:");
           mes=Introducir.enteroPositivo("Dime el mes: ");       
           anio=Introducir.enteroPositivo("Dime el año: "); 
       }
       
       int diasTranscurridos=0; //No ha empezado la cuenta
       //Por ej, si introducimos mes=5 y dia=12. Hay que contar los días que han pasado desde 1 de enero 
       //                                        hasta el 12 de mayo
       
       if (Fecha.bisiesto(anio)) //también se puede poner if (Fecha.bisiesto(anio)==true)
           dias[2]=29;
       
       for (int i = 1; i < mes; i++) {  
            diasTranscurridos+=dias[i];
       }
        
       //Ahora se debe añadir el día : 12
       diasTranscurridos+=dia;
       
        System.out.println("Los días transcurridos desde el 1 de enero hasta el "+dia+" de "+meses[mes]+" son "+diasTranscurridos);
         
    }
    
}
