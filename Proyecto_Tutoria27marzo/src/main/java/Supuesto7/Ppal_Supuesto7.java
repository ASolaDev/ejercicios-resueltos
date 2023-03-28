/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Supuesto7;


/**
 *
 * @author isabel
 */
public class Ppal_Supuesto7 {

    public static void main(String[] args) {        
        Vivienda vivienda1 = new Vivienda("Referencia1","Murcia","Murcia");    
        Vivienda vivienda2 = new Vivienda("Referencia2","Almeria","Almeria");    
        Vivienda vivienda3 = new Vivienda("Referencia3","Roquetas","Almeria");  
        Vivienda vivienda4 = new Vivienda("Referencia4","Montealegre","Teruel");    
        
        Moto2 moto2 = new Moto2(400,"Marca1","Modelo1","Matricula1");
        
        Coche2 coche2 = new Coche2(4,"MarcaCoche2","ModeloCoche2","MatriculaCoche2");   
        
        vivienda1.alquilar(); 
        vivienda2.vender(120000);
        vivienda3.vender(130000);
        vivienda3.negociar(10000);
        
        vivienda4.hipotecar(90000, 4);
                
        moto2.vender(2000);
        coche2.alquilar();
    }
}
