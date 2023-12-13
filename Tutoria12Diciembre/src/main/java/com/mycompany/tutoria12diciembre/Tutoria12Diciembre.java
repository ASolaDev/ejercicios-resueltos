/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tutoria12diciembre;

/**
 *
 * @author isabel
 */
public class Tutoria12Diciembre {

    public static void main(String[] args) {
        int matriz[][];
        matriz=new int [3][4];
      /*  
        //Fila 0
        matriz[0][0]=0;
        matriz[0][1]=1;
        matriz[0][2]=2;
        matriz[0][3]=3;
        
       //Fila 1
        matriz[1][0]=10;
        matriz[1][1]=11;
        matriz[1][2]=12;
        matriz[1][3]=13;
       
      //Fila 2
        matriz[2][0]=20;
        matriz[2][1]=21;
        matriz[2][2]=22;
        matriz[2][3]=23;
        
        //Tambien
       int tabla[][]=new int[3][];
       tabla[0]=new int[4];
       tabla[1]=new int[4];
       tabla[2]=new int[4];
       
       tabla[0][0]=0;
       tabla[0][1]=1;
       tabla[0][2]=2;
       tabla[0][3]=3;
       
       tabla[1][0]=10;
       tabla[1][1]=11;
       tabla[1][2]=12;
       tabla[1][3]=13;
       
       tabla[2][0]=20;
       tabla[2][1]=21;
       tabla[2][2]=22;
       tabla[2][3]=23;
       */ 
        int m[][]={{0,1,2,3}, {10,11,12,13}, {20,21,22,23}};
        
        for (int fila = 0; fila < 3; fila++) {
            System.out.println("Fila numero: "+fila);
            for (int columna = 0; columna < 4; columna++) {
                System.out.print(m[fila][columna]+" | ");
            }
            System.out.println("");
        }
        
        
        //Tambien
        System.out.println("Con m.length y m[fila].length");
        for (int fila = 0; fila < m.length; fila++) {
            System.out.println("Fila numero: "+fila);
            for (int columna = 0; columna < m[fila].length; columna++) {
                System.out.print(m[fila][columna]+" | ");
            }
            System.out.println("");
        }       
       
    }
}
