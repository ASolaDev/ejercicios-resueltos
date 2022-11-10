/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tarea3_3;

/**
 *
 * @author isabel
 */
public class MisMetodos {
    
    //Método: perimetro_rectangulo
    public static double perimetro_rectangulo(double a, double b)
    {
        double perimetro=2*(b+a);
        return perimetro; 
    }
        
    public static double conversor_grados(double c)
    {
        double f=(9.0/5.0)*c+32; //Si se pone 9/5 sale 1, ya que es int/int=int
        return f;           
    }
    
    
    public static void ecuacion(double a, double b)
    {
        double x=-b/a;
        if(a==0 && b==0) 
            System.out.println("La solución es indeterminada");
        else if (a==0 && b!=0) 
            System.out.println("La solución es imposible");
        else 
            System.out.println("El resultado es x= "+x);         
    }
    
    public static double energia(double m)
    {
        final double C=299729458; //declaración como constante
        double e=m*C*C;
        return e;
    }
    
    public static double millas_terrestres(double k)   
    {        
        //1 milla terrestre = 1609 metros
        double mt=k*1000.0/1609;
        return mt;
    }
      
     public static double millas_marinas(double k)   
    {
        //1.Convertir km a metros
        k*=1000;
        //2. 1 milla marina=1852 metros
        double mm=k/1852.0;
        return mm;
    }
     
   public static double imc(double p, double a)
    { 
        a/=100; //Se introduce en cm y la fórmula es en m
        double imc=p/Math.pow(a,2); 
        System.out.println("El IMC es de: " +imc);
      
        if(imc<16.00) 
            System.out.println("Delgadez severa");
        else if(imc<17)
            System.out.println("Delgadez moderada");
        else if(imc<18.5)
            System.out.println("Delgadez aceptable");
        else if(imc<25)
            System.out.println("Peso normal");
        else if(imc<30)
            System.out.println("Sobrepeso");
        else if(imc<35)
            System.out.println("Obeso Tipo I");
        else if(imc<=40)
            System.out.println("Obeso Tipo II");
        else 
            System.out.println("Obesidad de Tipo III");
 
        return imc;
    }
   
   public static void meses (int n)
     {
        switch(n)
        {
            case 1 -> System.out.println("ENERO");
            case 2 -> System.out.println("FEBRERO");
            case 3 -> System.out.println("MARZO");
            case 4 -> System.out.println("ABRIL");
            case 5 -> System.out.println("MAYO");
            case 6 -> System.out.println("JUNIO");
            case 7 -> System.out.println("JULIO");
            case 8 -> System.out.println("AGOSTO");
            case 9 -> System.out.println("SEPTIEMBRE");
            case 10 -> System.out.println("OCTUBRE");
            case 11 -> System.out.println("NOVIEMBRE");
            case 12 -> System.out.println("DICIEMBRE");                      
        }
     } 
   
   public static long sumaCuadradosEntreX_Y(int x, int y){
       if (x<y) //Intercambio de valores entre las 2 variables
       {
           int aux=x;
           x=y;
           y=aux;
       }
       
       long suma=0;
       for (int i = x; i <= y; i++) {
          suma+=Math.pow(i, 2);
       }
       
       return suma;
   }
   
   public static void descendente(int x, int y)
     {
        if (x<y) //Intercambio de valores entre las 2 variables
       {
           int aux=x;
           x=y;
           y=aux;
       }
       //Otra forma sería:
       /*
       int menor=(x<y)?x:y;
       int mayor=(xx>y)?x:y;
       for(int i=mayor; i>=menor; i--) System.out.println(i);
       */
         for(int i=x;i>=y;i--) System.out.println(i);
     }
   
   
   
}
