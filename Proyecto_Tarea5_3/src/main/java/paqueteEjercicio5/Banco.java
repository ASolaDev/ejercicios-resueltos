/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteEjercicio5;

/**
 *
 * @author isabel
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cuenta_1=new Cuenta(123456,2505.32);
        
        //double total_cuenta=cuenta_1.saldo; --Error: saldo tiene acceso privado
        //System.out.println("Total actual en la cuenta: "+total_cuenta+" Euros");
    }
    
}
