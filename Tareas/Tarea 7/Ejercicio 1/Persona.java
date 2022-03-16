import java.util.List;
import java.util.ArrayList;

/**
 * Abstract class Persona - write a description of the class here
 * 
 * @author: Adur Marques Herrero
 * Date: 
 */
public abstract class Persona
{
    String nombre;
    ArrayList<Telefono> telefonos = new ArrayList<Telefono>();

    /**
     * Constructor for objects of class Profesor
     */
    public Persona(String nombre)
    {
        this.nombre = nombre;
    }
    
    /**
     * Devuelve el nombre de la persona (Estudiante/Profesor)
     * 
     * @param
     * @return String
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Devuelve la lista de números de la persona
     * 
     * @param 
     * @return String
     */
    public String getListaNumeros()
    {
        String listaTelefonos = "";
        
        for(Telefono telefono: telefonos)
        {
            listaTelefonos = listaTelefonos + telefono.toString() + " ";
        }

        return listaTelefonos;
    }
    
    /**
     * Añade un número de telefono a la persona
     * 
     * @param  Telefono
     * @return boolean
     */
    public boolean addTelefono(Telefono telefono)
    {
        return telefonos.add(telefono);
    }
    
    /**
     * Devuelve cuantos números de teléfono tiene la persona
     * 
     * @param
     * @return int
     */
    public int cuantosTelefonos()
    {
        return telefonos.size();
    }
    
    public int hashCode()
    {
        return getNombre().hashCode();
    }
    
    public boolean equals(Object persona)
    {
        /* No se si tengo que comprar la clase de los objectos o utilizar el equals
            persona.getClass() == this.getClass()
            persona.equals(this)
        */
        
        return ((Persona) persona).getNombre() == getNombre();
    }
    
    public String toString()
    {
        String utilizaOrdenador = new String();
        
        if(this instanceof Estudiante) 
            utilizaOrdenador = ((Estudiante)this).utilizaOrdenador();
        else
            utilizaOrdenador = ((Profesor)this).utilizaOrdenador();
        
        return "Clase: " + this.getClass().getSimpleName() + " - " + this.getNombre() + "\n" + this.getListaNumeros() + "\n" + utilizaOrdenador + "\n";
    }
}
