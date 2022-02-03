
/**
 *  Clase Entero
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Entero
{
    private int val;

    /**
     * Constructor for objects of class Entero
     */
    public Entero(int val)
    {
        this.val = val;
    }

    /**
     *  Retorna el valor INT de val
     * 
     * @param
     * @return El valor de Val
     */
    public int getValor()
    {
        return val;
    }
    
    /**
     * Asigna el valor INT de val
     * 
     * @param Valor INT que se va a asignar a la propiedad Val
     * @return void
     */
    public void setValor(int nuevoValor)
    {
         val = nuevoValor;
    }
}
