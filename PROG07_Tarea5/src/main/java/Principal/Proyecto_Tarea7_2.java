/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

import java.time.LocalDate;
import paqueteExcepciones.*;
import paqueteJerarquia.*;
import paqueteOtros.Nie;
import paqueteOtros.Nif;

/**
 *
 * @author isabel
 */
public class Proyecto_Tarea7_2 {

    public static void main(String[] args) {
        
            //a.
            GestionRRHH hero=new GestionRRHH("Hero");
            //b.
            System.out.println("EMPRESA HERO: "+hero);
            //c.  
            
            
             /*
        a) ¿Qué significa añadir la clausa throws para la excepción: NifException que se encuentra en el paquete: paqueteExcepciones?  
        -Significa que hay que añadir en el main que lanza (throws) la excepción NifException y cuando ocurra esa excepcion -> se rompera el programa            
        
        b) ¿Qué significa envolver la orden EmleadoFijo rai = new EmpleadoFijo …. con un try-catch?
        -Se hace un try-catch para que intente crear el empleado fijo rai, y si no puede hacerlo que
        capture la excepción que se genera
            
        ¿Serías capaz de realizar un multicatch para cada vez que se cree un objeto de una
        subclase de Empleado contemple las excepciones IdException, NifException y
        NieException emitiendo los mensajes correspondientes para cada tipo de excepción?
        -Para capturar las 3 excepciones, primero habría que poner las excepciones de la subclase
        y por último la IdException que es la de la superclase 
       
        c) ¿Envolver el Bloque con try-catch? ¿Qué usarías como Bloque a) el conjunto de
        creación de objetos o b)main()?
        -Para envolver con un try-catch he usado como bloque el conjunto de la creación de objetos derivados de Empleado, si hubiera algún error en la creación, se envía el mensaje, pero
         se puede continuar realizando el resto de apartados del main.       
        Aunque también se puede envolver con try-catch el bloque de apartados c) hasta el último apartado de main. Ahora bien, en el caso de que haya algún error, salta y se va a catch finalizando
          el ejercicio. 
 
         */
            
            EmpleadoFijo rai = null;
            try {
                rai = new EmpleadoFijo(new Nif("00000001-R"), "Raimundo","Muñoz", LocalDate.of(1999,4,20),LocalDate.of(2017,4,20) );
            } catch (NifException | NieException ex1) {               
                System.out.println("Error "+ex1.getMessage());                
            } catch (IdException ex) {
                System.out.println(ex.getMessage());
            }
            
            
            EmpleadoHoras tomas = null;
            try {
                 tomas = new EmpleadoHoras(35, new Nie("X-0000001-R"), "Tomas","Escobar", LocalDate.of(1978,5,20),LocalDate.of(2021,8,21) );
            } catch (NifException | NieException ex) {
                System.out.println("Error: "+ex.getMessage());            
            }
            catch(IdException |NumHorasException ee){
                System.out.println("Error ocurrido de forma desconocida...");
            }
            
            
            EmpleadoComisiones kevin = null;
            try {
                kevin = new EmpleadoComisiones(4000, new Nie("X-0000002-W"), "Kevin","Costa", LocalDate.of(1983,12,21),LocalDate.of(2017,12,21) );
            } catch (NifException | NieException ex) {
                System.out.println("Error: "+ex.getMessage());            
            }
            catch (IdException | VentasException ex) {
                System.out.println("Error: "+ex.getMessage());
            }
            
            
        EmpleadoFijo pedro = null;
        try {
            pedro = new EmpleadoFijo(new Nif("12345678-Z"), "Pedro","Martinez", LocalDate.of(2000,5,1),LocalDate.of(2022,5,23) );
        } catch (NifException | NieException ex1) {               
                System.out.println("Error "+ex1.getMessage());                
        } catch(IdException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        EmpleadoHoras manuel = null;
        try {
            manuel = new EmpleadoHoras(49,new Nif("12345679-S"), "Manuel","Mosquera", LocalDate.of(2000,2,11),LocalDate.of(2022,5,23) );
        }
        catch (NifException | NieException ex1) {               
                System.out.println("Error "+ex1.getMessage());                
        }
        catch (IdException | NumHorasException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
        
        
        EmpleadoComisiones raquel = null;
        try {
            raquel = new EmpleadoComisiones(4500,new Nif("22345679-Y"), "Raquel","Vergara", LocalDate.of(2001,6,13),LocalDate.of(2021,5,21) );
        } 
        catch (NifException | NieException ex1) {               
                System.out.println("Error "+ex1.getMessage());                
        }
        catch (IdException | VentasException ex) {
            System.out.println("Error: "+ex.getMessage());
        }
            
            //d.
            if (rai != null)  hero.addEmpleado(rai);
            if (tomas != null) hero.addEmpleado(tomas);
            if (kevin != null) hero.addEmpleado(kevin);
            if (pedro != null) hero.addEmpleado(pedro);
            if (manuel != null) hero.addEmpleado(manuel);
            if (raquel != null) hero.addEmpleado(raquel);
            //e.
            System.out.println("\nEMPRESA HERO: "+hero);
            //f.
            System.out.println("\n\nTotal dinero necesario para pagar a la plantilla "+hero.sueldoSemanalPlantilla());
            //g.
            hero.listadoOrganizadoPantilla();
            System.out.println("");
            //h.
            /*
            if (hero.busquedaEmpleadoID(new Nif("22345679-Y"))){
            System.out.println("Si, existe un empleado con ese nif");
            }else{
            System.out.println("No hay empleado alguno con ese nif");
            }
            */
            
            
            Empleado reward = null;
        try {
            reward = hero.devuelveEmpleadoID(new Nif("22345679-Y"));
        } catch (IdException ex) {
            System.out.println("Error :"+ex.getMessage());
        }
            if (reward != null){
                System.out.print("Empleado buscado: "+reward.getNombre()+" "+reward.getApellidos());
                
                if (reward instanceof EmpleadoFijo){ System.out.println(" es Empleado fijo.");}
                else if (reward instanceof EmpleadoHoras){System.out.println(" es Empleado por Horas");}
                else System.out.println(" es Empleado por Comisiones");
                /* Otra forma
                switch(reward.getClass().getSimpleName()){
                case "EmpleadoFijo" -> System.out.println(" es Empleado Fijo");
                case "EmpleadoHoras" -> System.out.println(" es Empleado por Horas");
                case "EmpleadoComisiones" -> System.out.println(" es Empleado por Comisiones");
                }*/
            }
            
            //i.
            System.out.println("");
            hero.listadoAntiguedadPlantilla();
            
            //j.
            if (rai != null) {hero.despedirEmpleado(rai);}
            
            //k.
            System.out.println("\nEMPRESA HERO: "+hero);
            
            //l.
            System.out.println("---- \n TOTAL DE VENTAS -----");
            System.out.println(hero.sumaVentasEmpleados());
            
            //m.
            hero.listaEmpleadosHorasExtras();
            
            //n.
            hero.listadoEmpleadosFijosTrienios();  
        
    }
}
