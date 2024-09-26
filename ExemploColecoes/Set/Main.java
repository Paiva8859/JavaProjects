package ExemploColecoes.Set;

public class Main {
    public static void main(String[] args) {
        SetExemplo set = new SetExemplo();
        set.addNome("Maria");
        set.addNome("João");
        set.addNome("Pedro");
        set.listarNomes();
        set.addNome("Cleito");
        set.listarNomes();
        set.removerNome("Cleito");
        set.listarNomes();
    }
}