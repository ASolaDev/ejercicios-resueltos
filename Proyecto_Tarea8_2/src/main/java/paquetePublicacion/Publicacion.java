/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePublicacion;

/**
 *
 * @author isabel
 */
public abstract class Publicacion {
    protected int id;
    protected String titulo;
    protected int anioPublicacion;
    protected static int CONTEO_ID=0;

    public Publicacion(String titulo, int anioPublicacion) throws IllegalArgumentException {
        this.titulo = titulo;
        if (anioPublicacion <= 0) throw new IllegalArgumentException("El año debe ser mayor a 0");
        this.anioPublicacion = anioPublicacion;
        Publicacion.CONTEO_ID++;
        this.id=Publicacion.CONTEO_ID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) throws IllegalArgumentException{
        if (anioPublicacion <= 0) throw new IllegalArgumentException("Error, año de publicacion debe ser positivo");
        this.anioPublicacion = anioPublicacion;
    }

    public static int getCONTEO_ID() {
        return CONTEO_ID;
    }

   
    @Override
    public String toString() {
        return "Publicacion{" + "ID=" + id + " Titulo=" + titulo + " Año de Publicacion=" + anioPublicacion + '}';
    }
      
}
