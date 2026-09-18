package SistemaBiblioteca;

public class Emprestimo implements Identificavel{

    private int id;
    private Livro livro;
    private Usuario usuario;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String status;

    
    public Emprestimo(int id, Livro livro, Usuario usuario, String dataEmprestimo, String dataDevolucao, String status) {
        this.id = id;
        this.livro = livro;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }


    @Override
    public int getIdentificavel() {
        return getId();
    }

    public int getId() {
        return id;
    }


    public Livro getLivro() {
        return livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public String getStatus() {
        return status;
    }

    

    
    
}
