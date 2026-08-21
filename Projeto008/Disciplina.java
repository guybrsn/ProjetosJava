

import java.util.ArrayList;

public class Disciplina {
    
    private String nome;
    private int cargaHoraria;

    private ArrayList<Professor> professores;
    private ArrayList<Turma> turmas;

    public Disciplina(String nome, int cargaHoraria){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        professores = new ArrayList<Professor>();
    }


    public void adicionarProfessor(Professor professor){
        professores.add(professor);
    }

    public void removerProfessor(Professor professor){
        professores.remove(professor);
    }

    public int quantidadeProfessor(){
        return professores.size();
    }

    public Professor getProfessor(int posicao){
        return professores.get(posicao);
    }




    public String getNome() {
        return nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCargaHoraria(int cargaHoraria) {

        if (cargaHoraria >= 0) {
            this.cargaHoraria = cargaHoraria;
        }
        
    }
    
}
