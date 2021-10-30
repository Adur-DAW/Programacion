
/**
 * Ejercicio 2 de la Tarea 3 de Programación
 * 
 * @author Adur Marques
 * @version 1.0.0
 */
public class CartaBaraja
{
    private int palo;
    private int valor;

    final int OROS = 1;
    final int COPAS = 2;
    final int ESPADAS = 3;
    final int BASTOS = 4;
    
    /**
     * Constructor for objects of class CartaBaraja
     */
    public CartaBaraja(int queValor, int quePalo)
    {
        this.valor = queValor;
        this.palo = quePalo;
    }
    
    
    public String getPalo() 
    {
        switch(this.palo) {
            case OROS:
                return "Oros";
            case COPAS:
                return "Copas";
            case ESPADAS:
                return "Espadas";
            case BASTOS:
                return "Bastos";
            default:
                return "";
        }
    }
    
    public String getValor() 
    {
        if (this.valor == 1) return "As";
        if (this.valor == 2) return "Dos";
        if (this.valor == 3) return "Tres";
        if (this.valor == 4) return "Cuatro";
        if (this.valor == 5) return "Cinco";
        if (this.valor == 6) return "Seis";
        if (this.valor == 7) return "Siete";
        if (this.valor == 8) return "Ocho";
        if (this.valor == 9) return "Nueve";
        if (this.valor == 10) return "Sota"; 
        if (this.valor == 8) return "Caballo";
        if (this.valor == 9) return "Rey";

        return "";
    }
    
    public String toString() 
    { 
        return this.getValor() + " de " + this.getPalo();
    }
}
