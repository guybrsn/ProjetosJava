public abstract class Veiculo {
    private String placa;
    private String modelo;
    private double velocidadeAtual;
    private double KmPercorridos;
    private double litros;

    public Veiculo(String placa, String modelo, double velocidadeAtual) {
        this.placa = placa;
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

    public abstract void acelerar();

    public abstract double calcularConsumo(double KmPercorridos, double litros);

    public String getPlaca(){
        return placa;
    }

    public String getModelo(){
        return modelo;
    }

    public double getVelocidadeAtual(){
        return velocidadeAtual;
    }

    public double getKmPercorridos(){
        return KmPercorridos;
    }
    public double getLitros(){
        return litros;
    }
}
