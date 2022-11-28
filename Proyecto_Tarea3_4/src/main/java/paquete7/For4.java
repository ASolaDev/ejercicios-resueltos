/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete7;

/**
 *
 * @author isabel
 */
public class For4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma=0;
        int i=1;
        for (;;) 
        {
            if (i>10) break;
            
            suma+=i;
            i++;
        }
        
        System.out.println("La suma de los 10 primeros números enteros es: "+suma);
    }
    
}
