/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package paqueteExcepciones;

/**
 *
 * @author isabel
 */
public class NumHorasException extends EmpleadoException{

    /**
     * Creates a new instance of <code>NumHorasException</code> without detail
     * message.
     */
    public NumHorasException() {
    }

    /**
     * Constructs an instance of <code>NumHorasException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NumHorasException(String msg) {
        super(msg);
    }
}
