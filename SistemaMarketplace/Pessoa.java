package SistemaMarketplace;

public abstract class Pessoa implements Identificador{
    
    private int id;
    private String nome;
    private String gmail;
    
    public Pessoa(int id, String nome, String gmail) {
        this.id = id;
        this.nome = nome;
        this.gmail = gmail;
    }

    public abstract void realizarAcao();

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getGmail() {
        return gmail;
    }

    
}
