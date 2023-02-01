/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Ejercicio8;

/**
 *
 * @author isabel
 */
public class Ppal8 {

    public static void main(String[] args) {
        //En el Ejercicio 7, el apartado correcto es c) 
        // El objeto se llama portatil y tiene precio 900
        // El objeto sobremesa apunta a null y no tiene valor.
        
        Autor autor=new Autor("Paul","Auster");
        Libro libro=new Libro("La trilogia de Nueva York",autor);
        
        System.out.println(libro.getTitulo()+" de "+libro.getAutor().toString());
        //Muestra: La trilogia de Nueva York de Paul Auster
    }
}
