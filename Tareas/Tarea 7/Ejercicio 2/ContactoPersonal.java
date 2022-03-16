import java.util.Calendar;

/**
 * Write a description of class ContactoPersonal here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class ContactoPersonal extends Contacto
{
    private Fecha fechaNacimiento;

    /**
     * Constructor for objects of class ContactoPersonal
     */
    public ContactoPersonal(String nombre, String telefono, int dia, int mes, int año)
    {
        super(nombre, telefono);
        
        fechaNacimiento = new Fecha(dia, mes, año);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getFechaCumpleaños()
    {
        return fechaNacimiento.getDia() + "/" + fechaNacimiento.getMes() + "/" + fechaNacimiento.getAño();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getFirmaEmail()
    {
        return "Con cariño, adios";
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean esCumpleaños()
    {
        Calendar cal = Calendar.getInstance();
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH);
        
        return (fechaNacimiento.getDia() == dia && fechaNacimiento.getMes() == mes);
    }
}
