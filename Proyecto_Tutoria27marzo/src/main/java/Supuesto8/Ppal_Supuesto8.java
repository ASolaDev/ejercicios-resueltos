/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Supuesto8;
/**
 *
 * @author isabel
 */
public class Ppal_Supuesto8 {

    public static void main(String[] args) {        
        Vivienda vivienda1 = new Vivienda("Referencia1","Murcia","Murcia");        
       
        Moto moto2 = new Moto(400,"Marca1","Modelo1","Matricula1");
        
        Coche coche2 = new Coche(4,"MarcaCoche2","ModeloCoche2","MatriculaCoche2");   
        
        vivienda1.alquilar(); 
        moto2.alquilar();
        coche2.alquilar();
        
        vivienda1.saludo();
        
        Vehiculo vehiculo1 = new Vehiculo("MarcaVehiculo1", "ModeloVehiculo1", "MatriculaVehiculo1");
        vehiculo1.saludo();
        
        //Los metodos default NO se heredan en moto ni coche, solo lo puede utilizar Vehiculo
       //moto2.saludo();
       //coche2.saludo();      
    }      
}
