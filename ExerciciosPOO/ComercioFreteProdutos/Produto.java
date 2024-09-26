package ExerciciosPOO.ComercioFreteProdutos;

public abstract class Produto {
    // Atributos
    private String nome;
    private double preco;

    // Getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    
    public Produto() {
        
    }

    // Métodos
    public abstract double calcularPeso();
}
