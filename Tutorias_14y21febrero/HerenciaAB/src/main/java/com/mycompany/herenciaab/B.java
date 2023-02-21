/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.herenciaab;

/**
 *
 * @author isabel
 */
public class B extends A{
    //Hereda de A las propiedades i , j
    //Añade la propiedad k
    int k;          
    
    //Hereda metodo de A:  mostrarIJ()
    //Añade los metodos: mostrarK() y sumaIJK()
    public void mostrarK(){
        System.out.println(k);
    }    
    
    public int sumaIJK(){
        return super.i+super.j+this.k;
    }
}
