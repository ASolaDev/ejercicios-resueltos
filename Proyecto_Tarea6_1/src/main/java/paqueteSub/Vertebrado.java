/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteSub;

import java.time.LocalDate;
import paqueteSuper.Animal;

/**
 *
 * @author isabel
 */
public class Vertebrado extends Animal{
    protected int numVertebras;

    //CONSTRUCTORES
    //Constructor Patron
    public Vertebrado(int numVertebras, int peso, LocalDate fechaNac) throws IllegalArgumentException {
        super(peso, fechaNac);
        this.setNumVertebras(numVertebras);
    }

    public Vertebrado(int numVertebras, int peso) throws IllegalArgumentException {
        //this(numVertebras,peso,LocalDate.now());   //tambien es valido 
        super(peso);
        this.setNumVertebras(numVertebras);
    }

    public Vertebrado(int numVertebras, Animal other) throws IllegalArgumentException {
        super(other);
        this.setNumVertebras(numVertebras);
    }

    public Vertebrado(Vertebrado other) throws IllegalArgumentException{
        this(other.numVertebras,other.peso, other.fechaNac);
    }
    
    //Metodo getter

    public int getNumVertebras() {
        return numVertebras;
    }
    
    //Metodo setter

    public void setNumVertebras(int numVertebras) throws IllegalArgumentException {
        if (numVertebras < 2 || numVertebras > 1000){
            throw new IllegalArgumentException("Error, numero de vertebras incorrecto...");
        }
        this.numVertebras = numVertebras;
    }

    @Override
    public String toString() {
        return "["+super.toString()+" Vertebras=" + numVertebras + ']';
    }
    
    
    
    
}
