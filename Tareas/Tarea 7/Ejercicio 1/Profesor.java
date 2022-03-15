
/**
 * Write a description of class Profesor here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Profesor extends Persona implements Conferenciante
{
    // instance variables - replace the example below with your own
    private Dia dia;

    /**
     * Constructor for objects of class Profesor
     */
    public Profesor(String nombre, Dia dia)
    {
        super(nombre);
        dia = dia;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String utilizaOrdenador()
    {
        return "El profesor " + getNombre() + " utiliza el ordenador para poner notas";
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String diaConferencia()
    {
        return dia.toString();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public boolean equals(Object persona)
    {
        return false;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y    a sample parameter for a method
     * @return        the sum of x and y 
     */
    public String toString(Persona persona)
    {
        return "";
    }
}
