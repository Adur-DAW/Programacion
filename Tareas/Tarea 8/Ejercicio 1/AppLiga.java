
/**
 * Write a description of class AppLiga here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class AppLiga
{
    public static void main (String [ ] args) {
        Liga liga = new Liga("2022");
         
        try
        {
            liga.cargarDeFichero();
        }
        catch (java.io.FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        
        System.out.println("El equipo que contiene el pichichi de la liga es: " + liga.pichichi());
  
        Equipo equipo = new Equipo("Osasuna");
        Entrenador entrenador = new Entrenador("Adur Marques", 20, equipo);

        System.out.println("El nombre del equipo es: " + equipo.getNombre());
        
        Jugador jugador1 = new Jugador("Paula", 50, equipo);
        Jugador jugador2 = new Jugador("Adur", 25, equipo);
        Jugador jugador3 = new Jugador("Jon", 100, equipo);
        
        System.out.println("El nombre del primer jugador del equipo es: " + jugador1.getNombre() + "\n");
                    
        jugador1.setGolesMarcados(20);   
        jugador2.setGolesMarcados(10);  
        jugador3.setGolesMarcados(30);  

        System.out.println("Paula ha metido " + jugador1.getGolesMarcados() + " goles");
        System.out.println("Adur ha metido " + jugador2.getGolesMarcados() + " goles");
        
        Jugador[] jugadores = new Jugador[3];
        jugadores[0] = jugador1;
        jugadores[1] = jugador2;
        jugadores[2] = jugador3;
        
        equipo.addJugadores(jugadores);
        
        System.out.println("\n Los jugadores ordenados por sueldo:");
        equipo.listarPorSueldo();
        System.out.println("\n Los jugadores ordenados por orden alfabético:");
        equipo.listarOrdenAlfabético();
        
        System.out.println("\n Jon ha metido " + equipo.golesDe("Jon") + " goles");
        
        System.out.println("El pichichi del equipo es " + equipo.pichichi().getNombre());
    }
}
