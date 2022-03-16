
/**
 * Write a description of class Estudiante here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Estudiante extends Persona
{
    /**
     * Constructor for objects of class Estudiante
     */
    public Estudiante(String nombre)
    {
        super(nombre);
    }

    /**
     * Devuelve para que utiliza el ordenador el Estudiante
     * 
     * @param
     * @return String
     */
    public String utilizaOrdenador()
    {
        return "El estudiante " + getNombre() + " utiliza el ordenador para hacer prácticas de programación";
    }
}
