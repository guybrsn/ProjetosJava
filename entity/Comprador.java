package entity;

public class Comprador extends Participante{

    public Comprador(int id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public String toString() {
        return "Comprador " + super.toString();
    }
    
}
