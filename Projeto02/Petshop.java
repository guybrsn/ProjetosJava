package Projeto02;
import java.util.*;


public class Petshop {
    public static void main(String[] args) {
        Animal cachorro01 = new Cachorro("Doguinho", "Viralata");
        Animal cachorro02 = new Cachorro("Rabito", "Bull Dog");

        Animal gato01 = new Gato("Tikinha", "Raça desconhecida");

        List<Animal> todosOsAnimais = new ArrayList<>();

        todosOsAnimais.add(cachorro01);
        todosOsAnimais.add(cachorro02);
        todosOsAnimais.add(gato01);


        for ( Animal a : todosOsAnimais){
            System.out.println("Nome: " + a.getnome());
            System.out.println("Raça: "+ a.getraça());
            System.out.println("Dar banho " + a.DarBanho());
            System.out.println("----------------------------------");
        }
    }
}
