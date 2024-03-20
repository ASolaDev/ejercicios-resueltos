/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Supuesto13;
/**
 *
 * @author isabel
 */
public class Ppal_Supuesto13 {

    public static void main(String[] args) {        
        Vivienda vivienda1 = new Vivienda("Referencia1","Murcia","Murcia");        
       
        Moto moto2 = new Moto(400,"Marca1","Modelo1","Matricula1");
        
        Coche coche2 = new Coche(4,"MarcaCoche2","ModeloCoche2","MatriculaCoche2");   
        
        vivienda1.alquilar(); 
        moto2.alquilar();
        coche2.alquilar();   
        
        Alquilable.saludo(); //es un metodo estatico y se puede ejecutar como tal        
    }
}
