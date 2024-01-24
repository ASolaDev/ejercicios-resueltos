/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetePunto;

/**
 *
 * @author isabel
 */
public class Ppal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //a
        Punto1 p = new Punto1(12,10);
        Punto1 q = new Punto1(5,7);
        Punto1 r = new Punto1(9,5);
        Punto1 s = new Punto1(4,3);
        
        //b
        System.out.println("p= "+p);
        System.out.println("q= "+q);
        System.out.println("r= "+r);
        System.out.println("s= "+s);
        
        //c
        System.out.println("");
        System.out.println("Distancia entre los puntos p y q: "+p.distancia(q));
        
        //d
        System.out.println("");        
        System.out.println("Distancia entre los puntos r y (8,7):"+r.distancia(new Punto1(8,7)));
        
        //e
        System.out.println("");
        q.setX(p.getY());
        System.out.println(q.getX());
        
        //f
        Punto1 o= p.clone();
        
        //g
        System.out.println("o= "+o);
        System.out.println("p= "+p);
        
        //h
        Punto1 t = o.ptoSuma(q);
        
        //i
        System.out.println("");
        System.out.println("o= "+o);
        System.out.println("q= "+q);
        System.out.println("t= "+t);
        
        //j
        Punto1 u = p.ptoIntermedio(t);
        
        //k
        System.out.println("");
        System.out.println("p= "+p);
        System.out.println("t= "+t);
        System.out.println("u= "+u);
        
        //i
        //El punto v será el opuesto del punto intermedio de los puntos generados por el
        //la suma de p y q y el opuesto de t.
        Punto1 aux1=p.ptoSuma(q); //p+q= (12,10) + (10,7) = (22,17)
        Punto1 aux2=t.ptoOpuesto();// t(22,17)   aux2(-22,-17)
        Punto1 aux3=aux1.ptoIntermedio(aux2);// (22,17).ptoIntermedio(-22,-17) -> (0,0)
        Punto1 aux4=aux3.ptoOpuesto();// (0,0)
        
        Punto1 v = p.ptoSuma(q).ptoIntermedio(t.ptoOpuesto()).ptoOpuesto();
        //         (22,17).ptoIntermedio(-22,-17)
        //               (0,0).ptoOpuesto(); -> (0,0)        
        
        //m
        System.out.println("");
        System.out.println("p= "+p);
        System.out.println("q= "+q);
        System.out.println("r= "+r);
        System.out.println("s= "+s);
        System.out.println("o= "+o);
        System.out.println("t= "+t);
        System.out.println("u= "+u);
        System.out.println("v= "+v);
        System.out.println("aux= "+aux4);
        
        //n
        System.out.println("");
        if(o.equals(p)){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }
    }
    
}
