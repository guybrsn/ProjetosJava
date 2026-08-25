package Projeto014;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private int numeroPedido;
    private String nome;

    List<ItemPedido> items;

    public Pedido(int numeroPedido, String nome){
        this.numeroPedido = numeroPedido;
        this.nome = nome;
        items = new ArrayList<>();
    }

    public void adicionarItem(ItemPedido item){
        items.add(item);
    }

    public void removerItem(ItemPedido item){
        items.remove(item);
    }

    public int quantidadeTotalDeItemEstoque(){
        return items.size();
    }



    public int getNumeroPedido(){
        return numeroPedido;
    }

    public String getNome(){
        return nome;
    }

}
