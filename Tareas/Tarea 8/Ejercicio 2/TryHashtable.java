import java.util.Hashtable;
import java.util.Enumeration;

/**
 * Write a description of class TryHashTable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TryHashtable {
    
    public static void main(String[] args) {
        Hashtable nominas = new Hashtable();
        nominas.put(new Persona("Josean", "Pérez",
        12), new Nomina(12, 34.56, 23, 5));
        nominas.put(new Persona("Angel", "Goñi",
        13), new Nomina(43, 31.58, 10, 2));
        nominas.put(new Persona("Manuel", "Irigoyen",
        24), new Nomina(43, 32, 54, 8));
        nominas.put(new Persona("Ioseba", "Errazu",
        25), new Nomina(12, 73, 31, 20));
        //Recibir un objeto Nomina
        Nomina n1 = (Nomina)nominas.get(new Persona("Manuel", "Irigoyen",24));
        //Recibir todas las claves utilizadas
        for (Enumeration e = nominas.keys(); e.hasMoreElements();)
        {
            Persona p = (Persona)e;
            System.out.println("La persona:");
            System.out.println(p.getNombre());
            System.out.println(p.getApellido());
            System.out.println(p.getDni());
            Nomina n2 = (Nomina)nominas.get(p);
            System.out.println("Tiene la nomina:");
            System.out.println(n2.getSueldoBase());
            System.out.println(n2.getPrimas());
            System.out.println(n2.getComisiones());
            System.out.println(n2.getRetenciones()) ;
        }
    }
}
