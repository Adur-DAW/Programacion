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
    private String año;
    private TreeMap<String, Equipo> equipos = new TreeMap<String, Equipo>();
    
    static final String archivoEquipos = "equipos.txt";
    static final String archivoSalida = "salida.txt";

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
            BufferedReader entrada = new BufferedReader(new FileReader(archivoEquipos));
            String linea = entrada.readLine();
            
            String nombreEquipo = null;
            
            while (linea != null)
            {
                String[] partes = linea.split(":");
                
                if (partes.length == 4)
                {
                    Equipo equipo = new Equipo(partes[0]);
                    Entrenador entrenador = new Entrenador(partes[2], Integer.parseInt(partes[3]), equipo);
                    
                    nombreEquipo = equipo.getNombre();
                    
                    equipos.put(equipo.getNombre(), equipo);
                }
                else if (partes.length == 3)
                {
                    Equipo ultimoEquipo =  equipos.get(nombreEquipo);
                    
                    Jugador jugador = new Jugador(partes[0], Integer.parseInt(partes[1]), ultimoEquipo);
                    
                    ultimoEquipo.addJugador(jugador);
                    
                    equipos.put(nombreEquipo, ultimoEquipo);
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
            BufferedWriter entrada = new BufferedWriter(new FileWriter(archivoSalida));
           
            for (var entry : equipos.entrySet()) 
            {
                Equipo equipo = entry.getValue();
                
                Persona pichichi = equipo.pichichi();
                
                if (pichichi != null) 
                    entrada.write(equipo.getNombre() + " - " + pichichi.getNombre());
                else 
                    entrada.write("Error");
                    
                entrada.newLine();
            }
            
            entrada.close();
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
