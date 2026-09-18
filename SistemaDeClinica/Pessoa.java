
public abstract class Pessoa implements Identificavel{
    
    private int id;
    private String nome;


    public Pessoa(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    @Override 
    public int getIdentificadorUnico(){
        return getId();
    }

    public abstract String getTipo();

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }
}
