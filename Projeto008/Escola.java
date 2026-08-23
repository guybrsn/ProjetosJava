import java.sql.Date;

public class Escola {

    public static void main(String[] args) {

        // turmas
        Turma turma01 = new Turma("1A", 1);

        // Alunos
        Aluno aluno01 = new Aluno("Joao", 123, new Date(0));
        Aluno aluno02 = new Aluno("Maria Eduarda", 321, new Date(0));

        //Disciplinas
        Disciplina disciplina01 = new Disciplina("Matematica", 200);
        Disciplina disciplina02 = new Disciplina("Portugues", 400);

        //Professores
        Professor professor01 = new Professor("João",535, "Matematica", 5463.89);
        Professor professor02 = new Professor("Clara", 648, "Portugues", 3568.22);

        //Acossiações
        //Criando relação de joao com matematica
        professor01.adicionarDisciplina(disciplina01);
        professor01.adicionarDisciplina(disciplina02);
        disciplina01.adicionarProfessor(professor01);
        disciplina02.adicionarProfessor(professor01);

        professor02.adicionarDisciplina(disciplina02);
        disciplina02.adicionarProfessor(professor02);

        System.out.println("\n\nDisciplinas do prof " + professor01.getNome());
        for(int i = 0; i < professor01.quantidadeDisciplina(); i++){
            Disciplina disciplina = professor01.getDisciplina(i);
            System.out.println("Disciplina " + i + " "+ disciplina.getNome() + " Carga horaria " + disciplina.getCargaHoraria());
        }
        System.out.println("\n\n");


        aluno01.setTurma(turma01);
        aluno02.setTurma(turma01);
        turma01.adicionarAluno(aluno01);
        turma01.adicionarAluno(aluno02);

        System.out.println("Turma " + aluno01.getTurma().getSigla());
        System.out.println("Nome: " + aluno01.getNome());
        System.out.println("Matricula " + aluno01.getMatricula());
        System.out.println("Data de nascimento " + aluno01.getDataNascimento());
        System.out.println("");

        System.out.println("Alunos da turma");
        for(int i = 0 ; i < turma01.quantidadeAlunos() ; i++){
            System.out.println("Nome: " + turma01.getAluno(i).getNome());
            System.out.println("Matricula " + turma01.getAluno(i).getMatricula());
            System.out.println("Data de nascimento " + turma01.getAluno(i).getDataNascimento());
            System.out.println("");
        }
    }    
}