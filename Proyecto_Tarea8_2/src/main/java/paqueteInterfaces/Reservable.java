/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package paqueteInterfaces;

/**
 *
 * @author isabel
 */
public interface Reservable extends Prestable{
    void reservar(String telefono) throws IllegalArgumentException;
}
