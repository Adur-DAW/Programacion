import java.util.Comparator;

/**
 * Write a description of class ComparadorSueldo here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class ComparadorSueldo implements Comparator<Persona> {
    
      @Override
      public int compare(Persona p1, Persona p2) {
         return new Integer(p1.getSueldo()).compareTo(p2.getSueldo());
      }
}
