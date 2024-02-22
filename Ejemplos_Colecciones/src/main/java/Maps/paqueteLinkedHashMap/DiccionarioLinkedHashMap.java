/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maps.paqueteLinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author isabel
 */
public class DiccionarioLinkedHashMap {
    private LinkedHashMap <String, String> diccionario; //Mantiene el orden de inserccion

    public DiccionarioLinkedHashMap() {
        this.diccionario=new LinkedHashMap<String, String>();
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
