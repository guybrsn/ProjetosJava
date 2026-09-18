package PraticaDeConceitosNovos;

import java.util.ArrayList;
import java.util.List;

public class MainClientes {

    public static void main(String[] args) {

        List<Clientes> clientes = new ArrayList<>();

        clientes.add(new Clientes(1, "Marcos", "euMarcos@gmail.com"));
        clientes.add(new Clientes(2, "Maria", "euMaria@gmail.com"));
        clientes.add(new Clientes(3, "Joao", "euJoao@gmail.com"));

        // forma tradicional.
        // for(Clientes c : clientes){
        //     System.out.println("Nome: " + c.getNome());
        // }
        System.out.println("Todos so clinetes");
        clientes.forEach( cliente -> System.out.println("ID " + cliente.getId() + " nome: " + cliente.getNome() + " email " + cliente.getGmail()));

        System.out.println("\nClientes com o id maior que 1");
        clientes.stream()
            .filter(cliente -> cliente.getId() > 1)
            .forEach(cliente -> System.out.println("Nome: " + cliente.getNome()));
    }
    
}
