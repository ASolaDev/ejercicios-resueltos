/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea4_4;

/**
 *
 * @author isabel
 */
public class Ej28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   /* Se desea guardar en una matriz compuesta por 12 filas, las
      temperaturas de todos los días de los 12 meses que posee el año,
      temperaturas cogidas a las 12:00h (hay que considerar que los
      meses no tienen el mismo número de días). Utilizad también un
      vector de String con los nombres de los meses.
     
      d. Mostrad por pantalla las temperaturas de todos los días de un
         mes determinado (introducir el número), controlad que ese
         número esté dentro de un rango de mes.
   */
    int m [][]= {
            {1, 12, 6, 5, 8, 7, 9, 4, 5, 3, 6, 12, 5, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {1, 12, 6, 5, 8, 7, 9, 4, 5, 3, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {11, 12, 6, 5, 18, 17, 9, 14, 5, 13, 6, 12, 15, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {11, 12, 6, 5, 18, 17, 14, 5, 13, 6, 12, 15, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {11, 12, 6, 5, 18, 17, 9, 14, 5, 13, 6, 12, 15, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {25, 26, 26, 24, 25, 26, 24, 25, 27, 28, 29, 30, 31, 32, 30, 31, 32, 31, 32, 31, 32, 31, 32, 32, 32, 32, 32, 32, 32, 32, 32},
            {25, 26, 26, 24, 25, 26, 24, 25, 27, 28, 29, 30, 31, 32, 30, 31, 32, 31, 32, 31, 32, 31, 32, 32, 32, 32, 32, 32, 32, 32, 32},
            {21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30},
            {11, 12, 6, 5, 18, 17, 9, 14, 5, 13, 6, 12, 15, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {11, 12, 6, 5, 18, 17, 14, 5, 13, 6, 12, 15, 4, 9, 10, 11, 15, 2, 6, 8, 12, 11, 13, 12, 14, 10, 11, 10, 21, 10},
            {1, 12, 6, 5, 8, 7, 9, 4, 5, 3, 6, 12, 5, 4, 9, 1, 1, 1, 2, 6, 8, 1, 1, 1, 2, 4, 10, 1, 1, 1, 1}
        };  
    
        String nombreMes[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
            "Octubre", "Noviembre", "Diciembre"};
       
        Ej28.temperaturaMedia(m, nombreMes);
        Ej28.diaFrioyCalor(m, nombreMes);
        Ej28.diaCalurosoAño(m, nombreMes);
        Ej28.temperaturasMes(m, nombreMes);
        
    } 
    
    
    //A. Mostrar por pantalla la temperatura media de cada mes.
    public static void temperaturaMedia(int m[][], String nMeses[]){        
        System.out.println("---TEMPERATURA MEDIA DE CADA MES---");         
        for (int mes=0; mes < m.length; mes++) {
            
            double sumaTemp=0.0;
            for (int dia = 0; dia < m[mes].length; dia++) {
                sumaTemp+=m[mes][dia];
            }
            
            double tempMedia=sumaTemp/m[mes].length;
            System.out.println("La temperatura media del mes: "+nMeses[mes]+ " es "+tempMedia);
        }  
        System.out.println("");
    }
    
    
    /*B. Indicar cuál es el día más frío y más cálido de cada mes, para
         ello, utilizad dos vectores, uno de ellos se utilizará para los días
         más fríos de cada mes y otro para los más calurosos.
    */
    public static void diaFrioyCalor (int m[][], String nMeses[]){
        int diasFrios[]=new int[12];
        int diasCalor[]=new int[12];
        
        
        for(int mes=0; mes<m.length; mes++){
            
            int diaFrio=0, diaCalor=0; //Comenzamos con el dia 0 del mes (primer dia)
            int frio=m[mes][0];//el dia mas frio y mas caluroso se inicializan a la temperatrua del primer dia de cada mes
            int calor=frio;
            
            for(int dia=0; dia<m[mes].length; dia++){
                if(m[mes][dia] < frio){
                        frio=m[mes][dia]; //guardo la temperatura frio
                        diaFrio=dia; //guardo el dia mas frio del mes mes 
                }
                
                if(m[mes][dia] > calor){
                        calor=m[mes][dia];
                        diaCalor=dia;
                }
            }
            
            //Un vez recorrido todos los dias del mes
            diasFrios[mes]=diaFrio; //se guarda en el array el dia de mas frio
            diasCalor[mes]=diaCalor; //se guarda en el array el dia de mas calor
        }
        
        System.out.println("---LOS DIAS MAS FRIOS DE CADA MES--- ");
        for(int mes=0; mes < m.length; mes ++){            
            System.out.println("El dia mas frio de "+nMeses[mes]+" es el dia "+(diasFrios[mes]+1)+" con "+m[mes][diasFrios[mes]]+"º");
        }
        System.out.println("");
        
        System.out.println("---LOS DIAS MAS CALUROSOS DE CADA MES--- ");
        for(int mes=0; mes < m.length; mes ++){            
            System.out.println("El dia mas caluroso de "+nMeses[mes]+" es el dia "+(diasCalor[mes]+1)+" con "+m[mes][diasCalor[mes]]+"º");
        }
        System.out.println("");
        
    }
    
    
    //C. CALCULAR EL DÍA MÁS CALUROSO DEL AÑO, INDICANDO MES Y DÍA
    public static void diaCalurosoAño (int m[][], String nMeses[]){
        int masCalorAnual=m[0][0]; //temperatura del primer dia del primer mes del año
        int queMes=0, queDia=0;
        
        for(int mes=0; mes < m.length; mes++){
            for(int dia=0; dia < m[mes].length; dia++){
                if(m[mes][dia] > masCalorAnual){
                        masCalorAnual=m[mes][dia];
                        queMes=mes;
                        queDia=dia;
                }
            }
        }
        
        System.out.println("__________");
        System.out.print("La temperatura más calurosa del año es: "+masCalorAnual+"º");
        System.out.print("\ten el mes: " + nMeses[queMes]);
        System.out.println("\tdel día: " + (queDia+1));
    }
    
    
    //D. MOSTRAR LAS Tª DE UN MES INTRODUCIDO POR TECLADO
    public static void temperaturasMes(int m[][], String nMeses[]){
        int numMes=Introducir.enteroPositivo("Introduzca el mes para ver las temperaturas: ");
        
        while (numMes < 1 || numMes > 12){
            System.out.println("Error, los meses deben estar comprendidos entre 1 y 12.");
            numMes=Introducir.enteroPositivo("Introduzca el mes para ver las temperaturas: ");
        }
       
        
        numMes--;
        System.out.println("Las temperaturas del mes de " + nMeses[numMes] + " son: ");
        for(int dia=0; dia< m[numMes].length; dia++){
            System.out.print(m[numMes][dia]+"\t");
        }
        
        System.out.println("");
    }
    
}
