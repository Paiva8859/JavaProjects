package ExemploColecoes.List;

import java.util.ArrayList;
import java.util.List;

public class ListExemplo {
    // Atributos
    private List<String> nomes;

    // Construtor
    public ListExemplo() {
        nomes = new ArrayList<>();
    }

    // Métodos
    public void addNome(String nome) {
        nomes.add(nome);
        System.out.println(nomes.lastIndexOf(nome));
    }

    public void listarNomes(){
        System.out.println(nomes);
    }

    public void removerNome(String nome) {
        try {
            nomes.remove(nome);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void atualizarNome(String nome, String novoNome){
        try {
            int index = nomes.indexOf(nome);
            nomes.set(index, novoNome);
        } catch (Exception e) {
            System.err.println();
        }
    }
}
