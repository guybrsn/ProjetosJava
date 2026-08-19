package ProjetosJava.Projeto008;
import java.util.ArrayList;

public class Turma {
    
    private String sigla;
    private int ano;
    ArrayList<Aluno> alunos;
    ArrayList<Professor> professores = new ArrayList<>();
    ArrayList<Disciplina> disciplinas = new ArrayList<>();
    
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
}
