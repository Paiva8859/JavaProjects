package Estoque;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Item> itens;
    private static final String ARQUIVO_ESTOQUE = "estoque.txt";

    public Estoque() {
        itens = new ArrayList<>();
        carregarEstoque();
    }

    public void adicionarItem(String nome, int quantidade) {
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                item.setQuantidade(item.getQuantidade() + quantidade);
                salvarEstoque();
                return;
            }
        }
        itens.add(new Item(nome, quantidade));
        salvarEstoque();
    }

    public void removerItem(String nome) {
        Item itemRemover = null;
        for (Item item : itens) {
            if (item.getNome().equalsIgnoreCase(nome)) {
                itemRemover = item;
                break;
            }
        }
        if (itemRemover != null) {
            itens.remove(itemRemover);
            salvarEstoque();
        } else {
            System.out.println("Item não encontrado.");
        }
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("O estoque está vazio.");
        } else {
            for (Item item : itens) {
                System.out.println(item);
            }
        }
    }

    private void salvarEstoque() {
        try (FileWriter fw = new FileWriter(ARQUIVO_ESTOQUE);
             BufferedWriter bw = new BufferedWriter(fw)) {
            for (Item item : itens) {
                bw.write(item.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar o estoque: " + e.getMessage());
        }
    }

    private void carregarEstoque() {
        File arquivo = new File(ARQUIVO_ESTOQUE);
        if (arquivo.exists()) {
            try (FileReader fr = new FileReader(arquivo);
                 BufferedReader br = new BufferedReader(fr)) {
                String linha;
                while ((linha = br.readLine()) != null) {
                    String[] partes = linha.split(":");
                    if (partes.length == 2) {
                        String nome = partes[0];
                        int quantidade = Integer.parseInt(partes[1]);
                        itens.add(new Item(nome, quantidade));
                    }
                }
            } catch (IOException e) {
                System.out.println("Erro ao carregar o estoque: " + e.getMessage());
            }
        }
    }
}

