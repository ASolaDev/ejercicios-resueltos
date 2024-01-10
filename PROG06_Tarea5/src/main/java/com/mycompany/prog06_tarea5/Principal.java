/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prog06_tarea5;

/**
 *
 * @author isabel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Comprobacion del NIF */
        String grupo="TRWAGMYFPDXBNJZSQVHLCKE";
        
        String dni="00000010X"; //DNI del Rey Juan Carlos I
        
        String exprRegular1="^[0-9]{8}[TRWAGMYFPDXBNJZSQVHLCKE]$";
        if (dni.matches(exprRegular1)){           
            String numeros=dni.substring(0,8);
            int n=Integer.parseInt(numeros);           
            int indLetra=n%23;
            
            if (grupo.charAt(indLetra)== dni.charAt(8)){
                System.out.println("Representa un DNI");
            }else{
                System.out.println("Error, Letra incorrecta de NIF");
            }                
        }else{
            System.out.println("Formato incorrectod de NIF (8 digitos + letra)");
        }
        
         /* Comprobacion del NIE */
              
        String nie="X0000010X";
        
        String exprRegular2="^[XYZ][0-9]{7}[TRWAGMYFPDXBNJZSQVHLCKE]$";
        
        if (nie.matches(exprRegular2)){ 
            String numerosNie=nie.substring(1,8);
            
            switch (nie.charAt(0)){
                case 'X' -> numerosNie="0"+numerosNie;
                case 'Y' -> numerosNie="1"+numerosNie; 
                case 'Z' -> numerosNie="2"+numerosNie; 
            }
            
            int nNie=Integer.parseInt(numerosNie);   
            
            int indLetraNie=nNie%23;
            
            if (grupo.charAt(indLetraNie)== nie.charAt(8)){
                System.out.println("Representa un NIE");
            }else{
                System.out.println("Error, Letra incorrecta de NIE");
            }                
        }else{
            System.out.println("Formato incorrectod de NIE ('X'o'Y'o'Z' + 7 digitos + letra)");
        }
        
        
    }
    
}
