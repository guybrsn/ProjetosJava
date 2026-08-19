package Projeto03;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Catalago filme01 = new Filme("Vingadores Era de Ultron", 180);
        Catalago filme02 = new Filme("Attack on Titan", 100);

        List<Catalago> assistir = new ArrayList<>();

        assistir.add(filme01);
        assistir.add(filme02);


        for (Catalago a : assistir){
            System.out.println("Assistir no final de semana " + a.getTitulo()+ " Com Duração " + a.CalcularTempoDuracao() + " Min.");
        }
    }   
}
