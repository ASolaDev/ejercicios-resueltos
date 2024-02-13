/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteCoche;

/**
 *
 * @author isabel
 */
public class Coche {
   
    private Marcas marca;
    private Colores color;
    private Combustibles combustible;
    private String cambio;
    private int numPuertas, precio;
    private final static String [] CAMBIOS={"MANUAL","AUTOMATICO"};
   
    //Constructor patrón, poner excepciones
    public Coche(Marcas marca, Colores color, Combustibles combustible, 
            String cambio, int numPuertas, int precio)throws IllegalArgumentException{ 
        this.setMarca(marca);
        this.setColor(color);
        this.setCombustible(combustible);
        this.setCambio(cambio);
        this.setNumPuertas(numPuertas);
        this.setPrecio(precio);
    }
    
    public Coche(String marca, String color, String combustible,
            String cambio, int numPuertas, int precio)throws IllegalArgumentException{
        this.setMarca(marca);
        this.setColor(color);
        this.setCombustible(combustible);
        this.setCambio(cambio);
        this.setNumPuertas(numPuertas);
        this.setPrecio(precio);
    }
    
    public Coche()throws IllegalArgumentException{ //En este método no es necesario lanzar excepción porque se lanza sola?
        this(Marcas.SEAT,Colores.ROJO,Combustibles.GASOIL,"MANUAL",3,0);
       
    }
    
    public Coche(Coche other){
        this(other.marca,other.color, other.combustible, other.cambio, other.numPuertas, other.precio);
    }
    
    public void setMarca(Marcas marca){
            this.marca=marca;   
    }
    
    public void setMarca(String marca)throws IllegalArgumentException{
        try{
            marca=marca.toUpperCase();
            this.marca=Marcas.valueOf(marca); //Me devuelve la excepción: No enum constan paqueteCoche.Marcas.PEGUEOT
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException("La marca "+marca+" NO está en la lista");
        }        
    }
    

    //El método valueOf se encarga de lanzar la excepción
    public void setColor(String color) throws IllegalArgumentException{       
        try{
            color=color.toUpperCase();
            this.color=Colores.valueOf(color);
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException("ERROR, el color "+color+" NO está en la lista");
        }
    }
    
    public void setColor(Colores color) throws IllegalArgumentException{
        this.color = color;
    }
    
    
    public void setCombustible (String combustible)throws IllegalArgumentException{
        try{
            combustible=combustible.toUpperCase();
            this.combustible=Combustibles.valueOf(combustible);
        }catch(IllegalArgumentException ex){
            throw new IllegalArgumentException("ERROR, el combustible "+combustible+" NO está en la lista");
        }
    }
    
    public void setCombustible(Combustibles combustible)throws IllegalArgumentException{
        this.combustible= combustible;
    }
    
    
    public void setCambio (String cambio)throws IllegalArgumentException{
        cambio=cambio.toUpperCase();
        boolean existe=false;
        for(int i=0; i<CAMBIOS.length; i++){
            if(CAMBIOS[i].equals(cambio)) {
                existe=true;
                break;
            }
        }
        if(existe==false) throw new IllegalArgumentException("ERROR, el cambio "+cambio+" no está en la lista");
        else this.cambio=cambio;
    }
    
    public void setNumPuertas(int numPuertas){
        if(numPuertas<3 || numPuertas>5) throw new IllegalArgumentException("ERROR, el nºpuertas "+numPuertas+" no está entre 3-5");
        else this.numPuertas=numPuertas;
    }
    public void setPrecio(int precio){
        if(precio<=0) throw new IllegalArgumentException("ERROR, el precio "+precio+" es inferior a 0");
        else this.precio=precio;
    }
    @Override
    public String toString(){
        return "Marca: "+marca+"\nColor: "+color+"\nCombustible: "+combustible+"\nCambio: "+cambio+"\nNºPuertas: "+numPuertas+"\nPrecio: "+precio;
    }
}

