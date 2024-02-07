public class ProdutoFisico implements Calculavel{

    @Override
    public double calcularPrecoFinal(double valor){
        double taxaFrete = 50;
        double totalPreco = valor + taxaFrete;

        return totalPreco;

    }

}
