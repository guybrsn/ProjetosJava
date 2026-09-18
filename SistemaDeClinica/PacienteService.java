import java.util.List;

public class PacienteService {
    
    private Repository<Paciente> repositoryPaciente;


    public PacienteService(){
        repositoryPaciente = new Repository<>();
    }


    public void cadastrar(Paciente paciente){
        repositoryPaciente.adicionar(paciente);
        System.out.println("Paciente cadastrado com sucesso ! \n");
    }


    public void removerPaciente(Paciente paciente){
        repositoryPaciente.remover(paciente);
        System.out.println("Paciente removido com sucesso !");
    }


    public Paciente buscarPorIdentificadorUnico(int id){
        System.out.println("Resultado da busca... ");
        return repositoryPaciente.buscarPorIdentificador(id);
    }


    public List<Paciente> listarPacientes(){
        System.out.println("Todos os pacientes cadastrados \n");

        return repositoryPaciente.listar();
    }


    public int quantidadePacientes(){
        System.out.println("Quantidade de pacientes");
        return repositoryPaciente.quantidade();
    }
}
