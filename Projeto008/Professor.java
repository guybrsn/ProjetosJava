

import java.util.ArrayList;

public class Professor extends Pessoa{

    private String formacaoAcademica;
    private double salario;

    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;
    
    public Professor(String nome, int matricula, String formacaoAcademica, double salario){
        super(nome, matricula);
        this.formacaoAcademica = formacaoAcademica;
        this.salario = salario;
        disciplinas = new ArrayList<Disciplina>();
    }


    public void adicionarDisciplina(Disciplina disciplina){
        disciplinas.add(disciplina);
    }

    public void removerDisciplina(Disciplina disciplina){
        disciplinas.remove(disciplina);
    }

    public int quantidadeDisciplina(){
        return disciplinas.size();
    }

    public Disciplina getDisciplina(int posicao){
        return disciplinas.get(posicao);
    }


    public String getFormacaoAcademica(){
        return formacaoAcademica;
    }


    public double getSalario() {
        return salario;
    }


    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }


    public void setSalario(double salario) {
        this.salario = salario;
    }
}
