import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Write a description of class AgendaContactos here.
 * 
 * @author Adur Marques 
 * @version 1.0.0
 */
public class AgendaContactos implements Visualizable
{
    private HashMap<Character, ArrayList<Contacto>> agenda;

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
    public void mostrar()
    {
        Contacto contactoBlanca = new ContactoPersonal("Adur Marques", "948123456", 15, 4, 1970);
        Contacto contactoBeltran = new ContactoProfesional("Beltrán Iriarte", "948456677", "Empresa 01 D.A.");
        Contacto contactoDavid = new ContactoProfesional("David Alsúa", "948223344", "Empresa 02 S.L.");
        Contacto contactoPepa = new ContactoPersonal("Pepa", "675435672", 15, 4, 1980);
        Contacto contactoPablo = new ContactoPersonal("Pablo", "678897543", 12, 7, 1980);
        
        añadirContacto(contactoBlanca);
        añadirContacto(contactoBeltran);
        añadirContacto(contactoDavid);
        añadirContacto(contactoPepa);
        añadirContacto(contactoPablo);
        
        agenda.forEach((clave, contactos) -> {
            if (hayValores(contactos))
            {
               System.out.println(clave);
               
               contactos.forEach(contacto -> {
                   System.out.println("Nombre: " + contacto.getNombre());
                   System.out.println("Teléfono: " + contacto.getTelefono());
                   System.out.println(contacto.toString());
                   
                   if (contacto.getClass().getSimpleName() == "ContactoPersonal")
                       System.out.println(((ContactoPersonal)contacto).getFechaCumpleaños());
                   else
                       System.out.println(((ContactoProfesional)contacto).getNombreEmpresa());
               });
            }
    });
    }
    
    /**
     * 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void inicializarMap()
    {
        agenda = new HashMap<Character, ArrayList<Contacto>>();
        
        char[] cadena = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'Q', 'L', 'M', 'N', 'Ñ', 'O', 'P', 'K', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        
        agenda = new HashMap<Character, ArrayList<Contacto>>() {
            {
                for (char ch: cadena) put(ch, new ArrayList<Contacto>()); 
            }
        };
    }
    
    /**
     * Añade el contacto a la agenda en la letra correspondiente. Previamente se comprueba que no haya otro igual.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void añadirContacto(Contacto contacto)
    {
        char primeraLetra = contacto.getPrimeraLetra();
        ArrayList<Contacto> contactos = agenda.get(primeraLetra);
        contactos.add(contacto);
        
        if (buscarContacto(contacto.getNombre()).size() > 1) return;
        
        agenda.put(primeraLetra, contactos);
    }
    
    /**
     * Localiza el/los contacto/s dado un nombre.
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public ArrayList<Contacto> buscarContacto(String nombre)
    {
        char primeraLetra = nombre.charAt(0);
        
        ArrayList<Contacto> contactos = agenda.get(primeraLetra);
        ArrayList<Contacto> contactosEncontrados = new ArrayList<Contacto>();
        
        for (Contacto contacto : contactos){
            if (contacto.getNombre().contains(nombre))
               contactosEncontrados.add(contacto);
        }
        
        return contactosEncontrados;
    }
    
    /**
     * Localiza el/los contacto/s dado un contacto
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public List<Contacto> buscarContacto(Contacto contactoABuscar)
    {
        String nombre = contactoABuscar.getNombre();
        
        return buscarContacto(nombre);
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
    private List<ContactoPersonal> localizarCumpleaños(List<Contacto> contactosLetra)
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
    private boolean hayValores(ArrayList<Contacto> valores)
    {
        return valores.size() > 0;
    }
    
    /**
     * Devuelve el total de contactos que hay en la agenda
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int totalContactos()
    {
        return totalContactosList().size();
    }
    
    /**
     * Devuelve el total de contactos personales que hay en la agenda
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int totalContactosPersonales()
    {
        int cantidadContactos = 0;
        
        for (Contacto contacto : totalContactosList()) {
            if (contacto.getClass().getSimpleName() == "ContactoPersonal")
            {
                cantidadContactos++;
            }  
        }
        
        return cantidadContactos;
    }
    
    /**
     * Devuelve el total de contactos personales que hay en la agenda
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private ArrayList<Contacto> totalContactosList()
    {
        ArrayList<Contacto> contactosDevolver = new ArrayList<Contacto>();
        
        for (var entry : agenda.entrySet()) {
            ArrayList<Contacto> contactos = entry.getValue();
            
            if (hayValores(contactos))
            {
                contactos.forEach(contacto -> 
                    contactosDevolver.add(contacto)
                );
            }  
        }
        
        return contactosDevolver;
    }
    
    /**
     * Devuelve un array con los contactos personales ordenados alfabéticamente en la letra indicada. 
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Contacto[] contactosPersonalesEn(char letra)
    {
        ArrayList<Contacto> contactosDevolver = new ArrayList<Contacto>();
        
        for (var entry : agenda.entrySet()) {
            ArrayList<Contacto> contactos = entry.getValue();
            
            if (hayValores(contactos))
                contactos.forEach(contacto -> contactosDevolver.add(contacto));
        }
        
        Contacto[] arr = new Contacto[contactosDevolver.size()];
        
        for (int i = 0; i < contactosDevolver.size(); i++) {
             arr[i] = contactosDevolver.get(i);
        }
        
        return arr;
    }
}
