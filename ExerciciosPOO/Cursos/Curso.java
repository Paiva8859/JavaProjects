package ExerciciosPOO.Cursos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    // Atributos
    String nomeCurso;
    List<Aluno> alunos;
    Professor professor;

    // Construtor
    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        alunos = new ArrayList<>();
    }

    // Métodos
    public void addProf(Professor professor) {
        this.professor = professor;
    }

    public void addAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void lancarNotas(String nomeAluno, double notaAluno) {
        for (Aluno aluno : alunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeAluno)) {
                aluno.setNota(notaAluno);
                System.out.println("Nota inserida com sucesso!");
                return;
            } else {
                System.out.println("Aluno não encontrado.");
            }
        }
    }

    public void resultadoFinal() {
        for (Aluno aluno : alunos) {
            System.out.println(aluno.exibirInformacoes());
            aluno.avaliarDesempenho();
        }
    }
}