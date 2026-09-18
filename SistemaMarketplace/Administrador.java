package SistemaMarketplace;

public class Administrador extends Pessoa{
    
    private String nivelAcesso;

    public Administrador(int id, String nome, String gmail, String nivelAcesso) {
        super(id, nome, gmail);
        this.nivelAcesso = nivelAcesso;
    }

    

    @Override
    public void realizarAcao() {
        
    }

    @Override
    public int getIdentificador() {
        return getId();
    }


    public String getNivelAcesso() {
        return nivelAcesso;
    }
}
