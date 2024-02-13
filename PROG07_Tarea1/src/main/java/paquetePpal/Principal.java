/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquetePpal;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import paqueteSub.Hombre;
import paqueteSub.Vertebrado;

import paqueteSuper.Animal;
import paqueteSuper.Hijo;

/**
 *
 * @author isabel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //a. Crea una fecha con los valores 4, 10 y 2001.
       LocalDate f1=LocalDate.of(1975,10,4);
       
       //b. Crea un animal a1 con el peso: 3 y la fecha anterior.
       Animal a1=new Animal(3,f1);
       System.out.println("Animal a1="+a1);
       
       //c. Crea un vertebrado v1 con los valores del animal a1 y número de vértebras: 14.
       Vertebrado v1=new Vertebrado(14, a1);
       System.out.println("Vertebrado v1="+v1);
        
       //d. Crea un ArrayList con 5 hijos con los valores “Pepe”,(3-10-2000);
       //“Carlos”,(16-2-2004);  “Maria”,(7-07-2005); 
       //“Juan”,(18-8-2006); y “Ana”,(28-8-2016). 
       ArrayList <Hijo> hijos=new ArrayList <Hijo>();
       hijos.add(new Hijo("Pepe", LocalDate.of(2000,10,3)));
       hijos.add(new Hijo("Carlos", LocalDate.of(2004,2,16)));
       hijos.add(new Hijo("Maria", LocalDate.of(2005,7,7)));
       hijos.add(new Hijo("Juan", LocalDate.of(2006,8,18)));
       hijos.add(new Hijo("Ana", LocalDate.of(2016,8,28)));
       
       //e.Crea un hombre h1 con nombre: “Pedro Pérez”, 
       //está vivo, con los 5 hijos del ArrayList anterior y el vertebrado v1.
       Hombre h1=new Hombre("Pedro Perez",true, hijos,v1);
       System.out.println("Hombre h1="+h1);
        System.out.println("\n\n");
       
       //f. a1=h1; //El animal a1 toma forma de h1.
       //Indica qué propiedades y métodos puede acceder. 
       // ¿Qué método sobreescrito toString utiliza?
       a1=h1;
        System.out.println("-----ATRIBUTOS que puede usar a1 -----");
        System.out.println("Peso: "+a1.getPeso());
        System.out.println("Fecha de Nacimiento: "+a1.getFechaNac());
        //No puede usar el metodo de acceso a numVertebras al ser Animal y No Vertebrado
        //System.out.println("Vertebras: "+a1.getNumVertebras());
        //No puede usar el metodo de acceso a nombre al ser Animal y No Hombre
        //System.out.println("Nombre :"+a1.getNombre());
        
        //Tampoco puede usar el metodo morir al ser de Hombre
        // Ni tenerHijos, etc..
        //a1.morir();
        
        //Ahora bien, cuando usa toString, entonces usa el toString de Hombre h1
        //Y salen datos de h1
        System.out.println("Animal a1 convertido a Hombre h1, datos :"+a1);
        
        System.out.println("\n\n");
        
        //g. Cambia el peso del animal a1 a 45 Kg.
        a1.setPeso(45); //se puede, ya que setPeso es un metodo de Animal
        
        //h. Mostrad el peso del hombre h1 ¿Qué valor tiene?
        System.out.println("Peso del Hombre h1= "+h1.getPeso());
        //Tiene 45, el mismo que se le cambio a a1
        //ya que apuntan a la misma zona de memoria
        
        //i. h1 tiene un nuevo hijo, “Raquel”,(01-01-2019).
        h1.tenerHijo(new Hijo("Raquel", LocalDate.of(2019, 1,1)));
        System.out.println("\n\nHombre h1="+h1);
        
        //j. ¿Cuál es la edad del hijo menor de h1?
        System.out.println("");
        System.out.print("La edad del hijo menor de "+h1.getNombre()+" es ");
        int edadM=h1.edadHijoMenor();
        if (edadM==-1){
            System.out.println("no tiene hijos");
        }else{
            System.out.println(edadM);
        }
        
        //k. Mostrad los datos del hijo menor de h1.
        Hijo menor=h1.hijoMenor();
        System.out.println("\nEl hijo menor de "+h1.getNombre()+" es "+menor);
        
        //l. Se quiere saber tan solo el nombre del hijo menor de h1.
        System.out.println("\nEl nombre del hijo menor de "+h1.getNombre()+" es "+menor.getNombre());
        
        //m. Se quiere saber el nombre del hijo que ocupa la posición 4 del hombre h1.
        System.out.println("Nombre del 4º hijo de "+h1.getNombre()+": "+h1.darHijo(4).getNombre());
        
        //n. h1 muere
        h1.morir();
        
        //o. h1 muere
        try{
            h1.morir(); 
        }catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }       
      
    }
    
}
