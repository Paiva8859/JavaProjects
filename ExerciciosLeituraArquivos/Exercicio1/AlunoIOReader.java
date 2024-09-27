package ExerciciosLeituraArquivos.Exercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class AlunoIOReader {
    // Atributos
    String arquivo = "C:\\Users\\DevTarde\\Desktop\\GPaiva\\JavaProjects\\ExerciciosLeituraArquivos\\Exercicio\\arquivo.txtC:\\Users\\DevTarde\\Desktop\\GPaiva\\JavaProjects\\ExerciciosLeituraArquivos\\Exercicio\\arquivo.txt";
    List<Aluno> alunos;
    double mediaTurma = 0;

    // Construtor
    public AlunoIOReader() {
        alunos = new ArrayList<>();
        readerFileIO();
    }

    // Métodos
    public void readerFileIO() {
        try (BufferedReader br = new BufferedReader(
                new FileReader(arquivo))) {
            String linha = "";

            while ((linha = br.readLine()) != null) {
                String[] conteudo = linha.split(",");
                Aluno aluno = new Aluno(
                        conteudo[0],
                        Double.parseDouble(conteudo[1]),
                        Double.parseDouble(conteudo[2]),
                        Double.parseDouble(conteudo[3]));
                alunos.add(aluno);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double mediaAlunos() {
        for (Aluno aluno : alunos) {
            mediaTurma += aluno.mediaNotas();
        }
        mediaTurma /= alunos.size();
        return mediaTurma;
    }

    public String alunoComMaiorNota(){
        double maiorNota=0;
        String nomeAluno = "";
        for (Aluno aluno : alunos) {
            if (maiorNota<aluno.maiorNota()) {
                maiorNota = aluno.maiorNota();
                nomeAluno = aluno.getNome();
            }
        }
        return "Aluno com maior nota é: " + nomeAluno + ", com a nota: " + maiorNota;
    }

    public String alunoComMenorNota(){
        double menorNota=10;
        String nomeAluno = "";
        for (Aluno aluno : alunos) {
            if (menorNota>aluno.menorNota()) {
                menorNota = aluno.menorNota();
                nomeAluno = aluno.getNome();
            }
        }
        return "Aluno com menor nota é: " + nomeAluno + ", com a nota: " + menorNota;
    }
}
