/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Maps.paqueteHashMap.Sinonimos;

import java.util.ArrayList;

/**
 *
 * @author isabel
 */
public class PrincipalDiccionarioSinonimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DiccionarioSinonimos dcSin = new DiccionarioSinonimos();
        
        String palabra = "amor";
        ArrayList <String> sinonimos=new ArrayList<String>(); 
        sinonimos.add("afecto");
        sinonimos.add("cariño");
        sinonimos.add("apego");
        sinonimos.add("ternura");
        
        dcSin.addEntrada(palabra, sinonimos);
        
        palabra = "paciencia";
        sinonimos=new ArrayList<String>();
        sinonimos.add("serenidad");
        sinonimos.add("resignacion");
        sinonimos.add("conformidad");
        
        dcSin.addEntrada(palabra, sinonimos);
        
        palabra = "conformidad";
        sinonimos=new ArrayList<String>();
        sinonimos.add("armonia");
        sinonimos.add("aprobacion");
        sinonimos.add("acuerdo");
        
         dcSin.addEntrada(palabra, sinonimos);
         
         dcSin.listado1();
         
         dcSin.listado();
        
    }
    
}
