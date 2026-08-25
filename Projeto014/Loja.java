package Projeto014;

public class Loja {
    public static void main(String[] args) {
        Produto produto01 = new Produto("Caneta", 513.00, 10);
        ItemPedido item01 = new ItemPedido();

        Pedido pedido01 = new Pedido(132, "01 Pedido.");

        item01.setProduto(produto01);
        item01.setQuantidade(5);
        
        pedido01.adicionarItem(item01);
        
    }
}
