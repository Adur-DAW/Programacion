/**
 * Abstract class Telefono - write a description of the class here
 * 
 * @author: Adur Marques Herrero
 * Date: 
 */
public abstract class Telefono
{
    String numero;

    /**
     * Constructor for objects of class TelefonoSamsung
     */
    public Telefono(String numeroTelefono)
    {
        this.numero = numeroTelefono;
    }
    
    /**
     * Devuelve el número
     * 
     * @param
     * @return String
     */
    public String getNumero()
    {
        return numero;
    }
    
    /**
     * Devuelve un texto con el número que llama y a que número llama
     * 
     * @param  Telefono
     * @return String
     */
    public String llamar(Telefono telefono)
    {
        return "Llamando de " + getNumero() + " a " + telefono.getNumero();
    }
    
    public int hashCode()
    {
        return getNumero().hashCode();
    }

    public boolean equals(Object objeto)
    {
        return objeto.equals(objeto);
    }
}
