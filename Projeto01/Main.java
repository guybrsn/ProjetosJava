package Projeto01;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario("Carlos Da Silva", 1500);

        Funcionario gerente01 = new Gerente("Maria Eduarda", 5500.00);

        List<Funcionario> Equipe = new ArrayList<Funcionario>();


        Equipe.add(funcionario01);
        Equipe.add(gerente01);


        for(Funcionario f : Equipe){
            System.out.println("Funcionario " + f.getnome());
            System.out.println("Salario R$ "+ f.getsalario());
            System.out.println("Bonus R$ " + f.CalculaBonus());
        }
    }
     
}