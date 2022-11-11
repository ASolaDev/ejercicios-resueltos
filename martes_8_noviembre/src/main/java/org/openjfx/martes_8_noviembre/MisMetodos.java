/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.openjfx.martes_8_noviembre;

/**
 *
 * @author isabel
 */
public class MisMetodos {
    
    public static  int  mayor(int x, int y){
        int my;
        
           if (x>y) my=x;
           else my=y;
        
        return my;
    }
    
    
   // 5!= 1*2*3*4*5 =120
    
    public static long factorial(int n){
        long f=1;
          for (int i = 1; i <= n; i++) {
            f*=i; //f=f*i;
        }
          
        return f;
    }
    
    public static  void     tablaMultiplicar(int n){
        System.out.println("Tabla de multiplicar del "+n);
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+" x "+n+" = "+(i*n));
        }
                
    }
    
    
    
}
