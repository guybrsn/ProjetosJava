package repositorys;
import java.util.List;
import entity.Leilao;

public class LeilaoRepository extends RepositoryInMemory<Leilao>{
    
    public List<Leilao> buscarAbertos(){
        return dados.stream()
                    .filter(Leilao::isAberto)
                    .toList();
    }

    public List<Leilao> buscarPorVendedor(int vendedoresId){
        return dados.stream()
                    .filter(vend -> vend.getVendedor().getId() == vendedoresId)
                    .toList();
    }
}
