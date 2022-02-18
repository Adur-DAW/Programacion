import java.util.Scanner;
import java.util.ArrayList;

/**
 * Write a description of class AppRomanos here.
 * 
 * @author Adur Marques
 * @version 1.0.0
 */
public class AppRomanos
{
    public static void main(String[] args) {
        GestorRomanos gestorRomanos = new GestorRomanos();
        
        Scanner teclado = new Scanner(System.in);
 
        System.out.println("\n Introduzca 1 para añadir 1 y 2 para añadir varios: \n");
        
        int opcionElegida = teclado.nextInt();
        
        switch (opcionElegida) 
        {
            case 1: 
                gestorRomanos.añadirRomano(teclado.next());
                break;
            case 2: 
                ArrayList<String> numerosRomanos = new ArrayList<String>();
                
                while(true) 
                {   
                    String numeroRomano = teclado.next();
                    
                    if (numeroRomano == "FIN")
                        break;
                        
                    numerosRomanos.add(numeroRomano);
                }
        
                gestorRomanos.añadirRomanos(numerosRomanos.toArray(new String[0]));
                break;
        }
    }
}