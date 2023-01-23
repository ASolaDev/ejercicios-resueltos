/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paqueteStarWars2;

import paqueteStarWars1.Personaje;



/**
 *
 * @author isabel
 */
public class Principal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Personaje luke=new Personaje("Luke",500,300,100,2,1);
         Personaje darthVader=new Personaje("Darth Vader",500,300,500,3,4);
         Personaje yoda=new Personaje("Yoda",300,200,250,4,9 );
         
         int numAtaques=0;
         do {
             //darthVader ataca a luke o yoda (al azar) - Darth Vader está vivo
            int personajeAzar, ataqueAzar;
            personajeAzar=MisMetodos.generaNumAleatorio(1, 2);
            switch(personajeAzar){
                    case 1:  //Darth Vader ataca a luke
                        if (luke.isVivo()){
                           numAtaques++;
                           System.out.print("\nAtaque nº "+numAtaques+"\nDarth Vader ataca a Luke...");
                           ataqueAzar=MisMetodos.generaNumAleatorio(1, 2);
                           switch(ataqueAzar){
                               case 1: luke.danarSalud(darthVader.ataqueFisico()); break;                          
                               case 2: luke.danarSalud(darthVader.ataqueFuerza());
                            }   
                        System.out.println("Salud de Luke = "+luke.getSalud());
                        
                        //Ahora luke ataca a darthVader si luke está vivo
                        if (luke.isVivo()){
                           numAtaques++;
                           System.out.print("\nAtaque nº "+numAtaques+"\nLuke ataca a Darth Vader ...");
                           ataqueAzar=MisMetodos.generaNumAleatorio(1, 2);
                           switch(ataqueAzar){
                                case 1: darthVader.danarSalud(luke.ataqueFisico()); break;
                                case 2: darthVader.danarSalud(luke.ataqueFuerza());
                            }   
                           System.out.println("Salud de Darth Vader = "+darthVader.getSalud());                           
                           }                           
                        }
                        break;
                   
                    case 2: //Darth Vader ataca a yoda
                        if (yoda.isVivo()){
                           numAtaques++;
                           System.out.print("\nAtaque nº "+numAtaques+"\nDarth Vader ataca a Yoda...");
                           ataqueAzar=MisMetodos.generaNumAleatorio(1, 2);
                           switch(ataqueAzar){
                                case 1: yoda.danarSalud(darthVader.ataqueFisico()); break;
                                case 2: yoda.danarSalud(darthVader.ataqueFuerza());
                            }   
                        System.out.println("Salud de Yoda = "+yoda.getSalud());
                                               
                        //Ahora yoda ataca a darthVader si yoda está vivo
                        if (yoda.isVivo()){
                           numAtaques++;
                           System.out.print("\nAtaque nº "+numAtaques+"\nDarth Vader ataca a Yoda...");
                           ataqueAzar=MisMetodos.generaNumAleatorio(1, 2);
                           switch(ataqueAzar){
                                case 1: darthVader.danarSalud(yoda.ataqueFisico());break;
                                case 2: darthVader.danarSalud(yoda.ataqueFuerza());
                            }   
                        System.out.println("Salud de Darth Vader = "+darthVader.getSalud());
                        }    
                    }                      
            }                
        }while((luke.isVivo() || yoda.isVivo()) && darthVader.isVivo());
         
         
        System.out.println(""); 
        if (darthVader.isVivo()){
            System.out.println("El ganador es :"+darthVader.getNombre());
        } 
        else{
            System.out.println("Los ganadores son: Luke y Yoda");
            if (! luke.isVivo()){
                System.out.println("Aunque Luke no está vivo");
            }
            if (! yoda.isVivo()){
                System.out.println("Aunque Yoda no está vivo");
            }
        }
    }
}

    

