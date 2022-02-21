import java.util.HashMap;

/**
 * Write a description of class ConversorRomanos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConversorRomanos
{
    // instance variables - replace the example below with your own
    private HashMap<String, Integer> tabla;

    /**
     * Constructor for objects of class ConversorRomanos
     */
    public ConversorRomanos()
    {
        inicializar();
    }

    /**
     * Convierte los números romanos a números arábicos
     * 
     * @param String textoRomano
     * @return int
     */
    public int convertir(String textoRomano)
    {
        return tabla.get(textoRomano);
    }
    
    /**
     * Inicializa las relaciones entre los números árabicos y romanos
     * 
     * @param
     * @return void
     */
    public void inicializar()
    {
        tabla = new HashMap<String, Integer>();
        
        tabla.put("I", 1);
        tabla.put("V", 5);
        tabla.put("X", 10);
        tabla.put("L", 50);
        tabla.put("C", 100);
        tabla.put("D", 500);
        tabla.put("M", 1000);
    }
}
