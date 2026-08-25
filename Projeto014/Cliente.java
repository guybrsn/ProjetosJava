package Projeto014;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{
    
    private String endereço;
    private List<Animal> animais;


    public Cliente(String nome, String cpf, String telefone, String endereço){
        super(nome, cpf, telefone);
        this.endereço = endereço;
        animais = new ArrayList<>();
    }


    public void cadastrarAnimal(Animal animal){
        animais.add(animal);
    }

    public void removerAnimal(Animal animal){
        animais.remove(animal);
    }

    public int quantidadeAnimal(){
        return animais.size();
    }



    
    public String getEndereço(){
        return endereço;
    }

}
