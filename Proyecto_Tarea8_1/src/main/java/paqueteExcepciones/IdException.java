/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package paqueteExcepciones;

/**
 *
 * @author isabel
 */
public class IdException extends EmpleadoException {

    /**
     * Creates a new instance of <code>IdException</code> without detail
     * message.
     */
    public IdException() {
        super("Error en el ID...");
    }

    /**
     * Constructs an instance of <code>IdException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public IdException(String msg) {
        super(msg);
    }
}
