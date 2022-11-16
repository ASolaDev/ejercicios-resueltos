/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_tarea3_3;

/**
 *
 * @author isabel
 */
public class Principal {
    
    
    
    public static void main(String[] args) {
        int opcion;
        
        do
        {
            MisMetodos.menu(); 
            opcion=Introducir.entero("Introduzca una opción: ");
                   
            switch(opcion)
            {
                case 1 -> {                    
                    double base=Introducir.realDoble("Dime la base del rectángulo: ");
                    double altura=Introducir.realDoble("Dime la altura del rectángulo: ");                    
                    double perimetro=MisMetodos.perimetro_rectangulo(altura,base);
                    System.out.println("El perímetro del réctangulo de base "+base+" y altura "+altura+" es de: "+perimetro);
                }                    
                case 2 -> {                      
                    double c=Introducir.realDoble("Dime los grados Celsius: ");
                    double f=MisMetodos.conversor_grados(c);
                    System.out.println(c+" grados Celsius equivale a "+f+" grados Fahrenheit");
                }                    
                case 3 -> {                   
                    double h=Introducir.realDoble("Dime la altura del cilindro: ");                    
                    double r=Introducir.realDoble("Dime la base del cilindro: ");
                    double volumen=Math.PI*r*r*h;
                    double area=(2*Math.PI*r*h)+(2*Math.PI*r*r);
                    System.out.println("El volumen del cilindro es "+volumen);
                    System.out.println("El área del cilindro es "+area);    
                }
                    
                case 4 -> {
                    double a=Introducir.realDoble("Dime el valor del coeficiente a: ");                    
                    double b=Introducir.realDoble("Dime el valor del coeficiente b: ");                    
                    MisMetodos.ecuacion(a,b);
                }
                    
                case 5 -> {
                    double masa=Introducir.realDoble("Dime la masa en Kgr: ");                   
                    System.out.println(MisMetodos.energia(masa));
                }
                    
                case 6 -> {
                    double km=Introducir.realDoble("Dime los Kms: ");                   
                    char eleccion=Introducir.caracter("¿Qué conversión desea hacer? M(Marina) T(Terrestre)");                    
                    eleccion=Character.toUpperCase(eleccion);//para convertir en mayúscula
                    
                    switch (eleccion) 
                    {
                        case 'T' -> System.out.println(km+" km equivale a "+MisMetodos.millas_terrestres(km)+" millas terrestres");
                        case 'M' -> System.out.println(km+" km equivale a "+MisMetodos.millas_marinas(km)+" millas marinas");
                        default  -> System.out.println("Opción equivocada");
                    }
                }

                case 7 -> {   
                    System.out.println("Clasificación de 5 personas en función de su IMC");
                    for(int i=1;i<=5;i++)
                    {                         
                        double peso=Introducir.realDoble("Dime el peso en kg: ");                        
                        double altura=Introducir.realDoble("Dime la altura en cm: ");
                        MisMetodos.imc(peso,altura);
                    }
                }
                    
                case 8 -> {
                    System.out.println("Cálculo de la media aritmética de la nota obtenida por 15 alumnos ");
                    int n=1, nota, sumanota=0;
                    
                    for (int i =1; i <=15; ) {                                            
                        
                        nota=Introducir.entero("Dime la nota:");
                        if(nota>=0 && nota <=10) 
                        {
                            System.out.println("Nota correcta");                            
                            sumanota+=nota;
                            i++;
                        }                   
                        else System.out.println("Nota incorrecta");                        
                    }
                    
                    System.out.println("Nota media = "+(sumanota/15.0));
                }
        
                case 9 -> {
                    int mes;
                    boolean mesCorrecto=false;
                    do{
                      mes=Introducir.entero("Introduzca un número del 1 al 12: ");
                      if (mes>=1 && mes<=12) mesCorrecto=true;
                    }while(mesCorrecto==false); //también se puede poner while(!mesCorrecto);
                    
                    MisMetodos.meses(mes);
                }
                    
                case 10 -> {                    
                    int x=Introducir.entero("Introduzca el primer número: ");
                    int y=Introducir.entero("Introduzca el primer número: ");
                    
                    System.out.println("La suma de las potencias entre "+x+" y "+y+" es "+MisMetodos.sumaCuadradosEntreX_Y(x,y));
                }
                    
                case 11 -> {
                    int num=0, cont=0;
                    int i;
                    System.out.println("Introduce 10 números enteros, y te diré cuántos 0 se han introducido...");
                    for(i=1;i<=10;i++)
                    {                       
                        num=Introducir.entero("Introduzca un número:");
                        if (num==0) cont++;
                    }
                    
                    System.out.println("Hay "+cont+" números igual a cero.");
                }
             
                case 12 -> {
                    System.out.println("Introduce una serie de números, esa serie finaliza cuando se introduce -1 e indica cuántos 0 se han introducido...");
                    int contador0s = 0;
                    int num;
                    do
                    {                        
                        num=Introducir.entero("Introduzca un número:");
                        if (num==0) contador0s++;  
                        
                    }while (num!=-1);
                    System.out.println("Hay "+contador0s+" números igual a cero.");
                }
           
                case 13 -> { 
                    System.out.println("Listado de números en orden descendente");                    
                    int primero=Introducir.entero("Introduzca el primer número:");
                    int segundo=Introducir.entero("Introduzca el segundo número:");                    
                    MisMetodos.descendente(primero,segundo);
                }
                   
                case 14 -> { 
                    //Mostrar los múltiplos de 5 y 3 comprendidos entre dos números leídos por teclado
                    int primero=Introducir.entero("Introduzca el primer número:");
                    int segundo=Introducir.entero("Introduzca el segundo número:");    
                    if (primero > segundo){
                        int aux=primero;
                        primero=segundo;
                        segundo=aux;
                    }
                    for (int i = primero; i <= segundo; i++) {
                        if (i%3==0 && i%5==0)
                            System.out.println(i+" es múltiplo de 3 y 5");
                    }
                }
                 
                case 15 -> { 
                    /*
                    Dados 10 números enteros leídos por teclado, visualizar la suma de los
                        números pares de la lista. ¿Cuántos son números pares y cuál es la media
                        aritmética de los números impares?
                    */
                    int sumaPares=0, contImpares=0;
                    double sumaImpares=0;          
                    System.out.println("Dime 10 números");
                    int num;
                    for(int i=1;i<=10;i++) 
                    {                        
                        num=Introducir.entero("Dime un número:");
                        if (num%2 == 0) sumaPares+=num;
                        else{
                            contImpares++;
                            sumaImpares+=num;
                        }
                    }
                    System.out.println("La suma de los números pares es de: " +sumaPares);
                    System.out.println("Se han introducido "+contImpares+" números impares");
                    System.out.println("La media de los números impares es de "+(sumaImpares/contImpares));
                }
                    
                case 16 -> {
                    /*
                    De todos los no comprendidos entre 100 y 150, mostrar todos los múltiplos de 3.
                    Indicar cuántos múltiplos hay de 5. Calcula la suma de todos los pares.
                    */                    
                    System.out.println("Los múltiplos de 3 entre 100 y 150 son:");
                    int contMult5=0, sumaPares=0;
                    for(int i=100; i<=150; i++){
                        if (i%3 == 0) System.out.println(i+" es múltiplo de 3");
                        
                        if (i%5 == 0) contMult5++;
                        
                        if (i%2 == 0) sumaPares+=i;
                    }
                    System.out.println("Entre 100 y 150 hay "+contMult5+" múltiplos de 5");
                    System.out.println("La suma de los pares comprendidos entre 100 y 150 es "+sumaPares);
                } 
  
                case 17 -> {   
                    /*
                    cómo se podría expresar un dinero usando el mínimo número de billetes y monedas                     
                    */
                    
                    float cantidad=Introducir.realSimple("Introduzca una cantidad de dinero mayor que 100: ");
                    if(cantidad<=100) System.out.println("Error, se pidió una cantidad mayor que 100€");                        
                    else {
                        float dinero=cantidad;
                        int dineroEntero=(int)dinero;
                        
                        int centimos=(int)((dinero * 100 - dineroEntero*100)); //Para obtener los céntimos en número entero                        
                        
                        int  b500=dineroEntero/500; //billetes de 500€
                        dineroEntero%=500; //resto de dinero que queda -en cantidad entera-
                       
                        int b200=dineroEntero/200; //billetes de 200€
                        dineroEntero%=200; //resto de dinero que queda
                        
                        int  b100=dineroEntero/100; //billetes de 100€
                        dineroEntero%=100; //resto de dinero que queda -en cantidad entera-
                       
                        int b50=dineroEntero/50; //billetes de 50€
                        dineroEntero%=50; //resto de dinero que queda
                        
                        int  b20=dineroEntero/20; //billetes de 20€
                        dineroEntero%=20; //resto de dinero que queda -en cantidad entera-
                       
                        int b10=dineroEntero/10; //billetes de 10€
                        dineroEntero%=10; //resto de dinero que queda
                        
                        int  b5=dineroEntero/5; //billetes de 5€
                        dineroEntero%=5; //resto de dinero que queda -en cantidad entera-
                       
                        int mn2=dineroEntero/2; //monedas de 2€
                        int mn1=mn2%2; //resto de dinero que queda
                        
                        
                        int mn50c=centimos/50;
                        centimos%=50;
                        int mn20c=centimos/20;
                        centimos%=20;
                        int mn10c=centimos/10;
                        centimos%=10;
                        int mn5c=centimos/5;
                        centimos%=5;
                        int mn2c=centimos/2;
                        int mn1c=centimos%2;
                        
                        System.out.println("Hay "+b500+" billetes de 500€");
                        System.out.println("Hay "+b200+" billetes de 200€");
                        System.out.println("Hay "+b100+" billetes de 100€");
                        System.out.println("Hay "+b50+" billetes de 50€");
                        System.out.println("Hay "+b20+" billetes de 20€");
                        System.out.println("Hay "+b10+" billetes de 10€");
                        System.out.println("Hay "+b5+" billetes de 5€");
                        System.out.println("Hay "+mn2+" monedas de 2€");
                        System.out.println("Hay "+mn1+" monedas de 1€"); 
                        System.out.println("Hay "+mn50c+" monedas de 50 céntimos");
                        System.out.println("Hay "+mn20c+" monedas de 20 céntimos");
                        System.out.println("Hay "+mn10c+" monedas de 10 céntimos");
                        System.out.println("Hay "+mn5c+" monedas de 5 céntimos");
                        System.out.println("Hay "+mn2c+" monedas de 2 céntimos");
                        System.out.println("Hay "+mn1c+" monedas de 1 céntimo"); 
                    }
                }
                
                case 18 -> {
                    /*
                    Hallar la suma de los pares comprendidos entre 50 y 500, muestra los múltiplos 3
                    y cuenta los múltiplos de 5.
                    */
                    System.out.println("Los múltiplos de 3 entre 100 y 150 son:");
                    int contMult5=0, sumaPares=0;
                    for(int i=50; i<=500; i++){
                        if (i%3 == 0) System.out.println(i+" es múltiplo de 3");
                        
                        if (i%5 == 0) contMult5++;
                        
                        if (i%2 == 0) sumaPares+=i;
                    }
                    System.out.println("Entre 50 y 500 hay "+contMult5+" múltiplos de 5");
                    System.out.println("La suma de los pares comprendidos entre 50 y 500 es "+sumaPares);                    
                }
                    
                case 19 -> {
                    /*
                    Introducir un número entero positivo menor que 50000 por teclado, indicar qué cifras posee dicho número.
                    Pregunté a Juan Pedro -mi compañero- por el enunciado
                    */
                    // Indicar el número de cifras que tiene un número.
                    int num=Introducir.entero("Introduzca un número y le diré el total de cifras que posee:");
                    int cifras=1; //El número mínimo de cifras de un número entero positivo es 1
                    while (num >= 10){
                        cifras++;
                        num/=10; 
                    }
                    System.out.println("Tiene "+cifras+" cifras en total");                                       
                }
                    
                case 20 -> {
                    /*
                    Dados 2 números enteros generados al azar en el rango [1..1000], calcular cuál es el cociente y 
                    cuál es el resto utilizando el método de las restas sucesivas
                    */
                    int dividendo = (int) (Math.random() * 1000 + 1);
                    int divisor = (int) (Math.random() * 1000 + 1);
                    if(divisor>dividendo) //intercambio de valores
                    {
                        int aux=dividendo;
                        dividendo=divisor;
                        divisor=aux;
                    }
                    System.out.println("El dividendo es "+dividendo+" y el divisor es "+divisor);
                    int resto=dividendo;
                    int cociente=0;
        
                    while (resto>=divisor)
                    {
                        resto-=divisor;
                        cociente++;
                    }
                    System.out.println("El cociente es " + cociente + " y el resto es " + resto);    
                }
                    
                case 21 -> {
                    /*
                    Introduce por teclado 10 números enteros, calcular cuál es el mayor de ellos.
                    ¡¡¡ PUEDEN SER NEGATIVOS !!!
                    */
                    int mayor=Integer.MIN_VALUE; //Es el valor negativo más pequeño de todos los enteros
                    int n;
                    
                    for(int i=1;i<=10;i++){                        
                        n=Introducir.entero("Dime un número: ");
                        if(n>mayor) mayor=n;
                    }
                    System.out.println("El número mayor es: "+mayor);
                    
                    //Otra forma, introducir el primer número entero y darle el valor mayor para tomarlo como referencia a los demás
                    /*
                      int n=Introducir.entero("Dime el 1er número: ");
                      int mayor=n; 
                      for (int i = 2; i <= 10; i++) {  //Sería desde el 2 número hasta el 10, de uno en uno 
                        n=Introducir.entero("Dime el número "+i+":");
                        if (n > mayor) mayor=n;
                      }
                    System.out.println("El número mayor es: "+mayor);   
                    */
                }
                    
                case 22 -> {
                    //Calcular el factorial de un número entero generado al azar en el rango [1..10].
                    int azar = (int) (Math.random() * 10 + 1);
                    System.out.println("El factorial del número "+azar+" es " +MisMetodos.factorial(azar));
                }
                    
                case 23 -> {
                    // Calcular el factorial de los 5 primeros números naturales.                    
                    for(int n=1;n<=5;n++)
                    {
                        System.out.println("El factorial del número "+n+" es " +MisMetodos.factorial(n));
                    }
                }
                    
                case 24 -> {
                    //Generar un número entero al azar en el rango [1..10]. Mostrar por pantalla la tabla de multiplicar de ese número
                    int azar = (int) (Math.random() * 10 + 1);
                    MisMetodos.tabla_multiplicar(azar);
                }
                    
                case 25 -> {
                    //Mostrar las tablas de multiplicar de los números comprendidos entre dos números leídos por teclado                    
                    int x = Introducir.entero("Dime el primer número: ");
                    int y = Introducir.entero("Dime el segundo número: ");                    
                    
                    if(x > y) //intercambio de valores entre las dos variables
                    {
                        int aux=x;
                        x=y;
                        y=aux;
                    }
                    
                    System.out.println("Los tablas de multiplicar de los números entre "+x+" y " +y+ " son:");
                    for(int n=x; n<=y; n++)
                    {
                        MisMetodos.tabla_multiplicar(n);
                    }
                }
                    
                case 26 -> {
                    //Mostrar por pantalla los divisores de un número entero introducido por teclado                    
                    int n = Introducir.entero("Dime un número entero: ");
                    System.out.println("Los divisores de "+n+" son: ");
                    for (int i = 1; i <= n; i++) {
                        if (n % i==0) System.out.println(i+" es divisor");
                    }
                }
                    
                case 27 -> {
                    //Calcular el número de divisores que tiene un número entero introducido por teclado y la suma de éstos                 
                    int n = Introducir.entero("Dime un número entero: ");
                    System.out.println(n+ " tiene " +MisMetodos.contador_divisores(n)+" divisores");
                    System.out.println("La suma de sus divisores es  "+MisMetodos.suma_divisores(n));
                }
                    
                case 28 -> {
                    // Introducir un número por teclado e indica si es o no perfecto. El nº 6 es perfecto, suma: 1+2+3+6  - 6 = 6                    
                    int n = Introducir.entero("Dime un número entero: ");
                    
                    if((MisMetodos.suma_divisores(n) - n) == n) 
                        System.out.println("El número "+n+" es perfecto");
                    else
                        System.out.println("El número "+n+" NO es perfecto");
                }
                    
                case 29 -> {
                    // Introducir un número entero por teclado, e indica si es primo o no.                   
                    int n = Introducir.entero("Dime un número entero: ");
                    if(MisMetodos.primo(n) == true)
                        System.out.println(n+" es primo");
                    else
                        System.out.println(n+" no es primo");
                }
                    
                case 30 -> {
                    // Mostrar todos los números primos comprendidos entre dos números introducidos por teclado                   
                    int primero = Introducir.entero("Dime un número entero: ");                    
                    int segundo = Introducir.entero("Dime otro número entero: ");
                    
                    if(primero>segundo)
                    {
                        int aux=segundo;
                        segundo=primero;
                        primero=aux;
                    }
                    
                    System.out.println("Los números primos entre "+primero+" y " +segundo+ " son:");                   
                    for(int n=primero; n<=segundo; n++)
                    {
                        if(MisMetodos.primo(n) == true)
                            System.out.println(n+" es primo");
                    }
                }
                    
                case 31 -> {
                    // Mostrar los 10 primeros números primos.                    
                    int contprimos=0;
                    System.out.println("Los 10 primeros números primos son:");
                    
                    for(int i=1; contprimos<10 ;i++)
                    {
                        if(MisMetodos.primo(i)) //es lo mismo que decir MisMetodos.primo(i)==true
                        {
                            System.out.println(i);
                            contprimos++;
                        } 
                    }
                }
                    
                case 32 -> {
                    //Mostar el primer número primo a partir de un número introducido por teclado. 
                    
                    int n = Introducir.entero("Dime un número entero:");
                    
                    for(int i=n; ;i++)
                    {
                        if(MisMetodos.primo(i)) 
                        {
                            System.out.println("El primer número primo es: "+i);
                            break;
                        }
                    }
                }
                
                default -> System.out.println("Opción errónea, elija número de nuevo");
                
            } //Fin de switch            
           
            
        }while(opcion!=33);
        
        System.out.println("Gracias por utilizar el programa");
            
    }
}
