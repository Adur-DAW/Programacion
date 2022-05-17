/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marquesAdur;

/**
 *
 * @author adurt
 */
public class FicheroImagen extends Fichero {

    FicheroImagen(String titulo, int tamaño){
        super(titulo, tamaño);
    }
    
    // TODO
    @Override
    public void display(){
        super.display();
        System.out.print("y es una imagen");
    }
}
