package ProjetosJava.Projeto008;

import java.util.ArrayList;

public class Disciplina {
    
    private String nome;
    private int cargaHoraria;
    ArrayList<Professor> professores;
    ArrayList<Turma> turmas = new ArrayList<>();

    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;

    }



    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

}
