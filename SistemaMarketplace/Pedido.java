package SistemaMarketplace;

import java.time.LocalDateTime;

public class Pedido implements Identificador{
    
    private int id;
    private LocalDateTime data;
    private StatusPedido status;
    private double valorTotal;

    public Pedido(int id, LocalDateTime data, StatusPedido status, double valorTatal) {
        this.id = id;
        this.data = data;
        this.status = status;
        this.valorTotal = valorTatal;
    }

    @Override 
    public int getIdentificador(){
        return getId();
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    
}
