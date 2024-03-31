/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.ArrayList;
import paqueteExcepciones.IdException;
import paqueteExcepciones.NifException;
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
    
    public boolean busquedaEmpleadoID(Object object) throws IdException {
        if (object ==null){
            throw new IdException("Un empleado debe tener nif o nie de forma obligada");
        }
        if (!(object instanceof Nif) && !(object instanceof Nie) && !(object instanceof String)){
            throw new IdException("Error, un empleado debe tener nif o nie y No otra cosa");
        }
        
        boolean busco=false;
        if (object instanceof String){
           try{
               Nif nif = new Nif((String) object);
               for(Empleado empl: this.empleados){
                 if (empl.getNif()!=null && empl.getNif().equals(nif)){
                     busco=true;   
                break;
               }
            }   
           }catch(NifException ee) {
               Nie nie = new Nie((String) object);
               for(Empleado empl: this.empleados){
                if (empl.getNie()!=null && empl.getNie().equals(nie)){
                   busco=true;   
                break;
               }           
            }
           }
        }       
        else if (object instanceof Nif){
            Nif nif=(Nif)object;             
            for(Empleado empl: this.empleados){
            if (empl.getNif()!=null && empl.getNif().equals(nif)){
                busco=true;   
                break;
               }
            }        
        }else {
            Nie nie=(Nie)object;           
            for(Empleado empl: this.empleados){
            if (empl.getNie()!=null && empl.getNie().equals(nie)){
                busco=true;   
                break;
            }           
            }  
        }
        return busco;        
    }
    
    //Metodo usa Object , instanceof y DownCasting explicito
    public Empleado devuelveEmpleadoID(Object object) throws IdException {
      if (object ==null){
            throw new IdException("Un empleado debe tener nif o nie de forma obligada");
        }
        if (!(object instanceof Nif) && !(object instanceof Nie) ){
            throw new IdException("Error, un empleado debe tener nif o nie y No otra cosa");
        }
        Empleado e=null;
        
        if (object instanceof String){
           try{
               Nif nif = new Nif((String) object);
               for(Empleado empl: this.empleados){
                 if (empl.getNif()!=null && empl.getNif().equals(nif)){
                     e = empl;   
                break;
               }
            }   
           }catch(NifException ee) {
               Nie nie = new Nie((String) object);
               for(Empleado empl: this.empleados){
                if (empl.getNie()!=null && empl.getNie().equals(nie)){
                   e = empl;   
                break;
               }           
            }
           }
        }       
        else if (object instanceof Nif){
            Nif nif=(Nif)object;   //DownCasting explicito          
            for(Empleado empl: this.empleados){
            if (empl.getNif()!=null && empl.getNif().equals(nif)){                
                e=empl;   
                break;
               }
            }           
        }else{
            Nie nie=(Nie)object;    //DownCasting explicito       
            for(Empleado empl: this.empleados){
            if (empl.getNie()!=null && empl.getNie().equals(nie)){
                e=empl;   
                break;
            }           
            }  
        }
        return e;        
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
    
    
    //Metodos UpCasting
    public float sumaVentasEmpleados(){
        float suma=0.0f;
        for (Empleado empl: this.empleados) {
            if (empl instanceof EmpleadoComisiones){
                suma = suma + ((EmpleadoComisiones)empl).getVentas();
            }
        }
        return suma;
    }
    
    public void listaEmpleadosHorasExtras(){
        System.out.println("--EMPLEADOS CON HORAS EXTRAS ");
        for (Empleado empl: this.empleados) {
            if (empl instanceof EmpleadoHoras){
                int horas= ((EmpleadoHoras)empl).getNumHoras() - 40;
                if (horas > 0){
                    System.out.println("- "+empl);
                }
            }
        }
    }
    
    public void listadoEmpleadosFijosTrienios(){
       System.out.println("--EMPLEADOS FIJOS CON TRIENIOS ");
        for (Empleado empl: this.empleados) {
            if (empl instanceof EmpleadoFijo){
                int trienios= ((EmpleadoFijo)empl).trienios();
                if (trienios > 0){
                    System.out.println("- "+empl);
                }
            }
        } 
    }
    
} 