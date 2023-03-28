/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Supuesto7;

/**
 *
 * @author isabel
 */
public class Vehiculo2 {
    protected String marca;
    protected String modelo;
    protected String matricula;    

    public Vehiculo2(String marca, String modelo, String matricula) {
        this.marca = marca;
        this.modelo = modelo;
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Vehiculo2{" + "marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula + '}';
    }   
}
