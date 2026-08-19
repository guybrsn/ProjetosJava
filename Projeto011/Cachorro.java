package Projeto05;

public class Cachorro extends Mamifero{
    public Cachorro(String nome, String Pelagem){
        super(Pelagem, nome);
    }

    @Override
    public void EmitirSom(){
        System.out.println("Cachorro esta latindo...");
    }
}
