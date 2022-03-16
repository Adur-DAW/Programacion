
/**
 * Write a description of class Fecha here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Fecha
{
    // instance variables - replace the example below with your own
    private int dia;
    private int mes;
    private int año;

    /**
     * Constructor for objects of class Fecha
     */
    public Fecha(int dia, int mes, int año)
    {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getDia()
    {
        return dia;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getMes()
    {
        return mes;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getAño()
    {
        return año;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public boolean equals(Object fecha)
    {
        return false;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String toString()
    {
        return getDia() + "/" + getMes() + "/" + getAño();
    }
}
