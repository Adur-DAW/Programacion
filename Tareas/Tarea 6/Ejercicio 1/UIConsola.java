import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class UIConsola here.
 * 
 * @author Adur Marques
 * @version (a version number or a date)
 */
public class UIConsola
{
    // instance variables - replace the example below with your own
    private int x;
    
    private final String FIN = "FIN";

    /**
     * Constructor for objects of class UIConsola
     */
    public UIConsola()
    {
    }

    /**
     * Crear las personas y mostrarlas
     * 
     * @return void
     */
    public void iniciar()
    {
        ListaPersonas listaPersonas = new ListaPersonas();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca en cada linea los datos de una persona: /r/n");
        System.out.println("La coma (,) es el separador entre los datos. /r/n");
        System.out.println("Formato: <nombre y apellidos>, <estado civil en mayúsculas>, <dia>, <mes>, <año> /r/n");
        System.out.println("Para terminar, teclee FIN /r/n");
        
        while(true)
        {
            String texto = sc.nextLine();
            
            Persona persona = crearPersona(texto);
            
            try
            {
                listaPersonas.addPersona(persona);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            
            if (texto == FIN) break;
        }
        
        System.out.println("Personas inicialmente en la lista:");
        listaPersonas.printPersonas();
        
        System.out.println("Hay" + listaPersonas.cuantosDivorciados() + "personas divorciadas");

        System.out.println("Introduce un mes (numéro) para ver quienes cumplen años en ese mes");
        int mes = sc.nextInt();
        System.out.println(listaPersonas.cumplenEnMes(mes));
        
        System.out.println("La persona más joven es:");
        System.out.println(listaPersonas.masJoven());
        
        System.out.println("**Lista de solteros*");
        ArrayList<Persona> listaSolteros = listaPersonas.borrarSolteros();
        
        for (Persona persona: listaSolteros)
            System.out.println(persona.toString() + "/r/n");
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    private Persona crearPersona(String stringPersona)
    {
        String[] partes = stringPersona.split(",");
        
        EstadoCivil estadoCivil = null;
        
        switch(partes[1])
        {
           case "SOLTERO":
              estadoCivil = EstadoCivil.SOLTERO;
              break;
           case "CASADO":
              estadoCivil = EstadoCivil.CASADO;
              break;
           case "DIVORCIADO":
              estadoCivil = EstadoCivil.DIVORCIADO;
              break;
           case "VIUDO":
              estadoCivil = EstadoCivil.VIUDO;
              break;
          
        }
        
        return new Persona(partes[0], estadoCivil, Integer.parseInt(partes[2]), Integer.parseInt(partes[3]), Integer.parseInt(partes[4]));
    }
}
