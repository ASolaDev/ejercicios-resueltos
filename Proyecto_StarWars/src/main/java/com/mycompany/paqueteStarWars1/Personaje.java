/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paqueteStarWars1;

/**
 *
 * @author isabel
 */
public class Personaje {
    private String nombre;
    private int salud;
    private int fisico;
    private int fuerza;
    private int nivel;// nivel de destreza
    private int ph; //puntos de habilidad 
    
    //Operaciones
    // No hay Constructor, por lo que se utilizara el de por defecto, es decir
    // Las propiedades de tipo String a null y las propiedades numericas a 0
    
    
     //1. Métodos getter --nos permiten devolver el valor de las propiedades privadas
    public String getNombre() {
        return nombre;
    }

    public int getSalud(){
        return salud;
    }
    
    public int getFisico(){
        return fisico;
    }
    
    public int getFuerza(){
        return fuerza;
    }
    
    public int getNivel(){
        return nivel;
    }
    
    public int getPh(){
        return ph;
    }
    
    //2. Métodos: setter --son métodos que nos permiten acceder desde fuera a las propiedades privadas
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setFisico(int fisico) {
        this.fisico = fisico;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
  
    public void setPh(int ph) {   
        this.ph = ph;
    }
    
    //3.Metodo toString-> Devolver los valores del personaje en formato String
    @Override
    public String toString(){
       String cadena="[Nombre ="+nombre+"\tSalud= "+salud+"\tFísico="+fisico+"\tFuerza="+fuerza+"\tNivel="+nivel+"\tHabilidad="+ph+"]";
       return cadena;
    }
   
    //4. Atacar
    public int ataqueFisico(){       
        int va=(int)(Math.random()*(2-0+1)+0);
        
       return va*this.nivel*this.fisico;                
    }
    
    public int ataqueFuerza(){
        if (this.ph>0)
        {
            this.ph--;
            return this.nivel*this.fisico;
        }
        else 
            return 0;        
    }
         
    //5. Defender o dañarse
    public void defensa(int valor){
        this.salud-=valor;
    }
    
    //6. Comprobacion de que el Personaje1 esta vivo
    public boolean isVivo(){
        return this.salud>0;
    }
    
}
