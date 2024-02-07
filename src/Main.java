public class Main {
    public static void main(String[] args) {
        double valorProduto =  50;

        Livro livro1 = new Livro();
        System.out.println("R$ " + valorProduto + " com desconto de 10% é igual a R$: " + livro1.calcularPrecoFinal(valorProduto));

        ProdutoFisico produto1 = new ProdutoFisico();
        System.out.println("Valor do produto R$"+ valorProduto+ " +  a taxa de frete R$50.00. Total: R$ "+produto1.calcularPrecoFinal(valorProduto));

    }
}