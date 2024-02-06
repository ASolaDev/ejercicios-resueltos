/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteSuperClase;

public class A {
    protected int i;
    protected int j;   

    public A(int i, int j) {
        this.i = i;
        this.j = j;
    }   
    
    //Metodos Getter y Setter
    public int getI(){return i; }
    public void setI(int i) {this.i = i;}
    public int getJ() {return j;}
    public void setJ(int j) {this.j = j;}

    public void mostrarIJ() {
        System.out.println("i="+this.i+" j="+this.j);
    }
}
