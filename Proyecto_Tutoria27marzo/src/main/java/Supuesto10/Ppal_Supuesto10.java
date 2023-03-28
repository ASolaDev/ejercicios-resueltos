/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Supuesto10;

/**
 *
 * @author isabel
 */
public class Ppal_Supuesto10 {

    public static void main(String[] args) {        
        Vivienda vivienda1 = new Vivienda("Referencia1","Murcia","Murcia");        
       
        Moto moto2 = new Moto(400,"Marca1","Modelo1","Matricula1");
        
        Coche coche2 = new Coche(4,"MarcaCoche2","ModeloCoche2","MatriculaCoche2");   
        
        vivienda1.alquilar(); 
        vivienda1.saludo();        
        
        moto2.alquilar();
        coche2.alquilar();
           
        Vehiculo vehiculo1 = new Vehiculo("MarcaVehiculo1", "ModeloVehiculo1", "MatriculaVehiculo1");
        vehiculo1.saludo();
        vehiculo1.alquilar();
        vehiculo1.reservar("12345");      
        
        //moto2.saludo(); No se puede
        //moto2.reservar(); NO se puede
    }
}
