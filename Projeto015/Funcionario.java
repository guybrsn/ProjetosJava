package Projeto015;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {

    private String dataAdmissao;
    private double salario;
    private String especialidade;

    private List<OrdemServico> ordemServicos;

    public Funcionario(int codigo, String nome, String cpf, String telefone, String dataAdmissao, double salario,
            String especialidade) {
        super(codigo, nome, cpf, telefone);
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
        this.especialidade = especialidade;
        ordemServicos = new ArrayList<>();
    }

    public void adicionarOrdemServico(int numOS, String dataOrdemServico, String dataConclusao, Servico servico) {
        OrdemServico novaOrdemServico = new OrdemServico(numOS, dataOrdemServico, dataConclusao, servico);
        ordemServicos.add(novaOrdemServico);

    }

    public void verTodasOrdemSevicos() {
        for (OrdemServico os : ordemServicos) {
            System.out.println("NR OS° " + os.getNumOS());
            System.out.println("Data da OS " + os.getDataOrdemServico());
            System.out.println("Dt Conclusao OS " + os.getDataConclusao());

            os.verServisos();
            System.out.println();
        }
    }

    public void buscarOrdemServico(int numOS) {
        for (OrdemServico os : ordemServicos) {
            if (os.getNumOS() == numOS) {
                for (int i = 0; i <= ordemServicos.size();) {
                    System.out.println("NR OS° " + os.getNumOS());
                    System.out.println("Data da OS " + os.getDataOrdemServico());
                    System.out.println("Dt Conclusao OS " + os.getDataConclusao());

                    os.verServisos();
                    System.out.println();
                    break;
                }
            }
        }
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public double getSalario() {
        return salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String novaEspecialidade) {
        this.especialidade = novaEspecialidade;
    }

}
