package Supuesto1;

/**
 *
 * @author isabel
 */
public interface Alquilable {
    String EMPRESA = "LA EMPRENDEDORA, SA"; //nombre es una constante 
    
    void alquilar() throws IllegalArgumentException; //es un metodo abstracto
}
