package entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import exceptions.LanceInvalidoException;
import exceptions.LeilaoEncerradoException;
import identity.Identificador;

public class Leilao implements Identificador{
    
    private int id;
    private BemLeilao leilao;
    private Vendedor vendedor;
    private StatusLeilao status;
    private List<Lance> lances;

    public Leilao(int id, BemLeilao leilao, Vendedor vendedor, StatusLeilao status) {
        Objects.requireNonNull(leilao, "Leilão obrigatorio");
        Objects.requireNonNull(vendedor, "Vendedor obrigatorio.");

        this.id = id;
        this.leilao = leilao;
        this.vendedor = vendedor;
        this.status = status;
        this.lances = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public BemLeilao getLeilao() {
        return leilao;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public boolean isAberto() {
        return status == StatusLeilao.ABERTO;
    }

    public List<Lance> getLances() {
        return List.copyOf(lances);
    }

    @Override
    public String toString() {
        return "Leilao Id " + getId() + ", Leilao " + getLeilao() + ", Vendedor " + getVendedor()
                + ", Status " + isAberto() + ", Lances " + getLances();
    }
    
    public void adicionarLance(Comprador comprador, BigDecimal valor) throws LanceInvalidoException{

        Lance lance = new Lance(lances.size() + 1, comprador, valor, LocalDateTime.now(), this);

        if (comprador == null || valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new LanceInvalidoException("Valores invalidos.");
        }

        calcularMaiorLance().ifPresent(maior -> {
            if (lance.getValor().compareTo(maior.getValor()) <= 0) {
                throw new IllegalArgumentException("O lance deve ser maior que o atual.");
            }
        });

        lances.add(lance);
    };

    public Optional<Lance> calcularMaiorLance(){
        return lances.stream()
            .max(Comparator.comparing(Lance::getValor));
    }

    public Optional<Comprador> obterVendedor(){
        if (status != StatusLeilao.ENCERRADO) {
            Optional.empty();
        }
        return calcularMaiorLance().map(Lance::getComprador);
    }

    public void abrir(){
        if (status != StatusLeilao.ABERTO) {
            throw new IllegalArgumentException("O leilão já esta aberto.");
        }
        this.status = StatusLeilao.ABERTO;
    }

    public void encerrar() throws LeilaoEncerradoException{
        if (status != StatusLeilao.ABERTO){
            throw new LeilaoEncerradoException("Só e possivel encerrar um leilão aberto.");
        }

        this.status = StatusLeilao.ENCERRADO;
    }

    public void cancelar(){
        if (status != StatusLeilao.ABERTO || status != StatusLeilao.RASCUNHO) {
            throw new IllegalArgumentException("Leilão já esta finalizado. Status atual " + status);
        }

        this.status = StatusLeilao.CANCELADO;
    }
}
