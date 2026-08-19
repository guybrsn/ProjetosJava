package ProjetosJava.Projeto008;

import java.sql.Date;

public class Aluno extends Pessoa{

    private Date dataNascimento;
    Turma turma;

    public Aluno(String nome, int matricula, Date dataNascimento){
        super(nome, matricula);
        this.dataNascimento = dataNascimento;
    }


    public void realizaAvaliacao(){
        
    };

    public Date getDataNascimento(){
        return dataNascimento;
    }
}
