package ExerciciosPOO.ComercioFreteProdutos;

public class Eletronico extends Produto implements Transportavel{
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

    // Construtor
    public Eletronico(String nome, double preco, double volume) {
        super(nome, preco);
        this.volume = volume;
    }

    // Métodos
    @Override
    public double calcularPeso() {
        peso = volume * 150;
        return peso;
    }

    @Override
    public double calcularFrete() {
        double frete = calcularPeso(); // 1 R$ por Kg
        return frete;
    }
}