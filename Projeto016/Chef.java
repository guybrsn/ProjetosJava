public class Chef {
    
    private String nome;
    private String especialidade;
    private FoodTruck foodTruck;

    public Chef(String nome, String especialidade){
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String getNome(){
        return nome;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public FoodTruck geFoodTruck(){
        return foodTruck;
    }

    public void setFoodTruck(FoodTruck foodTruck){
        this.foodTruck = foodTruck;
    }
}
