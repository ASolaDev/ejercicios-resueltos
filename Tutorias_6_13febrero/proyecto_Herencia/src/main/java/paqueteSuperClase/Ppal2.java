/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteSuperClase;

import paquetePrincipal.CajaColor;
public class Ppal2 {    
    public static void main(String[] args) {
       Caja cajita=new Caja(10,20,30);
        
        System.out.println("----DATOS DE cajita ----");
        System.out.println("cajita ="+cajita);
        System.out.println("Volumen de cajita= "+cajita.volumen());
        
        System.out.println("----DATOS DE cajonVerde ----");
        CajaColor cajonVerde=new CajaColor("Verde", 23,56,78);
        System.out.println("cajonVerde ="+cajonVerde);
        System.out.println("Volumen de cajonVerde= "+cajonVerde.volumen());
        System.out.println("Color de cajonVerde ="+cajonVerde.getColor());
        
        CajaColor cajonRojo=new CajaColor("Rojo");
        System.out.println("cajonRojo ="+cajonRojo);        
    }    
}
