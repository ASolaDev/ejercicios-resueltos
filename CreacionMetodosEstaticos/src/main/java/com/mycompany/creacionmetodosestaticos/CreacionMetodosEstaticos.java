/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creacionmetodosestaticos;


/**
 *
 * @author isabel
 */
public class CreacionMetodosEstaticos {

    public static void main(String[] args) {
        /*
        int x=9, y=12;
        
        int z;
        
        
        z=MiClase.mayor(x,y); //public static int mayor (int a, int b)
        
        
        System.out.println("z="+z);
        
        z= MiClase.mayor(8,25);
        System.out.println("z="+z);
         
        System.out.println("El mayor de 8 y x es ="+MiClase.mayor(8, x));
        
        
        z=Integer.MIN_VALUE;
        
        for (int i = 1; i <= 10; i++) {
            double azar=Math.random()*(100-0+1)+0; //rango de 0 a 100, ambos incluidos
            int resultadoAzar = (int)azar;
            System.out.println(i+"- Numero generado al azar="+resultadoAzar);
            z=MiClase.mayor(z,resultadoAzar);
        }
        
        System.out.println("El valor mayor de todos es ="+z);
        
        */
        MiClase.subrayado();
        int x=5;       
        long fx= MiClase.factorial(x);
        System.out.println("El factorial de "+x+" es "+fx);
       
        
        System.out.println("El factorial de 10 es "+MiClase.factorial(10));
        
        MiClase.subrayado();
        
        int anio=2023;
        boolean si=MiClase.bisiesto(anio);
        if (si == false){ // if (!si)
            System.out.println(anio +" NO es bisiesto");
        }
        else{
            System.out.println(anio +" es bisiesto");
        }
        
        MiClase.subrayado();
        System.out.println("Listado de todos los años del siglo XXI bisiestos hasta 2023");
        for (int i = 2000; i <= 2023; i++) {
            if (MiClase.bisiesto(i)==true){
                System.out.println("El año "+i+" fue bisiesto");
            }
        }
        
        MiClase.subrayado();
        MiClase.tablaMultiplicar(7);
        
        MiClase.subrayado();
        MiClase.tablaMultiplicar(x);
        
        MiClase.subrayado();
        for (int i = 0; i <=10; i++) {
            MiClase.tablaMultiplicar(i);
            MiClase.subrayado();
        }
        
        
    }
}
