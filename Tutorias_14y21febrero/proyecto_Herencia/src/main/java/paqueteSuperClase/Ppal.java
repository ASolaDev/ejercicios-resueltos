/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteSuperClase;


/**
 *
 * @author isabel
 */
public class Ppal {

    public static void main(String[] args) {
        A a=new A(1,1);
        B b=new B(2,2,2);
        
        a=b;
        a.mostrarIJ();     
        
        //System.out.println("Suma de b="+a.sumaIJK());
    }
}
 /*
       // a.i=2;
        a.j=1;
        System.out.println("Ejecuto a.mostrarIJ()");
        a.mostrarIJ();
        
        B b=new B(9,9,5);
       // b.i=2;
        b.j=2;
        b.k=2;
        System.out.println("Ejecuto b.mostrarIJ()");
        b.mostrarIJ();
        System.out.println("");
        System.out.println("Ejecuto b.mostrarK()");
        b.mostrarK();
        System.out.println("Suma de los campos de b="+b.sumaIJK());
*/