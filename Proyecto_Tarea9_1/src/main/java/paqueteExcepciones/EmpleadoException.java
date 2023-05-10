/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package paqueteExcepciones;

/**
 *
 * @author isabel
 */
public class EmpleadoException extends Exception{

    /**
     * Creates a new instance of <code>EmpleadoException</code> without detail
     * message.
     */
    public EmpleadoException() {
        super("Error en el empleado...");
    }

    /**
     * Constructs an instance of <code>EmpleadoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmpleadoException(String msg) {
        super(msg);
    }
}
