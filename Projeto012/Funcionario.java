package Projeto06;

public abstract class Funcionario {
    private String nome;
    private double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public abstract double calcSalario();

    public void exibir(){
        System.out.println("Dados do Funcionario");
        System.out.println("O nome do funcionario e: " + nome);
        System.out.println("Sarario R$ " + salario);
    }

    public String getNome(){
        return nome;
    }

    public double getSalario(){
        return salario;
    }
}
