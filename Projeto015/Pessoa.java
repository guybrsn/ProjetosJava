package Projeto015;

public class Pessoa {

    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;

    public Pessoa(int codigo, String nome, String cpf, String telefone){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getCodigo(){
        return codigo;
    }

    public String getNome(){
        return nome;
    }
    
    public String getCPF(){
        return cpf;
    }

    public String getTelefone(){
        return telefone;
    }
}
