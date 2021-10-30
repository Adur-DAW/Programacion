
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

    private void incrementarTotal() 
    {
        this.setTotal(this.getTotalOperaciones() + 1);
    }
    
    public double sumar()
    {
        this.incrementarTotal();
        
        return this.operando1 + this.operando2;
    }
    
    public double restar()
    {
        this.incrementarTotal();
        
        return this.operando1 - this.operando2;
    }
    
    public double multiplicar()
    {
        this.incrementarTotal();
        
        return this.operando1 * this.operando2;
    }
    
    public double dividirReal()
    {
        this.incrementarTotal();
        
        return this.operando1 / this.operando2;
    }
    
    public int dividir()
    {
        this.incrementarTotal();
        
        return (int)(this.operando1 / this.operando2);
    }
    
    public double calcularPotencia()
    {
        this.incrementarTotal();
        
        return Math.pow(this.operando1, this.operando2);
    }
    
    public void clear()
    {
        this.operando1 = 0;
        this.operando2 = 0;
        this.total = 0;
    }
}
