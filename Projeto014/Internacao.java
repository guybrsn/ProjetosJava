package Projeto014;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import Projeto014.Excessoes.AnimalJaInternadoException;

public class Internacao {
    
    private int codigo;
    private Date dataEntrada;
    private int capacidadeMaxima;

    private List<Animal> animais;
    private List<Procedimento> procedimentos;


    public Internacao(int codigo, Date dataEntrada, int capacidadeMaxima){
        this.codigo = codigo;
        this.dataEntrada = dataEntrada;
        this.capacidadeMaxima = capacidadeMaxima;
        animais = new ArrayList<>();
        procedimentos = new ArrayList<>();
    }


    public void internarAnimal(Animal animal) throws AnimalJaInternadoException{
        for(Animal a : animais){
            if (a == animal) {
                throw new AnimalJaInternadoException("Este animal já esta internado !");
            }else{
                animais.add(animal);   
            }
        }
    }

    public void darAltaAnimal(Animal animal){
        animais.clear();
    }

    public int quantidadeAnimal(){
        return animais.size();
    }


    public void adicionarProcedimentoInternacao(Procedimento procedimento){
        procedimentos.add(procedimento);
    }


    public int getCodigo(){
        return codigo;
    }

    public Date getDate(){
        return dataEntrada;
    }

    public int getCapacidadeMaxima(){
        return capacidadeMaxima;
    }


}
