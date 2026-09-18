package SistemaMarketplace;

public class Produto implements Identificador{
    
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int estoque;
    
    public Produto(int id, String nome, String descricao, double preco, int estoque) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.estoque = estoque;
    }

    @Override 
    public int getIdentificador(){
        return getId();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    

}
