package Projeto01;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario){
        super(nome, salario);


    }

    @Override
    public double CalculaBonus(){
        return super.CalculaBonus() + (this.salario * 0.10);
    }
}