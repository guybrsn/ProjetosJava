import java.util.ArrayList;
import java.util.List;

public class Evento {
    
    private String nome;
    private int capacidadeMaxima;
    private List<FoodTruck> foodTrucks = new ArrayList<>();

    public Evento(String nome, int capacidadeMaxima){
        this.nome = nome;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public List<FoodTruck> getFoodTrucks(){
        return foodTrucks;
    }


    public String getNome(){
        return nome;
    }

    public int getCapacidadeMaxima(){
        return capacidadeMaxima;
    }
}
