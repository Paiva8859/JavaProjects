package ExerciciosPOO.Cursos;

public class Aluno extends Pessoa implements Avaliavel{
    // Atributos
    String matricula;
    double nota;

    // Métodos
    @Override // Sobrescrevendo o método da superclasse Pessoa
    public String exibirInformacoes() {
        super.exibirInformacoes();
        return "Matricula: " + getMatricula();
    }

    @Override // Sobrescrevendo o método da interface
    public void avaliarDesempenho(){
        if (nota>=7) {
            System.out.println("Aluno aprovado");
        } else if(nota>=5 && nota <7){
            System.out.println("Aluno de recuperação");
        } else{
            System.out.println("Aluno reprovado");
        }
    }

    // Getters and setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    // Construtor
    public Aluno(String nome, String cpf, String matricula) {
        super(nome, cpf);
        this.matricula = matricula;
        this.nota = 0.0;
    }
}
