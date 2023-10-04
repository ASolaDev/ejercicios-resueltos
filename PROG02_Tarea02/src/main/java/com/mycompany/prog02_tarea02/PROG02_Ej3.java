/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.prog02_tarea02;

/**
 *
 * @author isabel
 */
public class PROG02_Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      /*1. var1 || var2 && var3
        2. (var1 || var3) && (var2 && !var1)
        3. (var2 || !var1 || !var3) && var1
        4. (X > 3 || Y > 3) && Z < -3
        5. (X+Z == 15) && (Y != 2)
      */
      
      boolean var1=true, var2=true, var3=false;      
      
      //1.  var1 || var2 && var3 -> true || true && false
      // Orden de prioridad: &&
        // true && false => false
      // siguiente ejecucion: true || false => true
      
        System.out.println("1. var1 || var2 && var3 :"+(var1 || var2 && var3));
        
      //2. (var1 || var3) && (var2 && !var1)
      //Orden de prioridad: Parentesis
      // (var1 || var3) => (true || false) => true
      // true && (var2 && !var1)
      // true && (var2 && !true) => true && (var2 && false)
      // true && (true && false) 
      // true && false
      // false
      
        System.out.println("2. (var1 || var3) && (var2 && !var1) :"+((var1 || var3) && (var2 && !var1)));
      
        //3. (var2 || !var1 || !var3) && var1 
        // (true || !true || !false) && true
        // (true || false || true) && true
        // (    true      || true) && true
        //                true     && true
        //                        true
        System.out.println("3. (var2 || !var1 || !var3) && var1 :"+ ((var2 || !var1 || !var3) && var1));
       
        //------------------------------------------------------------------------------------------
        
        int X=5, Y=-8, Z=10;
        //4. (X > 3 || Y > 3) && Z < -3
        //   (5 > 3 || -8 > 3) && 10 < -3
        //   ( true || false)  && 10 < -3
        //         true        && 10 < -3
        //         true        &&  false
        //                    false
        System.out.println("4. (X > 3 || Y > 3) && Z < -3 :"+((X > 3 || Y > 3) && Z < -3));
        
        //5. (X+Z == 15) && (Y != 2)
        //   (5+10 == 15) && (-8 != 2)
        //   (15   == 15) && (-8 != 2)
        //       true     && (-8 != 2)
        //       true     &&  true
        //               true
        System.out.println("5. (X+Z == 15) && (Y != 2) :"+((X+Z == 15) && (Y != 2)));
        
        
    }
    
}
