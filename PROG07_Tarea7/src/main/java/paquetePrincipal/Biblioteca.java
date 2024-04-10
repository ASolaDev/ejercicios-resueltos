/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePrincipal;

import java.time.LocalDate;
import java.util.ArrayList;
import paqueteDispositivos.Dispositivo;
import paqueteInterfaces.Prestable;
import paqueteInterfaces.Reservable;
import paquetePublicacion.Libro;

/**
 *
 * @author isabel
 */
public class Biblioteca {
    private String nombre;
    private ArrayList <Prestable> prestamos= new ArrayList <Prestable> ();

    public Biblioteca(String nombre) {
        this.nombre = nombre;
    }
    
    public void prestarBiblioteca(Prestable objeto){
        objeto.prestar();
        this.prestamos.add(objeto);
    }
    
    public void reservarBiblioteca(Reservable libro, String telefono) throws IllegalArgumentException{
        if (this.prestamos.contains(libro)){
            libro.reservar(telefono);
        }
        else {
            throw new IllegalArgumentException("El libro "+libro+" NO esta prestado...");
        }
    }
    
    public int cuentaPrestamosBiblioteca(){
        return this.prestamos.size();
    }
    
    public void prestamosBiblioteca()
    {
        if (this.prestamos.isEmpty()){
            System.out.println("\nNO HAY NI LIBROS NI DISPOSITIVOS PRESTADOS TODAVIA");            
        }
        else{
            System.out.println("\n---LISTADO DE LIBROS PRESTADOS ---");
            int numLibros=0;
            for(Prestable p: this.prestamos){
                if (p instanceof Libro){
                    numLibros++;
                    System.out.println(numLibros+"- "+((Libro) p).getId()+" "+((Libro) p).getTitulo());                    
                }
            }
            System.out.println("Hay en total "+numLibros+" prestados");
            System.out.println("\n---LISTADO DE DISPOSITIVOS PRESTADOS ---");
            int numDispositivos=0;
            for(Prestable p: this.prestamos){
                if (p instanceof Dispositivo){                   
                    System.out.println(++numDispositivos+"- "+((Dispositivo) p).getTipo()+" "+((Dispositivo) p).getNumReferencia());                    
                }
            }
            System.out.println("Hay en total "+numDispositivos+" prestados");            
        }
    }
    
    public void prestamosBibliotecaCaducos(){
        if (this.prestamos.isEmpty()){
            System.out.println("\nNO HAY NI LIBROS NI DISPOSITIVOS PRESTADOS TODAVIA");            
        }
        else{
            System.out.println("\n---LISTADO DE LIBROS/DISPOSITIVOS PRESTADOS CUYA FECHA DE DEVOUCION ESTA PASADA---");
            int numPrestamosCaducos=0;
            for(Prestable p: this.prestamos){                
                if (p instanceof Libro && ((Libro)p).getFechaDevolucion().isBefore(LocalDate.now())){                   
                    System.out.println("-"+ ++numPrestamosCaducos+" "+((Libro) p).getId()+" "+((Libro) p).getTitulo()+" "+((Libro)p).getFechaDevolucion());                    
                }else if (p instanceof Dispositivo && ((Dispositivo)p).getFechaDevolucion().isBefore(LocalDate.now())){                   
                    System.out.println(++numPrestamosCaducos+"- "+((Dispositivo) p).getTipo()+" "+((Dispositivo) p).getNumReferencia()+" "+((Dispositivo)p).getFechaDevolucion());                    
                }                
            }
             System.out.println("Hay en total "+numPrestamosCaducos+" libros y/o dispositivos");            
        }
    }
    
    public void librosBibliotecaReservados(){
       if (this.prestamos.isEmpty()){
            System.out.println("\nNO HAY LIBROS PRESTADOS TODAVIA, Y COMO CONSECUENCA RESERVADOS");            
        }
        else{
            System.out.println("\n---LISTADO DE LIBROS RESERVADOS---");
            int numLibrosReservados=0;
            for(Prestable p: this.prestamos){
                if (p instanceof Libro && ((Libro)p).isReservado()){
                    Libro libro=(Libro)p;
                    System.out.println(++numLibrosReservados+"- "+libro.getId()+" "+libro.getTitulo());                    
                }
            }
            System.out.println("Hay en total "+numLibrosReservados+" libros reservados");            
        } 
    }
    
    public void devolverPrestamoBiblioteca(Prestable objeto){
        if (this.prestamos.contains(objeto)){   
            objeto.devolver();            
            this.prestamos.remove(objeto);
        }
        else {
            System.out.println("El libro o dispositivo "+objeto+" NO esta prestado...");
        } 
    }
    
    
}
