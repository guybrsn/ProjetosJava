package Projeto07;

public abstract class Veiculo implements Alugavel{
    
    private String placa;
    private String modelo;
    private int ano;
    private double valorDiaria;
    private double quilometragem;
    private boolean disponivel;

    public Veiculo(String placa, String modelo, int ano, double valorDiaria, double quilometragem, boolean disponivel){
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.valorDiaria = valorDiaria;
        this.quilometragem = quilometragem;
        this.disponivel = disponivel;
    }

    public abstract void calcularValorAluguel(int dias);

    public abstract boolean verificarDisponibilidade() throws VeiculoIndisponivelException;


    public String getPlaca(){
        return this.placa;
    }

    public String getModelo(){
        return this.modelo;
    }

    public int getAno(){
        return this.ano;
    }

    public double getValorDiaria(){
        return this.valorDiaria;
    }

    public void setValorDiaria(double valor){
        this.valorDiaria = valor;
    }

    public double getQuilometragem(){
        return this.quilometragem;
    }

    public boolean getDisponivel(){
        return this.disponivel;
    }

    public void setDisponivel(boolean disp){
        this.disponivel = disp;
    }
}
