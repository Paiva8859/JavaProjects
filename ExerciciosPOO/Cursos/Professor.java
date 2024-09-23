package ExerciciosPOO.Cursos;

public class Professor extends Pessoa{
    // Atributos
    private double salario;

    // Métodos
    @Override
    public String exibirInformacoes() {
        super.exibirInformacoes();
        return "Salário: " + getSalario();
    }

    
    // Getters and setters
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    // Construtor
    public Professor(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }
}
