package CadastroFuncionarios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GerenciamentoDeCadastro gerenciamento = new GerenciamentoDeCadastro();
        int opcao;

        do {
            System.out.println("1. Adicionar Funcionário");
            System.out.println("2. Remover Funcionário");
            System.out.println("3. Listar Funcionários");
            System.out.println("4. Calcular Média Salarial");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();  // Limpar o buffer

            switch (opcao) {
                case 1:
                    adicionarFuncionario(scanner, gerenciamento);
                    break;
                case 2:
                    removerFuncionario(scanner, gerenciamento);
                    break;
                case 3:
                    gerenciamento.listarFuncionarios();
                    break;
                case 4:
                    gerenciamento.calcularMediaSalarial();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void adicionarFuncionario(Scanner scanner, GerenciamentoDeCadastro gerenciamento) {
        try {
            System.out.print("Digite o nome do funcionário: ");
            String nome = scanner.nextLine();
            System.out.print("Digite a idade do funcionário: ");
            int idade = scanner.nextInt();
            System.out.print("Digite o salário do funcionário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            Funcionario funcionario = new Funcionario(nome, idade, salario);
            gerenciamento.adicionarFuncionario(funcionario);
            System.out.println("Funcionário adicionado com sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao adicionar funcionário: " + e.getMessage());
        }
    }

    private static void removerFuncionario(Scanner scanner, GerenciamentoDeCadastro gerenciamento) {
        try {
            System.out.print("Digite o nome do funcionário a ser removido: ");
            String nome = scanner.nextLine();
            gerenciamento.removerFuncionario(nome);
        } catch (Exception e) {
            System.out.println("Erro ao remover funcionário: " + e.getMessage());
        }
    }
}
