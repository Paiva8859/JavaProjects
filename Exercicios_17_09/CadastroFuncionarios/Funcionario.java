package CadastroFuncionarios;

public class Funcionario {
    String nome;
    int idade;
    double salario;

    // Construtor
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    // Método para exibir informações do funcionário
    @Override
    public String toString() {
        return "Nome: " + nome + ", Idade: " + idade + ", Salário: " + salario;
    }
}

