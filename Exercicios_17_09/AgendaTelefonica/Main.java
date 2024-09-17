package AgendaTelefonica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Remover contato");
            System.out.println("3. Buscar contato");
            System.out.println("4. Listar contatos");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome do contato: ");
                        String nomeAdicionar = scanner.nextLine();
                        System.out.print("Digite o telefone do contato: ");
                        String telefoneAdicionar = scanner.nextLine();
                        try {
                            agenda.adicionarContato(nomeAdicionar, telefoneAdicionar);
                            System.out.println("Contato adicionado com sucesso.");
                        } catch (AgendaCheiaException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    case 2:
                        System.out.print("Digite o nome do contato a ser removido: ");
                        String nomeRemover = scanner.nextLine();
                        try {
                            agenda.removerContato(nomeRemover);
                            System.out.println("Contato removido com sucesso.");
                        } catch (ContatoNaoEncontradoException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.print("Digite o nome do contato a ser buscado: ");
                        String nomeBuscar = scanner.nextLine();
                        try {
                            Contato contato = agenda.buscarContato(nomeBuscar);
                            System.out.println("Contato encontrado: " + contato);
                        } catch (ContatoNaoEncontradoException e) {
                            System.out.println("Erro: " + e.getMessage());
                        }
                        break;
                    case 4:
                        agenda.listarContatos();
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
