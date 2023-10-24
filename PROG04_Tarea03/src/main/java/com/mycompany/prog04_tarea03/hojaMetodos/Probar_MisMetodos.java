/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog04_tarea03.hojaMetodos;

/**
 *
 * @author isabel
 */
public class Probar_MisMetodos {

    public static void main(String[] args) {
       //1. sumaImparesN(2) -> 1+3=4
        System.out.print("Suma de los 2 primeros numeros impares ");
        System.out.println(MisMetodos.sumaImparesN(2));
        
       //2. mostrarMensaje(3) -> 3 veces: "Metodo ejecutandose ... veces"
       MisMetodos.mostrarMensaje(3);
       
       //3. maximo(45, 67) -> 67
        System.out.println("El maximo de 45 y 67 es :"+MisMetodos.maximo(45,67));
        
       //4. maximo(45.456, 67.23) -> 67
    System.out.println("El maximo de 45.456 y 67.23 es :"+MisMetodos.maximo(45.456f,67.23f));
        
       //5. minimo(45, 67) -> 45
        System.out.println("El minimo de 45 y 67 es :"+MisMetodos.minimo(45,67));
        
       //6. betweenNandM(3,6)-> 3 4 5 6
       MisMetodos.betweenNandM(3,6);
       
       //7. doble(6) -> 12
       int x=6;
        System.out.println(MisMetodos.doble(x));
        
       //8.longitudAreaCirculo(x, 'a') -> 3.1415 * 6* 6
        System.out.println(MisMetodos.longitudAreaCirculo(x,'a'));
        
       //9. esPar(x) -> true
        System.out.println(MisMetodos.esPar(x));
        
       //10. esMayuscula('k') -> false
        System.out.println(MisMetodos.esMayuscula('k'));
       
       //11. esLetra('k') -> true
        System.out.println(MisMetodos.esLetra('k'));
        
      //12. pasarAMinuscula('K') -> 'k'
        System.out.println(MisMetodos.pasarAMinuscula('K'));
        
      //13. esDigito('6') -> true
      System.out.println(MisMetodos.esDigito('6'));
      
      //14. distanciaEuclidea(2,2,4,4) -> punto(2,2) y punto(4,4)
        System.out.println(MisMetodos.distanciaEuclidea(2,2 , 4, 4));
       
    }
}
