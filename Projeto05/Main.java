package Projeto05;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Conta conta01 = new ContaCorrente(123, "Maria Eduarda", 2000);
        
        List<Conta> minhasContas = new ArrayList<>();
        
        minhasContas.add(conta01);
        
        for(Conta c : minhasContas){
            System.out.println("Numero da conta: " + c.getNumeroConta());
            System.out.println("Titular: " + c.getTitular());
            System.out.println("Meu Saldo atual R$ " + c.getSaldo());
            conta01.sacar(2200);
            System.out.println("Meu Saldo atual R$ " + c.getSaldo());
            System.out.println("");
        }
    }
}
