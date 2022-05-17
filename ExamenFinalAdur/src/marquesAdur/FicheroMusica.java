/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marquesAdur;

/**
 *
 * @author adurt
 */
public class FicheroMusica extends Fichero {
    private final int duracion;

    FicheroMusica(String titulo, int tamaño, int duracion){
        super(titulo, tamaño);
        this.duracion = duracion;
    }
    
    /**
     * Retorna la duracion de la cancion
     * @return duracion
     */
    public int getDuracion(){
        return duracion;
    }
    
    // TODO
    @Override
    public void display(){
        super.display();
        System.out.print("y es un MP3 que dura "+ getDuracion() + " minutos");
    }
}
