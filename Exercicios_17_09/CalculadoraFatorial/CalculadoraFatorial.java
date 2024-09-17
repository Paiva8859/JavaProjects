package CalculadoraFatorial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraFatorial {

    // Método recursivo para calcular o fatorial
    public static long calcularFatorial(int n) throws ValorInvalidoException {
        if (n < 0) {
            throw new ValorInvalidoException("Número negativo não é permitido.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1);
    }

    // Método para obter a entrada do usuário e calcular o fatorial
    public static void executar() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        
        while (true) {
            System.out.print("Digite um número inteiro positivo para calcular o fatorial: ");
            
            try {
                numero = scanner.nextInt();
                long resultado = calcularFatorial(numero);
                System.out.println("O fatorial de " + numero + " é: " + resultado);
                break; // Saímos do loop após uma entrada válida
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, insira um número inteiro.");
                scanner.next(); // Limpar o buffer
            } catch (ValorInvalidoException e) {
                System.out.println("Erro: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
