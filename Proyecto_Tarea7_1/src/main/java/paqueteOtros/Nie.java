/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteOtros;

/**
 *
 * @author isabel
 */
public class Nie {
    private String nie;
    private static final String LETRAS="TRWAGMYFPDXBNJZSQVHLCKE";
     
    public Nie(String NIE) throws Exception{
        this.setNie(NIE);
    }
    public Nie(Nie n) throws Exception{
        this(n.nie);
    }
    
    public String getNie(){
        return this.nie;
    }
    public void setNie(String NIE)throws Exception{
        int digitCONTR=0;
        String expr = "^[X-Z]-[0-9]{7}-[TRWAGMYFPDXBNJZSQVHLCKE]$";
        String primlValida="[X-Z]";
   
        NIE = NIE.trim().toUpperCase();
        String primL=Character.toString(NIE.charAt(0));
            if (NIE.matches(expr)) {
                switch (NIE.charAt(0)) {
                    case 'X' -> digitCONTR = 0;
                    case 'Y' -> digitCONTR = 1;
                    case 'Z' -> digitCONTR = 2;
                    } 
                String digitCONTRconv=String.valueOf(digitCONTR);
                String digitNIE=digitCONTRconv+(NIE.substring(2,9));
                int numeroNIE=Integer.parseInt(digitNIE);
                int resto=numeroNIE%23;
                char letra=LETRAS.charAt(resto);
                if (letra != NIE.charAt(10)) {
                    throw new Exception("Letra final no pertenece al NIE");
                }
            }else if(!(primL.matches(primlValida))){
                throw new Exception("1ª Letra incorrecta");
            }else throw new Exception("NIE incorrecto");
        this.nie=NIE;        
    }
    public void setNie(Nie n)throws Exception{
        this.setNie(n.nie);
    }
    
    @Override
    public String toString(){
        return this.nie;
    }
    
    public boolean equals(Nie n){
        boolean iguales=false;
        if(this.nie.equals(n.nie)) iguales=true;
        return iguales;
    }
}

