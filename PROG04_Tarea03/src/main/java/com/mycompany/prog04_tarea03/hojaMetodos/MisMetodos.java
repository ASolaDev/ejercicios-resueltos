/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prog04_tarea03.hojaMetodos;

/**
 *
 * @author isabel
 */
public class MisMetodos {
    //1. Escriba un método estático: sumaImparesN que devuelva la suma de los n
    //primeros números impares.
    public static int sumaImparesN(int n){
        int suma=0;
        int impar=1;
        for (int i = 1; i <= n; impar+=2, i++) {
            suma+= impar;            
        }
        return suma;
    }
    
    
    //2. Realizar un método estático: mostrarMensaje, al que se le pase como parámetro
    //un número entero N, y muestre por pantalla N veces, el mensaje: “Método ejecutandose”.
    public static void mostrarMensaje(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("Metodo ejecutandose "+i+" veces");
        }
    }
    
    //3. Diseñar un método estático maximo que tenga como parámetros dos números
    //   enteros, y que devuelva el máximo de los dos.
    public static int maximo(int x, int y){
        return (x>y)?x:y;
    }
    
    
    //4.Diseñar un método estático maximo, que tenga como parámetros dos números
    //reales (float), y que devuelva el máximo de los dos en valor entero. 
    public static int maximo(float x, float y){
        return (int)((x>y)?x:y);
    }
    
    //5. Diseñar un método estático minimo que tenga como parámetros dos números
    //enteros, y que devuelva el mínimo de los dos.
    public static int minimo(int x, int y){
        return (x<y)?x:y;
    }
    
    //6.Método estático: betweenNandM al que se le pasan dos enteros y muestra todos
    //los números comprendidos entre ellos, inclusive.
    public static void betweenNandM(int n, int m){
        for (int i = n; i <=m; i++) {
            System.out.println(i);
        }
    }
    
    //7.Método estático: doble que devuelva el doble del valor entero que se le pasa como
    //parámetro
    public static int doble(int n){
        return n*2;
    }
    
    //8.Realizar un método estático: longitudAreaCirculo que devuelva el área de un
    //círculo o la longitud de una circunferencia, según se especifique en el dato de
    //entrada. Para distinguir un caso de otro se le pasará el carácter 'a' (para área) o 'l'
    //(para la longitud). Además hemos de pasarle al método estático el radio (valor
    //entero).
    public static double longitudAreaCirculo(int radio, char eleccion){
        double resultado=0.0d;
        switch(eleccion){
            case 'a': resultado=Math.PI*Math.pow(radio,2); break;
            case 'l': resultado=2*Math.PI*radio;
        }
        return resultado;
    }
    
    
    //9.Diseña el método: esPar, tal que dado un número entero, devuelve true si es par o
    //false si es impar.
    public static boolean esPar(int n){
        return (n%2==0);
    }
    
    //10. Diseña el método: esMayuscula, tal que dado un carácter considerado como dato
    //de entrada, devuelve true si es una letra del abecedario y está en mayúscula, o
    //devuelve false, si no es letra o no está en mayúscula
    public static boolean esMayuscula(char c){
        return (c>='A' && c<='Z');
    }
    
    //11.  Diseña el método: esLetra, tal que dado un carácter considerado como dato de
    //entrada, devuelve true si es una letra del abecedario tanto si está en mayúscula
    //como en minúscula
    public static boolean esLetra(char c){
        return ((c>='A' && c<='Z') || (c>='a' && c<='z'));
    }
    
    //12.Diseña el método: pasarAMinuscula, tal que dado un carácter considerado como
    //dato de entrada, si es una letra del abecedario y está en Mayúscula lo transforma a
    //minúscula, si no es una letra del abecedario o no está en minúscula, devuelve el
    //carácter tal como entró al método
    public static char pasarAMinuscula(char c){
        if (c>='A' && c<='Z'){
            c+=32;
        }
        return c;
    }
    
    //13.  Diseña el método: esDigito, tal que dado un carácter considerado como dato de
    //entrada, si es un dígito devuelve true o si no lo es, devuelve false
    public static boolean esDigito(char c){
        return (c>='0' && c<='9');
    }
    
    //14. Diseñar un método estático: distanciaEuclidea que calcule la distancia euclídea
    //de dos puntos. Un punto tiene una coordenada x y otra y. La distancia es:
    //Math.sqrt((x1-x2)2 + (y1-y2)2 ). Donde x1,y1 son las coordenadas del primer punto y
    //x2,y2 son las coordenadas del segundo punto.
    public static double distanciaEuclidea(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow(x1-y1,2)+Math.pow(x2-y2,2));
    }
}
