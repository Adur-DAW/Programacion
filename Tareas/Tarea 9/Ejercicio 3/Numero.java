public class Numero {

    private int numero1;
    private int numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(String numero1) {
        if (numero1.length() == 0) return;

        this.numero1 = Integer.parseInt(numero1);
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(String numero2) {
        if (numero2.length() == 0) return;

        this.numero2 = Integer.parseInt(numero2);
    }

    public int sumar()
    {
        return getNumero1() + getNumero2();
    }

    public int restar()
    {
        return getNumero1() - getNumero2();
    }

    public int multiplicar()
    {
        return getNumero1() * getNumero2();
    }

    public int dividir()
    {
        return getNumero1() / getNumero2();
    }
}
