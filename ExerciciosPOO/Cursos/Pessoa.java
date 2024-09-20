package ExerciciosPOO.Cursos;

public class Pessoa {
    // Atributos
    String nome, cpf;

    // Métodos
    void exibirInformacoes(String nome, String cpf) {
        System.out.println("Nome: " + nome + ", cpf: " + cpf);
    }

    //Getters and setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
