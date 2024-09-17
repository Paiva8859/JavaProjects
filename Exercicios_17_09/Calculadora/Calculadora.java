package Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {

    // Método para realizar soma
    public double calcularSoma(double num1, double num2) {
        return num1 + num2;
    }

    // Método para realizar subtração
    public double calcularSubtracao(double num1, double num2) {
        return num1 - num2;
    }

    // Método para realizar multiplicação
    public double calcularMultiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    // Método para realizar divisão
    public double calcularDivisao(double num1, double num2) throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }

    // Método para calcular raiz quadrada
    public double calcularRaizQuadrada(double num) throws ArithmeticException {
        if (num < 0) {
            throw new ArithmeticException("Não é possível calcular a raiz quadrada de um número negativo.");
        }
        return Math.sqrt(num);
    }

    // Método para exibir o menu e processar as operações
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        double num1 = 0, num2 = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Raiz Quadrada");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            try {
                opcao = scanner.nextInt();

                if (opcao == 0) {
                    continuar = false;
                    System.out.println("Saindo...");
                    continue;
                }

                if (opcao == 5) {
                    System.out.print("Digite o número: ");
                    num1 = scanner.nextDouble();
                    try {
                        System.out.println("Resultado: " + calcularRaizQuadrada(num1));
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                } else {
                    System.out.print("Digite o primeiro número: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    num2 = scanner.nextDouble();

                    try {
                        switch (opcao) {
                            case 1:
                                System.out.println("Resultado: " + calcularSoma(num1, num2));
                                break;
                            case 2:
                                System.out.println("Resultado: " + calcularSubtracao(num1, num2));
                                break;
                            case 3:
                                System.out.println("Resultado: " + calcularMultiplicacao(num1, num2));
                                break;
                            case 4:
                                System.out.println("Resultado: " + calcularDivisao(num1, num2));
                                break;
                            default:
                                System.out.println("Opção inválida.");
                        }
                    } catch (ArithmeticException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número.");
                scanner.next(); // Limpar o buffer
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
