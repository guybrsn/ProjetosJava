package Empresa;
public class PrimeiraEmpresa {
    public static void main(String[] args) {
        
        Funcionarios joao = new FucionarioComun("João", "123.456.789-00", 1500.71);
        Funcionarios Carla = new Gerente("Carla", "111.444.777-35", 3000.89);

        Repository<Funcionarios> repository = new Repository<>();

        FuncionarioService service = new FuncionarioService(repository);



        try{

            service.cadastrar(joao);
            service.cadastrar(Carla);

        }catch (Exception e){

            System.out.println(e.getMessage());
            
        }


        //service.remover(joao);

        System.out.println("Qtd de funcionarios " + service.quantidade() + "\n");

        service.listar();

    }
}
