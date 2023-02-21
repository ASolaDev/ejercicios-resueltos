
/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteHerenciaAnimal_MultiNivel;
public class HerenciaAnimal_Video2 {    
    public static void main(String[] args) {
        System.out.println("---- FUNCIONES DE pluto como perro-----");
        Perro pluto=new Perro(10,"Pluto, amigo de Mickey Mouse");
        System.out.println("Perro: "+pluto);//Heredado de Mamifero
        pluto.comer(); //heredado de Animal , sin adaptar
        pluto.dormir(); //heredado de Animal, adaptado en Perro
        pluto.reproducir(); //heredado de Mamifero
        
        pluto.ladrar();
        pluto.grunir();
        
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
        
        //Cuando el casting no funciona, se genera una excepcion:
        // ClassCastingException
        laika=new Gato(8, "Silvestre, lindo gatito"); 
        System.out.println("Laika como Gato: "+laika);
        laika.comer();//Heredado Animal y adaptado a Gato
        laika.dormir();
        laika.reproducir();        
    }    
}
/*
        System.out.println("---- FUNCIONES DE doraemon como gato-----");
        Gato doraemon=new Gato(8,"Doraemon, el gato cosmico");
        System.out.println("Gato: "+doraemon);//Heredado de Mamifero
        doraemon.comer();//Heredado de Animal se adapta Gato
        doraemon.dormir(); //Heredado de Animal 
        doraemon.reproducir(); //Heredado de Animal y adaptado en Mamifero
        
        doraemon.ronronea();
        */