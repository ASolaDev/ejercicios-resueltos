/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePublicacion;

import java.time.LocalDate;
import paqueteInterfaces.Reservable;

/**
 *
 * @author isabel
 */
public class Libro extends Publicacion implements Reservable{
    protected boolean prestado=false;
    protected LocalDate fechaPrestamo, fechaDevolucion;
    protected boolean reservado=false;
    protected String telefonoReserva;

    public Libro(String titulo, int anioPublicacion) throws IllegalArgumentException {
        super(titulo, anioPublicacion);
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }
    

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }

    
    public boolean isReservado() {
        return reservado;
    }
   
    public String getTelefonoReserva() {
        return telefonoReserva;
    }

    public void setTelefonoReserva(String telefonoReserva) {
        this.telefonoReserva = telefonoReserva;
    }

    @Override
    public String toString() {
        String libroPrestado="";
        if (this.prestado){
            libroPrestado=" Esta prestado el "+Fecha.fechaFormateada(fechaPrestamo)+" y se devolvera el "+Fecha.fechaFormateada(fechaDevolucion);
            if (this.reservado){
                libroPrestado+=" Ademas, esta reservado con telefono "+this.telefonoReserva;
            }        
        }
        return "Libro["+ super.toString()+ libroPrestado + ']';
    }   
    //metodos de la interfaz Prestable
    @Override
    public void prestar() throws IllegalArgumentException{
        if (this.prestado && !this.reservado) throw new IllegalArgumentException("Error, ya esta prestado");
        if (this.prestado && this.reservado){
           this.reservado=false;
           this.telefonoReserva=null;             
        }
        this.prestado=true;
        this.fechaPrestamo= LocalDate.now();
        this.fechaDevolucion = this.fechaPrestamo.plusDays(15);        
    }
    
    @Override
    public void devolver() throws IllegalArgumentException{
        if (!this.prestado) throw new IllegalArgumentException("Error, el libro NO esta prestado");
        System.out.println("\nLibro con id= "+this.id+" devuelto");
        if (this.reservado){
            System.out.println("Atencion!!!: Aviso al telefono "+this.telefonoReserva+" para prestar");
            this.prestar();
        }else{ 
            this.prestado=false;
        }
    }
    
    //metodos de la interfaz Reservable
    @Override
    public void reservar(String telefono) throws IllegalArgumentException{
      if (!this.prestado) throw new IllegalArgumentException("Error, el libro no esta prestado, por lo que no se puede reservar");  
      this.reservado=true;
      this.telefonoReserva=telefono;
    }
}
