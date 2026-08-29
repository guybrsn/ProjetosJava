public abstract class Prato {
    
    private String nome;
    private double precoBase;
    private int estoque;

    public Prato (String nome, double precoBase, int estoque){
        this.nome = nome;
        this.precoBase = precoBase;
        this.estoque = estoque;
    }

    public abstract double calculaPrecoFinal();

    public abstract void exibirInfo();


    public String getNome(){
        return nome;
    }

    public double getPrecoBase(){
        return precoBase;
    }

    public int getEstoque(){
        return  estoque;
    }
}
