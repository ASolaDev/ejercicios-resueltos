package Supuesto14;


import java.util.ArrayList;
public class Ppal_Supuesto14 {

    public static void main(String[] args) { 
        
        Vivienda vivienda1 = new Vivienda("Referencia1","Murcia","Murcia");  
        vivienda1.alquilar();
        System.out.println("El numero de Referencia catastral de vivienda1 es "+vivienda1.getNumReferenciaCatastral());
        System.out.println("Datos de vivienda1 :"+vivienda1);
        
        //Polimorfismo
        Alquilable alq = vivienda1; //alq apunta a vivienda1, se transforma en ivienda1
        alq.alquilar(); //tan solo puede ejecutar el metodo alquilar ya que es Alquilable, y tambien toString al ser de Object
       
        //Ademas tambien se puede hacer downcasting explicito
        System.out.println("Referencia catastral de vivienda1 "+((Vivienda)alq).getNumReferenciaCatastral());
        System.out.println("Datos de alq1 que apunta a vivienda1 "+ alq); //ejecuta el metodo toString de la Vivienda
     
        
        
        Vehiculo vehiculo1 = new Vehiculo("Marca1","Modelo1","Matricula1");
        vehiculo1.alquilar();
        System.out.println("Matricula de vehiculo1: "+vehiculo1.getMatricula());
        System.out.println("Datos completos de vehiculo1: "+vehiculo1);       
        
        Moto moto2 = new Moto(400,"Marca1","Modelo1","Matricula1");
        moto2.alquilar();
        System.out.println("Matricula de moto2: "+moto2.getMatricula());
        System.out.println("Datos completos de moto2: "+moto2);
        
        //Polimorfismo Ahora alq va a apuntar a moto2 -> se trasnforma en moto2
        alq = moto2;        
        alq.alquilar(); //moto2 se alquila por medio de alq
        
        //DownCasting Explicito para alq apuntando a moto2
        System.out.println("Matricula de alq apuntando a moto2: "+((Moto)alq).getMatricula());
        System.out.println("Datos completos de alq apuntando a moto2: "+alq);//ejecuta el metodo toString de Moto
       
        //Polimorfismo  Ahora alq apunta a una zona de memoria sin nombre que guardainformacion de un coche        
        alq = new Coche(4,"MarcaCoche2","ModeloCoche2","MatriculaCoche2");   
        alq.alquilar(); // se alquila el coche
        System.out.println("Matricula de alq apuntando a un coche: "+((Coche)alq).getMatricula());
        System.out.println("Datos completos de alq apuntando a un coche: "+alq);//ejecuta el metodo toString de Coche
        
        
        //Incluso se puede crear un ArrayList de Interface
        ArrayList <Alquilable> alquileres = new ArrayList <Alquilable>();
        alquileres.add(alq); //acabo de guardar el coche
        alquileres.add(vivienda1); //internamente un puntero de tipo Interface Alquilable va a apuntar a vivienda1
        alquileres.add(moto2);//internamente un puntero de tipo Interface Alquilable va a apuntar a vivienda1
        
        //Especificando el tipo
        System.out.println("\n\n\n\n\n\n\n\n-- LISTADO DEL ARRAY--");        
        for (Alquilable a: alquileres) {
            if (a instanceof Vivienda) {
                System.out.println("Vivienda :"+((Vivienda) a).getNumReferenciaCatastral());
            }else if (a instanceof Moto){
                System.out.println("Moto :"+((Moto) a).getMatricula());
            }else{
                 System.out.println("Coche :"+((Coche) a).getMatricula());
            }                
        }

        //Otra forma
        System.out.println("\n-- LISTADO DEL ARRAY--");        
        for (Alquilable a: alquileres) {
            if (a instanceof Vivienda vivienda) {
                System.out.println("Vivienda :"+vivienda.getNumReferenciaCatastral());
            }else if (a instanceof Moto moto){
                System.out.println("Moto :"+moto.getMatricula());
            }else{
                 System.out.println("Coche :"+((Coche) a).getMatricula());
            }                
        }

                
       }
}
