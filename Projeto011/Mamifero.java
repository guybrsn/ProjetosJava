package Projeto011;

public class Mamifero extends Animal{

    private String Pelagem;

    public Mamifero(String pelagem, String nome){
        super(nome);
        this.Pelagem = pelagem;
    }

    public void Mover(){
        System.out.println("Se movendo...");
    }

    public String getPelagem(){
        return Pelagem;
    }   


}