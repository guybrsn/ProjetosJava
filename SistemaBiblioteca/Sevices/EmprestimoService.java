package SistemaBiblioteca.Sevices;

import java.util.List;

import SistemaBiblioteca.Emprestimo;
import SistemaBiblioteca.Repository;

public class EmprestimoService {
    
    private Repository<Emprestimo> repositoryService;

    public EmprestimoService(){
        repositoryService = new Repository<>();
    }


    public void registrarEmprestimo(Emprestimo emprestimo){
        repositoryService.adicinar(emprestimo);
        System.out.println("Emprestimo criado com sucesso !");
    }

    public void devolverEmpretimo(Emprestimo emprestimo){
        repositoryService.remover(emprestimo);
        System.out.println("Emprestimo excluido com sucesso !");
    }

    public List<Emprestimo> listarEmprestimos(){
        return repositoryService.listar();
    }

    public Emprestimo buscaEmprestimosPorID(int id){
        System.out.println("Resultados...");
        return repositoryService.buscarPorIdentificador(id);
    }

    public int quantidadeDeEmprestimos(){
        return repositoryService.quantidade();
    }
}
