package Projeto013;

import java.util.ArrayList;
import java.util.List;

public class Locadora {
    public static void main(String[] args) {
       Veiculo carro01 = new Carro("SDV-3215", "Fiat Strada", 2025, 100, 0, true);
       Veiculo carro02 = new Carro("KST-2006", "FIAT FASTBACK", 2026, 300, 10.689, true);

        List<Veiculo> alugados = new ArrayList<>();

        alugados.add(carro01);
        alugados.add(carro02);

        for(Veiculo a : alugados){
            System.out.println("Placa: " + a.getPlaca());
            System.out.println("Modelo: " + a.getModelo());
            System.out.println("Ano: " + a.getAno());
            System.out.println("Valor da diaria R$ " + a.getValorDiaria());
            System.out.println("KM: " + a.getQuilometragem());
            System.out.println("Disponibilidade: " + a.getDisponivel());
            System.out.println("");
            
            try{
                if (a.verificarDisponibilidade()){
                    a.alugar(20);
                    a.calcularValorAluguel(20);
                };
            } catch (Exception e){
                System.out.println(e.getMessage());
            }

            System.out.println("");
        }
        carro02.calcularMulta(5);
    }
}
