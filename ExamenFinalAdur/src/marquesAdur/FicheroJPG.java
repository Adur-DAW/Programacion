/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marquesAdur;

/**
 *
 * @author adurt
 */
public class FicheroJPG extends FicheroImagen {
   private final Compresion compresion;
   
   FicheroJPG(String titulo, int tamaño, Compresion compresion){
        super(titulo, tamaño);
        this.compresion = compresion;
    }
    
    // TODO
    @Override
    public void display(){
        super.display();
        System.out.print(" y tiene una compresión "+ compresion);
    }
}
