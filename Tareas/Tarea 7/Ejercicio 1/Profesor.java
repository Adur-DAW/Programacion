
/**
 * Write a description of class Profesor here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Profesor extends Persona implements Conferenciante
{
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
     * Devuelve para que utiliza el ordenador el Profesor
     * 
     * @param 
     * @return String
     */
    public String utilizaOrdenador()
    {
        return "El profesor " + getNombre() + " utiliza el ordenador para poner notas";
    }
    
    /**
     * Devuelve que día tiene conferencia el profesor
     * 
     * @param
     * @return String
     */
    public String diaConferencia()
    {
        return dia.toString();
    }
}
