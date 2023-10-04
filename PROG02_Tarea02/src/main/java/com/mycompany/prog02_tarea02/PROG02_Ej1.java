/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prog02_tarea02;

import java.util.Scanner;

/**
 *
 * @author isabel
 */
public class PROG02_Ej1 {

    public static void main(String[] args) {
      //En Java, por nomenclatura, a las constantes se les pone en mayusculas
      //A las variables con notacion de tipo Camel, primera palabra en minusculas
      //segunda palabra unida a la primera palabra, la primera inicial en mayuscula
      //tercera palabra unida a las anteriores, la primera inicial en mayuscula
      // y asi, sucesivamente
        
      //1 Valor máximo no modificable: 5000
      // Es de tipo numerico, elijo int, y debe ser constante: final
      //Una constante en Java por convencion se pone en mayusculas 
      // se asigna un valor inicial a la vez que se declara
      final int VALOR_MAXIMO=5000;
      
      
      //2 Si el nuevo empleado tiene carnet de conducir o no
      //boolean puede tomar el valor true o false
      // puede cambiar de valor, por lo que es una variable
      boolean carnetConducir;
      
      //3 Un mes del año en formato numérico y como cadena.
      // mes en formato numerico, puede cambiar de valor      
      int numMes; 
      
      //Un mes del año en formato cadena
      //mes de tipo String, puede cambiar de valor
      String nombreMes;
      
      //4 El nombre y apellidos de una persona.
      //Formato cadena: String, pueden cambiar de valor
      //* Se pueden declarar mas de una variable del mismo tipo juntas, eso si,
      //separadas por ,
      String nombre, apellidos;
      
      //5 Sexo: con dos valores posibles 'V' o 'M'.
      //Formato: char, puede cambiar
      char sexo;
      
      //6 Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
      // Formato numerico con muchas cifras, long 
      // Supongamos que milisegundos puede cambiar de valor
      long milisg;
      
      
      //7 Saldo de una cuenta bancaria.
      //El saldo admite cifras decimales, por lo tanto, sera real
      // Con float es suficiente, pero tambien lo podemos poner para
      //una cantidad muy, muy grande: double
      //el saldo puede cambiar de valor
      float saldo;
      
      //Distancia en kms desde la Tierra a Júpiter.
      //Valor muy, muy grande: double (es el mayor)
      double distancia;
      
      //Vamos a darle valores, los que queramos
      //2 carnetConducir
      carnetConducir=true; 
      
      //3 mes
      numMes=10;
      nombreMes="octubre";
      
      //4 nombre y apellidos
      nombre="Juan";
      apellidos="Palomo Palomo";
      
      //5 sexo
      sexo='V';
      
      //6 milisg
      milisg=230000000;
      
      //7 saldo. Cuando se inicializa a un valor de tipo float, se pone f despues del valor
      saldo=1200.67f;
      
      //8 distancia. Cuando se inicializa a un valor de tipo double, se pone d despues del valor
      distancia=2341233333333.6666d;
      
      
      //Mostrar los valores anteriores
        System.out.println("----VALORES-----");
        System.out.println("1. Valor maximo: "+VALOR_MAXIMO);
        System.out.println("2. Carnet de conducir :"+carnetConducir);
        System.out.println("3. Mes: "+numMes+" su nombre: "+nombreMes);
        System.out.println("4. Nombre con apellidos: "+nombre+" "+apellidos); //concatenacion
        System.out.println("5. Sexo: "+sexo);
        System.out.println("6. Milisegundos de un tiempo: "+milisg);
        System.out.println("7. Saldo: "+saldo+"€");
        System.out.println("8. Distancia: "+distancia+"Kms");
        
        
      //Ahora, introducimos los valores por teclado
      Scanner teclado=new Scanner(System.in); //Recordad que hay que importar Scanner
      String cadena; 
      
      //1 VALOR_MAXIMO no se puede cambiar.
              
      //2
        //Utilizo print para que NO salte de linea y se introduzca el valor a continuacion
        System.out.print("Introduce si tienes carnet de conducir (true o false): "); 
        cadena=teclado.nextLine();
        carnetConducir=Boolean.parseBoolean(cadena);       
        
        System.out.println("2. Carnet de conducir INTRODUCIDO: "+carnetConducir);
       
        //3
        System.out.print("Introduce mes en numero: "); 
        cadena=teclado.nextLine();
        numMes=Integer.parseInt(cadena);       
        
        System.out.println("3.Numero de mes INTRODUCIDO: "+numMes);
        
        System.out.print("Introduce mes en cadena: "); 
        cadena=teclado.nextLine();
        nombreMes=cadena;       
        
        System.out.println("Nombre de mes INTRODUCIDO: "+nombreMes);
       
        //4
        System.out.print("Introduce tu nombre: "); 
        cadena=teclado.nextLine();
        nombre=cadena;       
        
        System.out.print("Introduce tus apellidos: "); 
        apellidos=teclado.nextLine(); //se puede poner tambien asi        
        System.out.println("4. Nombre con apellidos: "+nombre+" "+apellidos); //concatenacion
        
        //5
        System.out.print("Introduce tu sexo: "); 
        cadena=teclado.nextLine();
        sexo=cadena.charAt(0); //La primera letra de la cadena *IMPORTANTE
       
        System.out.println("5. Sexo: "+sexo);
       
        //6
        System.out.print("Introduce los milisegundos: "); 
        cadena=teclado.nextLine();
        milisg=Long.parseLong(cadena);
       
        System.out.println("6. Milisegundos: "+milisg);
       
        //7
        System.out.print("Introduce el saldo de tu cuenta bancaria: "); 
        cadena=teclado.nextLine();
        saldo=Float.parseFloat(cadena);
       
        System.out.println("7. Saldo: "+saldo+"€");
        
        //8
        System.out.print("Introduce la distancia: "); 
        cadena=teclado.nextLine();
        distancia=Double.parseDouble(cadena);
       
        System.out.println("8. Distancia: "+distancia+"Kms");
       
        //1 VALOR_MAXIMO no se puede cambiar.
        /*
        System.out.print("Introduce el valor Maximo predefinido: "); 
        cadena=teclado.nextLine();
       // VALOR_MAXIMO=Integer.parseInteger(cadena); //Si quitas el comentario veras que hay error  
        
        System.out.println("1. Valor maximo: "+VALOR_MAXIMO);
     
        */
       
    }
}
