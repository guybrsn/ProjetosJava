package repositorys;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import identity.Identificador;

public abstract class RepositoryInMemory<T extends Identificador> implements Repository<T>{
    
    protected List<T> dados;

    public RepositoryInMemory(){
        this.dados = new ArrayList<>();
    }

    @Override
    public void adicionar(T objeto) {
        Objects.requireNonNull(objeto);
        dados.add(objeto);
    }

    @Override
    public Optional<T> buscarPorId(int id) {
        return dados.stream()
                    .filter(item -> item.getId() == id)
                    .findFirst();
    }

    @Override
    public List<T> listar() {
        return dados.stream()
                    .toList();
    }

    @Override
    public void remover(int id) {
        T item = buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Item não encontrado: " + id));
        dados.remove(item);
    };
        
}

