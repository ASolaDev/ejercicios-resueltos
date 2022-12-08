/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_examen1a;

/**
 *
 * @author isabel
 */
public class Ejercicios {
 /* EJERCICIO 1
    Crear un método estático denominado ley_de_ohm que acepte como
    parámetro de entrada un número entero n leído por teclado previamente
    en el main. Dicho número será el número de iteraciones de un bucle que
    permitirá hacer cálculos sobre el voltaje conforme a la ley de Ohm:
    V = I * R. La intensidad I se generará al azar en el rango [10..100] como
    número entero. La resistencia R se generará al azar en el rango [20.100]
    como número entero. Se deben mostrar los resultados según el siguiente
    formato.*/
    
    /*PSEUDOCÓDIGO
      1. Muestra por pantalla la cabecera de la tabla
      2. Desde paso=1 hasta n de 1 en 1
           - Genera la Intensidad al azar con 90 números comenzando en 10
           - Genera la Resistncia al azar con 80 números comenzando en 20
           - Voltaje = I * R
           - Se muestran los valores paso R I V
       3.Fin
    */
    public static void ley_de_ohm(int n){ //NO devuelve nada, simplemente muestra por pantalla
        System.out.println("     Paso     R     I     V");
        System.out.println("_______________________________");
        
        for (int paso = 1; paso <= n; paso++) {
            //azar = (int)(Math.random()*(b-a+1) + a);
            int I=(int)(Math.random()*(100-10+1)+10);
            int R=(int)(Math.random()*(100-20+1)+20);
       
            int V=I * R;
            System.out.println("      "+paso+"       "+R+"    "+I+"   "+V);            
        }            
    }

    /* EJERCICIO 2
    Crear un método estático llamado numero_mayor que no aceptará
    ningún parámetro de entrada. En dicho método se leerán por teclado 10
    número enteros. Habrá que determinar cuál es el máximo de entre ellos.
    A continuación se generará al azar un número entero en el rango [1.100].
    El método devolverá el mayor de los 2 números (del máximo calculado
    y del generado al azar).
    */
     public static int numero_mayor(){
         int my=Integer.MIN_VALUE;
         for (int i = 1; i <= 10; i++) {
             int x=Introducir.entero("Dime el número "+i+":");
             if (x > my)
                 my=x;
         }
         
         //azar = (int)(Math.random()*(b-a+1) + a);
         int azar=(int)(Math.random()*(100-1+1)+1);
         if (azar > my)
             my=azar;
         
         return my;
     }
     
     /* EJERCICIO 3
    Crear un método denominado numero_en_array sin parámetros de entrada.
    En su interior debe crear un array unidemensional con
    valores:10,20,30,40,50,60,70,80,90,100.
    A continuación se leerá por teclado un número entero x.
    Se desea cuántos valores del array son múltiplos de x. No es
    necesario que se muestren por pantalla. El método devolverá el contador.
    */
    public static int numero_en_array(){
        int v[]={10,20,30,40,50,60,70,80,90,100};
        
        int x=Introducir.entero("Dime un número entero:");
        int contMultX=0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % x == 0)
                contMultX++;
        }
        return contMultX;
    }

    /* ERCICIO 4
    Crear un método estático llamado tienda_de_repuestos que no acepte
    ningún parámetro de entrada.
    En dicha tienda se realizan ventas introduciendo: el tipo de pieza
    (0 ó 1 ó 2), el nombre de la pieza (String), y el precio de la pieza de
    tipo real (double).
    Cada cliente podrá comprar varios productos, por lo que se
    introducirá el tipo, nombre y precio de la piezasolicitada por él.
    Se termina la introducción de datos cuando el cliente no desee
    comprar más piezas, contestando en el tipo de pieza con valor 0.
    Se aplicará el método estático: calculo, que estará dentro de la
    clase Introducir. El método calculo, recibirá 2 datos de entrada:
    tipo de la pieza, precio de la pieza, y devuelve el valor real que
    será el precio a pagar por pieza. Ese valor real será en función
    del tipo de la pieza (tipo 1: 8% de descuento y tipo 2: 10% de
    descuento) Es muy importante establecer la cabecera del método de forma correcta (1 pto de
    los 4 ptos)
    El método devolverá la cantidad total a pagar por el cliente.
    */
    public static double tienda_de_repuestos_While(){       
        double totalPago=0.0d;
        
        //Obligo a que tipoPieza sea 0,1 ó 2
        int tipoPieza=Introducir.enteroPositivo("Dime el tipo de la pieza que desee: (1 o 2), con 0 finaliza el pedido");
        while(tipoPieza > 2){ //TAMBIÉN se puede poner while (! (tipoPieza <=2)) ó while (tipoPieza!=0 && tipoPieza!=1 && tipoPieza!=2 )
            System.out.println("Error, tipo debe ser 0, 1 ó 2");
            tipoPieza=Introducir.enteroPositivo("Dime el tipo de la pieza que desee: (1 o 2), con 0 finaliza el pedido");
        }
                
        //Ejercicio con while, mientras que el tipo de pieza sea != 0 continúa el pedido. TAMBIÉN SE PUEDE PONER: while (!(tipoPieza == 0))
        while (tipoPieza!=0){ //TAMBIÉN SE PUEDE PONER: while (tipoPieza == 1 || tipoPieza == 2) 
            String nombrePieza=Introducir.cadena("Dime el nombre de la pieza: ");
            double precioPieza=Introducir.realDoblePositivo("Dime el precio de la pieza: ");
            
            totalPago += Introducir.calculo(tipoPieza, precioPieza);
            
            tipoPieza=Introducir.enteroPositivo("Dime el tipo de la pieza que desee: (1 o 2), con 0 finaliza el pedido");
            while(tipoPieza>2){ //Si se utilizara Introducir.enteroPositivo, entonces while(tipo>2)
                System.out.println("Error, tipo debe ser 0, 1 ó 2");
                tipoPieza=Introducir.enteroPositivo("Dime el tipo de la pieza que desee: (1 o 2), con 0 finaliza el pedido");
            }           
        }
        
        return totalPago;
    }
   
     public static double tienda_de_repuestos_DoWhile(){       
        double totalPago=0.0d;
        
        int tipoPieza;
        //Ejercicio con do-while, realizar código mientras que el tipo de pieza no sea 0, si el tipo es 0 sale del bucle
        do{
           //Obligo a que tipoPieza sea 0,1 ó 2
           tipoPieza=Introducir.enteroPositivo("Dime el tipo de la pieza que desee: (1 o 2), con 0 finaliza el pedido");
           while(tipoPieza > 2){ 
               System.out.println("Error, tipo debe ser 0, 1 ó 2");
               tipoPieza=Introducir.enteroPositivo("Dime el tipo de la pieza que desee: (1 o 2), con 0 finaliza el pedido");
            }
                
            if (tipoPieza == 0) break;
                  
            String nombrePieza=Introducir.cadena("Dime el nombre de la pieza: ");
            double precioPieza=Introducir.realDoblePositivo("Dime el precio de la pieza: ");
            
            totalPago += Introducir.calculo(tipoPieza, precioPieza);            
                      
        }while(tipoPieza != 0);
        
        return totalPago;
    }    
     
}
