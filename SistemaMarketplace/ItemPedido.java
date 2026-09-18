package SistemaMarketplace;

public class ItemPedido {
    
    private int quantidade;
    private double precoUnitario;
    
    public ItemPedido(int quantidade, double precoUnitario) {
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double getSubtotal(){
        return getQuantidade() * getPrecoUnitario();
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    
}
