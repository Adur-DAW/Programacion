
/**
 * Write a description of class TelefonoNokia here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class TelefonoNokia extends Telefono
{
     /**
     * Constructor for objects of class TelefonoSamsung
     */
    public TelefonoNokia(String numeroTelefono)
    {
        super(numeroTelefono);
    }

    /**
     *  Devuelve una representación texto que indica la marca de móvil y el número de teléfono
     * 
     * @param
     * @return String
     */
    public String toString()
    {
        return "Nokia (" + getNumero() + ")";
    }
}
