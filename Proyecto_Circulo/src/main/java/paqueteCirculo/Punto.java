/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteCirculo;

/**
 *
 * @author isabel
 */
public class Punto {
  private int x;
  private int y;

  //Constructor patrón
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto(){
        /*
        this.x=0;
        this.y=0;
        */
        this(0,0);
    }
    
    public Punto(int a){
        /*
        this.x=a;
        this.y=a;
        */
        this(a,a);
    }
    
    public Punto(Punto other){
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
    //método patrón
    public boolean equals(Punto other){
        if (this.x==other.x && this.y==other.y)
            return true;
        return false;
    }
    
    public boolean equals(int x, int y){
        /*
        if (this.x==x && this.y==y)
            return true;
        return false;      
        */
        return this.equals(new Punto(x,y));
    }
    
    //método distancia
    //método patrón
    public double distancia(Punto other){
        double dist=Math.hypot(this.x - other.x,this.y-other.y);
        return dist;
    }
     
    public double distancia(int x, int y){
        /*
        double dist=Math.hypot(this.x-x, this.y-y);
        return dist;
        */
        return this.distancia(new Punto(x,y));
    }
    
    //punto opuesto
    public Punto puntoOpuesto(){
       return new Punto(-this.x,-this.y);        
    }
    
    //punto Suma
    //método sobrecargado patrón
    public Punto puntoSuma(int x,int y){
        Punto aux=new Punto(this.x+x, this.y+y);
        return aux;
    }
    
    public Punto puntoSuma(Punto other){
        /*
        Punto aux=new Punto(this.x+other.x, this.y+other.y);
        return aux;
        */
        return this.puntoSuma(other.x,other.y);
    }
    
    //punto intermedio
    //método sobrecargado patrón
    public Punto puntoIntermedio(int x, int y){
        Punto aux=new Punto((this.x+x)/2, (this.y+y)/2);
        return aux;
    }
    
    public Punto puntoIntermedio(Punto other){
        /*
        Punto aux=new Punto((this.x+other.x)/2,(this.y+other.y)/2);
        return aux;
        */
        return this.puntoIntermedio(other.x, other.y);
    }
    
    //punto copia
    public Punto copia(){
        return new Punto(this);        
    }
}
