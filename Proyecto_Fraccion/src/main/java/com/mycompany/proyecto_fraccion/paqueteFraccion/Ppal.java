/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_fraccion.paqueteFraccion;

/**
 *
 * @author isabel
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
      //a.
      Fraccion f=new Fraccion(27,5);
      //b.
      Fraccion g=new Fraccion();
      //c.
      Fraccion h=new Fraccion(g);
      //d.
      int x=Introducir.entero("Dime el numerador: ");
      int y=Introducir.entero("Dime el denominador:");
      Fraccion j=new Fraccion(x,y);
      //e.
      System.out.println("Fraccion f="+f);
      System.out.println("Fraccion g="+g);
      System.out.println("Fraccion h="+h);
      System.out.println("Fraccion j="+j);
      //f.
      f.setNum(g.getDen());
      f.setDen(h.getNum());
        System.out.println("Fraccion f="+f);
        
      //g. f=23/8
      f.setNum(23); f.setDen(8);
        
      //En g salia una excepcion: divide by zero, ya que 
      // g=1/1 y f=1/1, g-f =0. Por eso, he puesto f=23/8, asi se evita el error 
      //g.
      Fraccion k=g.fraccionResta(f);
      System.out.println("Fraccion k="+k);
      //h.
      Fraccion l=h.fraccionCociente(18,5);
      System.out.println("Fraccion l="+l);
      //i.
      System.out.println("(f+g)*k="+f.fraccionSuma(g).fraccionProducto(k));
      //j.
      Fraccion n=g.fraccionCociente(h.fraccionResta(f));
      System.out.println("Fraccion n="+n);
      //k.      
      Fraccion m=j.fraccionSuma(l.fraccionSuma(23,8));
        System.out.println("Fraccion m="+m);
      //l.
      Fraccion o=new Fraccion(f.fraccionSuma(h).getDen(), g.fraccionResta(m).getDen());
        System.out.println("Fraccion o="+o);
      //m.
      if (g.equals(45,2)) 
            System.out.println("Las fracciones g y 45/2 son iguales");
      else
            System.out.println("Las fracciones g y 45/2 son distintos");
      //n. Error del enunciado del ejercicio      
    }   
}
