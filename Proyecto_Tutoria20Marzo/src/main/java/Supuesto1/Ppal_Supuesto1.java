
package Supuesto1;

/**
 *
 * @author isabel
 */
public class Ppal_Supuesto1 {

    public static void main(String[] args) {        
        Vivienda vivienda1 = new Vivienda("Referencia1","Murcia","Murcia");
        System.out.println("He creado una vivienda para "+Vivienda.EMPRESA);
       
        Vehiculo vehiculo1 = new Vehiculo("Marca1","Modelo1","Matricula1");
        System.out.println("He creado una vehiculo para "+Vehiculo.EMPRESA);
        
        vivienda1.alquilar(); 
        vehiculo1.alquilar();
    }
}
