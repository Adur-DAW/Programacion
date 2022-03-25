
/**
 * Write a description of class Entrenador here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Entrenador extends Persona
{
    private Equipo equipo;

    /**
     * Constructor for objects of class Entrenador
     */
    public Entrenador(String nombre, int sueldo, Equipo equipo)
    {
        super(nombre, sueldo);
        
        this.equipo = equipo;
    }

    public void setEquipo(Equipo nuevoEquipo)
    {
        equipo = nuevoEquipo;
    }
    
    public Equipo getEquipo()
    {
        return equipo;
    }
    
    //TO STRING
}
