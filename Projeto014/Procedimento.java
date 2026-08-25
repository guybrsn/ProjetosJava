package Projeto014;

public class Procedimento {
    
    private String nome;
    private int duracaoMinutos;
    private double custo;

    public Procedimento(String nome, int duracaoMinutos, double custo){
        this.nome = nome;
        this.duracaoMinutos = duracaoMinutos; 
        this.custo = custo;
    }

    public String getNome(){
        return nome;
    }

    public int getDuracao(){
        return duracaoMinutos;
    }

    public double getCusto(){
        return custo;
    }

    
}
