public class Persona implements Comparable {
    private String nombre;
    private String apellido;
    private long dni;
    
    public Persona (String nombre, String apellido, long dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public String getNombre()
    {
        return this.nombre;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    public long getDni()
    {
        return this.dni;
    }
    
    public boolean equals()
    {
        return false;
    }
    
    public int hashCode()
    {
        return 7 * nombre.hashCode() + 13 * apellido.hashCode()+ (new Long(this.dni)).hashCode();
    }
    
    public int compareTo(Object o)
    {
        int result = nombre.compareTo(((Persona)o).getNombre());
        
        if(result == 0){
            result = apellido.compareTo(((Persona)o).getApellido());
            
            if(result == 0)
                return (new Long(dni)).compareTo((new Long(((Persona)o).getDni())));
            
            return result;
        }
        return result;
    }
}


