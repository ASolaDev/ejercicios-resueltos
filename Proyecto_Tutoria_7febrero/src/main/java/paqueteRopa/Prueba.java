/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteRopa;

/**
 *
 * @author isabel
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Ropa pantalon = new Ropa(Marcas.DOCKERS, "Puente Tocinos");
       
        System.out.println("pantalon ="+pantalon);
        
       Ropa blusa=null; 
       try{
           blusa = new Ropa("BUCCINI", "Espinardo");
       }catch(IllegalArgumentException ex){
           System.out.println(ex.getMessage());
           blusa=new Ropa();
       }
        System.out.println("blusa "+blusa);
        
       //1. Armario vacio
       Armario pepe=new Armario("Pepe");
        System.out.println("Armario de pepe="+pepe);
        
       //2. Añadir ropa al armario de pepe
       pepe.addRopa(blusa);
       if (!pepe.addRopa(pantalon)){
           System.out.println("El armario ya esta lleno");
       }
       
       //3. Muestra contenido del armario pepe
        System.out.println("");
        System.out.println("Armario de pepe="+pepe);
        
       //4. Muestra contenido de nuevo con los metodos size(), get() de ArrayList
        System.out.println("");
        System.out.println("Armario de pepe="+pepe);
       
       //5. Buscar una ropa en el armario de pepe
       if (pepe.contieneRopa(blusa)){
           System.out.println("Si, en el armario esta guardado "+blusa);
       }
       else {
           System.out.println("Lo siento, "+blusa+" no esta en el armario");
       }
       
       //6. Quitar una prenda del armario
       if (pepe.quitarRopa(blusa)){
           System.out.println("Se ha quitado la "+blusa+" del armario de "+pepe.getPropietario());
       }
       else{
           System.out.println("No se ha podido eliminar del armario la prenda "+blusa);
       }
       
       //7. Comprobacion de que se ha eliminado blusa
       System.out.println("");
        System.out.println("Armario de pepe="+pepe);
       
       //8. Insertar blusa y despues recolocar blusa y pantalon (blusa antes que pantalon, blusa = 0, pantalon =1)
       pepe.cambiarRopa(1, pantalon); // el indice 1 genera una excepcion
       
    }
    
}
