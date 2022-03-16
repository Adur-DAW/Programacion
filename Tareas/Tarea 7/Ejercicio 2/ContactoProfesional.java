
/**
 * Write a description of class ContactoProfesional here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class ContactoProfesional extends Contacto
{
    private String nombreEmpresa;
    
    /**
     * Constructor for objects of class ContactoProfesional
     */
    public ContactoProfesional(String nombre, String telefono, String nombreEmpresa)
    {
        super(nombre, telefono);
        
        this.nombreEmpresa = nombreEmpresa;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getNombreEmpresa()
    {
        return nombreEmpresa;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getFirmaEmail()
    {
        return "Atentamente, un saludo";
    }
}
