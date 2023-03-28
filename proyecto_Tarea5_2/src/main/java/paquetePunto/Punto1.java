/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetePunto;

/**
 *
 * @author isabel
 */
public class Punto1 {
  private int x;
  private int y;

  //Constructor patrón
    public Punto1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto1(){  
        this(0);
        /*
        this.x=0;
        this.y=0;   */    
    }
    
    public Punto1(int a){
        this(a,a);
        /*
        this.x=a;
        this.y=a;*/        
    }
    
    public Punto1(Punto1 other){
        this(other.x, other.y);
    }
    
  //Getter y Setter

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    //toString
    @Override
    public String toString() {
        return "(" + x + "," + y + ')';
    }
    
    //equals 
    public boolean equals(Punto1 other){
        if (this.x==other.x && this.y==other.y)
            return true;
        return false;
    }
         
    //método distancia
    public double distancia(Punto1 other){
        double dist=Math.hypot(this.x - other.x,this.y-other.y);
        return dist;
    }
           
    //punto opuesto
    public Punto1 ptoOpuesto(){
       return new Punto1(-this.x,-this.y);        
    }
    
    //punto Suma
    public Punto1 ptoSuma(Punto1 other){        
        Punto1 aux=new Punto1(this.x+other.x, this.y+other.y);
        return aux;        
    }
    
    //punto intermedio   
    public Punto1 ptoIntermedio(Punto1 other){  
        Punto1 aux=new Punto1((this.x+other.x)/2,(this.y+other.y)/2);
        return aux;        
    }
    
    //punto copia
    public Punto1 clone(){
        return new Punto1(this.x, this.y);        
    }
}
