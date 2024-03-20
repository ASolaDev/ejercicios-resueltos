/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Supuesto11;
/**
 *
 * @author isabel
 */
public interface Reservable extends Alquilable{
    void reservar(String telefono)throws IllegalArgumentException;
   
    @Override
    void saludo();
}
