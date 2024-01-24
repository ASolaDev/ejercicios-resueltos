/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteTriangulo;

import paqueteStarWars1.Personaje;

/**
 *
 * @author isabel
 */
public class Principal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //a. 
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        
        System.out.println("--------------------------------------------");
        System.out.println("No hemos visto todavia Constructores.");
        System.out.println("Uso el constructor por defecto, Propiedades numericas a 0 ");
        System.out.println("--------------------------------------------");
        System.out.println();
        //12,1
        t1.setBase(12); t1.setAltura(10);
        //5,7
        t1.setBase(5); t1.setAltura(7);
        
        //b. 
        System.out.println("--------------------------------------------");
        System.out.println("Valores de los lados de los 2 triangulos");
        System.out.println("--------------------------------------------");
        System.out.println("Los atributos del triangulo t1 son: " + t1);
        System.out.println("Los atributos del triangulo t2 son: " + t2);
        System.out.println();
        
        //c.
        System.out.print("Se duplica tamaño de t1 y se muestra su base: ");
        t1.duplicaTamano();
        System.out.println(t1.getBase());
        System.out.println();
        
        //d.
        System.out.print("Se amplía tamaño de t2 en 7 unidades y se muestra su altura: ");
        t2.ampliaTamano(7);
        System.out.println(t2.getAltura());
        System.out.println();
        
        //e.
        System.out.println("Se muestra área, perímetro e hipotenusa de t1: ");
        System.out.println("Area de t1="+t1.area());
        System.out.println("Perimetro de t1="+t1.perimetro());
        //El metodo hipotenusa es privado, por lo que, desde fuera NO se puede acceder a el.
        //El metodo hipotenusa solo es visible desde la clase donde se ha definido: Triangulo
//        System.out.println("Hipotenusa de t1="+t1.hipotenusa());
        System.out.println();
        
        //f.
        System.out.println("Se cambia la base de t2 por la altura de t1 multiplicado por 2");
        t2.setBase(t1.getAltura() * 2);
        System.out.println();
        
        //g.
        System.out.println("--------------------------------------------");
        System.out.println("Valores de los lados de los 2 triangulos");
        System.out.println("--------------------------------------------");
        System.out.println("Los atributos del triangulo t1 son: " + t1);
        System.out.println("Los atributos del triangulo t2 son: " + t2);
        System.out.println();
        
        //h.
        System.out.println("Se comprueba si los triangulos son iguales");
        if (t1.equals(t2)) {
            System.out.print("Los triangulos son iguales");
        } else {
            System.out.print("Los triangulos no son iguales");
        }
        
        /*
            Las clases en java pueden ser declararadas como public, o sin la palabra public. 
            1. En el primer caso, la clase es accesible desde cualquier paquete utilizando 
            la palabra import y la ruta a la clase.
            2. En el segundo caso la clase es accesible 
            sólo por clases dentro del mismo package.
            En el caso del enunciado 5.1, la clase Personaje es de tipo public y está definida en el paquete 
            paqueteStarWars1. La clase Principal2 está definida en el paquete paqueteTriangulo. 
            Como Personaje es public puede ser usada en Principal2 mediante la sentencia import 
            correspondiente y posteriormente creando una instancia de ella mediante la sentencia new.
import com.mycompany.paqueteStarWars1.Personaje;
        */
        Personaje leia = new Personaje();
  
    }
    
}
