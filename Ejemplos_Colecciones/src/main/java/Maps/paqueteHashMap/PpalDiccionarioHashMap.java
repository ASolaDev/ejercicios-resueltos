/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Maps.paqueteHashMap;

/**
 *
 * @author isabel
 */
public class PpalDiccionarioHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiccionarioHashMap dc = new DiccionarioHashMap();
        
        String palabra = "consulta";
        String significado = "Accion y efecto de consultar";        
        dc.addEntrada(palabra, significado);
        
        palabra = "mar";
        significado = "Masa de agua salada que cubre aproximadamente las tres cuartas partes de la superficie";        
        dc.addEntrada(palabra, significado);
        
        palabra = "pelicula";
        significado = "Piel delgada y delicada o capa muy fina que cubre una cosa";
        dc.addEntrada(palabra, significado);
        
        palabra = "area";
        significado = "Superficie acotada, que se distingue de lo que la rodea";
        dc.addEntrada(palabra, significado);
        
        dc.listado();
    }
    
}
