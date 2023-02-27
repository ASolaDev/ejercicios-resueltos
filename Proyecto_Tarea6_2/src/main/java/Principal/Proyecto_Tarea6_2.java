/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Principal;

import java.time.LocalDate;
import paqueteJerarquia.Empleado;
import paqueteJerarquia.EmpleadoComisiones;
import paqueteJerarquia.EmpleadoFijo;
import paqueteJerarquia.EmpleadoHoras;
import paqueteOtros.Nie;
import paqueteOtros.Nif;

/**
 *
 * @author isabel
 */
public class Proyecto_Tarea6_2 {

    public static void main(String[] args) {
       //a.
        GestionRRHH hero=new GestionRRHH("Hero");
       //b.
        System.out.println("EMPRESA HERO: "+hero);
       //c.       
       EmpleadoFijo rai=new EmpleadoFijo(new Nif("00000001-R"),null, "Raimundo","Muñoz", LocalDate.of(1999,4,20),LocalDate.of(2020,4,20) );
       EmpleadoHoras tomas=new EmpleadoHoras(35,null, new Nie("X-0000001-R"), "Tomas","Escobar", LocalDate.of(1978,5,20),LocalDate.of(2021,8,21) );
       EmpleadoComisiones kevin=new EmpleadoComisiones(4000,null, new Nie("X-0000002-W"), "Kevin","Costa", LocalDate.of(1983,12,21),LocalDate.of(2017,12,21) );
       EmpleadoFijo pedro=new EmpleadoFijo(new Nif("12345678-Z"),null, "Pedro","Martinez", LocalDate.of(2000,5,1),LocalDate.of(2022,5,23) );
       EmpleadoHoras manuel=new EmpleadoHoras(49,new Nif("12345679-S"),null, "Manuel","Mosquera", LocalDate.of(2000,2,11),LocalDate.of(2022,5,23) );
       EmpleadoComisiones raquel=new EmpleadoComisiones(4500,new Nif("22345679-Y"),null, "Raquel","Vergara", LocalDate.of(2001,6,13),LocalDate.of(2021,5,21) );
       //d.
       hero.addEmpleado(rai);
       hero.addEmpleado(tomas);
       hero.addEmpleado(kevin);
       hero.addEmpleado(pedro);
       hero.addEmpleado(manuel);
       hero.addEmpleado(raquel);
       //e.
        System.out.println("\nEMPRESA HERO: "+hero);
        //f.
        System.out.println("\n\nTotal dinero necesario para pagar a la plantilla "+hero.sueldoSemanalPlantilla());
        //g.
        hero.listadoOrganizadoPantilla();
        System.out.println("");
        //h.
        
        if (hero.busquedaEmpleadoNif(new Nif("22345679-Y"))){
            System.out.println("Si, existe un empleado con ese nif");
        }else{
            System.out.println("No hay empleado alguno con ese nif");
        }     
        
        //i.
        System.out.println("");
        hero.listadoAntiguedadPlantilla();
        
        //j.
        hero.despedirEmpleado(rai);
        
        //k.
        System.out.println("\nEMPRESA HERO: "+hero);
        
    }
}
