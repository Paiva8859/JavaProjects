package ExerciciosPOO.ComercioFreteProdutos;

public class Livro extends Produto implements Transportavel{

    // Atributos


    // Métodos
    @Override
    public double calcularFrete() {
        return 2;
    }

    @Override
    public double calcularPeso() {
        return 0.5;
    }
    
}
