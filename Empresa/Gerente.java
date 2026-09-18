package Empresa;

public class Gerente extends Funcionarios{

    public Gerente(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calculaSalarioBase() {
        return getSalarioBase() + (100 * 0.25);
    }

    
    
}
