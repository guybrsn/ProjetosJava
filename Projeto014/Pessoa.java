package Projeto014;

public class Pessoa {

    private String nome;
    private String cpf;
    private String telefone;

    public Pessoa(String nome, String cpf, String telefone){
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }


    public String getNome(){
        return this.nome;
    }

    public String getCPF(){
        return this.cpf;
    }

    public String getTelefone(){
        return this.telefone;
    }

    
}
