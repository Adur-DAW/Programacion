import java.util.ArrayList;

/**
 * Write a description of class Equipo here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Equipo
{
    private String nombre;
    private ArrayList<Persona> jugadores;
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
    
    public void addJugadores(Jugador[] jugadores)
    {
        
    }
    
    public int golesDe(String nombrePersona)
    {
        return 1;
    }
    
    private Persona buscarJugador(String nombreJugador)
    {
        return null;
    }
    
    public ArrayList<Persona> mejorPagado()
    {
        return null;
    }
    
    public void listarOrdenAlfabético()
    {
       
    }
    
    public void listarPorSueldo()
    {
        
    }
    
    private void escribir(ArrayList<Persona> jugadores)
    {
        
    }
    
    public Persona pichichi()
    {
        return null;
    }
}
