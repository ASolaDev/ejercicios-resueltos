/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.genericosservivo;

import java.util.ArrayList;

/**
 *
 * @author isabel
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1. Se crea un ArrayList para guardar Animales (tambien admiten gatos y perros)
        ArrayList <Animal> animales = new ArrayList <Animal>();
        animales.add(new Animal("Jirafa"));
        animales.add(new Animal("Halcon"));
        animales.add(new Gato("Silvestre, lindo gatito"));
    
        //2. Metodo muestra que tiene como dato de entrada un ArrayList <Animal>
            //Muestra los objetos de tipo ArrayList <Animal>
        muestra1(animales);
      
        //3. Se crea un ArrayList para guardar Gatos        
        ArrayList <Gato> gatos=new ArrayList<Gato>();
        gatos.add(new Gato("Patucas"));
        gatos.add(new Gato("Doraemon"));
        
        //4. Se quiere mostrar el contenido de gatos        
        // muestra(gatos);//Error, no todos los animales son gatos
                        // se pretende hacer gato=animal; 
          
       
        //5. Solucion: dato de entrada del metodo: un ArrayList que sea 
                       // de tipo Animal, o bien Gato o Perro
                       // cualquier tipo que extienda Animal, incluyendo Animal
                       // <? extends Animal>
        muestra1(gatos); 
        
        //6. Comprobacion del metodo anterior para Perros
        ArrayList <Perro> perros=new ArrayList<Perro>();
        perros.add(new Perro("Lulu"));
        perros.add(new Perro("Toby"));
        muestra1(perros);
        
        
        
        //7. Se crea un ArrayList <Servivo> que admitira seres vivos, animales,
             //perros y gatos
        ArrayList <Servivo> organismos = new ArrayList <Servivo>();
        
        //8. Se diseña el metodo cargaDatos, con dato de entrada: ArrayList <Servivo>
            //se pueden añadir animales, perros, gatos y seres vivos  
        cargaDatos(organismos);
        System.out.println("\n---- SERES VIVOS-----");
        for(Servivo v: organismos){
             System.out.println("-"+v);
        }
        /*
        //9. Se quiere añadir datos a un ArrayList <Animal>
             //Error, porque el dato de entrada del metodo es de tipo <Servivo>
        //cargaDatos(animales);// No todos los seres vivos son animales, error
        
        //10. Solucion: el tipo de dato de entrada para el metodo debe ser 
                      // un ArrayList de tipo igual o superior a Animal, como 
                      // es Servivo y Object
        cargaDatos1(animales);
        muestra1(animales);
        
        //11. Prueba del metodo anterior con un ArraList <Servivo>
        cargaDatos1(organismos);
        System.out.println("\n---- SERES VIVOS-----");
        for(Servivo v: organismos){
             System.out.println("-"+v);
        }
        */
    }
    
    public static  void muestra(ArrayList <Animal> listaAnimales){
        System.out.println("---- LISTADO DE ANIMALES ----");
        for(Animal a: listaAnimales){
            System.out.println("- "+a);
        }
    }
    
    public static  void muestra1(ArrayList <? extends Animal> listaAnimales){
        //Listado de un ArrayList de Animal, o de cualquier subClase de Animal
        String clase= listaAnimales.get(0).getClass().getName();
                
        System.out.println("---- LISTADO DE "+clase+"s-----");
        for(Animal a: listaAnimales){
            System.out.println("- "+a);
        }
    }
    
    public static void cargaDatos(ArrayList <Servivo> organismos){
        //Se añaden seres vivos, animales, gatos, perros en un ArrayList <Servivo>
        System.out.println("---CARGA DE SERES VIVOS ----");
        organismos.add(new Servivo("Protozoo"));
        organismos.add(new Servivo("Arbol"));
        organismos.add(new Animal("Elefante"));
    }
    
    public static void cargaDatos1(ArrayList <? super Animal> animales){
        //Se añaden animales, gatos, perros en un ArrayList de un Animal o superior a Animal
        animales.add(new Gato("Doraemon"));       
        animales.add(new Animal("Raton"));
    }
}
