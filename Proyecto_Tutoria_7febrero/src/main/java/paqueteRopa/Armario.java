/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteRopa;

import java.util.ArrayList;

/**
 *
 * @author isabel
 */
public class Armario {
    private String propietario;
    private ArrayList <Ropa> prendas;

    //Constructor Sobrecargado
    public Armario(String propietario) {
        this.propietario = propietario;
        this.prendas=new ArrayList <Ropa>();
    }

    public Armario(String propietario, ArrayList<Ropa> prendas) {
        this.propietario = propietario;
        this.prendas = prendas;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public ArrayList<Ropa> getPrendas() {
        return prendas;
    }

    public void setPrendas(ArrayList<Ropa> prendas) {
        this.prendas = prendas;
    }
    
    //Metodos de ArrayList

    @Override
    public String toString() {
        // vacio return "[Propietario=" + propietario + ", prendas=" + prendas + ']';
        String cadena="[Propietario ="+this.propietario;
        
        //Metodo isEmpty() de ArrayList
        if (this.prendas.isEmpty()){
            cadena+=" vacio";
        }
        else{
            /*
            //Metodo for (para cada Ropa en prendas)
            cadena+="\n";                    
            for(Ropa ropa: this.prendas){
                cadena+=ropa;
                cadena+="\n";
            }*/
            //Metodos get(), size()... de ArrayList
            cadena+="\n";                    
            for (int i = 0; i < this.prendas.size(); i++) {
                cadena+=(i+1)+" ";
                cadena+=this.prendas.get(i);
                cadena+="\n";
            }               
        }
        cadena+="]";
        return cadena;
    }
    
    public boolean addRopa(Ropa ropa){
        return this.prendas.add(ropa);
    }
    
    public boolean contieneRopa(Ropa ropa){
        return this.prendas.contains(ropa);
    }
    
    public boolean quitarRopa(Ropa ropa){
        return this.prendas.remove(ropa);
    }
    
    public void limpiarArmario(){
        this.prendas.clear();
    }
    
    public void cambiarRopa(int lugar, Ropa ropa){        
        this.prendas.set(lugar,ropa);// puede lanzar IndexOutBoundsException
    }
}
