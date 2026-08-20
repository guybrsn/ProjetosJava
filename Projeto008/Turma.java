
import java.util.ArrayList;

public class Turma {
    
    private String sigla;
    private int ano;

    ArrayList<Aluno> alunos;
    ArrayList<Professor> professores;
    ArrayList<Disciplina> disciplinas;
    
    public Turma(String sigla, int ano){
        this.sigla = sigla;
        this.ano = ano;
        
    }
    
    
    public void adicionarAluno(){};

    
    public String getSigla() {
        return sigla;
    }

    public int getAno() {
        return ano;
    }

    public void setSigla(String sigla){
        this.sigla = sigla;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

}
