package repositorys;
import java.util.List;
import java.util.Optional;

public interface Repository<T> {
    public void adicionar(T objeto);
    public Optional<T> buscarPorId(int id);
    public List<T> listar();
    public void remover(int id);
}
