/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tarea9_2.Ejercicio1.Jerarquia;

/**
 *
 * @author isabel
 */
public class Nif {
    private String nif;
    private static final String LETRAS = "TRWAGMYFPDXBNJZSQVHLCKE";

    public Nif(String NIF) throws IllegalArgumentException {
        this.setNif(NIF); //Overridable method call in constructor QUE ES
    }

    public Nif(int NIF) throws IllegalArgumentException {
        this.setNif(NIF);
    }

    public Nif(Nif n) throws IllegalArgumentException {
        this(n.nif);//Igual que n.getNif()
    }

    public String getNif() {
        return this.nif;
    }

    public void setNif(String NIF) throws IllegalArgumentException {
        NIF = NIF.trim().toUpperCase();
        String expr = "^[0-9]{1,8}-[TRWAGMYFPDXBNJZSQVHLCKE]$";
        if (NIF.matches(expr)) {
            String digitosNIF = NIF.substring(0, NIF.length()-2); //se quita - y la letra            
            int numero = Integer.parseInt(digitosNIF);
            int resto = numero % 23; // 12345678   0-22
            char letra = LETRAS.charAt(resto);
            if (letra != NIF.charAt(NIF.length()-1)) {
                throw new IllegalArgumentException("Letra incorrecta");
            }
           
            if (digitosNIF.length() < 8){              
              //Si el nunero tiene menos de 8 digitos se rellena de 0 por la izqda
              int l=digitosNIF.length();
              while (l < 8){
                digitosNIF="0"+digitosNIF;
                l++;
              }              
            }
            this.nif = digitosNIF + "-"+letra; 
        } else {
            throw new IllegalArgumentException("DNI incorrecto, formato 12345678-Z");
        }               
    }

    public void setNif(int NIF) throws IllegalArgumentException {
        String comprueba = String.valueOf(NIF);
        if (comprueba.length() <= 8) {
            int resto = NIF % 23;
            char letra = LETRAS.charAt(resto); 
            // Si el numero tiene menos de 8 digitos se rellena de 0 por la izqda
            int l=comprueba.length();
            while (l<8){
                comprueba="0"+comprueba;
                l++;
            }
            this.nif = comprueba + "-" + letra;            
        } else {
            throw new IllegalArgumentException("DNI incorrecto. Inserte al menos 8 dígitos");
        }
    }

    public void setNif(Nif n) throws IllegalArgumentException {
        this.setNif(n.nif);
    }
    
    @Override
    public String toString(){
        return this.nif;
    }
    
    public boolean equals(Nif n){
        boolean iguales=false;
        if(this.nif.equals(n.nif)) iguales=true;
        return iguales;
    }
} 

