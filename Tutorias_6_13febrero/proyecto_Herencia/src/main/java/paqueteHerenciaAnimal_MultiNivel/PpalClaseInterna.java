/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteHerenciaAnimal_MultiNivel;

/**
 *
 * @author isabel
 */
public class PpalClaseInterna {
    public static void main(String[] args) {
       Coche c1=new Coche(1200);
       Coche c2=new Coche(2400, 1000);
       
        System.out.println("c1="+c1);
        System.out.println("c2="+c2);
        
        System.out.println("Motor del coche c1="+c1.motor);
        System.out.println("Cilindrada del motor del coche c1="+c1.motor.cilindrada);
                
        Coche.Motor motorcito=new Coche.Motor(2000);        
        System.out.println("motorcito= "+motorcito);
        
        Coche c3=new Coche(100, motorcito);
        System.out.println("Coche c3 con motor como entrada="+c3);
    }    
}
