package SistemaMarketplace;

public class Vendedor extends Pessoa{

    private String loja;

    public Vendedor(int id, String nome, String gmail, String loja) {
        super(id, nome, gmail);
        this.loja = loja;
    }

    

    @Override
    public void realizarAcao() {
       
    }

    @Override
    public int getIdentificador() {
        return getId();
    }


    
    public String getLoja() {
        return loja;
    }

}
