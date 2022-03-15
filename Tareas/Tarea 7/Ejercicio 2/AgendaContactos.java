import java.util.List;
import java.util.Map;
import java.util.ArrayList;

/**
 * Write a description of class AgendaContactos here.
 * 
 * @author Adur Marques 
 * @version 1.0.0
 */
public class AgendaContactos
{
    private Map<String, ArrayList> agenda;

    /**
     * Constructor for objects of class AgendaContactos
     */
    public AgendaContactos()
    {
       inicializarMap();
    }

    /**
     * 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void inicializarMap()
    {
        for (char c = 'A'; c <= 'Z'; ++c) 
          agenda.put(String.valueOf(c), new ArrayList()); 
    }
    
    /**
     * Añade el contacto a la agenda en la letra correspondiente. Previamente se comprueba que no haya otro igual.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void añadirContacto(Contacto contacto)
    {
    }
    
    /**
     * Localiza el/los contacto/s dado un nombre.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public List<Contacto> buscarContacto(String nombre)
    {
        return null;
    }
    
    /**
     * Localiza el/los contacto/s dado un contacto
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public List<Contacto> buscarContacto(Contacto contacto)
    {
        return null;
    }
    
    /**
     * Borra un contacto
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void borrarContacto(Contacto contacto)
    {
    }
    
    /**
     * Devuelve un listado de contactos personales a los que hay que felicitar porque hoy es su cumpleaños
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public List<ContactoPersonal> felicitar()
    {
        //Puedes ayudarte del método privado localizarCumpleaños()
        return null;
    }
    
    /**
     * Método privado de ayuda que dada la lista de contactos de una letra devuelve los contactos personales que cumplen años hoy
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public List<ContactoPersonal> localizarCumpleaños(List<Contacto> contactosLetra)
    {
        return null;
    }
    
    /**
     * Representación textual de la agenda
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        return null;
    }
    
    /**
     * Método privado de ayuda que dada una lista de contactos indica si está o no vacía.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private boolean hayValores(List<Contacto> valores)
    {
        return false;
    }
    
    /**
     * Devuelve el total de contactos que hay en la agenda
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int totalContactos()
    {
        return 1;
    }
    
    /**
     * Devuelve el total de contactos personales que hay en la agenda
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int totalContactosPersonales()
    {
        return 1;
    }
    
    /**
     * Devuelve un array con los contactos personales ordenados alfabéticamente en la letra indicada. 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Contacto[] contactosPersonalesEn(char letra)
    {
        //Crea localmente una colección ordenada y luego convierte esa colección en un array con toArray()
        return null;
    }
    
    // La agenda es un elemento que se puede visualizar en pantalla. Cualquier elemento visualizable implementa el interfaz Visualizable que incluye un único método, void mostrar().
}
