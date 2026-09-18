package SistemaMarketplace;

public class Cliente extends Pessoa{

    private String endereco;

    public Cliente(int id, String nome, String gmail, String endereco) {
        super(id, nome, gmail);
        this.endereco = endereco;
    }

    @Override
    public int getIdentificador() {
        return getId();
    }

    @Override 
    public void realizarAcao(){
        // ainda vou implementar esse metodo;
    }

    public String getEndereco() {
        return endereco;
    }
}
