/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Supuesto4;

/**
 *
 * @author isabel
 */
public class Ppal_Supuesto4 {

    public static void main(String[] args) {        
        Vivienda vivienda1 = new Vivienda("Referencia1","Murcia","Murcia");        
       
        Moto2 moto2 = new Moto2(400,"Marca1","Modelo1","Matricula1");
        
        Coche2 coche2 = new Coche2(4,"MarcaCoche2","ModeloCoche2","MatriculaCoche2");   
        
        vivienda1.alquilar(); 
        //moto2.alquilar(); NO se puede
        coche2.alquilar();
    }
}
