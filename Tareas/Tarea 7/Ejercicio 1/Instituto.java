import java.util.List;

/**
 * Write a description of class Instituto here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Instituto
{
    private String nombre;
    private List<Estudiante> estudiantes;

    /**
     * Constructor for objects of class Instituto
     */
    public Instituto(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void altaPersona(Persona persona)
    {
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void mostrar()
    {
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public List<Profesor> quienDaConferenciasEn(Dia dia)
    {
        return null;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int cuantosEstudiantes()
    {
        return estudiantes.size();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void borrarEstudiantes()
    {
        estudiantes = null;
    }
}
