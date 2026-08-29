import java.util.ArrayList;
import java.util.List;

public class ComecandoEvento {
    public static void main(String[] args) {
        Chef chefMatheus = new Chef("Matheus ", "Saladas veganas");

        Chef chefMariaEduarda = new Chef("Maria Eduarda", "Comidas Tradicionais");
        
        FoodTruck foodTruckSaladas = new FoodTruck("Carro Vegano", chefMatheus);
        FoodTruck foodTruckTradicional = new FoodTruck("Comidas Tradicionais", chefMariaEduarda);
        
        foodTruckSaladas.adicionarPrato(new PratoVegano("Hanburguer de grao-de-bico", 37.50, 5));
        foodTruckSaladas.adicionarPrato(new PratoGourmet("Risoto de trufas", 135.22, 5));
        foodTruckTradicional.adicionarPrato(new PratoGourmet("Carne ao molho", 27.99, 10));

        List<Prato> todosOsPratos = new ArrayList<>();
        todosOsPratos.addAll(foodTruckSaladas.getCardapio());
        todosOsPratos.addAll(foodTruckTradicional.getCardapio());


        for(Prato p : todosOsPratos){
            p.exibirInfo();
        }
            

    }    
}
