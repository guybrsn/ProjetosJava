package SistemaBiblioteca;

public abstract class Pessoa implements Identificavel{
    
    private int id;
    private String nome;

    
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getID(){
        return id;
    }

    public String getNome(){
        return nome;
    }


    @Override 
    public abstract int getIdentificavel();
}
