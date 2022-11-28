/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea4_1;

/**
 *
 * @author isabel
 */
public class Fecha {
    /*
      Método estático: bisiesto, tal que dado un año considerado como dato de entrada
                        devuelve true o false, si es o no bisiesto
    */
    public static boolean bisiesto(int anio){
        boolean es=false;
        if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
	   es=true;
        else
           es=false;
        return es;
    }
}
