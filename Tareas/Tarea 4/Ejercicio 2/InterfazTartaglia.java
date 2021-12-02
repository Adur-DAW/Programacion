import java.util.Scanner;

/**
 * Write a description of class InterfazTartaglia here.
 * 
 * @author Adur Marques
 * @version (a version number or a date)
 */
public class InterfazTartaglia
{
    // instance variables - replace the example below with your own
    private char SI = 's';
    
    private Scanner teclado;
    
    private Tartaglia triangulo;

    /**
     * Constructor for objects of class InterfazTartaglia
     */
    public InterfazTartaglia()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void ejecutar()
    {
        Tartaglia triangulo = new Tartaglia();
        
        triangulo.setFilas(leerFilas());
            
        triangulo.dibujar();
        
        if (continuar() == SI) ejecutar();
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private int leerFilas()
    {
        teclado = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int filas = teclado.nextInt();
        
        return filas;
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private char continuar()
    {
        teclado = new Scanner(System.in);
        System.out.print("¿Desea continuar? S/N ");
        return teclado.next().charAt(0);
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private void borrarPantalla()
    {
        System.out.print('\u000C');
    }
}
