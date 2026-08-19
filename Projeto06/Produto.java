public abstract class Produto {
    
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public abstract int vender(int quantidadeVendida) throws QuantidadeInvalidaException;

    public abstract double calcularDesconto();



    public String getNome(){
        return this.nome;
    } 

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public int getQuantidade(){
        return this.quantidadeEstoque;
    }

    public void setQuantidade(int qtd){
        this.quantidadeEstoque = qtd;
    }

}
