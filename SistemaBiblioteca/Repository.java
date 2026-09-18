package SistemaBiblioteca;

import java.util.ArrayList;
import java.util.List;

public class Repository<T extends Identificavel> {
    

    List<T> dados;

    public Repository(){
        dados = new ArrayList<>();
    }


    public void adicinar(T item ){
        dados.add(item);
    }

    public void remover(T item ){
        dados.remove(item);
    }

    public List<T> listar(){
        return dados;
    }

    public T buscarPorIdentificador(int id){
        for(T item : dados){
            if (item.getIdentificavel() == id) {
                return item;
            }
        }
        return null;
    }

    public int quantidade(){
        return dados.size();
    }
}
