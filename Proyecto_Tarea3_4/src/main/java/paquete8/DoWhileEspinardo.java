/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete8;

/**
 *
 * @author isabel
 */
public class DoWhileEspinardo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre;    
       
       int contNinos=0, contAdolescentes=0, contAdultos=0;
       int contNinosPesoInferior=0, contNinosSobrepeso=0;
       int contAdolescentesPesoNormal=0, contAdolescentesSobrepeso=0;
       int contAdultosSuperior=0, contAdultosSobrepeso=0;
       
       
       
       int hora;
       boolean permitirEntrar;
       
       
       do 
       {
            hora=Leer.enteroPositivo("Dime la hora: (Recepción: 8 a 12   -A las 12 se cierra-)");
       
            permitirEntrar = (hora>7 && hora<12);
            
            if (!permitirEntrar) break; //es equivalente a poner if (permitirEntrar==false)
      
             nombre = Leer.cadena("Buenos días, ¿Cómo te llamas?");
             int edad = Leer.enteroPositivo("¿Cúantos años tienes?");
             short altura = (short) Leer.enteroPositivo("¿Cuánto mides en cm?");
             double peso = Leer.realDoblePositivo("¿Cuánto pesas en kgrs?");
             
             byte imcLetra = Calculo.imc(peso, altura);
             
             if (edad < 12) //niños
             {
                 contNinos++;
                 switch(imcLetra){
                     case 1 -> contNinosPesoInferior++;
                     case 4 -> contNinosSobrepeso++; 
                 }
                 
             }else if (edad < 23){
                 contAdolescentes++;
                 switch(imcLetra){
                     case 2 -> contAdolescentesPesoNormal++;
                     case 4 -> contAdolescentesSobrepeso++;
                 }
             }else{
                 contAdultos++;
                 switch(imcLetra){
                     case 3 -> contAdultosSuperior++;
                     case 4 -> contAdultosSobrepeso++;
                  }                    
             
                }               
             
       }while (permitirEntrar);
       
       
        System.out.println("Número de voluntarios totales :"+(contNinos+contAdolescentes+contAdultos));
        
        System.out.println("Niños en total: "+contNinos);
        System.out.println("\tCon peso inferior a lo normal: "+contNinosPesoInferior+"\tCon sobrepeso: "+contNinosSobrepeso);
        
        System.out.println("Adolescentes en total: "+contAdolescentes);
        System.out.println("\tCon peso normal: "+contAdolescentesPesoNormal+"\tCon sobrepeso: "+contAdolescentesSobrepeso);
    
        System.out.println("Adultos en total: "+contAdultos);
        System.out.println("\tCon peso superior a lo normal: "+contAdultosSuperior+"\tCon sobrepeso: "+contAdultosSobrepeso);
    }
    
}
