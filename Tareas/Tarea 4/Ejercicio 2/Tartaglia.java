
/**
 * Write a description of class Tartaglia here.
 * 
 * @author Adur Marques 
 * @version 1.0.0 29/11/2021
 */
public class Tartaglia
{
    // instance variables - replace the example below with your own
    private int filas;
    
    private NumeroCombinatorio nc;

    /**
     * Constructor for objects of class Tartaglia
     */
    public Tartaglia(int filas)
    {
        this.filas = filas;
    }
    
    /**
     * Constructor for objects of class Tartaglia
     */
    public Tartaglia()
    {
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int getFilas()
    {
        return filas;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void setFilas(int filas)
    {
        this.filas = filas;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void dibujar()
    {
        int[] a = new int[1];
        
        for (int i = 1; i <= getFilas(); i++) {
            
            int[] x = new int[i];
            
            for (int e = 0; e < i; e++) {
                
                if (e == 0 || e == (i - 1)) {
                    x[e] = 1;
                } else {
                    x[e] = a[e] + a[e - 1];
                }
                
                System.out.print(x[e] + " ");
            }
            
            a = x;
            System.out.println();
        }
    }
}
