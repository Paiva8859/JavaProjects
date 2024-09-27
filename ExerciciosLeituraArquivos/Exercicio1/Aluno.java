package ExerciciosLeituraArquivos.Exercicio1;

import java.util.List;

public class Aluno {
    // Atributos
    String nome;
    List<Double> notas;
    double media;

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public List<Double> getNotas() {
        return notas;
    }
    
    public void setNotas(List<Double> notas) {
        this.notas = notas;
    }

    // Construtor
    public Aluno(String nome, double nota1, double nota2, double nota3) {
        this.nome = nome;
        notas.add(nota1);
        notas.add(nota2);
        notas.add(nota3);
    }
    
    // Métodos
    public double mediaNotas(){
        for (Double nota: notas){
            media+=nota;
        }
        media/=notas.size();
        return media;
    }

    public double maiorNota(){
        double maiorNota = 0;
        for (Double nota: notas){
            maiorNota=nota;
        }
        return maiorNota;
    }

    public double menorNota(){
        double menorNota = 10;
        for (Double nota: notas){
            if(nota<menorNota){
                menorNota=nota;
            }
        }
        return menorNota;
    }
    
}
