import java.sql.Date;

public class Aluno extends Pessoa{

    private Date dataNascimento;
    private Turma turma;

    public Aluno(String nome, int matricula, Date dataNascimento){
        super(nome, matricula);
        this.dataNascimento = dataNascimento;
    }


    public void realizaAvaliacao(){
        
    };

    public Date getDataNascimento(){
        return dataNascimento;
    }

    public void setDataNascimento(Date date){
        this.dataNascimento = date;
    }


    public void setTurma(Turma turma){
        this.turma = turma;
    }

    public Turma getTurma(){
        return turma;
    }
}
