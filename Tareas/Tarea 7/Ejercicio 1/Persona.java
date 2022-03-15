import java.util.List;

/**
 * Abstract class Persona - write a description of the class here
 * 
 * @author: 
 * Date: 
 */
public abstract class Persona
{
    // instance variables - replace the example below with your own
    String nombre;
    List<Telefono> telefonos;

    /**
     * Constructor for objects of class Profesor
     */
    public Persona(String nombre)
    {
        this.nombre = nombre;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public String getListaNumeros()
    {
        return nombre;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public boolean addTelefono(Telefono telefono)
    {
        return false;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public int cuantosTelefonos()
    {
        return 1;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public String utilizarOrdenador()
    {
        return "a";
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public int hashCode()
    {
        return getNombre().hashCode();
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
    public int compareTo(Persona persona)
    {
        return 2;
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
