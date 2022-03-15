
/**
 * Write a description of class TelefonoSony here.
 * 
 * @author Adur Marques
 * @version 1.0.0
 */
public class TelefonoSony extends Telefono
{
    /**
     * Constructor for objects of class TelefonoSamsung
     */
    public TelefonoSony(String numeroTelefono)
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
        return "Sony: " + getNumero();
    }
}
