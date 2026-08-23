
import java.util.ArrayList;

public class Turma {
    
    private String sigla;
    private int ano;

    private ArrayList<Aluno> alunos;
    private ArrayList<Professor> professores;
    private ArrayList<Disciplina> disciplinas;
    
    public Turma(String sigla, int ano){
        this.sigla = sigla;
        this.ano = ano;
        alunos = new ArrayList<Aluno>();
        
    }
    
    
    public void adicionarAluno(Aluno aluno){

        alunos.add(aluno);

    }

    public int quantidadeAlunos(){

        return alunos.size();

    }

    public void removerAlunos(Aluno aluno){

        alunos.remove(aluno);

    }

    public Aluno getAluno(int posicao){
        return alunos.get(posicao);
    }

    
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
