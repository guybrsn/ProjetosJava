package SistemaBiblioteca;

public class Usuario extends Pessoa {

    private String gmail;
    private int matricula;

    public Usuario(int id, String nome, String gmail, int matricula) {
        super(id, nome);
        this.gmail = gmail;
        this.matricula = matricula;
    }
    
    public String getGmail() {
        return gmail;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    @Override
    public int getIdentificavel() {
        return getID();
    }
    
}
