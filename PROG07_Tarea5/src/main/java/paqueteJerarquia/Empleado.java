/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteJerarquia;

import java.time.LocalDate;
import java.time.Period;
import paqueteExcepciones.IdException;
import paqueteExcepciones.NieException;
import paqueteExcepciones.NifException;
import paqueteOtros.Fecha;
import paqueteOtros.Nie;
import paqueteOtros.Nif;

/**
 *
 * @author isabel
 */
public abstract class Empleado {
    protected Nif nif=null;
    protected Nie nie=null;
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNac;
    protected LocalDate fechaTrabajo;
    protected float sueldo=0.0f;

    //Constructor
    // usa Object , instanceof y DownCasting explicito
    /*Al ser IdException superclase de NieException y NifException no es necesario poner las
      dos últimas ya que IdException engloba a sus excepciones hijas
    */

    public Empleado(Object object , String nombre, String apellidos, LocalDate fechaNac, LocalDate fechaTrabajo) throws IdException{
        if (object == null){
            throw new IdException("Un empleado debe tener nif o nie de forma obligada");
        }
        if (!(object instanceof Nif) && !(object instanceof Nie) && !(object instanceof String) ){
            throw new IdException("Error, un empleado debe tener nif o nie y No otra cosa");
        }
                
        if (object instanceof Nif){
            this.nif=(Nif)object; //DownCasting explicito
        }else if (object instanceof Nie){
            this.nie=(Nie)object; //DownCasting explicito
        }else { //object es de tipo String , ahora vemos si representa un Nif o un Nie            
            try{
               this.nif = new Nif((String)object); 
            }catch (NifException ex){
                this.nie=new Nie((String)object);
            }
        }
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
        this.fechaTrabajo = fechaTrabajo;
    }

    
    public Nif getNif() {
        return nif;
    }

    public void setNif(Nif nif) {
        this.nif = nif;
    }
    
    public void setNif(String nif) throws NifException {
       this.nif = new Nif(nif);      
    }

    public Nie getNie() {
        return nie;
    }

    public void setNie(Nie nie) {
        this.nie = nie;
    }

    public void setNie(String nie) throws NieException {
        this.nie = new Nie(nie);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public LocalDate getFechaTrabajo() {
        return fechaTrabajo;
    }

    public void setFechaTrabajo(LocalDate fechaTrabajo) {
        this.fechaTrabajo = fechaTrabajo;
    }

    //Metodo toString()
    @Override
    public String toString() {
        String cadena=this.nombre;
        cadena+=" "+this.apellidos;
        String fechaN=Fecha.fechaFormateada(this.fechaNac);
        
        if (this.nif != null){
        return "[Nif=" + nif + " Nombre=" + cadena+ " Fecha de nacimiento=" + fechaN + " Tiempo en la empresa= " + tiempoEmpresa()+ " Sueldo=" + sueldo + ']';
        }
        return "[Nie=" + nie + " Nombre=" + cadena+ " Fecha de nacimiento=" + fechaN + " Tiempo en la empresa= " + tiempoEmpresa() + " Sueldo=" + sueldo + ']';
    }

    public abstract float calculaSueldo();    
    
    public String tiempoEmpresa(){         
       LocalDate ahora=LocalDate.now();
       Period p=Period.between(this.fechaTrabajo,ahora);
       String cadena=p.getYears()+" años, "+p.getMonths()+" meses y "+p.getDays()+" dias";
       return cadena;      
    }
    
       
}
