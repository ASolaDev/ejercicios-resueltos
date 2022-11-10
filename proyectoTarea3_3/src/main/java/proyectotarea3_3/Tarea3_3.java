/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package proyectotarea3_3;

import java.util.Scanner;


public class Tarea3_3 
{
   
   
    public static void main(String[] args) 
    { 
        Scanner teclado;
        teclado=new Scanner(System.in);
        int opcion;
        do
        {
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
            System.out.println("20.Mostrar coeficiente y resto de dos números al azar");
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
            
            System.out.print("Introduzca una opción: ");
            opcion=teclado.nextInt();
            
       
            switch(opcion)
            {
                case 1 -> { 
                    System.out.print("Dime la base del rectángulo: ");
                    double base=teclado.nextDouble();
                    System.out.print("Dime la altura del rectángulo: ");
                    double altura=teclado.nextDouble();
                    double perimetro=MisMetodos.Metodos.perimetro_rectangulo(altura,base);
                    System.out.println("El perímetro del réctangulo de base "+base+" y altura "+altura+" es de: "+perimetro);
                }
                    
                case 2 -> {  
                    System.out.print("Dime los grados Celsius: ");
                    double c=teclado.nextDouble();
                    double f=MisMetodos.Metodos.conversor_grados(c);
                    System.out.println(c+" grados Celsius equivale a "+f+" grados Fahrenheit");
                }
                    
                case 3 -> {
                    System.out.print("Dime la altura del cilindro: ");
                    double h=teclado.nextDouble();
                    System.out.print("Dime el radio de la base del cilindro: ");
                    double r=teclado.nextDouble();
                    MisMetodos.Metodos.area_volumen_cilindro(r,h);
                }
                    
                case 4 -> {
                    System.out.print("Dime el valor de a: ");
                    double a=teclado.nextDouble();
                    System.out.print("Dime el valor de b: ");
                    double b=teclado.nextDouble();
                    MisMetodos.Metodos.ecuacion(a,b);
                }
                    
                case 5 -> {
                    System.out.print("Dime la masa en kg: ");
                    double masa=teclado.nextDouble();
                    System.out.println(MisMetodos.Metodos.energia(masa));
                }
                    
                case 6 -> {
                    //no funciona
                    System.out.print("Dime los km: ");
                    double km=teclado.nextDouble();
                    //error a partir de aquí
                    System.out.print("¿Qué conversión desea hacer? M(Marina) T(Terrestre)");
                    String cadena;
                    cadena=teclado.nextLine();
                    char eleccion=cadena.charAt(0);//para elegir el primer caracter
                    eleccion=Character.toUpperCase(eleccion);//para convertir en mayúscula
                    
                    switch (eleccion) 
                    {
                        case 'T' -> System.out.println(km+" km equivale a "+MisMetodos.Metodos.millas_terrestres(km)+" millas terrestres");
                        case 'M' ->System.out.println(km+" km equivale a "+MisMetodos.Metodos.millas_marinas(km)+" millas marinas");
                        default -> System.out.println("Opción equivocada");
                    }
                }

                case 7 -> {
                    int i;
                    for(i=0;i<5;i++)
                    { 
                        System.out.print("Dime el peso en kg: ");
                        double peso=teclado.nextDouble();
                        System.out.print("Dime la altura en cm: ");
                        double alt=teclado.nextDouble();
                        MisMetodos.Metodos.imc(peso,alt);
                    }
                }
                    
                case 8 -> {
                    int n=1, nota, sumanota=0;
                    do
                    {
                        System.out.print("Dime la nota:");
                        nota=teclado.nextInt();
                        if(nota>=0 && nota <=10) 
                        {
                            System.out.println("Nota correcta");
                            n=n+1;
                            sumanota+=nota;
                        }
                   
                        else System.out.println("Nota incorrecta");
                        
                    }while(n<=15);
                    System.out.println("Nota media = "+(sumanota/15.0));
                }
        
                case 9 -> {
                    System.out.print("Introduzca un número del 1 al 12: ");
                    int mes=teclado.nextInt();
                    MisMetodos.Metodos.meses(mes);
                }
                    
                case 10 -> {
                    System.out.print("Introduzca el primer número: ");
                    int x=teclado.nextInt();
                    System.out.print("Introduzca el segundo número:");
                    int y=teclado.nextInt();
                    System.out.println("La suma de las potencias de dos de "+x+" y "+y+" es de "+MisMetodos.Metodos.potencia(x,y));
                }
                    
                case 11 -> {
                    int num=0, cont=0;
                    int i;
                    for(i=0;i<10;i++)
                    {
                        System.out.print("Introduzca un número:");
                        num=teclado.nextInt();
                        if (num==0) cont++;
                    }
                    System.out.println("Hay "+cont+" números igual a cero.");
                }
             
                case 12 -> {
                    int i = 0;
                    int num;
                    do
                    {
                        System.out.print("Introduzca un número:");
                        num=teclado.nextInt();
                        if (num==0) i++;  
                        
                    }while (num!=-1);
                    System.out.println("Hay "+i+" números igual a cero.");
                }
           
                case 13 -> { 
                    System.out.print("Dime un número:");
                    int primero=teclado.nextInt();
                    System.out.print("Dime otro número:");
                    int segundo=teclado.nextInt();
                    MisMetodos.Metodos.descendente(primero,segundo);
                }
                   
                case 14 -> { 
                    System.out.print("Dime un número:");
                    int primero = teclado.nextInt();
                    System.out.print("Dime otro número:");
                    int segundo = teclado.nextInt();
                    System.out.println("Los múltiplos de 3 son:");
                    MisMetodos.Metodos.multiplo3(primero,segundo);
                    System.out.println("Los múltiplos de 5 son:");
                    MisMetodos.Metodos.multiplo5(primero,segundo);
                }
                 
                case 15 -> { 
                    int sumapares=0;
                    int contimpares=0;
                    int sumaimpares=0;
                    int num;
                    int i;
                    for(i=0;i<10;i++)
                    {
                        System.out.print("Dime un número:");
                        num=teclado.nextInt();
                        sumapares+=MisMetodos.Metodos.suma_pares(num);
                        sumaimpares+=MisMetodos.Metodos.suma_impares(num);
                        contimpares+=MisMetodos.Metodos.contador_impares(num);
                    }
                    System.out.println("La suma de los números pares es de: " +sumapares);
                    System.out.println("Se han introducido "+contimpares+" números impares");
                    System.out.println("La media de los números impares es de "+(sumaimpares/contimpares));
                }
                    
                case 16 -> {
                    int primero = 100;
                    int segundo = 150;
                    System.out.println("Los múltiplos de 3 entre 100 y 150 son:");
                    MisMetodos.Metodos.multiplo3(primero,segundo);
                    MisMetodos.Metodos.contador_multiplo5(primero,segundo);
                    System.out.println("La suma de los pares es de " +MisMetodos.Metodos.suma_pares_entre_dos_numeros(primero,segundo));
                } 
  
                case 17 -> {
                    //solo para cantidades enteras
                    int cantidad=0;
                    System.out.print("Introduzca una cantidad de dinero mayor que 100: ");
                    cantidad=teclado.nextInt(); 
                    if(cantidad>100) MisMetodos.Metodos.desglose_dinero(cantidad);
                    else System.out.println("ERROR, cantidad no disponible");
                }
                
                case 18 -> {
                    int primero = 50;
                    int segundo = 500;
                    System.out.println("La suma de los pares entre 50 y 500 es de " +MisMetodos.Metodos.suma_pares_entre_dos_numeros(primero,segundo));
                    System.out.println("Los múltiplos de 3 entre 50 y 500 son:");
                    MisMetodos.Metodos.multiplo3(primero,segundo);
                    MisMetodos.Metodos.contador_multiplo5(primero,segundo);
                }
                    
                case 19 -> { //no sé hacerlo
                }
                    
                case 20 -> {
                    int dividendo = (int) (Math.random() * 1000 + 1);
                    int divisor = (int) (Math.random() * 1000 + 1);
                    if(divisor>dividendo)
                    {
                        int aux=dividendo;
                        dividendo=divisor;
                        divisor=aux;
                    }
                    System.out.println("El dividendo es "+dividendo+" y el divisor es "+divisor);
                    MisMetodos.Metodos.restas_sucesivas(dividendo,divisor);
                }
                    
                case 21 -> {
                    int mayor=0;
                    int n;
                    int i;
                    for(i=0;i<10;i++)
                    {
                        System.out.print("Dime un número: ");
                        n=teclado.nextInt();
                        if(n>mayor) mayor=n;
                    }
                    System.out.println("El número mayor es: "+mayor);
                }
                    
                case 22 -> {
                    int azar = (int) (Math.random() * 10 + 1);
                    System.out.println("El factorial del número "+azar+" es " +MisMetodos.Metodos.factorial(azar));
                }
                    
                case 23 -> {
                    int n;
                    for(n=1;n<=5;n++)
                    {
                        System.out.println("El factorial del número "+n+" es " +MisMetodos.Metodos.factorial(n));
                    }
                }
                    
                case 24 -> {
                    int azar = (int) (Math.random() * 10 + 1);
                    MisMetodos.Metodos.tablas_multiplicar(azar);
                }
                    
                case 25 -> {
                    System.out.print("Dime un número entero entre el 1 y el 9: ");
                    int primero = teclado.nextInt();
                    System.out.print("Dime otro número entero entre el 1 y el 9: ");
                    int segundo = teclado.nextInt();
                    System.out.println("Los tablas de multiplicar de los números entre "+primero+" y " +segundo+ " son:");
                    if(primero>segundo)
                    {
                        int aux=segundo;
                        segundo=primero;
                        primero=aux;
                    }
                    int n;
                    for(n=primero;n<=segundo;n++)
                    {
                        MisMetodos.Metodos.tablas_multiplicar(n);
                    }
                }
                    
                case 26 -> {
                    System.out.print("Dime un número entero: ");
                    int n = teclado.nextInt();
                    System.out.println("Los divisores de "+n+" son: ");
                    MisMetodos.Metodos.divisores(n);
                }
                    
                case 27 -> {
                    System.out.print("Dime un número entero: ");
                    int n = teclado.nextInt();
                    System.out.println(n+ " tiene " +MisMetodos.Metodos.contador_divisores(n)+" divisores");
                    System.out.println("La suma de sus divisores es de "+MisMetodos.Metodos.suma_divisores(n));
                }
                    
                case 28 -> {
                    System.out.print("Dime un número entero: ");
                    int n = teclado.nextInt();
                    if(MisMetodos.Metodos.suma_divisores(n)-n==n) System.out.println("El número "+n+" es perfecto");
                    else System.out.println("El número "+n+" NO es perfecto");
                }
                    
                case 29 -> {
                    System.out.print("Dime un número entero: ");
                    int n = teclado.nextInt();
                    if(MisMetodos.Metodos.primo(n)==true) System.out.println(n+" es primo");
                    else System.out.println(n+" no es primo");
                }
                    
                case 30 -> {
                    System.out.print("Dime un número entero: ");
                    int primero = teclado.nextInt();
                    System.out.print("Dime un número entero: ");
                    int segundo = teclado.nextInt();
                    System.out.println("Los números primos entre "+primero+" y " +segundo+ " son:");
                    if(primero>segundo)
                    {
                        int aux=segundo;
                        segundo=primero;
                        primero=aux;
                    }
                    int n;
                    for(n=primero;n<=segundo;n++)
                    {
                        if(MisMetodos.Metodos.primo(n)==true)System.out.println(n);
                    }
                }
                    
                case 31 -> {
                    System.out.println("Los 10 primeros números primos son:");
                    int contprimos=0;
                    int i;
                    for(i=1;contprimos<10;i++)
                    {
                        if(MisMetodos.Metodos.primo(i)==true)
                        {
                            System.out.println(i);
                            contprimos++;
                        } 
                    }
                }
                    
                case 32 -> {
                    //no se porqué no me funciona
                    System.out.print("Dime un número entero:");
                    int n = teclado.nextInt();
                    int i;
                    for(i=n;;i++)
                    {
                        if(MisMetodos.Metodos.primo(n)==true) 
                        {
                            System.out.println("El primer número primo es: "+i);
                            break;
                        }
                    }
                }

                
            }   
           
            if(opcion>33)System.out.println("Opción errónea, elija número de nuevo");
            
        }while(opcion!=33); System.out.println("Gracias por utilizar el programa");
            
    }
   
}
