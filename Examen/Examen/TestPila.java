import java.util.Scanner;
/**
 * Clase Test para Pila
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class TestPila
{
    private static Pila pila = null;

    /**
     * Constructor for objects of class TestPila
     */
    public TestPila()
    {
    }
    
    public static void main()
    {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce la cantidad de elementos en la Pila");
        int cantidadElementos = teclado.nextInt();
        
        pila = new Pila(cantidadElementos);
        
        menu();
    }

    private static void menu()
    {
        boolean continuar = true;
        
        Scanner teclado = new Scanner(System.in);
        Entero entero = new Entero(5);
        
        while(continuar == true) 
        {
            System.out.println("\n Introduzca la opción elegida: \n");
            System.out.println("\u2022 [1] Introducir un elemento en la pila");
            System.out.println("\u2022 [2] Sacar un elemento de la pila");
            System.out.println("\u2022 [3] Vaciar la pila");
            System.out.println("\u2022 [4] Consultar el estado de la pila");
            System.out.println("\u2022 [0] Salir \n");
            
            int opcionElegida = teclado.nextInt();
            
            Entero[] elementos = pila.consultarElementos();
            
            switch (opcionElegida) 
            {
                case 1: 
                    pila.push(entero);
                    break;
                    
                case 2: 
                    pila.pop();
                    break;
                    
                case 3: 
                    for (int i = 0; i < elementos.length; i++) pila.pop();
                    
                    break;
                    
                case 4: 
                    System.out.println("\n Elementos: \n");
                    
                    for (int i = 0; i < elementos.length; i++)
                    {
                        if (elementos[i] != null)
                            System.out.println(elementos[i].getValor());
                        else 
                            System.out.println("Vacio");
                    }
                        
                    break;
                    
                case 0: 
                    continuar = false;
                    break;
            }
        }
    }
}
