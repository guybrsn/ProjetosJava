package Projeto05;

public abstract class Conta {
    
    private int numeroConta;
    private String titular;
    private double saldo;
    

    public Conta(int numeroConta, String titular, double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }


    public abstract double depositar(double valorDeposito);

    public abstract double sacar(double valorSaque);

    public abstract boolean limiteSaque(double valorSaque);

    //public abstract void tranferir();



    public int getNumeroConta(){
        return this.numeroConta;
    }

    public String getTitular(){
        return this.titular;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
