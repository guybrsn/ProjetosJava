package servicess;
import java.util.Objects;
import java.util.Optional;
import entity.BemLeilao;
import entity.Leilao;
import entity.StatusLeilao;
import entity.Vendedor;
import repositorys.CompradorRepository;
import repositorys.LeilaoRepository;
import repositorys.VendedorRepository;

public class LeilaoService {

    private CompradorRepository compradorRepository;
    private VendedorRepository vendedorRepository;
    private LeilaoRepository leilaoRepository;

    public LeilaoService(CompradorRepository compradorRepository, VendedorRepository vendedorRepository,
            LeilaoRepository leilaoRepository) {
        this.compradorRepository = compradorRepository;
        this.vendedorRepository = vendedorRepository;
        this.leilaoRepository = leilaoRepository;
    }

    public void cadastrarNovoLeilao(int vendedorId, BemLeilao leilao){
        Objects.requireNonNull(leilao, "Leilão obrigatório.");

        Optional<Vendedor> vendedorEncontrado = vendedorRepository.buscarPorId(vendedorId);

        // Leilao novoLeilao = new Leilao(1, leilao, vendedorEncontrado, StatusLeilao.RASCUNHO);

        // leilaoRepository.adicionar(novoLeilao);
    }
    
}
