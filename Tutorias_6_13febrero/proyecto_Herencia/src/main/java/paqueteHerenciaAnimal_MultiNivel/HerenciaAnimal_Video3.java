/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteHerenciaAnimal_MultiNivel;
public class HerenciaAnimal_Video3 {    
    public static void main(String[] args) {        
        System.out.println("---- FUNCIONES DE pluto como perro-----");
        Perro pluto=new Perro(10,"Pluto, amigo de Mickey Mouse");
        System.out.println("Perro: "+pluto);//Heredado de Mamifero
        
        System.out.println("---- FUNCIONES DE doraemon como gato-----");
        Gato doraemon=new Gato(8,"Doraemon, el gato cosmico");
        System.out.println("Gato: "+doraemon);//Heredado de Mamifero
        
        System.out.println("----- POLIMORFISMO ------");
        Mamifero laika=new Mamifero(9,"Mamifero espacial ruso");
        System.out.println("laika: "+laika);
        laika.comer();//Heredado de Animal
        laika.dormir();//Heredado de Animal
        laika.reproducir();//Heredado de Animal se adapta a Mamifero
        
        
        //laika apunta pluto, por lo que el mamifero laika se transforma a perro pluto
        //DownCasting
        laika=pluto;
        System.out.println("laika como pluto (perro): "+laika);
        laika.comer();//Heredado de Animal
        laika.dormir();//Heredado de Animal, adaptado a un Perro
        laika.reproducir();//Heredado de Mamifero
        
        //laika.ladrar();
        
        
        laika=new Gato(8, "Silvestre, lindo gatito"); 
        System.out.println("Laika como Gato: "+laika);
        laika.comer();//Heredado Animal y adaptado a Gato
        laika.dormir();
        laika.reproducir();
        
        
        //El DownCasting es directo, se hace de forma implicita        
        //Cuando se quiere ejecutar un metodo AÑADIDO de una subclase por
        // un objeto de una superclase -> Downcasting debe ser explicito        
       
            System.out.println("Gremlin ronronea-----");
             Gato gremlin=(Gato)laika;  //int x=(int) 12.8;
             gremlin.ronronea();        // x++;
             
             System.out.println("Transformacion explicita (cast) de laika a Gato");
             //Es lo mismo que decir:
             ((Gato)laika).ronronea(); // ((int)x)++;       
        
        //Cuando el casting no funciona, se genera una excepcion:
        // ClassCastingException
        
        Mamifero et= new Gato(4,"E.T. el pequeño ExtraTerrestre");
        Gato gremlin1=(Gato)et;  //similar a int x=(int) 12.8;
        
        System.out.println("Gremlin ="+gremlin1);
        gremlin1.ronronea(); // x++;
 
         //Tambien
        System.out.println("Transformacion explicita (cast) de et a Gato");
         //Es lo mismo que decir:
        ((Gato)et).ronronea(); // ((int)x)++;      
        
        //instanceof --nos dice si el objeto es de una clase 
        if (doraemon instanceof Gato){
           System.out.println("Doraemon es un Gato");
           doraemon.ronronea();           
        }      
    }    
}
       