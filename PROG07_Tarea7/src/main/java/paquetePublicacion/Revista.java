/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePublicacion;

/**
 *
 * @author isabel
 */
public class Revista extends Publicacion{
    protected int numero;

    public Revista(int numero, String titulo, int anioPublicacion) throws IllegalArgumentException {
        super(titulo, anioPublicacion);
        if (numero < 0) throw new IllegalArgumentException("Error, el numero no puede ser negativo");
        this.numero = numero;        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) throws IllegalArgumentException {
        if (numero < 0) throw new IllegalArgumentException("Error, numero no puede ser negativo");
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Revista[" +super.toString()+ " Numero=" + numero + ']';
    }
    
    
}
