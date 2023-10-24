/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog04_tarea03.paquetePrincipal;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class Introducir { //esta clase va a contener métodos para leer variables desde teclado
    
     //El método entero, devuelve un número entero en función del mensaje msg
    public static int entero(String msg){
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
       int n=0;
       boolean numeroBueno=false;
       do{ //con el bucle, obliga a que si hay errores, nos obligue a introducir de nuevo el número
           //en el último vídeo del material de Isabel, está explicado las Exception
           try{ 
                System.out.println(msg);
                cadena=teclado.nextLine();
                n=Integer.parseInt(cadena); //parseInt es el método que gener la Exception en caso de error
                //La Exception generada es de tipo: NumberFormatException
                numeroBueno=true; //Si no se produce error, se ejecuta la instrucción numeroBueno=true;
           }catch(NumberFormatException e){
               System.out.println("Error, No se ha introducido un número");
           }           
       }while(numeroBueno==false);
       return n;    
    }
    
     //El método realSimple, devuelve un número float en función del mensaje msg
    public static float realSimple(String msg){
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
       float n=0.0f;
       boolean numeroBueno=false;
       do{ //con el bucle, obliga a que si hay errores, nos obligue a introducir de nuevo el número
           //en el último vídeo del material de Isabel, está explicado las Exception
           try{ 
                System.out.println(msg);
                cadena=teclado.nextLine();
                n=Float.parseFloat(cadena); //parseFloat es el método que gener la Exception en caso de error
                //La Exception generada es de tipo: NumberFormatException
                numeroBueno=true; //Si no se produce error, se ejecuta la instrucción numeroBueno=true;
           }catch(NumberFormatException e){
               System.out.println("Error, No se ha introducido un número");
           }           
       }while(numeroBueno==false);
       return n;    
    }
    
    //El método realDoble, devuelve un número float en función del mensaje msg
    public static double realDoble(String msg){
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
       double n=0.0d;
       boolean numeroBueno=false;
       do{ //con el bucle, obliga a que si hay errores, nos obligue a introducir de nuevo el número
           //en el último vídeo del material de Isabel, está explicado las Exception
           try{ 
                System.out.println(msg);
                cadena=teclado.nextLine();
                n=Double.parseDouble(cadena); //parseDouble es el método que gener la Exception en caso de error
                //La Exception generada es de tipo: NumberFormatException
                numeroBueno=true; //Si no se produce error, se ejecuta la instrucción numeroBueno=true;
           }catch(NumberFormatException e){
               System.out.println("Error, No se ha introducido un número");
           }           
       }while(numeroBueno==false);
       return n;    
    }

    //El método cadena, devuelve una frase o palabra en función del mensaje msg
    public static String cadena(String msg){
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
        System.out.println(msg);
        cadena=teclado.nextLine();
       return cadena;    
    }

    //El método caracter, devuelve una frase o palabra en función del mensaje msg
    public static char caracter(String msg){
       Scanner teclado=new Scanner(System.in);
       String cadena;
       char c;
       
        System.out.println(msg);
        cadena=teclado.next();
        c=cadena.charAt(0);
       return c;    
    }
    
}
