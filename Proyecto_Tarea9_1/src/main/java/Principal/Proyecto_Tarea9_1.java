/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

import java.util.TreeSet;
import paqueteExcepciones.*;
import paqueteInterfaces.Despedible;
import paqueteInterfaces.Incentivable;
import paqueteInterfaces.Jubilable;
import paqueteJerarquia.Empleado;
import paqueteJerarquia.*;
import paqueteOtros.Nie;
import paqueteOtros.Nif;

/**
 *
 * @author isabel
 */
public class Proyecto_Tarea9_1 {

    public static void main(String[] args) {
            //a.
            GestionRRHH hero=new GestionRRHH("Hero");
            
             //b.
            System.out.println("EMPRESA HERO: "+hero);
            
            //c.
            EmpleadoFijo rai = null;
            try {
                rai = new EmpleadoFijo(new Nif("00000001-R"), "Raimundo","Muñoz", LocalDate.of(1950,4,20),LocalDate.of(2017,4,20) );
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
        EmpleadoComisiones raquel2 = null;
        try {
            raquel2 = new EmpleadoComisiones(4500,new Nif("22345679-Y"), "Raquel","Vergara", LocalDate.of(2001,6,13),LocalDate.of(2021,5,21) );
        } 
        catch (NifException | NieException ex1) {               
                System.out.println("Error "+ex1.getMessage());                
        }
        catch (IdException | VentasException ex) {
            System.out.println("Error: "+ex.getMessage());
        } 
        
            //e.
            if (rai != null)  hero.addEmpleado(rai);
            if (tomas != null) hero.addEmpleado(tomas);
            if (kevin != null) hero.addEmpleado(kevin);
            if (pedro != null) hero.addEmpleado(pedro);
            if (manuel != null) hero.addEmpleado(manuel);
            if (raquel != null) hero.addEmpleado(raquel);
            if (raquel2 !=null) hero.addEmpleado(raquel2);
            
            
            //f.
            System.out.println("\nEMPRESA HERO: "+hero);
            
            //g.
            System.out.println("\n\nTotal dinero necesario para pagar a la plantilla "+hero.sueldoSemanalPlantilla()); 
            
            //h.
            hero.listadoOrganizadoPantilla();
            System.out.println("");
            
            //i.
            System.out.println("\n\nEmpleado buscado con Nif: 22345679-Y");
             if (hero.busquedaEmpleadoID("22345679-Y")){
                 Empleado empl=hero.devuelveEmpleadoID("22345679-Y");
                 System.out.println("- "+empl);
             }
            else System.out.println("NO esta");
            System.out.println("");
            
            //j.
            hero.listadoAntiguedadPlantilla();  
            
            //k.
            System.out.println("\nEMPRESA HERO: "+hero);
                        
            //l.
             System.out.println("Suma de ventas de empleados por Comisiones: "+hero.sumaVentasEmpleados());
            
            //m.
             hero.listaEmpleadosHorasExtras();
             
            //n.
             hero.listadoEmpleadosFijosTrienios();  
             
            //o.
            hero.empleadosAIncentivar(4,4200);
            
            //p.
            hero.empleadosIncentivados();           
            
            //q.
            ArrayList <Empleado> mM = hero.listaOrdenadaSueldoPlantilla('O');
            System.out.println("");
            if (!mM.isEmpty()){
                System.out.println("El empleado con menor sueldo es: "+mM.get(0).getApellidos()+" con "+mM.get(0).calculaSueldo()+"€");
                if (mM.size() ==2){                   
                   System.out.println("El empleado con mayor sueldo es: "+mM.get(1).getApellidos()+" con "+mM.get(1).calculaSueldo()+"€"); 
                }
                else if (mM.size() == 1){
                    System.out.println("El empleado con mayor sueldo es: "+mM.get(0).getApellidos()+" con "+mM.get(0).calculaSueldo()+"€");
                }
            }
            
            //r.
            hero.listaOrdenadaApellidosNombrePlantilla('O');
            
            //s.
            hero.listaOrdenadaApellidosNombrePlantilla('I');   
            
            //t.
            hero.listaOrdenadaEdadApellidosNombrePlantilla();
            
            //u.
            hero.listaOrdenadaEmpleadosHoras();
            
            //v.
            hero.listaOrdenadaEmpleadosComisiones();
            
            //w.
            if (rai != null) {hero.despedirEmpleado(rai);}
            
            //x.
             if (kevin != null) {hero.despedirEmpleado(kevin);}
            
            //y.
            hero.empleadosDespedidos();               
           
            //z.
            hero.listaDespedidosNoJubilados();

            hero.empleadosDespedidos();

    }
}
