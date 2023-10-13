/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creacionmetodosestaticos;

/**
 *
 * @author isabel
 */
public class MiClase {


    public static int mayor(int a, int b){// a=9 b=12
        int salida;
        if (a>b){
            salida=a;
        }
        else {
            salida=b;
        }
        
        return salida;
    }
   
     //Metodo factorial
    public static long factorial(int a){// a=5    5!=1x2x3x4x5
        long fa=1;
        
        for (int i = 1; i <=a; i++) {
            fa = fa * i;//
        }
        
        return fa;
    }
   
    
    //Metodo bisiesto, entrada: int anio salida: boolean
    public static boolean bisiesto(int anio){
        boolean esBisiesto;
        
        if (anio %4 ==0 ){
            esBisiesto = true;
        }
        else {
            esBisiesto=false;
        }
        
        return esBisiesto;
    }
    
    
    public static void subrayado(){        
            System.out.println("_______________________________________________");        
    }

    public static void tablaMultiplicar(int x){
        System.out.println("-LISTADO DE LA TABLA DE MULTIPLICAR DE "+x);
        for (int i = 1; i <= 10; i++) {
            System.out.println(x+" x "+i+" = "+(x*i));
        }
    }
}  
      
      
      
 
    

