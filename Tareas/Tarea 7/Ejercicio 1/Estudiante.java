
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String utilizarOrdenador()
    {
        return "El estudiante " + getNombre() + " utiliza el ordenador para hacer prácticas de programación";
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public boolean equals(Object persona)
    {
        return false;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public String toString(Persona persona)
    {
        return "";
    }
}
