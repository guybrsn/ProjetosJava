package Empresa;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {

    
    private List<T> dados;

   
    public Repository(){
        dados = new ArrayList<>();
    }


    public void adicionar(T objeto){
        dados.add(objeto);
    }


    public void remover(T objeto){
        dados.remove(objeto);
    }


    public List<T> listar(){
        return dados;
    }


    public int quantidade(){
        return dados.size();
    }
}
