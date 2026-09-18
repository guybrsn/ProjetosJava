package SistemaBiblioteca.Sevices;

import java.util.List;

import SistemaBiblioteca.Repository;
import SistemaBiblioteca.Usuario;

public class UsuarioService {

    private Repository<Usuario> repositoryUsuario;

    public UsuarioService(){
        repositoryUsuario = new Repository<>();
    }
    

    public void cadastrarUsuarios(Usuario usuario){
        repositoryUsuario.adicinar(usuario);
        System.out.println("Usuario cadastrado com sucesso!");
    }

    public void removerUsuarios(Usuario usuario){
        repositoryUsuario.remover(usuario);
        System.out.println("Usuario removido com sucesso !");
    }

    public List<Usuario> listaUsuarios(){
        return repositoryUsuario.listar();
    }

    public Usuario buscarUsuarios(int id){
        return repositoryUsuario.buscarPorIdentificador(id);
    }


}
