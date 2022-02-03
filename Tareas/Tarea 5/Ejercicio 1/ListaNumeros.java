
/**
 * Write a description of class ListaNumeros here.
 * 
 * @author Adur Marques
 * @version (a version number or a date)
 */

import java.util.Arrays;

public class ListaNumeros
{
    // instance variables - replace the example below with your own
    private int[] lista;
    private int elementos;

    /**
     * Constructor for objects of class ListaNumeros
     */
    public ListaNumeros(int[] lista)
    {
        this.lista = lista;
    }
    
    public ListaNumeros(int cantidadElementos)
    {
        this.lista = new int[cantidadElementos];
    }

    // Hacer versión complicada
    public void añadirElemento(int elemento)
    {
       int[] nuevaLista = Arrays.copyOf(lista, lista.length+1);
       nuevaLista[lista.length] = elemento;
       
       lista = nuevaLista;
    }
    
    public int getTotalNumeros()
    {
        return lista.length;
    }
    
    public void sumarPosicion()
    {
        for (int i = 0; i < lista.length; i++) {
          lista[i] = lista[i] + i;
        }
    }

    // Hacer versión complicada
    public int obtenerMinimo()
    {
        Arrays.sort(lista);
        
        return lista[0];
    }
    
    public int obtenerMinimos()
    {
        int cantidadNumerosMinimos = 0;
        int numeroMinimo = obtenerMinimo();
          
        for(int i=0; i < lista.length; i++)
        {
          if(lista[i] == numeroMinimo)
              cantidadNumerosMinimos++;
        }
        
        return cantidadNumerosMinimos;
    }
    
    // Sin hacer
    public int[] generarArrayMinimos()
    {
        int cantidadMinimos = obtenerMinimos();
        
        int minimo = obtenerMinimo();
        int[] listaMinimos = new int[cantidadMinimos];
        
        for(int i=0; i < listaMinimos.length; i++)
        {
          listaMinimos[i] = minimo;
        }
        
        return listaMinimos;
    }
    
    public void borrarUno(int index)
    {
        for (int i = index; i < lista.length - 1; i++) {
            lista[i] = lista[i + 1];
        }

        lista = new int[lista.length - 1];
    }
    
    public void borrarMultiplosDe(int multiplo)
    {
        for (int i = 0; i < lista.length - 1; i++) {
            if(multiplo%2==0)
                borrarUno(i);
        }
    }
    
    public void escribirLista()
    {
        System.out.println(toString());
    }
    
    //public int[] copiar()
    //{
    //}
    
    //Revisar y arreglar
    public String copiarRango(int numeroInicio, int numeroFin)
    {
        if (!indiceCorrecto(numeroInicio))
            return "No se ha podido copiar";
            
        String textoRango = "";
        
        for(int i=0; i < lista.length; i++)
        {
            if (lista[i] >= numeroInicio && lista[i] < numeroFin)
                textoRango += lista[i] + " ";
        }
        
        return textoRango;
    }
    
    public boolean indiceCorrecto(int indice)
    {
        if (indice < 0) return false;
        
        return (lista.length >= indice + 1);
    }
    
    public String toString()
    {
        String str = "{ ";
            
         for (int i=0; i < lista.length; i++)
         {
             str += lista[i];
             
             if (i != lista.length - 1)
                 str += ", ";
         }          
         str += " }";
         
        return str;
    }
}
