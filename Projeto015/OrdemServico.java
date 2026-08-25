package Projeto015;

import java.util.ArrayList;
import java.util.List;

public class OrdemServico {
    
    private int numOS;
    private String dataOrdemServico;
    private String dataConclusao;

    private List<Servico> servicos;

    public OrdemServico(int numOS, String dataOrdemServico, String dataConclusao, Servico servico){
        this.numOS = numOS;
        this.dataOrdemServico = dataOrdemServico;
        this.dataConclusao = dataConclusao;
        servicos = new ArrayList<>();
        servicos.add(servico);
    }

    /* public void adicionarServico(Servico servico){
        servicos.add(servico);
    }

    public void removerServiso(Servico servico){
        servicos.remove(servico);
    }

    public int quantidadeServisos(){
        return servicos.size();
    }

    */
    public void verServisos(){
        for(Servico s: servicos){
            System.out.println("Descricao " + s.getDescricao());
            System.out.println("valor R$ " + s.getValor());
        }
    }


    public int getNumOS(){
        return numOS;
    }

    public String getDataOrdemServico(){
        return dataOrdemServico;
    }

    public String getDataConclusao(){
        return dataConclusao;
    }

    public void setDataConclusao(String dataConclusaoServico){
        this.dataConclusao = dataConclusaoServico;
    }

}
