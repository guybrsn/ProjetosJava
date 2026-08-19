package Projeto010;

public class Motor extends Carro{

    public int Potencia;
    public String Combustivel;

    public Motor(int potencia, String combustivel, String modelo){
        super(modelo);
        this.Potencia = potencia;
        this.Combustivel = combustivel;
    }

    public void Ligar(){
        System.out.println("O Carro esta ligado.");
    }
}
