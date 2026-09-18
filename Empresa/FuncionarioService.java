package Empresa;


public class FuncionarioService {
    
    private Repository<Funcionarios> repository;


    public FuncionarioService(Repository<Funcionarios> repository){
        this.repository = repository;
    }


    public void cadastrar(Funcionarios funcionario) throws SalarioInvalidoException{

        if (funcionario.getSalarioBase() <= 0) {

            throw new SalarioInvalidoException(
                "O salario do funcionario não pode ser igual a R$ 0,00"
            );
        }else{

            repository.adicionar(funcionario);

        }

    }


    public void remover(Funcionarios funcionario){

        repository.remover(funcionario);
        
    }


    public void listar(){

        for(Funcionarios funcionario : repository.listar()){

            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("CPF :" + funcionario.getCpf());
            System.out.println("Salario R$ " + funcionario.getSalarioBase() + "\n");

        }
    }


    public int quantidade(){
        return repository.quantidade();
    }

}
