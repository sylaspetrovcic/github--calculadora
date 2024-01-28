public class TesteCalculadora {
    public static void main(String[] args) {
        Multiplicaçao a = new Multiplicaçao(2.3,5.0);
        System.out.println("O resultado da multiplicação de " + a.getValor1() + " * " +
                a.getValor2() + " é " + a.calcular());

        Divisao b =new Divisao(6,4);
        System.out.println("O resultado da divisão de " + a.getValor1() + " / " +
                a.getValor2() + " é " + b.calcular());

        Adicao c = new Adicao(7,8.4);
        System.out.println("O resultado da adição de " + a.getValor1() + " + " +
                a.getValor2() + " é " + c.calcular());

        Subtracao d = new Subtracao(8,3.45);
        System.out.println("O resultado da subtração de " + a.getValor1() + " - " +
                a.getValor2() + " é " + d.calcular());
    }
}
