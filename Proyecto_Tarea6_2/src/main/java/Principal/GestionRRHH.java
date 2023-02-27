/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.ArrayList;
import paqueteJerarquia.*;
import paqueteOtros.Nie;
import paqueteOtros.Nif;

/**
 *
 * @author isabel
 */
public class GestionRRHH {
   private String empresa;
   private ArrayList <Empleado> empleados;

   //Constructores
    public GestionRRHH(String empresa) {
        this.empresa = empresa;
        this.empleados= new ArrayList <Empleado>();
    }

    public GestionRRHH(String empresa, ArrayList<Empleado> empleados) {
        this.empresa = empresa;
        this.empleados = empleados;
    }
   
   //Getter y Setter

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }
    
    //Metodo toString

    @Override
    public String toString() {
        String cadena="[Empresa=" + empresa;
        if (this.empleados.isEmpty()){
            cadena+=" SIN EMPLEADOS";
        }
        else{
            int num=1;
            for(Empleado empl : this.empleados){
                cadena+="\n"+num+"- "+empl;
                num++;
            }
        }
        cadena+="]";
        return cadena;
    }
    
    //Metodos para el ArrayList
    public boolean existeEmpleado(Empleado empl){
        return this.empleados.contains(empl);
    }
    
    public void addEmpleado(Empleado empl){
        if (!existeEmpleado(empl))
           this.empleados.add(empl);
        else 
            System.out.println("El empleado: "+empl.getNombre()+" "+empl.getApellidos()+" ya esta dado de alta");
    }
    
    public void despedirEmpleado(Empleado empl){
        if (existeEmpleado(empl))
            this.empleados.remove(empl);
        else 
            System.out.println("El empleado: "+empl.getNombre()+" "+empl.getApellidos()+" ya esta dado de baja");
    }
    
    //Metodos propios
    public float sueldoSemanalPlantilla(){
        float suma=0.0f;
        for(Empleado empl: this.empleados){
            suma+=empl.calculaSueldo();
        }
        
        return suma;
    }
    
    public boolean busquedaEmpleadoNif(Nif nif){
        boolean busco=false;
        for(Empleado empl: this.empleados){
            if (empl.getNif()!=null && empl.getNif().equals(nif)){
                busco=true;   
                break;
            }
        }        
        return busco;
    }
    
    public boolean busquedaEmpleadoNie(Nie nie){
        boolean busco=false;
        for(Empleado empl: this.empleados){
            if (empl.getNie()!=null && empl.getNie().equals(nie)){
                busco=true;   
                break;
            }            
        }        
        return busco;
    }
    
    public void listadoOrganizadoPantilla(){
        System.out.println("-----LISTADO POR EMPLEADOS FIJOS-----");
        for(Empleado empl: this.empleados){
            if (empl instanceof EmpleadoFijo){
                System.out.println("-"+empl);
            }
        }
        System.out.println("-----LISTADO POR EMPLEADOS POR HORAS-----");
        for(Empleado empl: this.empleados){
            if (empl instanceof EmpleadoHoras){
                System.out.println("-"+empl);
            }
        }
        System.out.println("-----LISTADO POR EMPLEADOS POR COMISIONES-----");
        for(Empleado empl: this.empleados){
            if (empl instanceof EmpleadoComisiones){
                System.out.println("-"+empl);
            }
        }
    }   
    
    public void listadoAntiguedadPlantilla(){
        System.out.println("----LISTADO CON ANTIGUEDAD ----");
        for(Empleado empl: this.empleados){
            System.out.println("-"+empl.getNombre()+" "+empl.getApellidos()+" lleva trabajados "+empl.tiempoEmpresa());
        }
    }
} 