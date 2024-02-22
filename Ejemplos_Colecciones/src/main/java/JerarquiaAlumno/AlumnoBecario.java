/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JerarquiaAlumno;

/**
 *
 * @author isabel
 */
public class AlumnoBecario extends Alumno{
    
    public AlumnoBecario(String nombre, int edad, boolean becario) {
        super(nombre, edad, becario);        
    }

    
    @Override
    public String toString() {
        return "Becario: " + super.toString();
    }

}
