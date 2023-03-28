/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supuesto4;

/**
 *
 * @author isabel
 */
public class Moto2 extends Vehiculo2{
    private int cilindrada;

    public Moto2(int cilindrada, String marca, String modelo, String matricula) {
        super(marca, modelo, matricula);
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Moto2{" +super.toString()+ "cilindrada=" + cilindrada +'}';
    }   
    
}
