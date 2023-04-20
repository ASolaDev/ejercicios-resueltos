/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JerarquiaAlumno;

/**
 *
 * @author isabel
 */
public class AlumnoMayorEdad extends Alumno{
   
    public AlumnoMayorEdad(String nombre, int edad, boolean becario) {
        super(nombre, edad, becario);        
    }

    
    @Override
    public String toString() {
        return "Mayor " + super.toString();
    }
   
    
    
}
