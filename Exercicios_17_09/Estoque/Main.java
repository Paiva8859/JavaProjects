package Estoque;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Listar itens");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do item: ");
                        String nomeAdicionar = scanner.nextLine();
                        System.out.print("Digite a quantidade do item: ");
                        int quantidadeAdicionar = scanner.nextInt();
                        estoque.adicionarItem(nomeAdicionar, quantidadeAdicionar);
                        System.out.println("Item adicionado com sucesso.");
                        break;
                    case 2:
                        System.out.print("Digite o nome do item a ser removido: ");
                        String nomeRemover = scanner.nextLine();
                        estoque.removerItem(nomeRemover);
                        System.out.println("Item removido com sucesso.");
                        break;
                    case 3:
                        estoque.listarItens();
                        break;
                    case 0:
                        continuar = false;
                        System.out.println("Saindo...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); 
            }
        }

        scanner.close();
    }
}