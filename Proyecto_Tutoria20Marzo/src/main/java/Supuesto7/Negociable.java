/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Supuesto7;

/**
 *
 * @author isabel
 */
public interface Negociable extends Vendible, Hipotecable {  
    void negociar(float cuantia) throws IllegalArgumentException;
}

