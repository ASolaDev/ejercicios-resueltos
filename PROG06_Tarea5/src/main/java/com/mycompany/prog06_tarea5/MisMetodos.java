/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog06_tarea5;

/**
 *
 * @author isabel
 */
public class MisMetodos {
    /*
    Método: texto, tal que dado un texto considerado como parámetro de entrada,
    comprueba si todo él está compuesto por letras –que sea una palabra- (mayúsculas o minúsculas), devuelve true o false.
    */
    public static boolean texto(String palabra){
        String letras="abcdefghijklmnñopqrstuvwxyzABCDEFGHIJKLMNÑOPQRSTUVWXYáéíóúÁÉÍÓÚ";
                
        boolean esPalabra = true;
        for (int i = 0; i < palabra.length(); i++) {
            
            char letra=palabra.charAt(i); //extraigo una letra de la palabra
            
            if (letras.indexOf(letra) == -1){ //comprueba si realmente es una letra, es decir si esta en letras
                esPalabra = false;
                break;
            }
        }
        
        return esPalabra;
    }
    
    
    /*
    Método: sumaDigitos, tal que dado Introducir un texto, devuleve la suma de los caracteres correspondientes  
    dígitos pertenecientes a la secuencia almacenada en un String. 
    Por ejemplo, si la cadena es ABC12m4XYZ, entonces debe devolver el valor numérico entero 7.
    */
    public static int sumaDigitos(String cadena){
        String numeros="0123456789";
        
        int suma=0;
        for (int i = 0; i < cadena.length(); i++) {
            if (numeros.indexOf(cadena.charAt(i)) != -1){
                suma += cadena.charAt(i) - 48; //en la tabla ASCII, el 0 es 48                
            }            
        }
        
        return suma;
    }
    
    
    /*
    Método: invertida, tal que dado un String, lo devuelve de forma    invertido. 
    */
    public static String invertida(String texto){
        String nueva="";
        for (int i = texto.length()-1; i >= 0; i--) {
            nueva += texto.charAt(i);
        }
        
        return nueva;
    }
    
    /*
    Metodo: sinEspacios, tal que dada una cadena, la devuelve sin
    espacios
    */
    public static String sinEspacios(String texto){
        return texto.replaceAll(" ","");
    }
    
    /*
    Metodo: palindromo, tal que dada una cadena, devuelve true o
    false si es palíndroma.(Se lee de la misma manera de izquierda a
    derecha, que de derecha a izquierda).
    */
    public static boolean palindromo(String texto){
        boolean es=false;
        
        String textoMay=texto.toUpperCase();
        String textoInv=MisMetodos.invertida(textoMay);
        String nuevoTextoSinEspacios=MisMetodos.sinEspacios(textoMay);
        String nuevoTextoInvSinEspacios=MisMetodos.sinEspacios(textoInv);
        if (nuevoTextoSinEspacios.equals(nuevoTextoInvSinEspacios)){
            es=true;
        }
        
        return es;
    }
    
}
