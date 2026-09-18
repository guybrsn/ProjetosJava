package SistemaBiblioteca.Excecoes;

public class LivroNaoEmprestadoException extends Exception{

    public LivroNaoEmprestadoException(String mensagem){
        super(mensagem);
    }
    
}
