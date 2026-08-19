package Projeto05;

public class Gatos extends Mamifero{
    public Gatos(String nome, String Pelagem){
        super(Pelagem, nome);
    }

    @Override
    public void EmitirSom(){
        System.out.println("O gato esta miando...");
    }


    
}
