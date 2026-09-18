package Empresa;

public class FucionarioComun extends Funcionarios{

    public FucionarioComun(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }


    @Override
    public double calculaSalarioBase(){
        return getSalarioBase() + (100 * 0.01);
    }
    


}
