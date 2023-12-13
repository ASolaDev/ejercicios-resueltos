/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tutoria12diciembre;

/**
 *
 * @author isabel
 */
public class Bomberos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio de bomberos--- Hoja de matrices (edificio)
        
        int edificio[][]={{18,3}, {12,9,5,1}, {6,13,2,5}, {2,4,7,0,5}};
        
        //Mostrar el contenido del edificio, planta a planta y para cada planta, oficina a oficina
        System.out.println("EDIFICIO:");
        for (int planta = 0; planta < edificio.length; planta++) {
            System.out.println("Planta numero: "+planta);
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                System.out.print(edificio[planta][oficina]+" | ");
            }
            System.out.println("");
        }
       
        //a. Recorre la planta 2 e indica el número de personas que hay en
        //cada oficina.      
        System.out.println("\n----------------------------- APARTADO A -------------------------");
        System.out.println("Planta: 2");
        for (int oficina = 0; oficina < edificio[2].length; oficina++) {
            System.out.print(edificio[2][oficina]+" | ");
        }
        
        //b. Número de personas que hay en total en el edificio
        System.out.println("\n\n----------------------------- APARTADO B -------------------------");
        int contPersonasTotal=0;
        for (int planta = 0; planta < edificio.length; planta++) {
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                contPersonasTotal += edificio[planta][oficina];
            }
        }
        System.out.println("El numero de personas que hay en el edificio es: "+contPersonasTotal);
        
        //c. Se desea saber el número de personas que hay por planta.
        System.out.println("\n\n----------------------------- APARTADO C -------------------------");
       
        for (int planta = 0; planta < edificio.length; planta++) {
            int contPersonasPlanta=0;
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                contPersonasPlanta += edificio[planta][oficina];
            }
            System.out.println("El numero de personas que hay en la planta "+planta+" es: "+contPersonasPlanta);
        }
        
        //d. ¿Cuántas plantas tiene el edificio?
        System.out.println("\n\n----------------------------- APARTADO D -------------------------");
        System.out.println("El edificio tiene: "+edificio.length+" plantas");
        
        
        //e. Por cada planta, ¿cuántas oficinas hay?
        System.out.println("\n\n----------------------------- APARTADO E -------------------------");
        for (int planta = 0; planta < edificio.length; planta++) {
            System.out.println("La planta "+planta+" tiene "+edificio[planta].length+" oficinas");
            
        }
        
        //f. ¿En qué planta y oficina hay un menor número de personas?
        System.out.println("\n\n----------------------------- APARTADO F -------------------------");
        int minimo=Integer.MAX_VALUE;// minimo=edificio[0][0];
        int minimoPlanta=0, minimoOficina=0;
        for (int planta = 0; planta < edificio.length; planta++) {
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                if (minimo > edificio[planta][oficina]){
                    minimo=edificio[planta][oficina];
                    minimoPlanta=planta;
                    minimoOficina=oficina;
                }
            }            
        }
        System.out.println("El minimo numero de personas en una oficina en el edificio es "+minimo);
        System.out.println("La planta es: "+minimoPlanta+" y la oficina es: "+minimoOficina);
        
        //¿En qué planta y oficina hay un mayor número de personas?
        int maximo=Integer.MIN_VALUE;// maximo=edificio[0][0];
        int maximoPlanta=0, maximoOficina=0;
        for (int planta = 0; planta < edificio.length; planta++) {
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                if (maximo < edificio[planta][oficina]){
                    maximo=edificio[planta][oficina];
                    maximoPlanta=planta;
                    maximoOficina=oficina;
                }
            }            
        }
        System.out.println("El maximo numero de personas en una oficina en el edificio es "+maximo);
        System.out.println("La planta es: "+maximoPlanta+" y la oficina es: "+maximoOficina);

        //h. Se quiere saber si hay alguna oficina donde hay 13 personas y
        //en qué planta y oficina
        System.out.println("\n\n----------------------------- APARTADO H -------------------------");
        boolean si13personas=false;
        int planta13=0, oficina13=0;
        
        for (int planta = 0; planta < edificio.length; planta++) {
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                if (edificio[planta][oficina] == 13){
                    si13personas=true;
                    planta13=planta;
                    oficina13=oficina;
                }
            }
        }
        
        if (si13personas){ //equivalente a if (si13personas==true)
            System.out.println("Si, hay una oficina al menos con 13 personas");
            System.out.println("Se corresponde con la planta "+planta13+" oficina "+oficina13);
        }
        else{
            System.out.println("NO, no hay 13 personas en alguna oficina del edificio");
        }
        
        
        //g. Se desea saber si hay al menos una oficina donde hayan 5
        //personas
        System.out.println("\n\n----------------------------- APARTADO G -------------------------");
        boolean si5personas=false;
        
        for (int planta = 0; planta < edificio.length; planta++) {
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                if (edificio[planta][oficina] == 5){
                    si5personas=true;
                    break;
                }
            }
            if (si5personas) break;
        }
        
        if (si5personas){ //equivalente a if (si13personas==true)
            System.out.println("Si, hay una oficina al menos con 5 personas");            
        }
        else{
            System.out.println("NO, no hay 5 personas en alguna oficina del edificio");
        }
        
        
    }
    
}   
