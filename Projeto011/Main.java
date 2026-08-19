package Projeto05;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Mamifero cachorro01 = new Cachorro("Lindinha", "Cor clara");
        Mamifero gato01 = new Gatos("Princesinha", "Preto e Branco");

        List<Mamifero> animais = new ArrayList<>();

        animais.add(cachorro01);
        animais.add(gato01);

        for (Mamifero m : animais){
            System.out.println("Nome " + m.getNome());
            System.out.println("Pelagem " + m.getPelagem());
            m.EmitirSom();
            System.out.println(" ");
        }
    }
}