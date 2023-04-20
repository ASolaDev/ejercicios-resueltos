/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maps.paqueteHashMap.Sinonimos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 *
 * @author isabel
 */
public class DiccionarioSinonimos {
    private HashMap<String, ArrayList<String> > diccionario; //No mantiene la insercion
    
    public DiccionarioSinonimos(){
        this.diccionario= new HashMap <String, ArrayList <String>>();
    }
    
    public boolean contienePalabra(String palabra){
        return this.diccionario.containsKey(palabra);            
    }
    
    public void addEntrada(String palabra, ArrayList<String> sinonimos){        
        if(!this.diccionario.containsKey(palabra)){          
            this.diccionario.put(palabra, sinonimos);
        }
        else System.out.println("Esa palabra ya esta definida en el diccionario");
    }
    
    public ArrayList <String> getSinonimos(String palabra){
        ArrayList <String> sinonimos = null;
        if(!this.diccionario.containsKey(palabra)){
            System.out.println("La palabra "+palabra+" no esta definida en el diccionario");
        }    
        else{
             sinonimos = this.diccionario.get(palabra);
        }
        return sinonimos;
    }

    public boolean comprobarSinonimo(String palabra, String sinonimo){
        if(!this.diccionario.containsKey(palabra)){
            return false;
        }else{
            return this.diccionario.get(palabra).contains(sinonimo); 
        }
    }
    
    public void addSinonimo(String palabra, String sinonimo){
        if (this.diccionario.containsKey(palabra) && !this.comprobarSinonimo(palabra, sinonimo)){
            this.diccionario.get(palabra).add(sinonimo);
        }
    }   
    
    public int numSinonimosPalabra(String palabra){
        return this.diccionario.get(palabra).size();
    }
    
    
    public void listado1(){
        if (!this.diccionario.isEmpty()){
            System.out.println("----------DICCIONARIO DE SINONIMOS-------");
            for(Map.Entry <String, ArrayList <String>> entrada: this.diccionario.entrySet()){
                System.out.println("Palabra "+entrada.getKey());
                System.out.print("\tSinonimos:");
                for(String sino: entrada.getValue()){
                   System.out.print(sino+" ;");
                }
                System.out.println("");
            }
            
        }
    }
    
    
    public void listado(){
        List <String> lista = new ArrayList <String>(this.diccionario.keySet());
        Collections.sort(lista);
        if (!this.diccionario.isEmpty()){
            System.out.println("----------DICCIONARIO DE SINONIMOS-------");
            for(String key: lista){
                int numSinonimos=this.diccionario.get(key).size();
                System.out.print("Palabra: "+key+"\n\tSinonimos: ("+numSinonimos+") ");
                ArrayList <String> entrada = this.diccionario.get(key);
                for(String sinonimo: entrada){
                    System.out.print("- "+sinonimo+"\t");
                }
                System.out.println("");           
                
                this.aparicionEntradas(key);
                System.out.println("");
            }
            
        }
    }
    
    
    public void aparicionEntradas(String palabra){
        int apariciones = 0;
        for(Map.Entry <String , ArrayList <String>> entrada: this.diccionario.entrySet()){
            if (entrada.getValue().contains(palabra)){
                if (apariciones == 0) System.out.print("\t'"+palabra+ "' aparece tambien en las siguientes entradas: ");  
                System.out.print("'"+entrada.getKey()+"';");
                apariciones=1;
            }
        }
        if (apariciones == 1) System.out.println("");
    }
}
