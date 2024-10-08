package SistemaAprovacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] notas = new double[4];
        
        for (int i = 0; i < notas.length; i++) {
            while (true) {
                System.out.print("Digite a nota da disciplina " + (i + 1) + " (entre 0 e 10): ");
                if (scanner.hasNextDouble()) {
                    double nota = scanner.nextDouble();
                    if (nota >= 0 && nota <= 10) {
                        notas[i] = nota;
                        break;
                    } else {
                        System.out.println("Nota inválida. Deve estar entre 0 e 10.");
                    }
                } else {
                    System.out.println("Entrada inválida. Por favor, digite um número.");
                    scanner.next(); 
                }
            }
        }

        SistemaAprovacao sistema = new SistemaAprovacao(notas);

        System.out.println("\nNotas: ");
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Disciplina " + (i + 1) + ": " + notas[i]);
        }
        System.out.printf("Média final: %.2f%n", sistema.getMedia());
        System.out.println("Status: " + sistema.getStatus());
        
        scanner.close();
    }
}
