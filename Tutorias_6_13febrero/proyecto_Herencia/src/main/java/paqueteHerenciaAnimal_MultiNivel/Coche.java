/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteHerenciaAnimal_MultiNivel;

/**
 *
 * @author isabel
 */
public class Coche {
       int velocidad;
       Motor motor;
           
       Coche(int cilindrada)
       {
          this.velocidad=0;
          this.motor=new Motor(cilindrada);
       }
       
       Coche(int velocidad, int cilindrada){
           this.velocidad=velocidad;
           this.motor=new Motor(cilindrada);
       }
       
       Coche(int velocidad, Motor motor){
           this.velocidad=velocidad;
           this.motor=motor;
       }
       
       @Override
       public String toString(){            
           return "[Velocidad= "+this.velocidad+" Motor="+this.motor+"]";
       }
       
       static class Motor //clase interna
       {
          int cilindrada;
          
          Motor(int cilindrada)
          {
              this.cilindrada=cilindrada;        
          }
          
          @Override
          public String toString(){ 
              return "Motor["+this.cilindrada+"]";
          }
       }    
}
