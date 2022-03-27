import java.util.TreeMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Map;

/**
 * Write a description of class Liga here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Liga
{
    // instance variables - replace the example below with your own
    private String año;
    private TreeMap<String, Equipo> equipos;
    
    static final String nombreArchivo = "equipos.txt";

    /**
     * Constructor for objects of class Liga
     */
    public Liga(String año)
    {
        this.año = año;
    }

    public void cargarDeFichero() throws java.io.FileNotFoundException
    {
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(nombreArchivo));
            String linea = entrada.readLine();
            
            while (linea != null)
            {
                System.out.println(linea);
                
                String[] partes = linea.split(":");
                
                if (partes.length == 4)
                {
                    Equipo equipo = new Equipo(partes[0]);
                    Entrenador entrenador = new Entrenador(partes[3], Integer.parseInt(partes[4]), equipo);
                }
                else 
                {
                    Map.Entry<String, Equipo> lastEntry = equipos.lastEntry();
                    
                    Jugador jugador = new Jugador(partes[0], Integer.parseInt(partes[1]), equipo);
                }
                
                linea = entrada.readLine();
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
    public void salvarEnFichero()
    {
        try {
            BufferedWriter entrada = new BufferedWriter(new FileWriter(nombreArchivo));
           
            for (var entry : equipos.entrySet()) {
                System.out.println(entry.getKey() + "/" + entry.getValue());
                
                 entrada.write(entry.getValue().getNombre());
            }
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }
    
    public String pichichi()
    {
        TreeMap<String, Integer> golesPorEquipo = new TreeMap<String, Integer>();
        
        for (var entry : equipos.entrySet()) 
        {
            Equipo equipo = entry.getValue();
        
            golesPorEquipo.put(equipo.getNombre(), ((Jugador)equipo.pichichi()).getGolesMarcados());
        }

        return golesPorEquipo.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
    }
}
