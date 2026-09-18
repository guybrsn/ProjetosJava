import java.util.List;

public class SistemaClinica {
    
    public static void main(String[] args) {
        
        Paciente ana = new Paciente(01, "Ana Maria", 22, "Bradesco Saude");
        Paciente pedro = new Paciente(02, "Pedro", 35, "SUS");

        Medico breno = new Medico(01, "Breno ", "123", "Clinico geral");

        Consulta consultaClinica = new Consulta(02, ana, breno, 150);


        PacienteService service = new PacienteService();

        service.cadastrar(ana);
        service.cadastrar(pedro);



        List<Paciente> pacientes = service.listarPacientes();
        for(Paciente paciente : pacientes){
            System.out.println("ID " + paciente.getId());
            System.out.println("Nome: " + paciente.getNome());
            System.out.println("Idade: " + paciente.getIdade());
            System.out.println("Plano de saude: " + paciente.getPlanoSaude() + "\n");
        }
        

        Paciente paciente = service.buscarPorIdentificadorUnico(02);

        if (paciente != null) {
            System.out.println("ID " + paciente.getId());
            System.out.println("Nome: " + paciente.getNome());
            System.out.println("Idade: " + paciente.getIdade());
            System.out.println("Plano de saude: " + paciente.getPlanoSaude() + "\n");
        }
        

        consultaClinica.getPaciente();    
    }
}
