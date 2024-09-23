package ExerciciosPOO.Cursos;

public class Pessoa {
    // Atributos
    String nome, cpf;

    // Métodos
    public String exibirInformacoes() {
        return "Nome:"+nome+", CPF: "+cpf;
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

    // Construtor
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
}
