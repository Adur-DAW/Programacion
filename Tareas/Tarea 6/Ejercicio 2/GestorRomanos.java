import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;

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
     * Constructor
     */
    public GestorRomanos()
    {
        listaArabicos = new TreeMap<Integer, String>();
    }

    /**
     * Añade un número Romano al mapa ListaArabicos
     * 
     * @param String romano
     * @return void
     */
    public void añadirRomano(String romano)
    {
        listaArabicos.put(conversor.convertir(romano), romano);
    }
    
    /**
     * Añade todos los números Romanos que le pasemos por parámetro al mapa ListaArabicos
     * 
     * @param  String[] romanos
     * @return void
     */
    public void añadirRomanos(String[] romanos)
    {
        for(String romano: romanos)
            añadirRomano(romano);
    }
    
    /**
     * Muestra por pantalla la lista de números Arabicos
     * 
     * @param
     * @return void
     */
    public void escribirListaArabicos()
    {
        Set entrySet = listaArabicos.entrySet();
        Iterator it = entrySet.iterator();

        while(it.hasNext())
        {
          System.out.println(it.next());
        }
    }
}
