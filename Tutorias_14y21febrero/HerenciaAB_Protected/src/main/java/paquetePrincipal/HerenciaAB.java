/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paquetePrincipal;

import paqueteSubClase.B;
import paqueteSuperClase.A;

public class HerenciaAB {
    public static void main(String[] args) {
        A a=new A();
        a.setI(1);
        a.setJ(1);
        System.out.println("Ejecuto a.mostrarIJ()");
        a.mostrarIJ();
        
        
        B b=new B();
        b.setI(2);
        b.setJ(2);
        
        b.setK(2);
        
        System.out.println("Ejecuto b.mostrarIJ()");
        b.mostrarIJ();
        System.out.println("");
        System.out.println("Ejecuto b.mostrarK()");
        b.mostrarK();
        System.out.println("Suma de los campos de b="+b.sumaIJK());        
    }
}
