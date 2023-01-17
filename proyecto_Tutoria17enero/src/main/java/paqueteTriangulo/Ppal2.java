/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteTriangulo;

/**
 *
 * @author isabel
 */
public class Ppal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Triangulo t1=new Triangulo();
        System.out.println("t1="+t1);
        
        Triangulo t2=new Triangulo(8,4);
        System.out.println("t2="+t2);
        
        t2.setAltura(20);
        System.out.println("Altura de t2="+t2.getAltura());
        
        System.out.println("Hipotenusa de t2="+t2.hipotenusa()); //hipotenusa() es privado
        
        System.out.println("Area de t2= "+t2.area()+" Perimetro de t2= "+t2.perimetro());
        
        //Constructor por copia
        Triangulo t3=new Triangulo(t2);
        System.out.println("t3= "+t3);
        
        //Constructor isosceles rectangulo
        Triangulo t4=new Triangulo(4);
        System.out.println("t4="+t4);
        
        //Metodo --> boolean equals(Triangulo other)
        if (t3.equals(t2)){
            System.out.println("t2 y t3 son iguales");
        }
        else {
            System.out.println("t2 y t3 son distintos");
        }
        
        //Metodo clonar
        Triangulo clonT3=t3.clonar();
        if (t3.equals(clonT3)){
            System.out.println("t3 y clonT3 son iguales");
        }
        else {
            System.out.println("t3 y clonT3 son distintos");
        }
        
        //Metodo equals sobrecargado --> boolean equals(int base, int altura)
        if (t3.equals(7,9)){
            System.out.println("t3 y Triangulo(base:7,altura:9) son iguales");
        }
        else {
            System.out.println("t3 y Triangulo(base:7,altura:9) son distintos");
        }
        
    }
    
}
