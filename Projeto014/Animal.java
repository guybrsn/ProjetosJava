package Projeto014;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    
    private String nome;
    private String especie;
    private int idade;
    private double peso;

    private Cliente cliente;
    private List<Internacao> internacoes;

    public Animal(String nome, String especie, int idade, double peso ){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
        internacoes = new ArrayList<>();
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void adicionarInternacaoAnimal(Internacao internacao){
        internacoes.add(internacao);
    }

    public void removerInternacaoAnimal(Internacao internacao){
        internacoes.remove(internacao);
    }

    public int quantidadeInternacaoAnimal(){
        return internacoes.size();
    }

    public void mostrarProcedimentoInternacao(Procedimento procedimento){
        System.out.println(procedimento.getNome());
    }


    public String getNome(){
        return nome;
    }

    public String getEspecie(){
        return especie;
    }

    public int getIDade(){
        return idade;
    }

    public double getPeso(){
        return peso;
    }



}
