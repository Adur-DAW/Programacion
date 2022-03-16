/**
 * Abstract class Contacto - write a description of the class here
 * 
 * @author: Adur Marques Herrero
 * Date: 10/03/2022
 */
public abstract class Contacto
{
    String nombre;
    String telefono;

    public Contacto(String nombre, String telefono)
    {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public String toString()
    {
        String nombreClase = this.getClass().getSimpleName();
        
        return "Tipo contacto: " + nombreClase;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public String getTelefono()
    {
        return telefono;
    }
    
    public char getPrimeraLetra()
    {
        return nombre.charAt(0);
    }
}
