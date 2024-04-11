/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maps.paqueteTreeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author isabel
 */
public class DiccionarioTreeMap {
    private TreeMap <String, String> diccionario; //Ordena por clave

    public DiccionarioTreeMap() {
        this.diccionario=new TreeMap<String, String>();
    }
    
    public void addEntrada(String palabra, String significado){
        if (!this.diccionario.containsKey(palabra)){
            this.diccionario.put(palabra, significado);
        }else System.out.println("Esa palabra ya existe");
    }
    
    public boolean contienePalabra(String palabra){
        return this.diccionario.containsKey(palabra);
    }
    
    public void listado(){
        if (!this.diccionario.isEmpty()){
            System.out.println("---DICCIONARIO---");
            for(Map.Entry <String, String> entrada: this.diccionario.entrySet()){
                System.out.println("Palabra: "+entrada.getKey());
                System.out.println("\t\t"+entrada.getValue());
            }
        }
    }       

    
    
}
