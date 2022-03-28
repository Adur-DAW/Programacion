import java.util.ArrayList;
import java.util.*;

/**
 * Write a description of class Equipo here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Equipo
{
    private String nombre;
    private ArrayList<Jugador> jugadores = new ArrayList();
    private Entrenador entrenador;

    /**
     * Constructor for objects of class Equipo
     */
    public Equipo(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public Entrenador getEntrenador()
    {
        return entrenador;
    }
    
    public void addJugadores(Jugador[] nuevosJugadores)
    {
        for(Jugador jugador : nuevosJugadores) {
            addJugador(jugador);
        }
    }
    
    public void addJugador(Jugador nuevoJugador)
    {
        if (buscarJugador(nuevoJugador.getNombre()) != null) return;
        
        jugadores.add(nuevoJugador);
    }
    
    public int golesDe(String nombrePersona)
    {
        Persona persona = buscarJugador(nombrePersona);
        
        if (persona == null) return -1;
        
        return ((Jugador)persona).getGolesMarcados();
    }
    
    private Persona buscarJugador(String nombreJugador)
    {
        if (!hayJugadores()) return null;
        
        for(Persona jugador : jugadores) {
            if(jugador.getNombre() == nombreJugador)
                return jugador;
        }
        return null;
    }
    
    private boolean hayJugadores()
    {
        return jugadores.size() > 0;
    }
    
    public ArrayList<Persona> mejorPagado()
    {
        return null;
    }
    
    public void listarOrdenAlfabético()
    {
       ArrayList jugadoresOrdenados = jugadores;
       
       Collections.sort(jugadores, new ComparadorNombre());
        
       escribir(jugadoresOrdenados);
    }
    
    public void listarPorSueldo()
    {
        ArrayList jugadoresOrdenados = jugadores;
        
        Collections.sort(jugadoresOrdenados, new ComparadorSueldo());
        
        escribir(jugadoresOrdenados);
    }
    
    private void escribir(ArrayList<Persona> jugadores)
    {
        for(Persona jugador : jugadores) {
          System.out.println("Nombre: " + jugador.getNombre() + " - Sueldo: " + jugador.getSueldo() + " - Goles: " + ((Jugador)jugador).getGolesMarcados());
        }
    }
    
    public Persona pichichi()
    {
        if (!hayJugadores()) return null;
        
        return Collections.max(jugadores, Comparator.comparing(j -> j.getGolesMarcados()));
    }
}
