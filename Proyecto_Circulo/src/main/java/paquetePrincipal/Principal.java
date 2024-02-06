/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetePrincipal;

import paqueteCirculo.*;


/**
 *
 * @author isabel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //a.
        Punto p=new Punto();
        Punto q=new Punto(5,4);
        Punto r=new Punto(Introducir.entero("x:"),Introducir.entero("y:"));
        Punto t=new Punto(q);
        
        //b.Si en c2 ponemos r=-4 se rompería el programa. Deberíamos
        //tratarla con un try/catch
        Circulo c1=new Circulo();
        Circulo c2=new Circulo(q,4);
        Circulo c3=new Circulo(7,10,12);
        Circulo c4=new Circulo(7);
        Circulo c5=new Circulo(c3);
        Circulo c6=new Circulo(c3.getCentro(), c4.getRadio());
        Circulo c7=new Circulo(q.puntoOpuesto(), 19);
        Circulo c8=new Circulo(p.puntoIntermedio(c7.getCentro()),24);
        //c.
        System.out.println("C1: "+c1);
        System.out.println("C2: "+c2);
        System.out.println("C3: "+c3);
        System.out.println("C4: "+c4);
        System.out.println("C5: "+c5);
        System.out.println("C6: "+c6);
        System.out.println("C7: "+c7);
        System.out.println("C8: "+c8);
        //d. 
        System.out.println(c8.getCentro());
        //e, f.
        c5.setCentro(c7.getCentro()); 
        System.out.println("C5= "+c5);
        //g, h.
        c4.setCentro(r);
        System.out.println("C4= "+c4);
        //i, j.
        c2.setCentro(4,5);
        System.out.println("C2= "+c2);
        //k,l.
        c4.setCentro(c4.getCentro().puntoSuma(r.puntoOpuesto()));
        System.out.println("C4= "+c4);
        //m,n.
        c5.setRadio(c4.getCentro().getX());
        System.out.println("C5= "+c5);
        //o, p.
        c6.setCentro(c5.getCentro());
        c6.setRadio(r.getX());
        System.out.println("C6= "+c6);
        //q, r
        c4.setCentro(c5.getCentro().getY(),7);
        //Aquí pone cambiar radio c4 por radioc4¿?¿?
        System.out.println("C4= "+c4);
        //s
        c7.setCentro(c4.getCentro());
        c7.setRadio(c4.getRadio());
        System.out.println("C7= "+c7);
        System.out.println("C8 long:"+c8.longitud());
        //t
        System.out.println("Área c1: "+c1.area());
        //u.
        System.out.println("Dist c4,c5: "+c4.distancia(c5));
        //v
        System.out.println("Dist c4, punto t: "+c4.distancia(t));
        //w.
        System.out.println("Dist c3,c1: "+c3.distancia(c1));
        //x.
        System.out.println("Dist c7, Punto: "+c7.distancia(c2.getCentro().getX(),c3.getCentro().getY()));
        //y.
        System.out.println("Ejercicio introducir radio EXCEPCION");
        try{
            c1.setRadio(Introducir.entero("Introduzca el radio de c1:"));
            System.out.println("Cambiado con éxito");
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
       
        System.out.println("Circulo con excepción");
        try{
        Circulo c9=new Circulo(Introducir.entero("x="),
                Introducir.entero("y="),Introducir.entero("radio="));
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

        
