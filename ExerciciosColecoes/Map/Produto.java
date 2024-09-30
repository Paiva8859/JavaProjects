package ExerciciosColecoes.Map;

public class Produto {
    // Atributos
    private String nome;
    private double preco;
    
    // Métodos
    @Override
    public String toString(){
        return "Nome Produto: "+nome +", Preço: "+preco;
    }

    public double getPreco() {
        return preco;
    }           

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}
