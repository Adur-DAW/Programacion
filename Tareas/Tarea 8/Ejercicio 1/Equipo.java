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
    private ArrayList<Jugador> jugadores;
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
        for(Jugador jugador : jugadores) {
            addJugador(jugador);
        }
    }
    
    public void addJugador(Jugador nuevoJugador)
    {
        if (buscarJugador(nuevoJugador.getNombre()) == null) return;
        
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
        for(Persona jugador : jugadores) {
            if(jugador.getNombre() == nombreJugador)
                return jugador;
        }
        return null;
    }
    
    public ArrayList<Persona> mejorPagado()
    {
        return null;
    }
    
    public void listarOrdenAlfabético()
    {
       Collections.sort(jugadores, new ComparadorNombre());
    }
    
    public void listarPorSueldo()
    {
        Collections.sort(jugadores, new ComparadorSueldo());
    }
    
    private void escribir(ArrayList<Persona> jugadores)
    {
        for(Persona jugador : jugadores) {
          System.out.println(jugador.getNombre());
        }
    }
    
    public Persona pichichi()
    {
        return Collections.max(jugadores, Comparator.comparing(j -> j.getGolesMarcados()));
    }
}
