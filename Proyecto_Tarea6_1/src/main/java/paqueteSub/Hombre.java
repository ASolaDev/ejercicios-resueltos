/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteSub;

import java.time.LocalDate;
import java.util.ArrayList;
import paqueteSuper.Animal;
import paqueteSuper.Fecha;
import paqueteSuper.Hijo;

/**
 *
 * @author isabel
 */
public class Hombre extends Vertebrado{
   protected String nombre;
   protected boolean vivo;
   protected int numHijos = 0;
   protected ArrayList <Hijo> datosHijos= new ArrayList <Hijo>();;
   
   //CONSTRUCTORES
   //Constructor Patron

    public Hombre(String nombre, boolean vivo, ArrayList <Hijo> datosHijos, int numVertebras, int peso, LocalDate fechaNac) throws IllegalArgumentException {
        super(numVertebras, peso, fechaNac);
        this.nombre = nombre;
        this.vivo = vivo;
        this.datosHijos = datosHijos;
        this.numHijos=this.datosHijos.size();
    }

    public Hombre(String nombre, boolean vivo, int numVertebras, int peso, LocalDate fechaNac) throws IllegalArgumentException {
        super(numVertebras, peso, fechaNac);
        this.nombre = nombre;
        this.vivo = vivo;        
    }

    public Hombre(String nombre, boolean vivo, int numVertebras, int peso) throws IllegalArgumentException {
        super(numVertebras, peso);
        this.nombre = nombre;
        this.vivo = vivo;       
    }
        
    public Hombre(String nombre, boolean vivo, int numVertebras, Animal other) throws IllegalArgumentException {
        super(numVertebras, other);
        this.nombre = nombre;
        this.vivo = vivo;       
    }

    public Hombre(String nombre, boolean vivo, ArrayList <Hijo> datosHijos, Vertebrado other) throws IllegalArgumentException {
        super(other);
        this.nombre = nombre;
        this.vivo = vivo;
        this.datosHijos=datosHijos;
        this.numHijos=this.datosHijos.size();
    }
    
    public Hombre(String nombre, boolean vivo, Vertebrado other) throws IllegalArgumentException {
        super(other);
        this.nombre = nombre;
        this.vivo = vivo;
    }
   
    public Hombre(Hombre other){
        this(other.nombre, other.vivo, other.datosHijos, other.numVertebras, other.peso, other.fechaNac);
        this.numHijos=this.datosHijos.size();
    }
    
    //Metodos Getter

    public String getNombre() {
        return nombre;
    }

    public boolean isVivo() {
        return vivo;
    }

    public int getNumHijos() {
        return numHijos;
    }

    public ArrayList<Hijo> getDatosHijos() {
        return datosHijos;
    }
    
    //Metodo setNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos propios

    @Override
    public String toString() {
        String cadena="[Nombre ="+this.nombre;
        if (this.vivo){
            cadena+=" VIVO ";
        }
        else{
            cadena+=" FALLECIDO ";
        }
        cadena+=" Peso ="+this.peso;
        cadena+=" Fecha de Nacimiento ="+ Fecha.fechaFormateada(this.fechaNac);
        if (this.numHijos==0){
            cadena+= " Sin Hijos ";
        }
        else{
            cadena+="\n ---- DESCENDENCIA ----";
            for (int i = 0; i < this.numHijos; i++) {
                cadena+="\n"+(i+1)+" ";
                cadena+=this.datosHijos.get(i);
            }
        }
        cadena+="]";
        return cadena;
    }
    
    
    //Metodos propios de Hombre
    public void morir() throws IllegalArgumentException{
        if (!this.vivo){
            throw new IllegalArgumentException("Error, no se puede morir mas de una vez...");
        }
        this.vivo=false;
    }
    
    public void tenerHijo(Hijo nuevoHijo){
        if (this.datosHijos.contains(nuevoHijo)){
            System.out.println("Error, hijo ya registrado...");
        }
        else{
            this.datosHijos.add(nuevoHijo);
            this.numHijos++;
        }
    }
    
    public int edadHijoMenor(){
        int edadMenor=Integer.MAX_VALUE;
        if (this.numHijos > 0){
            for(Hijo hijo: this.datosHijos){
                if (hijo.edad() < edadMenor){
                    edadMenor=hijo.edad();
                }                
            }
            return edadMenor;
        } 
        else return -1;        
    }
    
    public Hijo hijoMenor(){       
        int edad=this.edadHijoMenor();
        if (edad != -1){
            for (int i = 0; i < this.numHijos; i++) {
                if (edad == this.datosHijos.get(i).edad())
                    return this.datosHijos.get(i);
            }
        }
        return null;
    }
    
    public Hijo darHijo(int posicion){
        if (this.numHijos > 0){
            //tiene hijos        
            int indice=posicion-1;
            if (indice < 0 || indice > this.numHijos){
               throw new IllegalArgumentException("Error en posicion del hijo");
            }
            return this.datosHijos.get(indice);
        }    
        return null;
    }    
    
}
