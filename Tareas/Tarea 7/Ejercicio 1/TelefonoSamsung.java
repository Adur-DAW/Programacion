
/**
 * SubClase Samsung
 * 
 * @author Adur Marques
 * @version 1.0.0
 */
public class TelefonoSamsung extends Telefono
{
    /**
     * Constructor for objects of class TelefonoSamsung
     */
    public TelefonoSamsung(String numeroTelefono)
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
        return "Samsung: " + getNumero();
    }
}
