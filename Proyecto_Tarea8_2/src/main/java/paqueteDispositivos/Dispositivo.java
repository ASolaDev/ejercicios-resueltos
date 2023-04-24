/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteDispositivos;

import java.time.LocalDate;
import paqueteInterfaces.Prestable;
import paquetePublicacion.Fecha;

/**
 *
 * @author isabel
 */
public class Dispositivo implements Prestable{
    private String tipo;
    private int numReferencia;
    private String modelo;
    private boolean prestado=false;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Dispositivo(String tipo, int numReferencia, String modelo) {
        this.tipo = tipo;
        this.numReferencia = numReferencia;
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(int numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    
    @Override
    public String toString() {
        String dispositivoPrestado="";
        if (this.prestado){
            dispositivoPrestado=" Esta prestado el "+Fecha.fechaFormateada(fechaPrestamo)+" y se devolvera el "+Fecha.fechaFormateada(fechaDevolucion);
            
        }     
        return "Dispositivo{" + "Tipo=" + tipo + " Numero de Referencia=" + numReferencia + " Modelo=" + modelo +dispositivoPrestado+ '}';
    }
    
     //metodos de la interfaz Prestable
    @Override
    public void prestar() throws IllegalArgumentException{
        if (this.prestado) throw new IllegalArgumentException("Error, ya esta prestado");
        this.prestado=true;
        this.fechaPrestamo= LocalDate.now();
        this.fechaDevolucion = this.fechaPrestamo.plusDays(7);
    }
    
    @Override
    public void devolver() throws IllegalArgumentException{
        if (!this.prestado) throw new IllegalArgumentException("Error, el libro NO esta prestado");
        System.out.println("\nDispositivo con numero de referencia= "+this.numReferencia+" devuelto");
        this.prestado=false;        
    }
   
    
    
    
}
