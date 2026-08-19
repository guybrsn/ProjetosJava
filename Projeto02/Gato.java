package Projeto02;

public class Gato extends Animal {

    private double TaxaExtresse = 20.00;

    public Gato(String nome, String raça){
        super(nome, raça);

    }

    public String DarBanho(){
        return "Taxa Extresse " + getTaxaExtresse();
    }

    //public String getnome(){return nome; }
    //public String getraça(){ return raça; }
    public double getTaxaExtresse(){return TaxaExtresse;}
}
