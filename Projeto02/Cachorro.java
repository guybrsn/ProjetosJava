package Projeto02;

public class Cachorro extends Animal{
    // O contrutor tem que ter o msm nome da classe.
    public Cachorro(String nome, String raça){
        super(nome, raça);

    }

    @Override
    public String DarBanho(){
        return "Ganhou um lencinho...";
    }

    //public String getnome(){return nome;}
    //public String getraça(){return raça;} 
}
