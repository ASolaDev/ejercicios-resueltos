/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.HashMap;
import paqueteInterfaces.Despedible;
import paqueteInterfaces.Incentivable;
import paqueteInterfaces.Jubilable;
import paqueteJerarquia.*;

/**
 *
 * @author isabel
 */
public class GestionRRHH {
   private String empresa;
   private HashMap <String,Empleado> empleados=new HashMap <String, Empleado>();
  
   private ArrayList <Incentivable> incentivados = new ArrayList <Incentivable>();
   private ArrayList <Despedible> despedidos = new ArrayList <Despedible>();   
   private ArrayList<Jubilable> jubilados = new ArrayList <Jubilable>();
   
   //Constructores
    public GestionRRHH(String empresa) {
        this.empresa = empresa;        
    }

    public GestionRRHH(String empresa, HashMap <String, Empleado> empleados) {
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

    public HashMap <String, Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashMap <String, Empleado> empleados) {
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
            for(String key: this.empleados.keySet()){ //contiene las key
                cadena+="\n"+num+"- "+this.empleados.get(key);
                num++;
            }
        }
        cadena+="]";
        return cadena;
    }
    
    //Metodos para el HashMap
    public boolean existeEmpleado(Empleado empl){ 
        String key = (empl.getNif()!=null)?empl.getNif().toString():empl.getNie().toString();        
        return this.empleados.containsKey(key);
    }
    
    public void addEmpleado(Empleado empl){        
        String key = (empl.getNif()!=null)?empl.getNif().toString():empl.getNie().toString();    
        if (!this.existeEmpleado(empl)){
            this.empleados.put(key, empl);   
        }else {System.out.println(" El empleado ya esta dado de alta");  }  
    }
    
    
    //Metodos propios
    public float sueldoSemanalPlantilla(){
        float suma=0.0f;
        
        for(Map.Entry <String, Empleado> entrada: this.empleados.entrySet()){
            suma+=entrada.getValue().calculaSueldo();
        }        
        return suma;
    }
       
    public boolean busquedaEmpleadoID(String key) {        
        return this.empleados.containsKey(key);
       
    }   
    
    public Empleado devuelveEmpleadoID(String key) {
      Empleado e=null;
      if (this.busquedaEmpleadoID(key)){
          e=this.empleados.get(key);
      }
      return e;
    }
    
    public void listadoOrganizadoPantilla(){
        System.out.println("\n-----LISTADO POR EMPLEADOS FIJOS-----");
        Collection <Empleado> coleccion= this.empleados.values();
        for(Empleado empl: coleccion){
            if (empl instanceof EmpleadoFijo){
                System.out.println("-"+empl);
            }
        }
        System.out.println("\n-----LISTADO POR EMPLEADOS POR HORAS-----");
        for(Empleado empl: coleccion){
            if (empl instanceof EmpleadoHoras){
                System.out.println("-"+empl);
            }
        }
        System.out.println("\n-----LISTADO POR EMPLEADOS POR COMISIONES-----");
       for (Empleado empl: coleccion) {
           if (empl instanceof EmpleadoComisiones){
               System.out.println("-"+empl);
           }
       }
    }   
    
    public void listadoAntiguedadPlantilla(){
        System.out.println("\n----LISTADO POR ANTIGUEDAD ----");
        Collection <Empleado> coleccion= this.empleados.values(); //Todos los valores se meten en una coleccion
        
        List <Empleado> lista= new ArrayList <>();
        lista.addAll(coleccion);
                
        Collections.sort(lista, new ComparadorFechaTrabajoEmpleado());
        for(Empleado empl: lista){
                String key = (empl.getNif()!=null)?empl.getNif().toString():empl.getNie().toString();        
                System.out.println("-"+key+" "+empl.getNombre()+" "+empl.getApellidos()+" con "+empl.tiempoEmpresa());
        }
           
    }
    
    //Metodos UpCasting
    public float sumaVentasEmpleados(){
        float suma=0.0f;
        for(Empleado empl: this.empleados.values()){
            if (empl instanceof EmpleadoComisiones c)
            suma+=c.getVentas();
        }
        return suma;
    }
    
    
    public void listaEmpleadosHorasExtras(){
        System.out.println("\n--EMPLEADOS CON HORAS EXTRAS ");
        
        for (Map.Entry <String, Empleado> entrada: this.empleados.entrySet()) {
            if (entrada.getValue() instanceof EmpleadoHoras h){        
                int horas= h.getNumHoras() - 40;
                if (horas > 0){
                    String key = (h.getNif()!=null)?h.getNif().toString():h.getNie().toString();        
                    System.out.println("- "+key+" "+entrada.getKey()+" "+h.getApellidos()+" "+h.getNombre()+" -> "+horas+" horas");
                }
            }
        }
    }
    
    
    public void listadoEmpleadosFijosTrienios(){
       System.out.println("\n--EMPLEADOS FIJOS CON TRIENIOS ");
       int numEmple = 0;
        for (Map.Entry <String,Empleado> entrada: this.empleados.entrySet()) {
            if (entrada.getValue() instanceof EmpleadoFijo f){
                int trienios= f.trienios();
                if (trienios > 0){
                    String key = (f.getNif()!=null)?f.getNif().toString():f.getNie().toString();        
                    System.out.println("- "+key+" "+entrada.getKey()+ " "+f.getApellidos()+" "+f.getNombre()+" -> "+trienios+" trienios");
                    numEmple ++;
                }
            }
        } 
        System.out.println("Hay "+numEmple+" Fijos con Trienios");
    }
    
    public void empleadosAIncentivar(int horas, float ventas){        
        for(Map.Entry<String, Empleado> e : this.empleados.entrySet()){
            if (e.getValue() instanceof EmpleadoHoras h){    
                if (h.getNumHoras() > (40 + horas)){
                   this.incentivados.add(h); 
                   h.premiar();
                }
            } else if (e.getValue() instanceof EmpleadoComisiones c){
                if (c.getVentas() > ventas){
                    this.incentivados.add(c);
                    c.premiar();
                }            
            }        
        }
    }
    
    
    public void empleadosIncentivados(){
        System.out.println("\n\n--EMPLEADOS PREMIADOS POR INCENTIVO--");
        for(Incentivable i: this.incentivados){
            if (i instanceof EmpleadoHoras h) {
                String key = (h.getNif()!=null)?h.getNif().toString():h.getNie().toString();        
                System.out.println("Empleado por horas ->"+h.getNombre()+" "+h.getApellidos()+" con "+h.calculaSueldo()+"€");
            }else if (i instanceof EmpleadoComisiones c) {     
                String key = (c.getNif()!=null)?c.getNif().toString():c.getNie().toString();        
                System.out.println("Empleado por Comisiones ->"+c.getNombre()+" "+c.getApellidos()+" con "+c.calculaSueldo()+"€");
            }              
        }
    }
    
    public void despedirEmpleado(Empleado empl){
        if (existeEmpleado(empl)){
            empl.despedir();
            this.despedidos.add(empl);
            if (empl.isJubilado())
                this.jubilados.add(empl);
            
            String key = (empl.getNif()!=null)?empl.getNif().toString():empl.getNie().toString();
            this.empleados.remove(key);
        }else 
            System.out.println("El empleado: "+empl.getNombre()+" "+empl.getApellidos()+" ya esta dado de baja");
    }
   
    public void empleadosDespedidos(){
        System.out.println("\n\n--EMPLEADOS DESPEDIDOS--");
        for(Despedible d: this.despedidos){   
            
            if (d instanceof EmpleadoFijo f){
                String key = (f.getNif()!=null)?f.getNif().toString():f.getNie().toString();        
                System.out.println("Empleado Fijo ->"+key+" "+f.getNombre()+" "+f.getApellidos());
            }else if (d instanceof EmpleadoHoras h){
                String key = (h.getNif()!=null)?h.getNif().toString():h.getNie().toString();        
                System.out.println("Empleado por horas ->"+key+" "+h.getNombre()+" "+h.getApellidos());
            }else if (d instanceof EmpleadoComisiones c){    
                String key = (c.getNif()!=null)?c.getNif().toString():c.getNie().toString();        
                System.out.println("Empleado por Comisiones ->"+key+" "+c.getNombre()+" "+c.getApellidos());                                
            }
        }
    }
   
   
    //HashMap se va a ordenar por FechaTrabajo de Empleado -> Clase interna
    public class ComparadorFechaTrabajoEmpleado implements Comparator <Empleado>{
        @Override
        public int compare(Empleado o1, Empleado o2) {
            /*
            if (o1.getFechaTrabajo().isAfter(o2.getFechaTrabajo())) return 1;
            else if (o1.getFechaTrabajo().isBefore(o2.getFechaTrabajo())) return 0;
            else return -1;
            */
           return o1.getFechaTrabajo().compareTo(o2.getFechaTrabajo());
        }     
   }
   
 
  public class ComparadorApellidosNombreEmpleado implements Comparator <Empleado>{ 
    @Override
    public int compare(Empleado o1, Empleado o2) {
        String name1=o1.getApellidos()+" "+o1.getNombre();
        String name2=o2.getApellidos()+" "+o2.getNombre();
        
        return name1.compareToIgnoreCase(name2);
    }   
  }
  
  public class ComparadorSueldoEmpleado implements Comparator <Empleado>{
        @Override
       public int compare(Empleado o1, Empleado o2) {
           return (int) (o1.calculaSueldo() - o2.calculaSueldo());
           /*
           if (o1.calculaSueldo() > o2.calculaSueldo()) return 1;
           else if (o1.calculaSueldo() == o2.calculaSueldo()) return 0;
           else return -1;*/
    
       }    
    }
  
   
   public class ComparadorEdadApellidosNombreEmpleado implements Comparator <Empleado> {
        @Override
        public int compare(Empleado o1, Empleado o2) {
            if (o1.edad() != o2.edad()){
                return o1.edad() - o2.edad();
            }
            String name1=o1.getApellidos()+" "+o1.getNombre();
            String name2=o2.getApellidos()+" "+o2.getNombre();
            return name1.compareTo(name2);
        }    
   }

  public void listaOrdenadaApellidosNombrePlantilla(char orden){
        Character.toUpperCase(orden);
        
        Collection <Empleado> coleccion= this.empleados.values(); //Todos los valores se meten en una coleccion
        
        List <Empleado> lista= new ArrayList <>();
        lista.addAll(coleccion);
                
        Collections.sort(lista, new ComparadorApellidosNombreEmpleado());           
        
        switch(orden){
            case 'I': System.out.println("\n\nLISTADO DE LA PLANTILLA ORDENADA POR APELLIDOS+NOMBRE EN ORDEN DECRECIENTE");
                      Collections.reverse(lista);                      
                      break;   
            default: System.out.println("\n\nLISTADO DE LA PLANTILLA ORDENADA POR APELLIDOS+NOMBRE EN ORDEN CRECIENTE");
                     
        }   
        for(Empleado empl: lista){
            String key = (empl.getNif()!=null)?empl.getNif().toString():empl.getNie().toString();        
            System.out.println(" - "+empl.getApellidos()+" "+empl.getNombre()+" "+empl.edad()+" años "+empl.calculaSueldo()+"€"); 
        } 
    }   

  
   
    public ArrayList<Empleado> listaOrdenadaSueldoPlantilla(char orden){
        Character.toUpperCase(orden);
        ArrayList <Empleado> menorMayor = new ArrayList <Empleado>();
        Collection <Empleado> coleccion= this.empleados.values(); //Todos los valores se meten en una coleccion
        
        List <Empleado> lista= new ArrayList <>();
        lista.addAll(coleccion);
                
        Collections.sort(lista, new ComparadorSueldoEmpleado());        
        
        ListIterator listIt = lista.listIterator();
        int num = 0;
        switch(orden){
            case 'I': System.out.println("\n\nLISTADO DE LA PLANTILLA EN FUNCION DEL SUELDO DE MAYOR A MENOR");
                      
                      while(listIt.hasPrevious()){
                          Empleado empl = (Empleado)listIt.previous();
                          if (num == 0) menorMayor.add(empl);
                          num++;    
                          String key = (empl.getNif()!=null)?empl.getNif().toString():empl.getNie().toString();        
                          System.out.println(" - "+key+" "+empl.getApellidos()+" "+empl.getNombre()+" "+empl.edad()+" años "+empl.calculaSueldo()+"€");
                      }
                      if (listIt.hasNext()) menorMayor.add((Empleado)listIt.next());
                      break;   
            default: System.out.println("\n\nLISTADO DE LA PLANTILLA EN FUNCION DEL SUELDO DE MENOR A MAYOR");
                      
                      while(listIt.hasNext()){
                          Empleado empl = (Empleado)listIt.next();
                          if (num == 0) menorMayor.add(empl);
                          num++;
                          String key = (empl.getNif()!=null)?empl.getNif().toString():empl.getNie().toString();        
                          System.out.println(" - "+key+" "+empl.getApellidos()+" "+empl.getNombre()+" "+empl.edad()+" años "+empl.calculaSueldo()+"€");
                      } 
                      if (listIt.hasPrevious())  menorMayor.add((Empleado)listIt.previous());
        }
        
        return menorMayor;       
    }   
 
   public void listaOrdenadaEdadApellidosNombrePlantilla(){        
        Collection <Empleado> coleccion= this.empleados.values(); //Todos los valores se meten en una coleccion
        
        List <Empleado> lista= new ArrayList <>();
        lista.addAll(coleccion);
                
        Collections.sort(lista, new ComparadorEdadApellidosNombreEmpleado());         
           
        System.out.println("\n\nLISTADO DE LA PLANTILLA ORDENADA POR EDAD - APELLIDOS+NOMBRE EN ORDEN CRECIENTE");
        for(Empleado empl: lista){
            String key = (empl.getNif()!=null)?empl.getNif().toString():empl.getNie().toString();        
            System.out.println(" - "+key+" "+empl.getApellidos()+" "+empl.getNombre()+" "+empl.edad()+" años "+empl.calculaSueldo()+"€"); 
        } 
    }   

   public void listaOrdenadaEmpleadosHoras(){       
        List <EmpleadoHoras> lista = new ArrayList<>();
        
        for(Empleado empl: this.empleados.values()){
            if (empl instanceof EmpleadoHoras h){
                lista.add(h);
            }
        }
                
        Collections.sort(lista);
        
        System.out.println("\n\nLISTADO DE EMPLEADOS HORAS EN ORDEN CRECIENTE");
        
        for(EmpleadoHoras empl: lista){
            String key = (empl.getNif()!=null)?empl.getNif().toString():empl.getNie().toString();        
            System.out.println(" - "+key+" "+empl.getApellidos()+" "+empl.getNombre()+" "+empl.getNumHoras()+" horas trabjadas "+empl.calculaSueldo()+"€"); 
        }    
    }
   
   public void listaOrdenadaEmpleadosComisiones(){       
        List <EmpleadoComisiones> lista = new ArrayList<>();
        
        for(Empleado empl: this.empleados.values()){
            if (empl instanceof EmpleadoComisiones h){
                lista.add(h);
            }
        }
                
        Collections.sort(lista);
        
        System.out.println("\n\nLISTADO DE EMPLEADOS POR COMISION CON VENTAS EN ORDEN CRECIENTE");
        
        for(EmpleadoComisiones empl: lista){
            String key = (empl.getNif()!=null)?empl.getNif().toString():empl.getNie().toString();        
            System.out.println(" - "+key+" "+empl.getApellidos()+" "+empl.getNombre()+" "+empl.getVentas()+"€ en ventas "+empl.calculaSueldo()+"€"); 
        }    
    }

   
    public void listaDespedidosNoJubilados(){
        System.out.println("\n-----DIFERENCIA despedidos NO jubilados ---");
        ArrayList <Despedible> despedidosVolatiles = new ArrayList (this.despedidos); //Cuidado!!! this.despedidos se puede modificar
                                                                                        // para evitarlo se genera una zona de memoria NUEVA
        despedidosVolatiles.removeAll(jubilados); 
        for(Despedible d: despedidosVolatiles){ 
            Empleado e= (Empleado)d;
            System.out.println("- "+e.getApellidos()+" "+e.getNombre());
        }
       
}
}
   
    

    
    
