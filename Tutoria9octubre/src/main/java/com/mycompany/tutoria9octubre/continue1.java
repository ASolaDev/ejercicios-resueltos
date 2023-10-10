/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria9octubre;

/**
 *
 * @author isabel
 */
public class continue1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Muestra del 1 al 10, a excepcion del 7
        for(int i=1; i<=10; i++){
            if (i==7){continue;}
            System.out.println(i);
        }
    }
    
}
