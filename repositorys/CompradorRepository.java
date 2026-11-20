package repositorys;
import java.util.Objects;
import java.util.Optional;
import entity.Comprador;

public class CompradorRepository extends RepositoryInMemory<Comprador>{
    
    public Optional<Comprador> buscarPorEmail(String email){
        Objects.requireNonNull(email, "E-mail é obrigatório.");

        String emailProcurado = email.trim();

        return dados.stream()
                    .filter(emailComprador -> emailProcurado.equalsIgnoreCase(emailComprador.getEmail()))
                    .findFirst(); 
    }

}
