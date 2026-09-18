public class Medico extends Pessoa{
    
    private String crm;
    private String especialidade;


    public Medico(int id, String nome, String crm, String especialidade) {
        super(id, nome);
        this.crm = crm;
        this.especialidade = especialidade;
    }

    

    @Override
    public String getTipo() {
        return "Medico";
    }

    
    public String getCrm() {
        return crm;
    }


    public String getEspecialidade() {
        return especialidade;
    }    
}
