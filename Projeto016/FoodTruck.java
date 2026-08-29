import java.util.ArrayList;
import java.util.List;

public class FoodTruck {
    
    private String nome;
    private Chef chefResponsavel;
    private List<Prato> pratos = new ArrayList<>();
    private List<Evento> eventos = new ArrayList<>();

    public FoodTruck(String nome, Chef chefResponsavel){
        this.nome = nome;
        this.chefResponsavel = chefResponsavel;

        chefResponsavel.setFoodTruck(this);
    }

    public void adicionarPrato(Prato prato){
        pratos.add(prato);
    }

    public void removerPratoCardapio(Prato prato){
        pratos.remove(prato);
    }

    public List<Prato> getCardapio(){
        return pratos;
    }

    public List<Evento> getEventos(){
        return eventos;
    }
    

    public void inscreverEmEvento(){

    }

    public void prepararPedido(){
        System.out.println("Preparando...");
    }


    public String getNome(){
        return nome;
    }

    public Chef getChefResponsavel(){
        return chefResponsavel;
    }
}
