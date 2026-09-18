package SistemaBiblioteca;

import SistemaBiblioteca.Sevices.EmprestimoService;
import SistemaBiblioteca.Sevices.LivroService;
import SistemaBiblioteca.Sevices.UsuarioService;

public class SistemaBiblioteca {
    public static void main(String[] args) {

        // criando todos os usuario
        Usuario carla = new Usuario(01, "Carla", "eucarla@gmail.com", 132);
        Usuario Pedro = new Usuario(02, "Pedro", "euPedro@gmail.com", 020);

        // criando todos os livros
        Livro livroCulinaria = new Livro(01, "Livro completo de culinaria", "Eu escrevi", 2024, true);

        // criando o emprestimo
        Emprestimo emprestimo = new Emprestimo(01, livroCulinaria, carla, "14-07-2026", "20-07-2026", "Desvolvido em bom estado");

        // criando os serviços de livro
        LivroService serviceLivro = new LivroService();

        // criando o serviço usuario
        UsuarioService serviceUsuario = new UsuarioService();
        
        // criando o serviço emprestimo
        EmprestimoService serviceEmprestimo = new EmprestimoService();

        // cadastrando um objeto do tipo livro com o serviço de livro.
        serviceLivro.cadastrarLivros(livroCulinaria);

        // cadastrando um objeto do tipo usuario com o serviço de usuario ou ultilizando o serviço usuario.
        serviceUsuario.cadastrarUsuarios(carla);
        serviceUsuario.cadastrarUsuarios(Pedro);

        // usando o serviço de emprestimo
        serviceEmprestimo.registrarEmprestimo(emprestimo);
        // ultilizando os serviços
        
        System.out.println("Todos os usuarios \n");
        for(Usuario us : serviceUsuario.listaUsuarios()){
            System.out.println("ID " + us.getID());
            System.out.println("Nome: " + us.getNome());
            System.out.println("Matricula: " + us.getMatricula());
            System.out.println("Gmail " + us.getGmail() + "\n");

        }

        System.out.println("Todos os livros cadastrados \n");
        for(Livro l : serviceLivro.listarLivros()){
            System.out.println("ID " + l.getId());
            System.out.println("Titulo: " + l.getTitulo());
            System.out.println("Autor do livro: " + l.getAutor());
            System.out.println("Ano Publicação do livro: " + l.getAnoPublicacao());
            System.out.println("Disponivel " + l.isDisponivel() + "\n");
        }

        System.out.println("Todos os emprestimos \n");
        for(Emprestimo e : serviceEmprestimo.listarEmprestimos()){
            System.out.println("ID " + e.getId());
            System.out.println("Livro emprestado: " + e.getLivro().getTitulo());
            System.out.println("Usuario: " + e.getUsuario().getNome());
            System.out.println("Data do emprestimo: " + e.getDataEmprestimo());
            System.out.println("Data da devolução: " + e.getDataDevolucao());
            System.out.println("Status: " + e.getStatus());
        }
    }
    
}
