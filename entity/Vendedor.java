package entity;

public class Vendedor extends Participante{

    public Vendedor(int id, String nome, String email) {
        super(id, nome, email);
    }

    @Override
    public String toString() {
        return "Vendedor " + super.toString();
    }
    
}
