package entity;
import java.math.BigDecimal;
import java.util.Objects;

import identity.Identificador;

public class BemLeilao implements Identificador{
    
    private int id;
    private String descricao;
    private BigDecimal valorInicial;
    private BigDecimal incrimentoMinimo;

    public BemLeilao(int id, String descricao, BigDecimal valorInicial, BigDecimal incrimentoMinimo) {
        Objects.requireNonNull(valorInicial, "Valor Obrigatorio.");
        
        if (valorInicial.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("O valor inicial tem que ser maior que zero.");
        }

        this.id = id;
        this.descricao = descricao;
        this.valorInicial = valorInicial;
        this.incrimentoMinimo = incrimentoMinimo;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public BigDecimal getValorInicial() {
        return valorInicial;
    }

    public BigDecimal getIncrimentoMinimo() {
        return incrimentoMinimo;
    }

    @Override
    public String toString() {
        return "BemLeilao Id " + getId() + ", Descricao " + getDescricao() + ", Valor Inicial "
                + getValorInicial() + ", Incrimento Minimo " + getIncrimentoMinimo();
    }
    
    
}
