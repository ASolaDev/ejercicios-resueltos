/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paquetePrincipal;

import paqueteDispositivos.Dispositivo;
import paquetePublicacion.*;


/**
 *
 * @author isabel
 */
public class Proyecto_Tarea8_2 {

    public static void main(String[] args) {
        //1
        Biblioteca mia=new Biblioteca("MiBiblioteca");        
        //2
        Libro libro1 = new Libro("El dia que se perdio la cordura", 2021);
        Libro libro2 = new Libro("El informe Pelicano", 2000);        
        Revista revista = new Revista(1, "Nation Geographic",2023);
        //3
        Dispositivo disp1 = new Dispositivo("Tablet", 234, "Galaxy A SM-7585");
        Dispositivo disp2 = new Dispositivo("Tablet", 345,"Lenovo M10Plus");
        //4
        mia.prestarBiblioteca(libro1);
        mia.prestarBiblioteca(libro2);
        //5
        mia.prestarBiblioteca(disp1);
        mia.prestarBiblioteca(disp2);           
        
        //6 -> SALDRA 4
        System.out.println("Numero de prestamos :"+mia.cuentaPrestamosBiblioteca());
        
        //7 ->2 LIBROS Y 2 DISPOSITIVOS        
        mia.prestamosBiblioteca();
        
        //8  ->RESERVA DE libro2 -INFORME PELICANO        
        mia.reservarBiblioteca(libro2, "123456");        
                
        //9 -> 1 LIBRO RESERVADO - INFORME PELICANO
        mia.librosBibliotecaReservados();
        
        //10 -> SE DEVUELVE EL libro2 QUE ESTA PRESTADO Y RESERVADO
        //   -> PASA A NO SER RESERVADO Y PRESTADO        
        mia.devolverPrestamoBiblioteca(libro2);        
        //11 -> 2 LIBROS Y 2 DISPOSITIVOS PRESTADOS
        mia.prestamosBiblioteca();
        
        //12 -> SE DEVUELVE EL libro2 
        mia.devolverPrestamoBiblioteca(libro2); 
        //13 -> 1 LIBRO Y 2 DISPOSITIVOS PRESTADOS
        mia.prestamosBiblioteca();
        
        //14 -> SE DEVUELVE disp2
        mia.devolverPrestamoBiblioteca(disp2);  
        //15 -> 1 LIBRO Y 1 DISPOSITIVO
        mia.prestamosBiblioteca();
        
        //16 ->LISTADO DE PRESTAMOS CADUCADOS
        mia.prestamosBibliotecaCaducos();        
    }
}
