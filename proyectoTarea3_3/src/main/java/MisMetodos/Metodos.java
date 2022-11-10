/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MisMetodos;


public class Metodos 
{
     //MÉTODOS
    public static double perimetro_rectangulo(double a, double b)
    {
        double perimetro=2*(b+a);
        return perimetro; 
    }
    
    public static double conversor_grados(double c)
    {
        double f=1.8*c+32; //No se porqué si pongo 9/5 no sale el resultado
        return f;           
    }

    public static void area_volumen_cilindro(double r, double h)
    {
       double volumen=Math.PI*r*r*h;
       double area=(2*Math.PI*r*h)+(2*Math.PI*r*r);
        System.out.println("El volumen del cilindro es "+volumen);
        System.out.println("El área del cilindro es "+area);        
    }
    
    public static void ecuacion(double a, double b)
    {
        double x=-b/a;
        if(a==0 && b==0) System.out.println("La solución es indeterminada");
        else if (a==0 && b!=0) System.out.println("La solución es imposible");
        else System.out.println("El resultado es x= "+x);
         
    }
    
    public static double energia(double m)
    {
        double c=299729458;
        double e=m*c*c;
        return e;
    }
             
    public static double millas_terrestres(double k)   
    {
        //1.Convertir km a metros
        k*=1000;
        //1 milla terrestre = 1609 metros
        double mt=k*1000/1609;
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
        double imc=p/(a/100*a/100); //Se introduce en cm y la fórmula es en m
        System.out.println("El IMC es de: " +imc);
      
        if(imc<16.00) 
            System.out.println("Delgadez servera");
        else if(imc>=16.00 && imc<=16.99)
            System.out.println("Delgadez moderada");
        else if(imc>=17.00 && imc<=18.49)
            System.out.println("Delgadez aceptable");
        else if(imc>=18.50 && imc<=24.99)
            System.out.println("Peso normal");
        else if(imc>=25.00 && imc<=29.99)
            System.out.println("Sobrepeso");
        else if(imc>=30.00 && imc<=34.99)
            System.out.println("Obeso Tipo I");
        else if(imc>=35.00 && imc<=40.00)
            System.out.println("Obeso Tipo II");
        else 
            System.out.println("No existe clasificacion");
 
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
     
     public static int potencia(int a, int b)
     {
         int potencia=(a*a)+(b*b);
         return potencia;
     }
     
     public static int igual_cero(int num) //no la he sabido usar en el 11 y el 12
     {
         int i=0;
         if (num==0) i++; 
         return i; 
     }
     
     public static void descendente(int primero, int segundo)
     {
         int i;
         if(primero<segundo)
         {
             int aux=segundo;
             segundo=primero;
             primero=aux;
         }
         for(i=primero;i>=segundo;i--) System.out.println(i);
     }
     
     public static void multiplo3(int primero, int segundo)
     {
         int i;
          if(primero>segundo)
         {
             int aux=segundo;
             segundo=primero;
             primero=aux;
         }
         for(i=primero;i<=segundo;i++)
             if(i%3==0)System.out.println(i);
          
     }
     
      public static void multiplo5(int primero, int segundo)
     {
         int i;
          if(primero>segundo)
         {
             int aux=segundo;
             segundo=primero;
             primero=aux;
         }
         for(i=primero;i<=segundo;i++)
             if(i%5==0)System.out.println(i);
          
     }
      
      public static void contador_multiplo5(int primero, int segundo)
     {
         int i;
         int cont=0;
         if(primero>segundo)
         {
             int aux=segundo;
             segundo=primero;
             primero=aux;
         }
         for(i=primero;i<=segundo;i++)
         { 
             if(i%5==0) cont++;
         }
         System.out.println("Hay "+cont+" múltiplos de 5");       
      
     }
    
    public static int suma_pares(int n)
    {
        int sumapares=0;
        if(n%2==0) sumapares+=n; 
        return sumapares;
    }
    
    public static int suma_pares_entre_dos_numeros(int primero, int segundo)
    {
        int i, sumapares=0;
          if(primero>segundo)
         {
             int aux=segundo;
             segundo=primero;
             primero=aux;
         }
        for(i=primero;i<=segundo;i++)
        {
             if(i%2==0) sumapares+=i;
        }
        return sumapares;
    }
    public static int suma_impares(int n) 
    {
        int sumaimpares=0;
        if(n%2!=0) sumaimpares+=n; 
        return sumaimpares;
    }    
         
   
    public static int contador_impares(int n) 
    {
        int contimpares=0;
        if(n%2!=0) contimpares++; 
        return contimpares;
    }     
    public static void desglose_dinero(int cantidad) //solo he sabido hacerlo con números enteros
    {
        int b500=0;
        int b200=0;
        int b100=0;
        int b50=0;
        int b20=0;
        int b10=0;
        int b5=0;
        int m2=0;
        int m1=0;
        int reserva=0;
        cantidad=0;
        
        b500=cantidad/500;
        reserva=cantidad%500;
        
        b200=reserva/200;
        reserva=reserva%200;
       
        b100=reserva/100;
        reserva=reserva%100;
       
        b50=reserva/50;
        reserva=reserva%50;
        
        b20=reserva/20;
        reserva=reserva%20;
        
        b10=reserva/10;
        reserva=reserva%10;
        
        b5=reserva/5;
        reserva=reserva%5;
        
        m2=reserva/2;
        reserva=reserva%2;
       
        m1=reserva/1;
        
        System.out.println("Hay "+b500+" billetes de 500€");
        System.out.println("Hay "+b200+" billetes de 200€");
        System.out.println("Hay "+b100+" billetes de 100€");
        System.out.println("Hay "+b50+" billetes de 50€");
        System.out.println("Hay "+b20+" billetes de 20€");
        System.out.println("Hay "+b10+" billetes de 10€");
        System.out.println("Hay "+b5+" billetes de 5€");
        System.out.println("Hay "+m2+" monedas de 2€");
        System.out.println("Hay "+m1+" monedas de 1€"); 
    }
    
    public static void divisores(int n)
    {
        for (int i=1;i<=n;i++)
        {
            if(n%i==0) System.out.println(i);
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
    
    public static boolean primo(int n)
    {
        boolean esPrimo=true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {esPrimo=false;break;}        
        } 
        return esPrimo;    
    }
    
    public static int factorial(int n)
    {
        int factorial=1;
        while (n!=0)
        {
            factorial=factorial*n; n--;
        }
       return factorial;
    }
    
    
    public static void tablas_multiplicar(int n)
    {
        System.out.println("La tabla del "+n+" es:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
    
    public static void restas_sucesivas(int dividendo, int divisor)
    {
        int resto=dividendo;
        int cociente=0;
        
        while (resto>=divisor)
        {
            resto-=divisor;
            cociente++;
        }
       System.out.println("El cociente es " + cociente + " y el resto es " + resto);
    
    }
}
