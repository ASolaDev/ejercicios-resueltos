/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePrincipal;

import paqueteSuperClase.Caja;

/**
 *
 * @author isabel
 */
public class CajaPeso extends Caja{
    protected String peso;
   
   @Override
    public String toString() {
        return "[" + super.toString()+" Peso=" + this.peso + ']';
    }
    
    
   public CajaPeso(String peso, int alto, int ancho, int profundo) {
        super(alto, ancho, profundo);
        this.peso = peso;
    }

    public CajaPeso(String peso, int x) {
        super(x);
        this.peso = peso;
    }

    public CajaPeso(String peso) {
        super();
        this.peso = peso;
    }

    public CajaPeso(String peso, Caja other) {
        super(other);
        this.peso = peso;
    }

    public CajaPeso(CajaPeso other){
        this(other.peso, other.alto, other.ancho, other.profundo);
    }
    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

   
    
    
    
    
}
