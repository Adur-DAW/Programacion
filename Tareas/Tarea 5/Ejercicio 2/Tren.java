import java.util.Arrays;

/**
 * Write a description of class Tren here.
 * 
 * @author Adur Marques Herrero
 * @version (a version number or a date)
 */
public class Tren
{
    // instance variables - replace the example below with your own
    private Vagon[] vagones = new Vagon[0];
    private int ultimoVagon = 0;
    
    static final int MAX_VAGONES = 10; 

    /**
     * Constructor for objects of class Tren
     */
    public Tren()
    {
    }

    public int getNumeroVagones()
    {
        return vagones.length;
    }
    
    public void anadirVagon(Vagon vagon)
    {
        if (vagon == null || ultimoVagon == MAX_VAGONES) return;

        Vagon[] nuevaListaVagones = Arrays.copyOf(vagones, vagones.length+1);
        nuevaListaVagones[vagones.length] = vagon;
       
        vagones = nuevaListaVagones;
    }
    
    public Vagon borrarVagon(int posicionVagonBorrar)
    {
        if (posicionVagonBorrar == 0 && vagones.length == 1)
            vagones = new Vagon[0];
            
        if (posicionVagonBorrar < 0 
        || posicionVagonBorrar >= vagones.length 
        || posicionVagonBorrar == 0 && vagones.length == 1
        ) return null;
    
        Vagon[] vagones2 = new Vagon[vagones.length - 1];
        
        Vagon vagonBorrado = vagones[posicionVagonBorrar];
        
        for (int i = posicionVagonBorrar; i < vagones.length - 1; i++) {
            vagones2[i] = vagones[i + 1];
        }
        
        vagones = vagones2;
        
        return vagonBorrado;
    }
    
    public void printListaVagones()
    {
        if (vagones.length == 0) {
            System.out.println("El tren no tiene ningún vagón");
            return;
        }
            
        for (Vagon vagon: vagones)
        {
            System.out.println(vagon.textToString() + "\n");
        }
    }
    
    public boolean emitirTicket()
    {
        boolean seHaPodidoReservar = false;
        
        for (Vagon vagon: vagones)
        {
            if (vagon.reservarSiguienteAsiento()) 
            {
                seHaPodidoReservar = true;
                break;
            }
                
        }
        
        return seHaPodidoReservar;
    }
    
    public Vagon[] ordenarVagones()
    {
        Vagon[] vagones2 = new Vagon[0];
        
        for (int i = 0; i < vagones.length; i++)
        {
            int indiceVagonConMasCapacidad = buscarIndiceDelMayor();
            
            Vagon[] nuevaListaVagones = Arrays.copyOf(vagones2, vagones2.length+1);
            nuevaListaVagones[vagones2.length] = vagones[indiceVagonConMasCapacidad];
           
            vagones2 = nuevaListaVagones;
        
            borrarVagon(indiceVagonConMasCapacidad);
        }
        
        vagones = vagones2;
        
        return vagones;
    }
    
    private int buscarIndiceDelMayor() 
    {
        int vagonConMasCapacidad = 0;
        int maximaCapacidadEncontrada = 0;
        
        for (int i = 0; i < vagones.length; i++)
        {
            int capacidadDelVagon = vagones[i].getCapacidad();
            
            if (capacidadDelVagon >= maximaCapacidadEncontrada) 
            {
                maximaCapacidadEncontrada = capacidadDelVagon;
                vagonConMasCapacidad = i;
            }
        }
        
        System.out.println(String.valueOf(maximaCapacidadEncontrada) + "\n");
        
        return vagonConMasCapacidad;
    }
    
    public void ordenarVagonesPorSeleccionDirecta()
    {
        // ordena todos los vagones del tren en base a su capacidad, de mayor a menor capacidad, 
        // utilizando el método de ordenación por selección directa.
    }
}
