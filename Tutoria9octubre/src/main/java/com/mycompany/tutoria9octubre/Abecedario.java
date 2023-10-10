/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria9octubre;

/**
 *
 * @author isabel
 */
public class Abecedario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int x=97; x<='z';x++)
           System.out.println(x);
        
        System.out.println((int)'9');
        
        
        
        byte b1=9, b2=8, sb;
        sb=(byte) (b1+b2);
        sb=(byte) (b1-b2);
        sb=(byte) (b1*b2);
        sb=(byte) (b1/b2);
        sb= (byte) (b1%b2);
        
        short s1=91, s2=81, ss;
        ss=(short) (s1+s2);
        
        
        float l1=912.3f, l2=811, sl;
        sl=l1%l2;
        
        System.out.println("sl ="+sl);
        
        byte b=2;
        float s=8;
        float sh= b + s;
    }
    
}
