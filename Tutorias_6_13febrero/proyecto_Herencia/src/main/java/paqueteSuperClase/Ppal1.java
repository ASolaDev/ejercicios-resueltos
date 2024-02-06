/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteSuperClase;

import paquetePrincipal.CajaColor;

public class Ppal1 {
    public static void main(String[] args) {        
         Caja cajita=new Caja(10,20,30);
        
        System.out.println("----DATOS DE cajita ----");
        System.out.println("Alto de la cajita= ("+cajita.getAlto());
        System.out.println("Ancho de la cajita= ("+cajita.getAncho());
        System.out.println("Profundo de la cajita= ("+cajita.getProfundo());
        System.out.println("Volumen de cajita ="+cajita.volumen());
        System.out.println("cajita ="+cajita);
       
        System.out.println("----DATOS DE cajonVerde ----");
        CajaColor cajonVerde=new CajaColor("Verde", 23,56,78);
        System.out.println("Alto de cajonVerde= "+cajonVerde.getAlto());
        System.out.println("Ancho de la cajonVerde= "+cajonVerde.getAncho());
        System.out.println("Profundo de la cajonVerde= "+cajonVerde.getProfundo());
        System.out.println("Volumen de cajonVerde ="+cajonVerde.volumen());
        System.out.println("cajonVerde ="+cajonVerde);
        
        System.out.println("Color de cajonVerde ="+cajonVerde.getColor());
        
        
        //cajita se transforma en cajonVerde
        //cajita ahora apunta a la zona de memoria de cajonVerde
        //Ahora alto, ancho y profundo de cajita seran los mismos de cajonVerde
        //Pero NO tiene color
        //cajita tan solo puede ejecutar metodos definidos en la clase Caja
        //nunca cajita podra ejecutar getColor() - definido en CajaColor
        
        cajita = cajonVerde;
        
        System.out.println("----DATOS DE cajita transformada en cajonVerde----");
        System.out.println("Alto de la cajita= "+cajita.getAlto());
        System.out.println("Ancho de la cajita= "+cajita.getAncho());
        System.out.println("Profundo de la cajita= "+cajita.getProfundo());
        System.out.println("Volumen de cajita ="+cajita.volumen());
        
       //System.out.println("Color de cajita ="+cajita.getColor()); 
       //Error, porque cajita NO tiene acceso al metodo getColor() al ser de tipo Caja
        System.out.println("cajita ="+cajita);       
    }    
}
