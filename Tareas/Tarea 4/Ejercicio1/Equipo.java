
/**
 * Write a description of class Equipo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Equipo
{
    // instance variables - replace the example below with your own
    private String nombre;
    
    private Jugador jugador1;
    
    private Jugador jugador2;
    
    private Jugador jugador3;

    /**
     * Constructor for objects of class Equipo
     */
    public Equipo(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int cuantosJugadores()
    {
        int cantidad = 0;
        
        if (jugador1 != null)
        {
            cantidad++;
        }
        if (jugador2 != null)
        {
            cantidad++;
        }
        if (jugador3 != null)
        {
            cantidad++;
        }
        
        return cantidad;  
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addJugador(Jugador jugador)
    {
        if (equipoCompleto()) return;
        
        if (jugador1 == null)
        {
            jugador1 = jugador;
        } 
        else if (jugador2 == null)
        {
            jugador2 = jugador;
        }
        else if (jugador3 == null)
        {
            jugador3 = jugador;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean equipoCompleto()
    {
        if (cuantosJugadores() == 3) return true;
        
        return false;  
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addJugador(String nombre, double sueldo)
    {
        Jugador jugador = new Jugador(nombre, sueldo);
        
        addJugador(jugador);
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int pichichi()
    {
        if (jugador1 == null)
            return 0;
            
        if (jugador2 == null)
            return jugador1.getGoles();
            
        if (jugador1.getGoles() > jugador2.getGoles()) 
        {
            if (jugador3 == null || jugador1.getGoles() > jugador3.getGoles()) 
                return jugador1.getGoles();
        } else 
        {
            if (jugador3 == null || jugador2.getGoles() > jugador3.getGoles()) 
                return jugador2.getGoles();
        }
  
        return jugador3.getGoles();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void borrarPantalla()
    {
        System.out.print('\u000C');
    }
    
      /**
     * Valor del atributo nombre
     *
     * @param   
     * @return Atributo nombre
     */
    public void printEquipo() 
    {
        System.out.print(toString());
    }
    
    /**
     * Valor del atributo nombre
     *
     * @param   
     * @return Atributo nombre
     */
    public String toString() 
    {
        String string = "\n Equipo - " + nombre + "\n" + "Jugadores:" + "\n";
        
        if (jugador1 != null) 
            string = string + jugador1.toString();
            
        if (jugador2 != null) 
            string = string + jugador2.toString();
            
        if (jugador3 != null) 
            string = string + jugador3.toString();
        
        return string;
    }
}
