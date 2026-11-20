package repositorys;
import java.util.Objects;
import java.util.Optional;

import entity.Vendedor;

public class VendedorRepository extends RepositoryInMemory<Vendedor>{
    
    public Optional<Vendedor> buscarPorEmail(String email){
        Objects.requireNonNull(email, "E-mail é obrigatorio.");

        String emailProcurado = email.trim();

        return dados.stream()
                    .filter(vendedor -> emailProcurado.equalsIgnoreCase(vendedor.getEmail()))
                    .findFirst();
    }

    @Override
    public void adicionar(Vendedor vendedor) {
        Objects.requireNonNull(vendedor, "Vendedor é obrigatorio.");
        if (buscarPorEmail(vendedor.getEmail()).isPresent()) {
            throw new IllegalArgumentException("Já existe um vendedor com esse e-mail.");
        }
        super.adicionar(vendedor);
    }

    
}
