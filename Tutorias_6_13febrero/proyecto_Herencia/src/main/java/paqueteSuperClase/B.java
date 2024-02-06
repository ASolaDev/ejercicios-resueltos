/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteSuperClase;

/**
 *
 * @author isabel
 */
public class B extends A{
    protected int i;       

    public B(int k, int i, int j) {
        super(i, j);
        this.i = k;
    }
    
    
    public int sumaIJK(){
        return super.i+super.j+this.i;
    }
}
