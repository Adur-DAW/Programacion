import java.util.Arrays;

/**
 * Write a description of class Vagon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vagon
{
    // instance variables - replace the example below with your own
    private int x;
    private int identificador; // Vagon 1,2,3,4
    private double[] asientos;
    private int asientoSiguiente;
    
    /**
     * Constructor for objects of class Vagon
     */
    public Vagon(int numeroAsientos)
    {
        // Crear asientos dependiendo de numeroAsientos
        inicializarAsientos(numeroAsientos);
    }
    
    private int[] inicializarAsientos(int numeroAsientos)
    {
        asientoSiguiente = 0;
        
        asientos = new double[numeroAsientos];
        
        /*  También se puede hacer así
         Arrays.fill(asientos, -1); 
        */
        
        for(int i = 0; asientos.length > i; i++) 
            asientos[i] = -1;
            
        return null;
    }
    
    public int getCapacidad()
    {
        return asientos.length;
    }
    
    public void printDetallesVagon()
    {
        System.out.println(textToString());
    }

    public String textToString()
    {
        return "Vagón " + identificador + " - Capacidad " + getCapacidad();
    }
    
    public void printTicket(int numeroAsiento)
    {
        if (numeroAsiento > getCapacidad() - 1) return;
        
        System.out.println(
            textToString() + "\n" 
            + "Nº asiento - " + numeroAsiento + "\n" 
            + "Precio: " + asientos[numeroAsiento]
        );
    }
    
    public double reembolsarAsiento(int numeroAsiento)
    {
        if (numeroAsiento >= 0 && asientos[numeroAsiento] >= 0)
            return asientos[numeroAsiento] = -1;
        
        return 0;
    }
    
    public boolean reservarSiguienteAsiento()
    {
        asientos[asientoSiguiente] = (asientoSiguiente * 2.5) + 1;
        
        asientoSiguiente++;
        
        return (asientoSiguiente + 1 < getCapacidad());
    }
    
    public double getPrecioMedio()
    {
        int precioTotal = 0;
        int dividir = 0;
        
        for(double asiento: asientos)
        {
            if (asiento >= 0)
            {
                dividir++;
                precioTotal += asiento;
            }
                
        }
        
        if (dividir == 0) return 0;

        return precioTotal / dividir;
    }
}
