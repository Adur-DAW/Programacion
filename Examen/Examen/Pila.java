import java.util.Arrays;

/**
 * Clase Pila
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Pila
{
    private Entero[] elementos;
    private int top;
    
    /**
     * Constructor para los elementos de la clase Pila
     */
    public Pila(int cantidadElementos)
    {
        this.top = 0;

        elementos = new Entero[cantidadElementos];
    }

    /**
     * Indica si la pila está o no vacía
     * 
     * @param
     * @return boolean - True o False dependiendo si la lista está vacía o no
     */
    public boolean estaVacia()
    {
        return (top == 0);
    }
    
    /**
     * Indica si la pila está o no llena
     * 
     * @param
     * @return boolean - True o False dependiendo si la lista está llena o no
     */
    public boolean estaLlena()
    {
        if (elementos == null) return false;
        
        return (top - 1 == elementos.length - 1);
    }
    
    /**
     * Devuelve el objeto que está en la cumbre sin modificar la pila
     * 
     * @param
     * @return Entero que está en la cumbre
     */
    public Entero getCumbre()
    {
        if (estaVacia())
        {
            System.out.println("Pila vacía");
            return null;
        }
        
        return elementos[top - 1];
    }
    
    /**
     * Saca de la pila el elemento apuntado por la cumbre y lo devuelve
     * 
     * @param
     * @return Entero eliminado
     */
    public Entero pop()
    {
        if (estaVacia())
        {
            System.out.println("Pila vacía");
            return null;
        }
        
        Entero elementoBorrado = getCumbre();
        
        for (int i = 0; i < top - 1; i++) {
            elementos[i] = elementos[i + 1];
        }

        elementos[top - 1] = null;
        
        top--;
        
        return elementoBorrado;
    }
    
    /**
     * Añade un nuevo elemento a la pila lo que supone una cambio de estado de la pila
     * 
     * @param Nuevo valor Entero a añadir al array elementos
     * @return
     */
    public void push(Entero valor)
    {
       if (estaLlena())
       {
            System.out.println("Pila llena");
            return;
       }
       
       elementos[top] = valor;
       
       top++;
    }
    
    /**
     * Devuelve el array de Entero
     * 
     * @param
     * @return array de Entero
     */
    public Entero[] consultarElementos()
    {
        return elementos;
    }
}
