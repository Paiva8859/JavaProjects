package ExerciciosPOO.ComercioFreteProdutos;

public class Roupa extends Produto implements Transportavel {

    // Atributos
    private double volume;
    private double peso;
    
    // Getters and setters
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
    
    public double getPeso() {
        return peso;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    // Construtor
    public Roupa(String nome, double preco, double volume) {
        super(nome, preco);
        this.volume = volume;
    }

    // Métodos
    @Override
    public double calcularFrete() {
        double frete = peso*5;
        return frete;
    }

    @Override
    public double calcularPeso() {
        peso = volume *10;
        return peso;
    }
}
