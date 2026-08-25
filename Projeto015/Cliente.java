package Projeto015;

public class Cliente extends Pessoa{
    
    private String tipoCliente;

    public Cliente(int codigo, String nome, String cpf, String telefone, String tipoCliente){
        super(codigo, nome, cpf, telefone);
        this.tipoCliente = tipoCliente;
    }


    public String getTipoCliente(){
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente){
        this.tipoCliente = tipoCliente;
    }

}
