package Projeto03;

public class Filme extends Catalago{

    public Filme(String titulo, double duracao){
        super(titulo, duracao);

    }

    @Override
    public double CalcularTempoDuracao(){
        setDuracao(120);
        return getDuracao();
    }
}
