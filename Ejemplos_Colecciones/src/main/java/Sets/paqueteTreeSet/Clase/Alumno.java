/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sets.paqueteTreeSet.Clase;

/**
 *
 * @author isabel
 */
public abstract class Alumno implements Comparable{ //Para que un TreeSet pueda ordenar un objeto compuesto por varios campos, hay que indicarle 
                                                    // cual va a ser el campo por el que queremos ordenar. Se hace con la interface Comparable
                                                    // metodo: int compareTo(Object o)
                                                    // lo conveniente es que se implemente Comparable <Alumno>
                                                    // de esa forma el metodo sera: int compareTo(Alumno o)
                                                    // Y no es necesario castear
    protected String nombre;
    protected int edad;
    protected boolean becario;

    public Alumno(String nombre, int edad, boolean becario) {
        this.nombre = nombre;
        this.edad = edad;
        this.becario = becario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isBecario() {
        return becario;
    }

    public void setBecario(boolean becario) {
        this.becario = becario;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", edad=" + edad + ", becario=" + becario + '}';
    }

    @Override
    public int compareTo(Object o){
        return this.nombre.compareToIgnoreCase(((Alumno)o).nombre);
    }
}
