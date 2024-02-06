/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteSuperClase;

/**
 *
 * @author isabel
 */
public class Caja {
    protected int alto;
    protected int ancho;
    protected int profundo;

    public Caja(int alto, int ancho, int profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }

    public Caja(int x){
        this(x,x,x);
    }
    
    public Caja(){
        this(0,0,0);
    }
    
    public Caja(Caja other){
        this(other.alto, other.ancho, other.profundo);
    }
    
    
    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

    @Override
    public String toString() {
        return "[" + "Alto=" + this.alto + " Ancho=" + this.ancho + " Profundo=" + this.profundo + ']';
    }

    
    public int volumen(){
        return this.alto*this.profundo*this.ancho;
    }
}
