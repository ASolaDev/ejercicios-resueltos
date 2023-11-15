/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog06_tarea1;


import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class Introducir { //esta clase va a contener métodos para leer variables desde teclado
    
    /******************************************************************************
     * ENTEROS
     * 
     * El método entero, devuelve un número entero en función del mensaje msg 
     * 
     * El méotodo enteroPositivo, devuelve un número entero positivo con respecto al dato de entrada msg
     * 
     * @param msg
     * @return 
     ********************************************************************************/
    public static int entero(String msg){
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
       int n=0;
       boolean numeroBueno=false;
       do{ //con el bucle, obliga a que si hay errores, nos obligue a introducir de nuevo el número
           //en el último vídeo del material de Isabel del Tema3, está explicado las Exception
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
    
     public static int enteroPositivo(String msg){
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
       int n=0;
       boolean numeroBueno=false;
       do{ //con el bucle, obliga a que si hay errores, nos obligue a introducir de nuevo el número
           //en el último vídeo del material de Isabel del Tema3, está explicado las Exception
           try{ 
                System.out.println(msg);
                cadena=teclado.nextLine();
                n=Integer.parseInt(cadena); //parseInt es el método que gener la Exception en caso de error
                //La Exception generada es de tipo: NumberFormatException
                if (n>=0) numeroBueno=true; //Si no se produce error, se ejecuta la instrucción numeroBueno=true;
           }catch(NumberFormatException e){
               System.out.println("Error, No se ha introducido un número");
           }           
       }while(numeroBueno==false);
       return n;    
    }
     
   /******************************************************************************
     * REALES
     * 
     * 
     * FLOAT
     * El método realSimple, devuelve un número float en función del mensaje msg 
     * 
     * El méotodo realSimplePositivo, devuelve un número entero positivo con respecto al dato de entrada msg
     * 
     * 
     * DOUBLE 
     * El método realDouble, devuelve un número double en función del mensaje msg 
     * 
     * El méotodo realDoblePositivo, devuelve un número double positivo con respecto al dato de entrada msg 
     * 
     * 
     * @param msg
     * @return 
     ********************************************************************************/
   
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
    
    public static float realSimplePositivo(String msg){
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
                if (n>=0) numeroBueno=true; //Si no se produce error, se ejecuta la instrucción numeroBueno=true;
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

    //El método realDoble, devuelve un número float en función del mensaje msg
    public static double realDoblePositivo(String msg){
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
                if (n>=0) numeroBueno=true; //Si no se produce error, se ejecuta la instrucción numeroBueno=true;
           }catch(NumberFormatException e){
               System.out.println("Error, No se ha introducido un número");
           }           
       }while(numeroBueno==false);
       return n;    
    }
    
    /******************************************************************************
     * STRING o CADENAS
     * 
     * El método cadena, devuelve una frase o palabra en función del mensaje msg
     * 
     * @param msg
     * @return 
     ********************************************************************************/    
    public static String cadena(String msg){
       Scanner teclado=new Scanner(System.in);
       String cadena;
       
        System.out.println(msg);
        cadena=teclado.nextLine();
       return cadena;    
    }

     /******************************************************************************
     * CHAR
     * 
     * El método caracter, devuelve un carácter o letra en función del mensaje msg
     * 
     * @param msg
     * @return 
     ********************************************************************************/    
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
