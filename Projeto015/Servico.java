package Projeto015;

public class Servico {
    
    private int codServico;
    private String descricao;
    private double valor;

    public Servico(int codService, String descricao, double valor){
        this.codServico = codService;
        this.descricao = descricao;
        this.valor = valor;
    }

    public int getCodServico(){
        return codServico;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String novaDescricao){
        this.descricao = novaDescricao;
    }

    public double getValor(){
        return valor;
    }
}
