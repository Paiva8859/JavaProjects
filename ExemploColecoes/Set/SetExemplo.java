package ExemploColecoes.Set;

import java.util.HashSet;
import java.util.Set;

public class SetExemplo {
    //Atributos
    private Set<String> nomes;
    
    // Construtor
    public SetExemplo() {
        nomes = new HashSet<>();
    }
    
    // Métodos
    public void addNome(String nome){
        nomes.add(nome);
        System.out.println(nomes.hashCode());
    }
    
    public void listarNomes(){
        System.out.println(nomes);
    }
    
    public void removerNome(String nome){
        try {
            nomes.remove(nome);
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}
