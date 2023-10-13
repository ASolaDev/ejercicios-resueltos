/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creacionmenus;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class MiClase {
    public static void subrayado(){        
            System.out.println("_______________________________________________");        
    }

    public static int introducirEntero(String mensaje){
        int opcion;
        Scanner teclado=new Scanner(System.in);
        String cadena;
        
        System.out.println(mensaje);
        cadena=teclado.nextLine();
        int x=Integer.parseInt(cadena);
        
        return x;
    }
    
    public static void mostrarMenu(){
        MiClase.subrayado();
        System.out.println("---- LISTADO DE OPCIONES ----");
        System.out.println("1- Introduce un numero y te dire si es par o impar");
        System.out.println("2- Introduce un numero y muestro su tabla de multiplicar");
        System.out.println("3- Introduce un numero y te dire cual es su factorial");
        System.out.println("4- Salir");
    }
    
    public static void opcion1(){
        MiClase.subrayado();
        int numero=MiClase.introducirEntero("Dime un numero entero y te dire si es par o impar:");
        if (numero %2 ==0){
            System.out.println(numero+" es par");
        }
        else{
            System.out.println(numero+" es impar");
        }
    }
    
    public static void tablaMultiplicar(int x){
        System.out.println("-LISTADO DE LA TABLA DE MULTIPLICAR DE "+x);
        for (int i = 1; i <= 10; i++) {
            System.out.println(x+" x "+i+" = "+(x*i));
        }
    }
    
    public static void opcion2(){
        MiClase.subrayado();
        int numero=MiClase.introducirEntero("Dime un numero entero y mostrare la tabla de multiplicar:");    
        MiClase.tablaMultiplicar(numero);
    }
    
      //Metodo factorial
    public static long factorial(int a){// a=5    5!=1x2x3x4x5
        long fa=1;
        
        for (int i = 1; i <=a; i++) {
            fa = fa * i;//
        }
        
        return fa;
    }
   
    public static void opcion3(){
        MiClase.subrayado();
        int numero=MiClase.introducirEntero("Dime un numero entero y te dire su factorial:");    
        long fNumero=MiClase.factorial(numero);
        System.out.println("El factorial de "+numero+" es "+fNumero);
    }
    
}
