/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.creacionmenus;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class CreacionMenus {

    public static void main(String[] args) {
        //Diseño de un menu
        // Opciones 3 y la de salir = 4
        int opcion;
        
        do{
            MiClase.mostrarMenu();            
            opcion = MiClase.introducirEntero("Dime la opcion que desees (1 a 4):");
            while (opcion < 1 || opcion >4){
                System.out.println("Error!!! ");
                opcion = MiClase.introducirEntero("Dime la opcion que desees (1 a 4):");
            }
            
            switch(opcion){
                case 1: MiClase.opcion1(); break;
                case 2: MiClase.opcion2(); break;
                case 3: MiClase.opcion3(); break;
                default: System.out.println("TA LUEGUITO!!");
            }
            
        }while (opcion != 4);
        
        System.out.println("FIN DEL PROGRAMA");
    }
}
