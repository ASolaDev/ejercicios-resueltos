/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog06_tarea5;

import java.util.Arrays;

/**
 *
 * @author isabel
 */
public class PROG06_Tarea5 {

    public static void main(String[] args) {
        /*1.
        Introducir un texto, volvedlo a mostrar en mayúsculas.
        */
        System.out.println("--- 1. ---");
        String texto=Introducir.cadena("Dime un texto y lo muestro en mayusculas: ");  
        String textoMay=texto.toUpperCase();
        System.out.println("'"+texto+"' en mayusculas: '"+textoMay+"'");
        
        /*
        2. Indica el número de aes, y de vocales que posee el String : “Mañana es sabado y voy a irme a tomar unas copillas por el centro de Logroño".
        */
        System.out.println("\n--- 2. ---");
        String frase="Mañana es sabado y voy a ir a tomarme unas copillas por el centro de Logroño";
        String fraseMy=frase.toUpperCase();
        int a=0, e=0, vocal=0;
        for (int i = 0; i < fraseMy.length(); i++) {
            switch(fraseMy.charAt(i)){
               case 'A'-> {
                    vocal++;
                    a++;                    
                }                
                case 'E' -> { 
                    vocal++;
                    e++;
                }                                   
                case 'I', 'O', 'U' -> vocal++;
            }
        }
        System.out.println("'"+frase+"' tiene " + a + " aes, "+e+" ees y "+vocal+" vocales");
        
        /*
        3. Introducir un texto, e indicar si está la 'W' (en mayúscula o minúscula), y la posición que ocupa la primera vez.
        He usado el del ejercicio 1
        */
        System.out.println("\n--- 3. ---");
        int wMin=texto.indexOf('w');
        int wMay=texto.indexOf('W');
        
        if (wMin == -1 && wMay == -1){
          System.out.println("No hay 'w' en el texto");  
        }else{
             if (wMin != -1){
                 System.out.println("En el texto '"+texto+"' aparece la 'w' en el indice "+wMin);
            }
            if (wMay != -1){
                System.out.println("En el texto '"+texto+"' aparece la 'W' en el indice "+wMay);
            }
        } 
        
        
        /*
        4. En el texto indicar si está la ‘T’ (en mayúscula o minúscula), y las posiciones que ocupan (es necesario utilizar un array).
        */
        System.out.println("\n--- 4. ---");
        int contT=0;
        int indice=textoMay.indexOf('T');
        for (; indice != -1; ) {
            contT++;
            indice=textoMay.indexOf('T',indice+1);
        }
        System.out.println("El texto: '"+texto+"' tiene "+contT+" 'T' minusculas como mayusculas");
        
        int vT[]=new int[contT]; //El array de las posiciones de 'T' se dimensiona en funcion del numero de T
        indice=textoMay.indexOf('T');
        for (int i = 0; i < contT; i++) {
            vT[i]=indice;
            indice=textoMay.indexOf('T',indice+1);
        }
        
        System.out.println(Arrays.toString(vT));
        
        /*
          5. String "En mi proxima vida, creere en la reencarnacion" indica si se encuentra la subcadena “creere”
        */
        System.out.println("\n--- 5. ---");
        String cinco="En mi proxima vida, creere en la reencarnacion";        
        System.out.println("La subcadena 'creere' "+((cinco.indexOf("creere") != -1)?" si ":" no ")+" esta en '"+cinco+"'");
        
        /*
          6. Introducir un texto e indicar si representa un número.
        */
        System.out.println("\n--- 6. ---");
        try{
            int n=Integer.parseInt(texto);
            System.out.println("El numero es "+n);
        }catch (NumberFormatException exc){
            System.out.println("'"+texto+"' NO es numero");
        }
        
        /*
        7. Comprobacion de si texto es una palabra
        */
        System.out.println("\n--- 7. ---");
        System.out.print("'"+texto+"'");
        if (MisMetodos.texto(texto)){
            System.out.println(" Es una palabra");
        }
        else{
            System.out.println(" Tiene signos especiales a parte de letras");
        }
        
        /*
        8. Calculo de la suma de los digitos
        */
        System.out.println("\n--- 8. ---");
        System.out.println("La suma de los digitos en el texto '"+texto+"' es :"+MisMetodos.sumaDigitos(texto));
        
        /*
        9. Calculo del texto invertido
        */
        System.out.println("\n--- 9. ---");
        System.out.println("El texto invertido de '"+texto+"' es :'"+MisMetodos.invertida(texto)+"'");
        
        /*
        10. Eliminar espacios en un texto
        */
        System.out.println("\n--- 10. ---");
        System.out.println("Texto: '"+texto+"' sin espacios en blanco '"+MisMetodos.sinEspacios(texto)+"'");
        
        /*
        11. Comprobar si un texto es palindromo
        */
        System.out.println("\n--- 11. ---");
        texto="A cavar a Caravaca";
        System.out.println("Texto: 'A cavar a Caravaca' es palindromo?  "+((MisMetodos.palindromo(texto))?"si":"no"));
     
    }
}
