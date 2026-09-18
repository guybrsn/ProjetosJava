package PraticaDeConceitosNovos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainProduto {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(1, "Teclado", 150));
        produtos.add(new Produto(2, "Mouse", 100));
        produtos.add(new Produto(3, "Cabo de rede", 80));
        produtos.add(new Produto(4, "Alicate de clipagem", 90));
        produtos.add(new Produto(5, "Monitor", 1236));

        
        System.out.println("\nProdutos sem ordenação de proço R$ ");
        produtos.forEach(protudo -> System.out.println("ID " + protudo.getId() + " Nome: " + protudo.getNome() + " R$ " + protudo.getPreco()));
        
        //produtos.sort((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()));
        produtos.sort(Comparator.comparing(Produto::getPreco));

        System.out.println("\nProdutos ordenados por preço R$ 0,00");
        produtos.forEach(protudo -> System.out.println("ID " + protudo.getId() + " Nome: " + protudo.getNome() + " R$ " + protudo.getPreco()));

    }
}
