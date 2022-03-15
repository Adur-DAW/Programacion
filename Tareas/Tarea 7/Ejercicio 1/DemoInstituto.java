/**
 * DemoInstituto
 * 
 * @author  
 * @version 
 */
public class DemoInstituto {


    /**
     * Constructor de la clase DemoInstituto
     */
    public DemoInstituto(){
        
    }

    public static void main (String [] args){
        Instituto i=new Instituto("CI Politecnico Estella");
        //i.clear();
        Persona p1 = new Profesor("Pedro", Dia.Martes);
        Telefono t1=new TelefonoSony("657890123");
        Telefono t2=new TelefonoSamsung("657890123");
        p1.addTelefono(t1);
        p1.addTelefono(t2);
        i.altaPersona(p1);
        System.out.println(p1.toString());
        
        Persona p2 = new Profesor("Isabel", Dia.Viernes);
        Telefono t3=new TelefonoNokia("6521123456");
        p2.addTelefono(t3);
        i.altaPersona(p2);
        System.out.println(p2.toString());
        
        Persona p3 = new Profesor("Carmen", Dia.Martes);
        Telefono t4=new TelefonoSony("623321178");
        p3.addTelefono(t4);
        i.altaPersona(p3); 
        System.out.println(p3.toString());
        
        Persona p4 = new Estudiante("Juan");
        Telefono t5=new TelefonoSony("689765432");
        p4.addTelefono(t5);
        i.altaPersona(p4); 
        System.out.println(p4.toString());
        
        Persona p5 = new Estudiante("Elena");
        Telefono t6=new TelefonoNokia("689000011");
        Telefono t7=new TelefonoNokia("622211111");
        p5.addTelefono(t6);
        p5.addTelefono(t7);
        i.altaPersona(p5);  
        System.out.println(p5.toString());
        
        Persona p6 = new Estudiante("Luis");
        i.altaPersona(p6);
        System.out.println(p6.toString());
        
        Persona p7 = new Estudiante("Ignacio");
        Telefono t8=new TelefonoSamsung("627222777");
        p7.addTelefono(t8);
        i.altaPersona(p7);
        System.out.println(p7.toString());
        
        System.out.println("Total de estudiantes en el " + i.getNombre() + ": " + i.cuantosEstudiantes());
        System.out.println("Después de borrar a los estudiantes que no tienen movil");
        i.borrarEstudiantes();
        System.out.println("Total de estudiantes en el " + i.getNombre() + ": " + i.cuantosEstudiantes());
    }
    
}
