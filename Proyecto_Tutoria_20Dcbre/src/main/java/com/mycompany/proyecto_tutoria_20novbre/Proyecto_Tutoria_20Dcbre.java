/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto_tutoria_20novbre;

import java.util.Arrays;

/**
 *
 * @author isabel
 */
public class Proyecto_Tutoria_20Dcbre {

    public static void main(String[] args) {
        // Comentar como se recorren arrays unidimensionales con 2 formas de for
        int v[]={23,56,78,9,22};
        
        System.out.println("Recorrido del array v con for normal....");
        for (int i = 0; i < v.length; i++) {
            System.out.print(v[i]+"\t");
        }
        System.out.println("\n");
        
        
        System.out.println("Recorrido del array v con for foreach....");
        for (int x: v) {
            System.out.print(x+"\t");
        }
        System.out.println("");
        
        
        //Inconvenientes de usar 'foreach' en arrays: 
        // cuando los valores del arrays deben ser modificados
        for(int x: v){
            if (x==56) 
            { 
                System.out.println("Sí hay un 56");
                x++;
            }
        }
        
        System.out.println("\nRecorrido del array v con for foreach....");
        for (int x: v) {
            System.out.print(x+"\t");
        }
        System.out.println("");
        
        
        /*
        Clase de Java: Arrays 
        para buscar métodos e información desde Google
        Búsqueda: nombreClase java oracle
        Seleccionar: ORACLE versión JDK
        Sección: Methods 
        */
        
        /*Clase Arrays
         Métodos: public static void sort(int []a)
                  public static int binarySearch(int []a, int key)                  
                  public static void fill(int []a, int value)                   
        En tutoría anterior
       */
        
        System.out.println("\nRecorrido secuencial del array v ");
        for(int x: v){
            System.out.print(x+"\t");
        } 
            
        Arrays.sort(v);
        
        System.out.println("\n\nRecorrido secuencial del array v ya ordenado ");
         for(int x: v){
            System.out.print(x+"\t");
        }
         
        System.out.println("\n\nBúsqueda del elemento 56 usando la búsqueda lineal o dicotómica ");
        int y=Arrays.binarySearch(v, 56);
        
        if (y==-1){
            System.out.println("56 NO está en el array v");
        }
        else{
            System.out.println("56 Sí está en el array v en el índice "+y);
        }
        
         /*
        Clase de Java: String 
        para buscar métodos e información desde Google
        Búsqueda: nombreClase java oracle
        Seleccionar: ORACLE versión JDK
        Sección: Methods 
        */
        
        /*Clase String
         Constructor: 
                String str="valor";                
         
         Métodos: 
                - Métodos estáticos:
                     public static String valueOf(int i) 
                     public static String valueOf(float f)
                     public static String valueOf(double d)
                
                - Métodos propios:
                  * Ver                  
                 
        En tutoría anterior
       */
        
        
        System.out.println("\n\n\n---------------------------STRING----------------------------------"); 
        //Constructor
        String cadena;
           cadena=new String("PayPal"); //En String el new es redundante       
        
        System.out.println("cadena es "+cadena);
        
        String palabra;
         palabra="Martes";
         System.out.println("str es "+palabra);
        
        char data[] = {'a', 'b', 'c'};
        String str = new String(data);
        System.out.println("str ="+str);
        
        //Métodos estáticos
        String t=String.valueOf(1234);
        System.out.println("t como String "+t); //+ concatena 
        
        //Métodos propios
        //length()     public int legth()
        int l="Abracadabra".length();
        System.out.println("Longitud de la palabara anterior "+l);
        palabra="Abracadabra";
        System.out.println("La longitud de "+palabra+" es "+l);
        //public char charAt(int index)  //Exception: StringIndexOutBoundsException
        char c=palabra.charAt(0); //será 'A'

        System.out.println("\nRecorrido de "+palabra);
        for (int i = 0; i < palabra.length(); i++) {
            System.out.print(palabra.charAt(i)+"\t");
        }
        
        //compareTo    public int compareTo(String anotherString) Compara lexicográficamente
        System.out.println("\n\nCompara en función de la tabla UNICODE");
        System.out.println("abracadabra".compareTo(palabra));
        
        //compareToIgnoreCase public int compareToIgnoreCase(String str)
        System.out.println("\nCompara en función de la tabla UNICODE - Ignora mayúsculas de minúsculas -");
        System.out.println("abracadabra".compareToIgnoreCase(palabra));
        
        //starsWith public boolean starsWith(String prefix)
        System.out.println("Uso de starsWith");
        System.out.println(palabra+" empieza por A???"+ palabra.startsWith("A"));
        
        //endsWith public boolean endsWith(String sufix)
        System.out.println("Uso de endsWith");
        System.out.println(palabra+" acaba en A???"+ palabra.endsWith("A"));
        
        //indexOf   public int indexOf(String str) //Devuelve el primer indice donde encuentra str 
        System.out.println("\n\n Uso de indexOf y sobrecargados");
        System.out.println("Primer índice de 'ra' en "+palabra);
        System.out.println(palabra.indexOf("ra"));
        
        //indexOf public int indexOf(char ch) //Devuelve el primer indice donde encuentra ch
        System.out.println("Primer índice de 'a' en "+palabra);
        System.out.println(palabra.indexOf('a'));
        
        //indexOf public int indexOf(String str, int fromIndex) 
        //Devuelve el primer indice donde encuentra str a partir de fromIndex
        System.out.println("Segundo índice de 'ra' en "+palabra);
        System.out.println(palabra.indexOf("ra", palabra.indexOf("ra")+1));
        
        //indexOf public int indexOf(char ch, int fromIndex) 
        //Devuelve el primer indice donde encuentra ch a partir de fromIndex
        System.out.println("Segundo índice de 'a' en "+palabra);
        System.out.println(palabra.indexOf('a', palabra.indexOf('a')+1));
        
        //lastIndexOf ---idem a indexOf comenzando desde el final de la cadena
        
        //substring  public String substring​(int beginIndex) throws IndexOutOfBoundsException 
        System.out.println("Uso de substring y sobrecargados--");
        System.out.println("unhappy".substring(2)); // happy
        System.out.println("feliz".substring(5)); //vacío
        // System.out.println("feliz".substring(23));  //Excepción: 23 es mayor que la longitud de feliz
        
        //substring  public String substring​(int beginIndex, int endIndex) throws IndexOutOfBoundsException 
        System.out.println("hamburger".substring(4,8)); //burger
        //System.out.println("hamburger".substring(-2,8)); //Excepción: beginIndex es -
        //System.out.println("hamburger".substring(2,10)); //Excepción: endIndex es > longitud 
        
        //Métodos: concat, toUpperCase, toLowerCase, trim, toCharArray
        
        
        // EXPRESIONES REGULARES EN JAVA
        // Métodos: matches y split 
        //matches public boolean matches​(String regex)
        System.out.println("\nEjemplos con Expresiones Regulares-----------------------------------------------");
        String fechaNocheVieja="31/12/2022";
        String expr="^[0-9]{2}/[0-9]{2}/[0-9]{4}$"; //Formato: dd/dd/dddd
        
        //Método: matches
        if (fechaNocheVieja.matches(expr)){
            System.out.println("Tomaremos las uvas");
        }
        else{
            System.out.println("No cenaremos ni habrá celebración");
        }
        
        //split  public String[] split​(String regex)
        //Extrae en subcadenas en función de un separador o de varios
        String strFecha[]=fechaNocheVieja.split("/");
        System.out.println("\nRecorrido de las subcadenas obtenidas con split");
        for (int i = 0; i < strFecha.length; i++) {
            System.out.println(strFecha[i]);
        }
                
        
  
        
        
    }
}
