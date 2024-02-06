/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.herenciaab;

/**
 *
 * @author isabel
 */
public class HerenciaAB {
    public static void main(String[] args) {
        A a=new A();
        a.i=1;
        a.j=1;
        System.out.println("Ejecuto a.mostrarIJ()");
        a.mostrarIJ();
        
        
        B b=new B();
        b.i=2;
        b.j=2;
        b.k=2;
        System.out.println("Ejecuto b.mostrarIJ()");
        b.mostrarIJ();
        System.out.println("");
        System.out.println("Ejecuto b.mostrarK()");
        b.mostrarK();
        System.out.println("Suma de los campos de b="+b.sumaIJK());        
    }
}
