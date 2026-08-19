package Projeto07;

public class Carro extends Veiculo{
    
    public Carro(String placa, String modelo, int ano, double valorDiaria, double quilometragem, boolean disponivel){
        super(placa, modelo, ano, valorDiaria, quilometragem, disponivel);

    }

    @Override
    public void calcularValorAluguel(int dias) {
        setValorDiaria(getValorDiaria() * dias);
        System.out.println("O valor por " + dias + " R$ " + getValorDiaria());
    }

    @Override
    public boolean verificarDisponibilidade() throws VeiculoIndisponivelException {
        // tratamento de Exception
        if (getDisponivel() == true) {
            return true;
        }else{
            throw new VeiculoIndisponivelException("Esse veiculo não esta disponivel.");
        }
    }
    
    @Override
    public void alugar(int dias){
        System.out.println("Você alugou o veiculo " + getModelo() + " Placa " + getPlaca() + " Dias alugados: " + dias);
    }

    @Override
    public void devolver(){
        if( getDisponivel() == false ){
            setDisponivel(true);
            System.out.println("Voce esta devolvendo o veiculo " + getModelo());
            System.out.println("Obrigado pela preferencia");
        }else{
            System.out.println("Voce nao alugou esse veiculo.");
        }
    }

    @Override
    public void calcularMulta(int diasAtraso){
        setValorDiaria(getValorDiaria() * diasAtraso * 0.01);
        System.out.println("Dias de atraso: " + diasAtraso + " Valor da multa R$ " + getValorDiaria());
    }
}
