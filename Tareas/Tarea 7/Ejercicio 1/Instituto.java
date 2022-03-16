import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Instituto here.
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Instituto
{
    private String nombre;
    private ArrayList<Persona> personas = new ArrayList<Persona>();

    /**
     * Constructor for objects of class Instituto
     */
    public Instituto(String nombre)
    {
        this.nombre = nombre;
    }

    /**
     * Da de alta a una persona en el centro (Estudiante/Profesor)
     * 
     * @param  Persona
     * @return void
     */
    public void altaPersona(Persona persona)
    {
        personas.add(persona);
    }
    
    /**
     * Muestra cuantos estudiantes hay en el centro
     * 
     * @param
     * @return void
     */
    public void mostrar()
    {
         System.out.print(cuantosEstudiantes());
    }
    
    /**
     * Devuelve los profesores que tienen conferencias determinado día
     * 
     * @param  Dia
     * @return List<Profesor>
     */
    public List<Profesor> quienDaConferenciasEn(Dia dia)
    {
        List<Profesor> profesores = new ArrayList<Profesor>();
        
        for (Persona persona : personas) {
            if (persona.getClass().getSimpleName() == "Profesor" && ((Profesor)persona).diaConferencia() == dia.toString())
                profesores.add((Profesor)persona);
        }
        
        return profesores;
    }
    
    /**
     * Devuelve el nombre del centro
     * 
     * @param
     * @return String
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     * Devuelve cuantos estudiantes hay en el centro
     * 
     * @param
     * @return int
     */
    public int cuantosEstudiantes()
    {
        int cantidadEstudiantes = 0;
        
        for (Persona persona : personas) {
            if (persona.getClass().getSimpleName() == "Estudiante")
                cantidadEstudiantes++;
        }
         
        return cantidadEstudiantes;
    }
    
    /**
     * Borra los estudiantes sin número de telefono del centro
     * 
     * @param 
     * @return void
     */
    public void borrarEstudiantes()
    {
        List<Persona> estudiantes = new ArrayList<Persona>();
        
         for (Persona persona : personas) {
            if (persona.getClass().getSimpleName() == "Estudiante" && persona.cuantosTelefonos() == 0)
                estudiantes.add(persona);
         }
         
         for (Persona estudiante : estudiantes) {
                personas.remove(estudiante);
         }
    }
}
