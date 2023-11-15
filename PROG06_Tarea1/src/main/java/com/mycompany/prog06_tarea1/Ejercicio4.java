/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package com.mycompany.prog06_tarea1;

/**
 *
 * @author isabel
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    /*
    Comprobad si una fecha introducida por teclado es correcta, para
    ello, introducir por teclado: día, mes y año (todos enteros positivos)
        a) Diseña un método estático en una clase Fecha: bisiesto,
            tal que dado un año, considerado como dato de entrada, devuelve
            true o false, en función de si es bisiesto o no. Búsqueda por Google
            lo de bisiesto.
        b) En main()
            1. Un año es correcto si está entre 0 y 3000
            2. Un mes es correcto si está entre 1 y 12
            3. Un día es correcto si está comprendido entre 1 y el
                último día del mes ¡¡Cuidado con febrero, ya que si el
                año es bisiesto, el número de días es 29!!
    * Utilizad el TRUCO
    */
    public static void main(String[] args) {
        int dias[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        int agno=Introducir.enteroPositivo("Dime el año:");
        int mes=Introducir.enteroPositivo("Dime el mes: ");       
        int dia=Introducir.enteroPositivo("Dime el día:");
        
        boolean fechaCorrecta=false;
        if (agno >=0 && agno<=3000){ //el año está comprendido entre 0 y 3000
            if (mes >=0 && mes <=12){
                //if (Fecha.bisiesto(agno)==true)
                if (Fecha.bisiesto(agno))// también se puede poner 
                     dias[2]=29;
                if (dia > 0 && dia <=dias[mes])
                    fechaCorrecta=true;
            }
        }
        
        System.out.println("La fecha "+dia+"/"+mes+"/"+agno);
        System.out.println((fechaCorrecta)?"es correcta":"No es correcta");
    }
    
}
