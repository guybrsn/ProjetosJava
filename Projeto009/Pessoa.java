package Projeto009;

public class Pessoa {

    String nome;
    int idade;
    public Endereço endereço;

    public Pessoa(String Nome, int Idade, Endereço endereço){
        this.nome = Nome;
        this.idade = Idade; 
        this.endereço = endereço;
    }

    public void Exibir(){
        System.out.println("--Exibindo dados de " + nome);
        System.out.println(nome + " Tem " + idade + " anos de idade.");
        System.out.println("Mora no endereço: Cidade " + endereço.Cidade + ", Rua " + endereço.rua + ", Numero " + endereço.numeroCasa);
    }

}

