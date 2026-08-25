package Projeto015;

public class AutoPecas {
    
    public static void main(String[] args) {
        //Cliente cliente01 = new Cliente(3568, "Mario", "321.498.987-65", "659997070-7070", "Troca do vidro");

        Funcionario funcionario = new Funcionario(321, "Lucas", "611.494.389-56", "56-91351-4665", "01-01-2026", 2530.99, "Eletrica");

        Servico servico01 = new Servico(111, "Troca de vidro", 100.35);
        Servico servico02 = new Servico(2, "Barulho no motor", 150.56);

        funcionario.adicionarOrdemServico(01, "01-08-2026", "Não concluido", servico01);
        funcionario.adicionarOrdemServico(02, "08-07-2026", "Não concluido", servico02);

        //funcionario.verTodasOrdemSevicos();
        funcionario.buscarOrdemServico(03);
    }
}
