/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


package com.mycompany.prog06_tarea1;

/**
 *
 * @author isabel
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    /*
    Calculad el número de días transcurridos desde el 1 de Enero
    hasta un día (introducido por teclado) y un mes (introducido por
    teclado) -ambos deben ser positivos-, suponiendo que el año es NO
    bisiesto. Utilizad el TRUCO
    */
    public static void main(String[] args) {
       String meses[]={"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septbre","Octbre","Novbre","Dcbre"};
       int dias[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
       
       int mes=Introducir.enteroPositivo("Dime el mes: ");       
       int dia=Introducir.enteroPositivo("Dime el día:");
       
       int diasTranscurridos=0; //No ha empezado la cuenta
       //Por ej, si introducimos mes=5 y dia=12. Hay que contar los días que han pasado desde 1 de enero 
       //                                        hasta el 12 de mayo
       for (int i = 1; i < mes; i++) {  /* desde i=1 (enero) hasta i=4 (abril) de mes en mes */
            diasTranscurridos+=dias[i];
       }
        
       //Ahora se debe añadir el día : 12
       diasTranscurridos+=dia;
       
        System.out.println("Los días transcurridos desde el 1 de enero hasta el "+dia+" de "+meses[mes]+" son "+diasTranscurridos);
        
    }
    
}
