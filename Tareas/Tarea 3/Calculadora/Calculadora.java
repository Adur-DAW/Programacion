
/**
 * Tarea 03 Calculadora
 * 
 * @author Adur Marques Herrero
 * @version 1.0.0
 */
public class Calculadora
{
    private double operando1;
    private double operando2;
    private int total;

    /**
     * Constructor for objects of class Calculadora
     */
    public Calculadora()
    {
        operando1 = 0;
        operando2 = 0;
        total = 0;
    }

    /**
     * Setters and Getters
     */
    
    public void setOperando1(double operando1)
    {
        this.operando1 = operando1;
    }
    
    public double getOperando1()
    {
        return this.operando1;
    }
    
    public void setOperando2(double operando2)
    {
        this.operando2 = operando2;
    }
    
    public double getOperando2()
    {
        return this.operando2;
    }
    
    public void setTotal(int total)
    {
        this.total = total;
    }
    
    public int getTotalOperaciones()
    {
        return this.total;
    }
    
    /**
     * Methods
     */

    public double sumar()
    {
        return this.operando1 + this.operando2;
    }
    
    public double restar()
    {
        return this.operando1 - this.operando2;
    }
    
    public double multiplicar()
    {
        return this.operando1 * this.operando2;
    }
    
    public double dividir()
    {
        return this.operando1 / this.operando2;
    }
    
    public void clear()
    {
        this.operando1 = 0;
        this.operando2 = 0;
        this.total = 0;
    }
}
