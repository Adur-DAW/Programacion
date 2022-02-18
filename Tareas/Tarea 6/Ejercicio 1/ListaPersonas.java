import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class ListaPersonas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ListaPersonas
{
    // instance variables - replace the example below with your own
    private ArrayList<Persona> listaPersonas;

    /**
     * Constructor for objects of class ListaPersonas
     */
    public ListaPersonas()
    {
        listaPersonas = new ArrayList<Persona>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addPersona(Persona persona) throws Exception
    {
        if (persona == null) 
            throw new Exception("La persona no puede ser NULA");
        
        listaPersonas.add(persona);
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public ArrayList borrarSolteros()
    {
        ArrayList<Persona> listaPersonasEliminar = new ArrayList<Persona>();
        
        listaPersonas.forEach(persona -> {
            if (persona.getEstadoCivil() == EstadoCivil.SOLTERO)
                 listaPersonasEliminar.add(persona);
        });
        
        listaPersonas.removeAll(listaPersonasEliminar);
        
        return listaPersonasEliminar;
        
        // Otra forma de hacerlo
        //listaPersonas.removeIf(persona -> persona.getEstadoCivil() == EstadoCivil.SOLTERO);
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int cuantosDivorciados()
    {
        return 69;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int cumplenEnMes(int mes)
    {
        return 69;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int cuantasPersonas()
    {
        return listaPersonas.size();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Persona masJoven()
    {
        if (listaPersonas.isEmpty()) return null;
        
        listaPersonas.sort((Persona persona1, Persona persona2) -> {
           if (persona1.masJovenQue(persona2))
             return 1;
           if (persona2.masJovenQue(persona1))
             return -1;
             
           return 0;
        });

        return listaPersonas.get(0);
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void printPersonas()
    {
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        return "Guapo";
    }
}
