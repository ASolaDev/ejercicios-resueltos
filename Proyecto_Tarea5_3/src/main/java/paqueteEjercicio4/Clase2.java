/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteEjercicio4;

/**
 *
 * @author isabel
 */
public class Clase2 { //aunque en el enunciado sea Clase1, asi no hay conflicto con Ejercicio3
    int p1,p2;

    public Clase2(int p1, int p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    
    public int modificar(int i){
        this.p1+=i;
        this.p2+=i;
        return this.p1;
    }
    
}
