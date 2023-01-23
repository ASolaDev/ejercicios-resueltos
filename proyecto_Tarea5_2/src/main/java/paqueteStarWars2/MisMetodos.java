/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteStarWars2;

/**
 *
 * @author isabel
 */
public class MisMetodos {
    public static int generaNumAleatorio(int a, int b){
        if (a>b){
            int aux=a;a=b;b=aux;
        }
        return (int)(Math.random()*(b-a+1)+a);
    }
}
