package Projeto03;

public class Catalago {
    
    private String Titulo;
    private double Duracao;

    public Catalago(String titulo, double duracao){
        this.Titulo = titulo;
        this.Duracao = duracao;
    }

    public double CalcularTempoDuracao(){
        return this.Duracao;
    }



    public String getTitulo(){
        return Titulo;
    }
    public double getDuracao(){
        return Duracao;
    }

    public void setDuracao(double duracao){
        Duracao = duracao;
    }
}
