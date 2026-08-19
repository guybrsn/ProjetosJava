package Projeto05;

public class ContaCorrente extends Conta{

    private double novoSaldo;

    public ContaCorrente(int numeroConta, String titular, double saldo){
        super(numeroConta, titular, saldo);
        this.novoSaldo = 0;
    }

    @Override
    public double depositar(double valorDeposito){
        this.novoSaldo = valorDeposito;
        setSaldo(valorDeposito += getSaldo());
        System.out.println("Deposito de R$ " + this.novoSaldo + " realizado com sucesso :).");

        return getSaldo();
    }
    
    @Override
    public double sacar(double valorSaque){
        if (limiteSaque(valorSaque)) {
            setSaldo(getSaldo() - valorSaque);
            System.out.println("Valor do saque R$ " + valorSaque + " autorizado");
        }
        return getSaldo();
    }
    
    @Override
    public boolean limiteSaque(double valorSaque){
        if (valorSaque <= getSaldo()){
            return true;
        }else{
            System.out.println("Valor muito alto para saque.");
            return false;
        }
    }

    public double getNovoSaldo(){
        return this.novoSaldo;
    }

}
