/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package paqueteCoche;

/**
 *
 * @author isabel
 */
public class Principal {

    public static void main(String[] args) {
        
        Coche cochecito=null; 
        try { //correcto
            cochecito = new Coche("TOYOTA", "ROJO", "HIBRIDO", "MANUAL", 4, 1000);
            System.out.println("Coche creado con exito: "+cochecito);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        Coche prueba1=null; 
        try { //marca mala
            prueba1 = new Coche("PEUGEOT", "ROJO", "HIBRIDO", "MANUAL", 4, 1000);
            System.out.println("Coche creado con exito: "+prueba1);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        Coche prueba2=null; 
        try { //color malo
            prueba2 = new Coche("TOYOTA", "MARRON", "HIBRIDO", "MANUAL", 4, 1000);
            System.out.println("Coche creado con exito: "+prueba2);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        
        Coche prueba3=null; 
        try { //combustible malo
            prueba1 = new Coche("TOYOTA", "ROJO", "CARBON", "MANUAL", 4, 1000);
            System.out.println("Coche creado con exito: "+prueba3);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        
        Coche prueba4=null; 
        try { //cambio malo
            prueba1 = new Coche("TOYOTA", "ROJO", "HIBRIDO", "PEDALES", 4, 1000);
            System.out.println("Coche creado con exito: "+prueba4);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        
        Coche prueba5=null; 
        try { //numero de puertas malo
            prueba1 = new Coche("TOYOTA", "ROJO", "HIBRIDO", "MANUAL", -4, 1000);
            System.out.println("Coche creado con exito: "+prueba5);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        
        Coche prueba6=null; 
        try { //precio malo
            prueba1 = new Coche("TOYOTA", "ROJO", "HIBRIDO", "MANUAL", 4, -1000);
            System.out.println("Coche creado con exito: "+prueba6);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        
         Coche prueba7=null; 
        try { //combustible, cambio y precio malo. SALTA EL PRIMER ERROR QUE ENCUENTRE DEBIDO AL ORDEN DE EJECUCION EN EL CONSTRUCTOR
            prueba1 = new Coche("TOYOTA", "ROJO", "CARBON", "PEDALES", 4, -1000);
            System.out.println("Coche creado con exito: "+prueba7);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
