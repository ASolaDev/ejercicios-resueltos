/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author isabel
 */
public class Calculo {
    
    //método que calcula el imc de una persona, dato de entrada: altura (short) y peso (real corto)
    //devuelve un byte cuyo valor será 1 ó 2 ó 3 ó 4

   
    public static byte imc(double peso, short altura){
        byte b;
        
          double alturaM=altura/100.0;
        
          double imc;
          imc = (double)peso / Math.pow(alturaM,2 );
        
          if (imc < 18.5) b=1;
          else if (imc < 24.9) b=2;
          else if (imc < 29.9) b=3;
          else b=4;
              
        return b;
    }
    
}
