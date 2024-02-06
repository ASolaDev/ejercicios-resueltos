/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteHerenciaAnimal_MultiNivel;

/**
 *
 * @author isabel
 */
public class HerenciaAnimal_Video1 {
    /*
    
    public class Animal{
        String nombre;
        
        //Constructor
        public Animal(String nombre){this.nombre=nombre;}
        //metodos propios
        public void comer(){ System.out.println("Animal -Necesita comer para sobrevivir");}
        public void dormir(){System.out.println("Animal -Es indispensable para descansar");}
        public void reproducir(){System.out.println("Animal -Origina nuevos seres vivos");}
        //metodo sobreescrito
        @Override
        public String toString(){ return "[Nombre ="+this.nombre+"]";}
    }

    public class Mamifero extends Animal{
        int numMamas;
        
        //Constructor
        public Mamifero(int numMamas, String nombre){ super(nombre); this.numMamas=numMamas;}
        //metodos sobreescritos
        @Override
        public void reproducir(){ System.out.println("Mamifero -Reproduccion vivipara");}
        @Override
        public String toString(){ return "["+super.toString()+" Numero de mamas: "+this.numMamas+"]";}
    }    
    
    public class Perro extends Mamifero{
        //Constructor
        public Perro(int numMamas,String nombre){super(numMamas, nombre);}
        //metodo sobreescrito
        @Override
        public void dormir(){System.out.println("Perro -Duerme en funcion del ejercicio que realiza");}
        
        //metodos a agrepar
        public void ladrar(){System.out.println("Perro -Ladra que es labor social de guardia");}
        public void grunir(){System.out.println("Perro -Gruñe Grrrr....");}
    }
    
    public class Gato extends Mamifero{
        //Constructor
        public Gato(int numMamas, String nombre){ super(numMamas, nombre);}
       //Metodos sobreEscritos
       @Override
       public void comer(){System.out.println("Gato - Su comida preferida: pescado");}
    
       //Metos propios
       public void ronronea(){System.out.println("Gato - Esta feliz");}    
}

    */
    
    public static void main(String args[]){     
        //a.
        System.out.println("---- FUNCIONES DE gamu como Animal-----");
        Animal gamu=new Animal("Gamusino");
        System.out.println("Animal: "+gamu);
        gamu.comer(); 
        gamu.dormir(); 
        gamu.reproducir(); 
        
        //b.
        System.out.println("---- FUNCIONES DE laika como Mamifero-----");
        Mamifero laika=new Mamifero(9,"Mamifero espacial ruso");
        System.out.println("Mamifero: "+laika);//Heredado de Animal- adaptado en Mamifero
        laika.comer(); //heredado de Animal , sin adaptar
        laika.dormir(); //heredado de Animal, sin adaptar
        laika.reproducir(); //heredado de Animal y adaptado en Mamifero
        
        //c.
        System.out.println("---- FUNCIONES DE pluto como perro-----");
        Perro pluto=new Perro(10,"Pluto, amigo de Mickey Mouse");
        System.out.println("Perro: "+pluto);//Heredado de Mamifero
        pluto.comer(); //heredado de Animal , sin adaptar
        pluto.dormir(); //heredado de Animal, adaptado en Perro
        pluto.reproducir(); //heredado de Mamifero
        
        pluto.ladrar();
        pluto.grunir();
        
        //d.
        System.out.println("---- FUNCIONES DE doraemon como gato-----");
        Gato doraemon=new Gato(8,"Doraemon, el gato cosmico");
        System.out.println("Gato: "+doraemon);//Heredado de Mamifero
        doraemon.comer();//Heredado de Animal se adapta Gato
        doraemon.dormir(); //Heredado de Animal 
        doraemon.reproducir(); //Heredado de Animal y adaptado en Mamifero
        
        doraemon.ronronea();
    }

}
