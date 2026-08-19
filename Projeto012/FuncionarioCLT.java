package Projeto012;

public class FuncionarioCLT extends Funcionario{

    private double valeTransporte;

    public FuncionarioCLT(String nome, double salario, double valeTransporte){
        super(nome, salario);
        this.valeTransporte = valeTransporte;
    }

    @Override
    public double calcSalario(){
        return calcSalario() + valeTransporte;
    }
}
