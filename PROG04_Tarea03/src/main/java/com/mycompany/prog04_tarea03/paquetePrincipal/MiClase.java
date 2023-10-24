/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog04_tarea03.paquetePrincipal;

/**
 *
 * @author isabel
 */
public class MiClase {
    
    public static void menu(){
            System.out.println("********************************************");
            System.out.println("Menú de opciones:");
            System.out.println("1.Calcular perímetro de rectángulo");
            System.out.println("2.Convertir grados Celsius a Fahrenheit");
            System.out.println("3.Calcular área y volumen de un cilindro");
            System.out.println("4.Resolver la ecuación ax+b=0");
            System.out.println("5.Calcular la energía");
            System.out.println("6.Calcular la conversión de km a millas");
            System.out.println("7.Calcular IMC de 5 personas");
            System.out.println("8.Calcular la media aritmética de 15 alumnos");
            System.out.println("9.Introducir número y te diré el mes");
            System.out.println("10.Sumar las potencias de 2 entre dos números");
            System.out.println("11.Introducir 10 números y te diré cuantos 0 hay");
            System.out.println("12.Introducir números y te diré cuantos 0 hay");
            System.out.println("13.Mostrar números entre a y b");
            System.out.println("14.Mostrar múltiplos de 5 y 3 entre a y b");
            System.out.println("15.Sumar los números pares y media de los impares");
            System.out.println("16.Mostrar múltiplos de 3 entre 100 y 150");
            System.out.println("17.Mostrar cuantos billetes y monedas");
            System.out.println("18.Mostrar suma de los pares entre 50 y 500");
            System.out.println("19.Mostrar cifras de un número");
            System.out.println("20.Mostrar cociente y resto de dos números al azar");
            System.out.println("21.Calcular el número mayor");
            System.out.println("22.Mostrar factorial de un número al azar");
            System.out.println("23.Motrar factorial de los 5 primeros números naturales");
            System.out.println("24.Mostrar tabla de multiplicar de un número al azar");
            System.out.println("25.Mostrar tabla de multiplicar de varios números");
            System.out.println("26.Motrar los divisores de un número");
            System.out.println("27.Calcular el número de divisores y la suma");
            System.out.println("28.Indicar si un número es perfecto");
            System.out.println("29.Indicar si un número es primo");
            System.out.println("30.Mostrar todos los números primos entre dos números");
            System.out.println("31.Mostrar los 10 primeros números primos");
            System.out.println("32.Mostrar el primer número primo a partir de otro");
            System.out.println("33.Salir");
            System.out.println("\n********************************************");              
    }

    
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
        double x;
        if(a==0 && b==0) 
            System.out.println("La solución es indeterminada");
        else if (a==0 && b!=0) 
            System.out.println("La solución es imposible");
        else {
            x=-a/b;
            System.out.println("El resultado es x= "+x);         
             }
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
       if (x>y) //Intercambio de valores entre las 2 variables
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
   
   public static long factorial(int n){
       long f=1;
       for (int i = 1; i <= n; i++) {
           f*=i;
       }
       return f;
   }
     
   public static void tabla_multiplicar(int n)
    {
        System.out.println("La tabla de "+n);
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
   
    public static int contador_divisores(int n)
    {
        int cont=0;
        for (int i=1;i<=n;i++)
        {
            if(n%i==0) cont++;
        }
        return cont;
    }
    
    public static int suma_divisores(int n)
    {
        int suma=0;
        for (int i=1;i<=n;i++)
        {
            if(n%i==0) suma+=i;
        }
        return suma;
    }
    
    //En el último vídeo de los míos o penúltimo viene explicado de otra forma
    public static boolean primo(int n) //Se puede hacer de varias formas hasta la máxima optimización             
    {
        //lo voy a hacer sencillo.
        // Un número es primo cuando solo es divisible entre 1 y sí mismo.
        // ¿Cuántos divisores tiene un número primo? 2
        // Si el número de divisores = 2 entonces el número es primo
        
        boolean esPrimo; //se supone que todo número es primo, HASTA que se DEMUESTRE LO CONTRARIO
        
        if (n==1 || MiClase.contador_divisores(n) == 2 ) //El número 1 siempre es primo, aunque tenga 1 divisor
            esPrimo=true;
        else 
            esPrimo=false;
         
        return esPrimo;    
    }
   
}
