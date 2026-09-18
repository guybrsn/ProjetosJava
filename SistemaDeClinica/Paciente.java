public class Paciente extends Pessoa{

    private int idade;
    private String planoSaude;

    public Paciente(int id, String nome, int idade, String planoSaude) {
        super(id, nome);
        this.idade = idade;
        this.planoSaude = planoSaude;
    }
    

    @Override 
    public int getIdentificadorUnico(){
        return getId();
    }
  
    @Override
    public String getTipo() {
        return "Pasciente";
    }


    public int getIdade() {
        return idade;
    }


    public String getPlanoSaude() {
        return planoSaude;
    }

}
