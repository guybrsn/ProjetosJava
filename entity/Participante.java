package entity;
import identity.Identificador;

public abstract class Participante implements Identificador{
    
    private int id;
    private String nome;
    private String email;

    public Participante(int id, String nome, String email) {
        this.id = id;
        this.nome = nome;
        this.email = email;
    }

    @Override 
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Participante Id " + getId() + ", Nome " + getNome() + ", Email " + getEmail();  
    }
    
    
}
