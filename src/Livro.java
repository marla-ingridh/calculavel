public class Livro implements Calculavel {
    @Override
    public double calcularPrecoFinal(double valor){
        double desconto = valor * 0.10;
        double totalPreco = valor - desconto;
        return totalPreco;

    }
}
