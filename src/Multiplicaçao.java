public class Multiplicaçao implements ICalculo {
    private double valor1, valor2;

    public Multiplicaçao(double valor1, double valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public double getValor1() {
        return valor1;
    }

    public double getValor2() {
        return valor2;
    }

    @Override
    public double calcular() {
        return valor1 * valor2;
    }

}
