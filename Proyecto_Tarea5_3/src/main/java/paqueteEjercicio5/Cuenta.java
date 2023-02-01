/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteEjercicio5;

/**
 *
 * @author isabel
 */
public class Cuenta {
    private int numero_cuenta;
    private double saldo;
    
    //Constructor
    public Cuenta(int cuenta, double inicial){
        this.numero_cuenta=cuenta;
        this.saldo=inicial;
    }
    
    //Operaciones sobre cuenta 
    
    //Se añade cantidad al saldo
    public void depositar(double cantidad){
       this.saldo+=cantidad;    
    }
    
    //Devuelve el saldo que hay
    public double getSaldo(){
        return saldo;
    }   
}
