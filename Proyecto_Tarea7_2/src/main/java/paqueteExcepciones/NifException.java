/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package paqueteExcepciones;

/**
 *
 * @author isabel
 */
public class NifException extends IdException{

    /**
     * Creates a new instance of <code>NifException</code> without detail
     * message.
     */
    public NifException() {
    }

    /**
     * Constructs an instance of <code>NifException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NifException(String msg) {
        super(msg);
    }
}
