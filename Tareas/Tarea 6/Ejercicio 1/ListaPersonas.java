import java.util.ArrayList;
import java.util.List;
import java.util.Calendar;
import java.util.Iterator;

/**
 * Write a description of class ListaPersonas here.
 * 
 * @author Adur Marques
 * @version 1.0.0
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
     * Añadir una persona al ArrayList
     * 
     * @param  Persona
     * @return  void
     */
    public void addPersona(Persona persona) throws Exception
    {
        if (persona == null) 
            throw new Exception("La persona no puede ser NULA");
        
        listaPersonas.add(persona);
    }
    
    /**
     * Utilizando un foreach borrar todas las personas solteras
     * 
     * @return ArrayList<Persona>
     */
    public ArrayList<Persona> borrarSolteros()
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
     * Utilizando el iterador de ArrayList obtener la cantidad de personas divorciadas
     * 
     * @return int
     */
    public int cuantosDivorciados()
    {
        int cantidadPersonasDivorciadas = 0;
        
        Iterator<Persona> iterador = listaPersonas.iterator();
            
        while (iterador.hasNext()) {
           if (iterador.next().getEstadoCivil() == EstadoCivil.DIVORCIADO)
                 cantidadPersonasDivorciadas++;
        }
 
        return cantidadPersonasDivorciadas;
    }
    
    /**
     * Obtener la cantidad de personas que cumplen en determinado mes
     * 
     * @param  int
     * @return int
     */
    public int cumplenEnMes(int mes)
    {
        int cantidadPersonasCumplenEnMes = 0;
        
        Iterator<Persona> iterador = listaPersonas.iterator();
            
        while (iterador.hasNext()) {
           if (iterador.next().getFechaNacimiento().get(Calendar.MONTH) == mes)
                 cantidadPersonasCumplenEnMes++;
        }
 
        return cantidadPersonasCumplenEnMes;
    }
    
    /**
     * Obtener la cantidad total de personas en el ArrayList ListaPersonas
     * 
     * @return int
     */
    public int cuantasPersonas()
    {
        return listaPersonas.size();
    }
    
    /**
     * Obtener la persona más joven de la lista ListaPersonas
     * 
     * @return Persona
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
     * Mostrar las personas
     * 
     * @return void
     */
    public void printPersonas()
    {
         System.out.println(toString());
    }
    
    /**
     *
     * 
     * @return String
     */
    public String toString()
    {
        String texto = "";
        
        for (Persona persona: listaPersonas)
            texto = persona.toString() + "\r\n"; 

        return texto;
    }
}
