import java.util.Comparator;

/**
 * Write a description of class ComparadorSueldo here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class ComparadorNombre implements Comparator<Persona> {
    
      @Override
      public int compare(Persona p1, Persona p2) {
         return p1.getNombre().compareTo(p2.getNombre());
      }
}