
/**
 * Write a description of class Jugador here.
 * 
 * @author Adur Marques Herrero
 * @version (a version number or a date)
 */
public class Jugador
{
    // instance variables - replace the example below with your own
    private int x;
    
    private String nombre;
    
    private double sueldo;
    
    private int golesMarcados;

    /**
     * Constructor
     */
    public Jugador(String nombre, double sueldo)
    {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    /**
     * Valor del atributo nombre
     *
     * @param   
     * @return Atributo nombre
     */
    public String getNombre() 
    {
        return nombre;
    }
    
    /**
     * Valor del atributo sueldo
     *
     * @param   
     * @return Atributo sueldo
     */
    public double getSueldo() 
    {
        return sueldo;
    }
    
    /**
     * Valor del atributo golesMarcados
     *
     * @param   
     * @return Atributo golesMarcados
     */
    public int getGoles() 
    {
        return golesMarcados;
    }
    
    
    /**
     * Valor del atributo golesMarcados
     *
     * @param   
     * @return Atributo golesMarcados
     */
    public void marcarGol()
    {
        golesMarcados = golesMarcados + 1;
    }
    
  
    /**
     * Valor del atributo nombre
     *
     * @param   
     * @return Atributo nombre
     */
    public String toString() 
    {
        return "\n Nombre:" + getNombre() + "\n Sueldo:" + getSueldo() + "\n Goles:" + getGoles() + "\n";
    }
}
