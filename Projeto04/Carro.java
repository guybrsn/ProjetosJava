public class Carro extends Veiculo implements Manutencao{

    public Carro(String placa, String modelo, double velocidadeAtual){
        super(placa, modelo, velocidadeAtual);
    }

    @Override
    public void acelerar(){
        System.out.println("Acelerando veiculo...");
    }

    @Override
    public double calcularConsumo(double KmPercorridos, double litros){
        return KmPercorridos / litros;
    }

    @Override
    public void realizarManutencao(){
        System.out.println("Realizando manutenção no carro...");
    }

}

