public class Subtracao implements ICalculo {
    private double valor1,valor2;

    public Subtracao(double valor1, double valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    @Override
    public double calcular() {
        return valor1 -valor2;
    }
}
