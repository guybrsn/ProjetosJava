

import java.util.ArrayList;
import java.util.List;


public class Repository<T extends Identificavel> {
    
    List<T> dados;

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

    public T buscarPorIdentificador(int id){

        for(T objeto : dados){

            if (objeto.getIdentificadorUnico() == id) {
                return objeto;
            }

        }

        return null;
    }

    public int quantidade(){
        return dados.size();
    }

}
