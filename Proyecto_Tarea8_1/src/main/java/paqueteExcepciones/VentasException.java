/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package paqueteExcepciones;

/**
 *
 * @author isabel
 */
public class VentasException extends EmpleadoException {

    /**
     * Creates a new instance of <code>VentasException</code> without detail
     * message.
     */
    public VentasException() {
    }

    /**
     * Constructs an instance of <code>VentasException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public VentasException(String msg) {
        super(msg);
    }
}
