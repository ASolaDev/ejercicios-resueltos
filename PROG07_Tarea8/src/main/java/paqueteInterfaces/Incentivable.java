/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package paqueteInterfaces;

/**
 *
 * @author isabel
 */
//Se incentivara a Empleados en GestionRRHH, o a jugadores de futbol en la Liga Nacional, a tenistas en la ATP, o a Alumnos dentro de la Jerarquia IES ....
//Para eso se diseña un adaptador

//En este caso, el adaptador Incentivable tiene un metodo: incentivar que en funcion de un entero x, devolvera un numero real
//Y en el ejercicio se Incentivara con dinero a determinados Empleados (segun tipo de Empleado)
public interface Incentivable{
    void incentivar(float x);
}
