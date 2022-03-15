/**
 * Abstract class Telefono - write a description of the class here
 * 
 * @author: Adur Marques Herrero
 * Date: 
 */
public abstract class Telefono
{
    // instance variables - replace the example below with your own
    String numero;

    
    /**
     * Constructor for objects of class TelefonoSamsung
     */
    public Telefono(String numeroTelefono)
    {
        this.numero = numeroTelefono;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public String getNumero()
    {
        return numero;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public String llamar(Telefono telefono)
    {
        return telefono.getNumero();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public int hashCode()
    {
        return getNumero().hashCode();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public boolean equals(Object objeto)
    {
        return objeto.equals(objeto);
    }
}
