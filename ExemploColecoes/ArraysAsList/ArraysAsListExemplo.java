package ExemploColecoes.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsListExemplo {
    private String[] nomes = {"Maria", "João", "Pedro"};
    private List<String> nomesList;

    public ArraysAsListExemplo(){
        nomesList = new ArrayList<>(Arrays.asList(nomes));
    }

    public void addArray(String nome){
        try {
            nomes[3] = nome;
        } catch (Exception e) {
            System.err.println();
        }
    }

    public void addNome(String nome){
        nomesList.add(nome);
        System.out.println("Nome adicionado com sucesso!");
    }
}
