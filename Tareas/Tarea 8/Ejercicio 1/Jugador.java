
/**
 * Write a description of class Jugador here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Jugador extends Persona
{
    private int golesMarcados;

    /**
     * Constructor for objects of class Jugador
     */
    public Jugador(String nombre, int sueldo, Equipo equipo)
    {
        super(nombre, sueldo);
    }

    public void setGolesMarcados(int golesMarcadosJugador)
    {
        golesMarcados = golesMarcadosJugador;
    }
    
    public int getGolesMarcados(int y)
    {
        return golesMarcados;
    }
}
