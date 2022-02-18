import java.util.TreeMap;

/**
 * Write a description of class GestorRomanos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GestorRomanos
{
    // instance variables - replace the example below with your own
    private TreeMap<Integer, String> listaArabicos;
    private ConversorRomanos conversor;

    /**
     * Constructor for objects of class GestorRomanos
     */
    public GestorRomanos()
    {
        listaArabicos = new TreeMap<Integer, String>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void añadirRomano(String romano)
    {
        listaArabicos.put(conversor.convertir(romano), romano);
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void añadirRomanos(String[] romanos)
    {
        //Usar el iterator y añadir romano
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void escribirListaArabicos(String romano)
    {
        // Iterator : )
    }
}
