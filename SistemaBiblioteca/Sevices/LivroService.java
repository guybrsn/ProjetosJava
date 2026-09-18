package SistemaBiblioteca.Sevices;


import SistemaBiblioteca.Livro;
import SistemaBiblioteca.Excecoes.LivroIndisponivelException;

import java.util.List;
import SistemaBiblioteca.*;


public class LivroService {

    private Repository<Livro> repositoryLivro;


    public LivroService(){
        repositoryLivro = new Repository<>();
    }


    public void cadastrarLivros(Livro livro){
        repositoryLivro.adicinar(livro);
        System.out.println("Livro cadastrado com sucesso !");
    }

    public void removerLivroCadastrado(Livro livro){
        repositoryLivro.remover(livro);
        System.out.println("Livro removido com sucesse !");
    }

    public List<Livro> listarLivros(){
        return repositoryLivro.listar();
    }
    

    public Livro buscarLivroPorIdentificador(int id){

      return repositoryLivro.buscarPorIdentificador(id);

    }

    public void realizarEmprestimoLivro(Livro livro)throws LivroIndisponivelException{

        if (livro != null) {
            livro.emprestar();
            System.out.println("Livro emprestado. ");
        }else{
            throw new LivroIndisponivelException("Este livro não esta disponivel !");
        }
    }

}
