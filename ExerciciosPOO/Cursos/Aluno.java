package ExerciciosPOO.Cursos;

public class Aluno extends Pessoa{
    // Atributos
    String matricula;

    // Métodos
    @Override
    void exibirInformacoes(String nome, String matricula){ 
        System.out.println("Nome: " + nome + ", matricula: " + matricula);
    }

    // Getters and setters
    public String getMatricula() {
        return matricula;
    }
    
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
