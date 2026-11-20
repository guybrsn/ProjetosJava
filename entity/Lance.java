package entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

import identity.Identificador;

public class Lance implements Identificador{
    
    private int id;
    private Comprador comprador;
    private BigDecimal valor;
    private LocalDateTime dataHora;
    private Leilao leilao;

    public Lance(int id, Comprador comprador, BigDecimal valor, LocalDateTime dataHora, Leilao leilao) {
        Objects.requireNonNull(comprador, "Comprador obrigatorio.");
        Objects.requireNonNull(valor, "Valor obrigatotorio.");
        Objects.requireNonNull(dataHora, "Data obrigatorio.");
        Objects.requireNonNull(leilao, "Leilão obrigatorio.");

        if (valor.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor do lance tem que ser maior que zero.");
        }

        if (dataHora.isAfter(LocalDateTime.now())) {
            throw new IllegalArgumentException("A data não pode ser maior que a data atual.");
        }

        this.id = id;
        this.comprador = comprador;
        this.valor = valor;
        this.dataHora = dataHora;
        this.leilao = leilao;
    }

    @Override 
    public int getId() {
        return id;
    }

    public Comprador getComprador() {
        return comprador;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public Leilao getLeilao() {
        return leilao;
    }

    @Override
    public String toString() {
        return "Lance Id " + getId() + ", Comprador " + getComprador().getNome() + ", Valor " + getValor()
                + ", Data e Hora " + getDataHora() + ", Leilao " + getLeilao().getLeilao().getDescricao();
    }

    
    
}
