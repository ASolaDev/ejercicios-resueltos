/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tarea4_2;

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
    
    /* Objetivo: Método nos indica si la fecha formada por anio, mes y dia es correcta
     * Nombre del método: fechaCorrecta
     * Datos de entrada: anio, mes, dia de tipo entero
     * Salida: boolean
     *  
     * @param anio, mes, dia
     * @return es
    */
    public static boolean fechaCorrecta(int anio, int mes, int dia){
        boolean es=false;
        int dias[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        
        if (anio >= 0 && anio<= 3000) //anio está comprendido entre 0 y 3000
        {
            if (mes >= 1 && mes <=12) //mes está comprendido entre 1 y 12
            {
                if (Fecha.bisiesto(anio)) dias[2]=29;
                if (dia >=1 && dia <=dias[mes])
                    es=true;
            }    
        }    
       
        return es;
    }
    
    
}
