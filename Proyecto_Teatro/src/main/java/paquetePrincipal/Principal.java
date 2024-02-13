/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetePrincipal;

import java.util.ArrayList;
import paqueteTeatro.Funcion;
import paqueteTeatro.Teatro;

/**
 *
 * @author isabel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           //a
        System.out.println("\nAPARTADO A:");
        Funcion f1=new Funcion("Bodas de sangre",10);
        Funcion f2=new Funcion("Magia",7);
        Funcion f3=new Funcion("La casa de Bernarda",6);
        Funcion f4=new Funcion("Garbancito",8);
        //b.
        System.out.println("\nAPARTADO B:");
        ArrayList <Funcion> v=new ArrayList<Funcion>();
        //c,d,e      
        System.out.println("\nAPARTADO C,D,E:");
        v.add(f1);
        v.add(f2);
        v.add(f3);
        //f.
        System.out.println("\nAPARTADO F:");
        Teatro romea=new Teatro("Romea",v);
        //g.
        System.out.println("\nAPARTADO G:");
        System.out.println(romea);
        //h. 
        System.out.println("\nAPARTADO H:");        
        ArrayList <Funcion> w=v; //El arrayList apunta a la misma zona de memoria
                                //que v        
        //i.
        System.out.println("\nAPARTADO I:");
        for(int i=0;i<w.size();i++){
            System.out.println(w.get(i));
        }
        //j.
        System.out.println("\nAPARTADO J:");
        Funcion f5=new Funcion("Cascanueces",15);
        //k.
        System.out.println("\nAPARTADO K:");
        v.add(f5);
        //l.
        System.out.println("\nAPARTADO L:");
        System.out.println(romea);
        //m.
        System.out.println("\nAPARTADO M:");
        if(v.contains(f5)) System.out.println("Está la función");
        else System.out.println("NO está la función");
        //n.
        System.out.println("\nAPARTADO N:");
        v.remove(f5);
        //o.
        System.out.println("\nAPARTADO O:");
        System.out.println(romea);

    }
    
}
