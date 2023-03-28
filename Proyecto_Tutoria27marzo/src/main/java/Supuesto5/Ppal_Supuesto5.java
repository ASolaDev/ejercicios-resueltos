/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Supuesto5;

/**
 *
 * @author isabel
 */
public class Ppal_Supuesto5 {

    public static void main(String[] args) {        
        Vivienda vivienda1 = new Vivienda("Referencia1","Murcia","Murcia");    
        Vivienda vivienda2 = new Vivienda("Referencia2","Almeria","Almeria");    
       
        Moto2 moto2 = new Moto2(400,"Marca1","Modelo1","Matricula1");
        
        Coche2 coche2 = new Coche2(4,"MarcaCoche2","ModeloCoche2","MatriculaCoche2");   
        
        vivienda1.alquilar(); 
        vivienda2.vender(120000);
        moto2.vender(2000);
        coche2.alquilar();
    }
}
