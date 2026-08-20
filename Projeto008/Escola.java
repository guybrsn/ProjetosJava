import java.sql.Date;

public class Escola {

    public static void main(String[] args) {
        Turma turma01 = new Turma("1A", 1);
        Aluno aluno01 = new Aluno("Joao", 123, new Date(0));
        Aluno aluno02 = new Aluno("Maria Eduarda", 321, new Date(0));


        aluno01.setTurma(turma01);
        aluno02.setTurma(turma01);

        System.out.println("Turma " + aluno01.getTurma().getSigla());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Matricula " + aluno01.getMatricula());
        System.out.println("Data de nascimento " + aluno01.getDataNascimento());

    }
    
}