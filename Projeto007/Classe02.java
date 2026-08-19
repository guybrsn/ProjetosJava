class Soma{
    int numero;

    public Soma(int inteiro){
        this.numero = inteiro + inteiro;
    }


    public void mostraSoma(){
        System.out.println("A soma e " + numero);
    }
}



public class Classe02 {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Fusca");
        Pessoa pessoa01 = new Pessoa("Maria", 20, 50.62);

        carro.acelerar();
        pessoa01.str();


        Soma AcumulaSoma = new Soma(5);

        AcumulaSoma.mostraSoma();
    }
}




// Esse e o metodo contrutor de carro
class Carro {

    String modelo;
    
    public Carro(String modeloRecebido){

        this.modelo = modeloRecebido;

    }


    public void acelerar(){
        System.out.println("O modelo do carro e " + modelo);
    }
}


// Esse e o metodo contrutor de pessoa.
class Pessoa{

    String nome;
    int idade;
    double Nobolso;

    public Pessoa(String Nome, int Idade, double Nobolso){
        this.nome = Nome;
        this.idade = Idade;
        this.Nobolso = Nobolso;
    }


    public void str(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cateira R$ " + Nobolso);
    }
}