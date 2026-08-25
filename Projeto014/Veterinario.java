package Projeto014;

public class Veterinario extends Pessoa{
    
    private String crmv;
    private String especialidade;
    private double salario;

    public Veterinario(String nome, String cpf, String telefone, String crmv, String especialidade, double salario){
        super(nome, cpf, telefone);
        this.crmv = crmv;
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public void realizarProcedimento(Animal animal, Procedimento procedimento){
        
    }



    public String getCRMV(){
        return crmv;
    }

    public String getEspecialidade(){
        return especialidade;
    }

    public double getSalario(){
        return salario;
    }



}
