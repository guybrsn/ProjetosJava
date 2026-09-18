
public class Consulta implements Identificavel{

    private int id;
    private Paciente paciente;
    private Medico medico;
    private double valor;

    
    public Consulta(int id, Paciente paciente, Medico medico, double valor) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.valor = valor;
    }


    @Override 
    public int getIdentificadorUnico(){
        return getId();
    }


    public double calcularValorFinal(){
        return valor * (100 * 0.01);
    }


    public int getId() {
        return id;
    }


    public Paciente getPaciente() {
        return paciente;
    }


    public Medico getMedico() {
        return medico;
    }


    public double getValor() {
        return valor;
    }

    
    
}
