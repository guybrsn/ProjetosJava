

import java.util.ArrayList;

public class Professor extends Pessoa{

    private String formacaoAcademica;
    private double salario;
    ArrayList<Disciplina> disciplinas;
    ArrayList<Turma> turmas;
    
    public Professor(String nome, int matricula, String formacaoAcademica, double salario){
        super(nome, matricula, salario);
        this.formacaoAcademica = formacaoAcademica;
        this.salario = salario;
    }


    public void aplicaAvaliacao(){

    }


    public String getFormacaoAcademica(){
        return formacaoAcademica;
    }


    public double getSalario() {
        return salario;
    }

}
