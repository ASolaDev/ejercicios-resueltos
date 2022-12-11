/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_tutoria13diciembre;

/**
 *
 * @author isabel
 */
public class TutoriaMatrices {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // Edificio de 4 plantas, cada planta puede tener un número distinto de oficinas
        int edificio[][]=new int[4][];//El edificio tiene 4 plantas
        edificio[0]=new int[2]; //La planta 0 del edificio tiene 2 oficinas
        edificio[0][0]=18;
        edificio[0][1]=3;
        edificio[1]=new int[4]; //La planta 1 del edificio tiene 4 oficinas
        edificio[1][0]=12;
        edificio[1][1]=9;
        edificio[1][2]=5;
        edificio[1][3]=1;
        edificio[2]=new int[4]; //La planta 2 del edificio tiene 4 oficinas
        edificio[2][0]=6;
        edificio[2][1]=13;
        edificio[2][2]=2;
        edificio[2][3]=5;
        edificio[3]=new int[5]; //La planta 3 del edificio tiene 5 oficinas
        edificio[3][0]=2;
        edificio[3][1]=4;
        edificio[3][2]=7;
        edificio[3][3]=0;
        edificio[3][4]=5;
        
        /* Otra forma :
        int edificio[][]={
                          {18,3},
                          {12,9,5,1},
                          {6,13,2,5},
                          {2,4,7,0,5}
                         };
        */

        //a. Recorre la planta 2 e indica el número de personas que hay en cada oficina
        System.out.println("Personas en cada oficina de la planta 2");
        for (int oficina = 0; oficina < edificio[2].length; oficina++) {
            System.out.println("Oficina: "+oficina+" hay "+edificio[2][oficina]+" personas");
        }
        
        //b. Número de personas que hay en total en el edificio
        System.out.print("\n\nEl número total de personas que hay actualmente en el edificio es :");
        int totalPersonas=0;
        for (int planta = 0; planta < edificio.length; planta++) {
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                totalPersonas += edificio[planta][oficina];
            }
        }
        System.out.println(totalPersonas);
        
        //c. Se desea saber el número de personas que hay por planta
        System.out.println("\n\nPersonas por planta-------------");
        for (int planta = 0; planta < edificio.length; planta++) {
            int personasPlanta=0;
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                personasPlanta += edificio[planta][oficina];
            }
            System.out.println("En la planta :"+planta+" hay "+personasPlanta+" personas.");
        }
        
        //d. ¿Cuántas plantas tiene el edificio?        
        int numPlantas=edificio.length;
        System.out.println("\n\nEl edificio tiene "+numPlantas+" plantas");
        //e. Por cada planta, ¿cuántas oficinas hay?
        for (int planta = 0; planta < numPlantas; planta++) {
            System.out.println("En la planta: "+planta+" hay "+edificio[planta].length+" oficinas");
        }
        
        //f. ¿En qué planta y oficina hay un menor número de personas?
        int mn=edificio[0][0], plantaMn=0, oficinaMn=0;
        for (int planta = 0; planta < edificio.length; planta++) {
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                if (edificio[planta][oficina] < mn){
                    mn=edificio[planta][oficina];
                    plantaMn=planta;
                    oficinaMn=oficina;
                }
            }
        }
        System.out.println("\n\nEn la planta: "+plantaMn+" oficina: "+oficinaMn+" se encuentran menos personas, con un número de "+mn+" personas");
        
       //g. Se desea saber si hay al menos una oficina donde hayan 5 personas
        int y=5;
        boolean encontradoY=false;
        for (int planta = 0; planta < edificio.length; planta++) {
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                if (edificio[planta][oficina] == y){
                    encontradoY=true;
                    break;
                }
            }
            if (encontradoY) break;
        }
        if (encontradoY) System.out.println("\n\nSí, al menos hay una oficina donde hay "+y+" personas");
        else System.out.println("\n\nNo, no existe oficina con "+y+" personas.");
           
        //h. Se quiere saber si hay alguna oficina donde hay 13 personas y en qué planta y oficina
        int x=13;
        int plantaX=0, oficinaX=0;
        boolean encontrado=false;
        for (int planta = 0; planta < edificio.length; planta++) {
            for (int oficina = 0; oficina < edificio[planta].length; oficina++) {
                if (edificio[planta][oficina] == x){
                    plantaX=planta;
                    oficinaX=oficina;
                    encontrado=true;
                    break;
                }
            }
            if (encontrado) break;
        }
        if (encontrado)
            System.out.println("\n\nEn la planta: "+plantaX+" oficina: "+oficinaX+" se encuentran "+x+" personas");
        else
            System.out.println("En el edificio no hay oficinas con "+x+" personas.");
        
      //i.Muestra por cada planta, desde la 0 hasta la última, y por cada oficina de la
      //  la planta desde la 0 hasta la última, el número de personas que trabajan.
        System.out.println("\n\nDescripción del edificio completo");
        for(int planta=0; planta < edificio.length; planta++){
            System.out.println("Planta: "+planta);
            for(int oficina=0; oficina < edificio[planta].length; oficina++){
                System.out.println("Oficina: "+oficina+" hay "+edificio[planta][oficina]+" personas trabajando.");
            }
        }
    }
}
