package Projeto01;

public class Funcionario {
    public String nome;
    public double salario;


    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }


    public double CalculaBonus(){
        return 500.00;
    }


    public String getnome(){return nome;}
    public double getsalario(){return salario;}

}   