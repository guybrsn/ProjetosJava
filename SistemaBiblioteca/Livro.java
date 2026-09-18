package SistemaBiblioteca;

public class Livro implements Identificavel{

    private int id;
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private boolean disponivel;


    public Livro(int id, String titulo, String autor, int anoPublicacao, boolean disponivel) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.disponivel = disponivel;
    }

    public void emprestar(){
        setDisponivel(false);
    }

    public void devolver(){
        setDisponivel(true);
    }

    @Override 
    public int getIdentificavel(){
        return getId();
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }
}
