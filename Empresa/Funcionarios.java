package Empresa;

public abstract class Funcionarios {

    private String nome;
    private String cpf;
    private double salarioBase;


    public Funcionarios(String nome, String cpf, double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }


    public abstract double calculaSalarioBase();


    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    
}
