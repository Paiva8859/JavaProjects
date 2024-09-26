package ExemploColecoes.List;

public class Main {
    public static void main(String[] args) {
        ListExemplo list = new ListExemplo();
    
        list.addNome("Maria");
        list.addNome("João");
        list.addNome("Pedro");

        list.listarNomes();

        list.atualizarNome("Pedro", "Cleito");

        list.listarNomes();

        list.removerNome("Cleito");
    }
}
