package SistemaMarketplace;

import java.util.ArrayList;
import java.util.List;

public class Repository<T extends Identificador> {
    
    List<T> dados;

    public Repository(){
        dados = new ArrayList<>();
    }


    public void adicinar(T item){
        dados.add(item);
    }

    public void remover(T item){
        dados.remove(item);
    }

    public List<T> listar(){
        return dados;
    }

    public T buscarPorID(int id){
        for(T item : dados){
            if(item.getIdentificador() == id){
                return item;
            }
        }
        return null;
    }

    public void alterar( T novoItem ){
        for(int i = 0; i < dados.size(); i ++){
            if (dados.get(i).getIdentificador() == novoItem.getIdentificador()) {
                dados.set(i, novoItem);
                return;
            }
        }
    }
    

}
