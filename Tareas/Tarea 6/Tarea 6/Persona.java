import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.SimpleDateFormat;

/**
 * Write a description of class Persona here.
 * 
 * @author Adur Marques
 * @version 1.0.0
 */
public class Persona
{
    private String nombre;
    private EstadoCivil estadoCivil;
    private Calendar fechaNac;
    
    /**
     * Constructor for objects of class Persona
     */
    public Persona(int dia, int mes, int ano, String nombre, EstadoCivil estadoCivil)
    {
        this.nombre = nombre;
        this.estadoCivil = estadoCivil;
        this.fechaNac = asignarFecha(dia, mes, ano);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private Calendar asignarFecha(int dia, int mes, int ano)
    {
        Calendar calendario = GregorianCalendar.getInstance();
        calendario.set(dia, mes, ano);
        
        return calendario;
    }
    
    public String getNombre()
    {
        return nombre.substring(0,1) + ". " + nombre.split(" ")[1];
    }
    
    public EstadoCivil getEstadoCivil()
    {
        return estadoCivil;
    }
    
    public String getEstadoCivilToString()
    {
        return estadoCivil.toString();
    } 
    
    public Calendar getFechaNacimiento()
    {
        return fechaNac;
    }
    
    public SimpleDateFormat getFecha()
    {
        return new SimpleDateFormat("dd/mm/yyyy");
    }
    
    public boolean masJovenQue(Persona persona)
    {
        return persona.getFechaNacimiento().compareTo(getFechaNacimiento()) > 0;
    }
    
    public String toString()
    {
        return "/n Nombre: " + getNombre() + "/n" + "Estado Civil: " + getEstadoCivil() + "/n" + "Fecha nacimiento: " + getFechaNacimiento();
    }
}
