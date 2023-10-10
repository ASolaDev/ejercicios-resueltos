/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria9octubre;

/**
 *
 * @author isabel
 */
public class postpreFijo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int x=9, y=7, z;
        
       y++;
        System.out.println("y="+y);
        
        System.out.println("y="+y++);
        
       ++y;
        System.out.println("y="+y);
        System.out.println("y="+ ++y);
        
        
       z = x++ -y;
        System.out.println("z="+z+" x="+x+" y="+y);
       z = ++x -y; 
       System.out.println("z="+z+" x="+x+" y="+y);
    }
    
}
