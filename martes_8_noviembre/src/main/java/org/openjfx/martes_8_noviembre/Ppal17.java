/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package org.openjfx.martes_8_noviembre;


public class Ppal17 {

    
    public static void main(String[] args) {
        int numero=3451;
        int b500, b200, b100, b50, b20, b10, b5,M2, M1;
         int dinero=numero;

        b500=numero/500;  //billetes de 500€

        numero%=500; //resto de 500€

        b200=numero/200;  //billetes de 200€

        numero%=200; //resto de 200€

        b100=numero/100;  //billetes de 100€

        numero%=100; //resto de 100€

        b50=numero/50; 

        numero%=50;

        b20=numero/20; 

        numero%=20;

        b10=numero/10; 

        numero%=10;

        b5=numero/5; 

        numero%=5;

        M2=numero/2;

        M1=numero%2;

        System.out.println(dinero+"€ corresponde a :");

        System.out.println(b500 + " billetes de 500€");

        System.out.println(b200 + " billetes de 200€");

        System.out.println(b100 + " billetes de 100€");

        System.out.println(b50 + " billetes de 50€");

        System.out.println(b20 + " billetes de 20€");

        System.out.println(b10 + " billetes de 10€");

        System.out.println(b5 + " billetes de 5€");

        System.out.println(M2 + " monedas de 2€");

        System.out.println(M1 + " monedas de 1€");
    }
    
}
