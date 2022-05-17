/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marquesAdur;

/**
 *
 * @author adurt
 */
public abstract class Fichero {

    private final String titulo;
    private final int tamaño;
    
    Fichero(String titulo, int tamaño){
        this.titulo = titulo;
        this.tamaño = tamaño;
    }
    
    /**
     * Retorna el tamaño del archivo
     * @return int tamaño
     */
    public int getTamaño(){
        return tamaño;
    }
    
    /**
     * Retorna el titulo del archivo
     * @return int tamaño
     */
    public String getTitulo(){
        return titulo;
    }
    
    /**
     * Compara dos archivos en base a su tamaño
     * @param fichero
     * @return int
     */
    public int compareTo(Fichero fichero)
    {
        // Calculamos la diferencia de tamaño entre los dos archivos
        int diferencia = getTamaño() - fichero.getTamaño();

        // Pesan lo mismo
        if (diferencia == 0)
            return 0; 
        // El primero pesa mas
        else if (diferencia < 0)
            return -1;
        // El segundo pesa mas
        else
            return 1;
    }
    
    /**
     * Muestra por pantalla los datos del fichero
     */
    public void display(){
        System.out.print("El archivo " + getTitulo() + " pesa " + getTamaño() + "MB");
    }
}
