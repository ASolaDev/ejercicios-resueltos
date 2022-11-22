/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_introducir;

/**
 *
 * @author isabel
 */
public class Principal {

    public static void main(String[] args) {
        
      /*
        int tren[];
        tren=new int[5];
        
        //El array tren se acaba de crear, digamos que es nuevo, por tanto, sus vagones están vacíos, con 0 personas
        for (int i = 0; i < 5; i++) {
            System.out.println("Vagón: "+i+" con "+tren[i]+" personas");            
        }
        
        for (int i = 0; i < tren.length; i++) { //tren.length indica los elementos que tiene el array tren (5 elementos)
            System.out.println("Vagón: "+i+" con "+tren[i]+" personas");            
        }
        
        //Voy poniendo los pasajeros en cada vagón, donde tren[0] es el primer vagon, tren[1] es el segundo vagón,.....
        tren[0]=49;
        tren[1]=32;
        tren[2]=90;
        tren[3]=35;
        tren[4]=943;
        
        //Muestro ahora el estado actual del tren, vagón a vagón, tren[i]
        for (int i = 0; i < 5; i++) {
            System.out.println("Vagón: "+i+" con "+tren[i]+" personas");            
        }
       
      
        //Otra forma de crear un array e inicializarlo a la vez
        // v contiene valores enteros y tiene 5 elementos
        int v[]={4,6,7,12,3};
        
        //Cambio el cuarto elemento, v[3] de valor, ahora v[3]=34
        v[3]=34;
        
        
        System.out.println("Introducción de 5 valores para el array v");
        for (int i = 0; i < v.length; i++) { //Para introducir enteros por teclado, utilizo la clase Introducir, método: entero
            /* int n=Introducir.entero("Dime el valor de v["+i+"]");            
               v[i]=n;
            
            v[i]=Introducir.entero("Dime el valor de v["+i+"]");            
        }
        
        System.out.println("Array introducido de forma completa: ");
        for (int i = 0; i < v.length; i++) {
            System.out.println("v["+i+"]="+v[i]);
        }     
        
        final String meses[]={"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septbre","Octbre","Novbre","Dcbre"};
        int dias[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        int dia=Introducir.enteroPositivo("Dime un día: ");
        int mes=Introducir.enteroPositivo("Dime un mes: ");
        int anio=Introducir.enteroPositivo("Dime un año: ");
        
        int sumaDias=0;
        if (anio%4==0) dias[2]=29; 
        for (int i = 1; i < mes ; i++) {
            sumaDias=sumaDias + dias[i];
        }
        sumaDias+=dia;
        
        
       //meses[7]="José";
       
       */
       int w[]=new int[4];// w=023fa   0 0 0 0
       w[0]=89; //023fa 
       w[1]=89;
       w[2]=89;
       w[3]=89;
       
       int x[]=new int[4];// x=1234 // 0 0 0 0
       
       x[2]=w[3]; // x 0 0 89 0
       x[2]++; //x 0 0 90 0
       
       
       int y=9, z=7;
       y=z;// y=7
       
       
       x=w;// x  89 89 89 89 // x toma la misma dirección de memoria que guarda w
       
       for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }
        
       
       x[2]++; // 89 89 90 89
       for (int i = 0; i < w.length; i++) {
            System.out.println(w[i]);
        }
       
       
       /* Introducir 5 números enteros y calcular cuál es el mayor*/
       int m[]=new int[5];
       
        for (int i = 0; i < 5; i++) {
            m[i]=Introducir.entero("Dime un número: ");
        }
        
        int my=Integer.MIN_VALUE;
        for (int i = 0; i < 5; i++) {
            if (m[i]>my) my=m[i];
        }
        
        System.out.println("El mayor de todos es "+my);
        
       
        
        
    }
}
