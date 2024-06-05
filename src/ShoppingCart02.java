public class ShoppingCart02 {
    
    private double preco;
    private double imposto;
    private int quantidade;

    // Método para calcular o preço total incluindo imposto
    public double calcularTotalPrice() {
        return preco * quantidade * (1 + imposto);
    }

    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        ShoppingCart02 carrinho = new ShoppingCart02();

        // Inicializando os numéros
        carrinho.preco = 10.0; // Preço de cada item
        carrinho.imposto = 0.07; // Taxa de imposto (7%)
        carrinho.quantidade = 2; // Quantidade de itens

        // Mensagem mostrando a quantidade de itens que o cliente quer comprar
        System.out.println("Alex quer comprar " + carrinho.quantidade + " Camisas");

        // Calculando o custo total com imposto
        double totalPrice = carrinho.calcularTotalPrice();

        // Imprimindo o custo total
        System.out.println("O custo total com o imposto e: $" + String.format("%.2f", totalPrice));
    }
}
