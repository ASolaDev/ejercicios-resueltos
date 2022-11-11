/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.openjfx.martes_8_noviembre;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String cadena;
       /* 
        System.out.println("Dime el primer número: ");
        cadena=teclado.nextLine();
        int n1= Integer.parseInt(cadena);  //n1 =9
        
        System.out.println("Dime el segundo número: ");
        cadena=teclado.nextLine();
        int n2= Integer.parseInt(cadena);// n2= 23
        
        
        int z=MisMetodos.mayor(n1, n2);  // mayor(9,23);
        
        System.out.println("El mayor entre "+n1+" y "+n2+" es "+z);
        
        
        int zz=MisMetodos.mayor(156, 234);
        System.out.println("El mayor es "+zz);
        
        int x=45, y=7;
        int my=MisMetodos.mayor(x, y);
        
        System.out.println("Mayor "+my);
        
        
        x=230; y=98;
        System.out.println("El mayor entre "+x+" y "+y+" es :"+MisMetodos.mayor(x,y));
        */
        //Ejercicio, cálculo del mayor de 5 números introducidos por teclado
        /* posibilidad a)
        
        int mayo=Integer.MIN_VALUE;
        System.out.println("MIN_VALUE"+Integer.MIN_VALUE);
        */
        System.out.println("Dime el número: 1");
             cadena=teclado.nextLine();
             int n= Integer.parseInt(cadena);
        int mayo=n;
        
        for (int i = 2; i <= 5; i++) {
             System.out.println("Dime el número: "+i);
             cadena=teclado.nextLine();
             n= Integer.parseInt(cadena);
               
             
             mayo=MisMetodos.mayor(mayo, n);            
        }
        
        System.out.println("El mayor de todos los números introducidos es: "+mayo);
        
        
        
        
        
        
        /*
        public static  int    mayor(int x, int y){ // x=n1=9   y=n2=23
        int my;
        
           if (x>y) my=x;
           else my=y;
        
        return my;//my=23
    }

    */
        
    }
    
}
