/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria9octubre;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class switch1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Determinar en funcion de un numero introducido por teclado el nombre 
        // del dia de la semana
        //Indica el caso de que el dia sea incorrecto
        Scanner teclado=new Scanner(System.in);
        String cadena;
        
        System.out.print("Dime un numero de la semana en el que nos encontramos: ");
        cadena=teclado.nextLine();
        int x=Integer.parseInt(cadena);
       
        //Con if's y else
        if (x==1){
            System.out.println("Es lunes");
        }else if (x==2){
            System.out.println("Es martes");
        }else if (x==3){
            System.out.println("Es miercoles");
        }else if (x==4){
            System.out.println("Es jueves");
        }else if (x==5){
            System.out.println("Es viernes");
        }else if (x==6){
            System.out.println("Es sabado");
        }else if (x==7){
            System.out.println("Es domingo");
        }else{
            System.out.println("Numero de dia de la semana incorrecto");
        }
        
        //switch
        switch (x) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("Numero de dia de la semana incorrecto");                
        }
       
        //Alternativa al switch
        if (x<1 || x>7){
            System.out.println("Numero de dia de la semana incorrecto");
        }else{
            switch (x){
            case 1: System.out.println("Es lunes");break;
            case 2: System.out.println("Es martes");break;
            case 3: System.out.println("Es miercoles");break;
            case 4: System.out.println("Es jueves");break;
            case 5: System.out.println("Es viernes");break;
            case 6: System.out.println("Es sabado");break;
            case 7: System.out.println("Es domingo");break;            
           }        
        }
        
    }
    
}
