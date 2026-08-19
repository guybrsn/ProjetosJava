import java.util.*;

public class Main {
    public static void main(String[] args) {
        Veiculo carro01 = new Carro("C3ER222", "Celta ", 100);

        List<Veiculo> todosVeiculos = new ArrayList<>();

        todosVeiculos.add(carro01);

        for (Veiculo v : todosVeiculos){
            System.out.println("Placa: " + v.getPlaca());
            System.out.println("Modelo do Veiculo: " + v.getModelo());
            System.out.println("Velocidade: " + v.getVelocidadeAtual());
            System.out.println(v.calcularConsumo(50, 5));
            System.out.println("");
        }
    }
    
}