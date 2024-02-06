/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteSubClase;

import paqueteSuperClase.A;

public class B extends A{
    //Hereda de A las propiedades i , j
    //Añade la propiedad k
    protected int k;          
    
    //Hereda metodo de A:  mostrarIJ() y los Getter y Setter de i j
    //Añade los metodos: mostrarK() y sumaIJK()    
    public void mostrarK(){
        System.out.println(k);
    }    
    
    public int sumaIJK(){
        return super.i+super.j+this.k;
    }
    
    //Añade los Getter y Setter 
    public int getK() {return k;}
    public void setK(int k) {this.k = k;}
    
}
