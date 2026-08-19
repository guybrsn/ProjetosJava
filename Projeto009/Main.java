package Projeto009;

public class Main {
    public static void main(String[] args) {
        Endereço endereço = new Endereço("Cuiabá", "Passa Nada", 35);
        Pessoa pessoa01 = new Pessoa("Maria Clara", 22, endereço);

        pessoa01.Exibir();
    }
}
