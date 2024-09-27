package ExemploColecoes.Map;

public class Main {
    public static void main(String[] args) {
        MapExemplo map = new MapExemplo();
        map.addNomeIdade("Maria",25);
        map.addNomeIdade("João", 30);
        map.addNomeIdade("Pedro", 40);
        map.listarNomesIdade();
        map.modificarValor("Pedro",35);
        map.listarNomesIdade();
        map.removerNomeIdade("Maria");
        map.listarNomesIdade();
    }
}
