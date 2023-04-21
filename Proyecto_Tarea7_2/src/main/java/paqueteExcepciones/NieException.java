/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package paqueteExcepciones;

/**
 *
 * @author isabel
 */
public class NieException extends IdException{

    /**
     * Creates a new instance of <code>NieException</code> without detail
     * message.
     */
    public NieException() {        
    }

    /**
     * Constructs an instance of <code>NieException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public NieException(String msg) {
        super(msg);
    }
}
