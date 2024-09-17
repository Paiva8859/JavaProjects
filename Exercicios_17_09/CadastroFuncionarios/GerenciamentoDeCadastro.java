package CadastroFuncionarios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GerenciamentoDeCadastro {

    private List<Funcionario> funcionarios;

    // Construtor
    public GerenciamentoDeCadastro() {
        this.funcionarios = new ArrayList<>();
    }

    // Adiciona um novo funcionário
    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    // Remove um funcionário pelo nome
    public void removerFuncionario(String nome) {
        Iterator<Funcionario> iterator = funcionarios.iterator();
        boolean encontrado = false;

        while (iterator.hasNext()) {
            Funcionario funcionario = iterator.next();
            if (funcionario.nome.equals(nome)) {
                iterator.remove();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Funcionário não encontrado.");
        }
    }

    // Lista todos os funcionários
    public void listarFuncionarios() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            System.out.println("Funcionários cadastrados:");
            for (Funcionario funcionario : funcionarios) {
                System.out.println(funcionario);
            }
        }
    }

    // Calcula e exibe a média salarial
    public void calcularMediaSalarial() {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado para calcular a média salarial.");
        } else {
            double totalSalario = 0;
            for (Funcionario funcionario : funcionarios) {
                totalSalario += funcionario.salario;
            }
            double mediaSalarial = totalSalario / funcionarios.size();
            System.out.println("Média salarial dos funcionários: " + mediaSalarial);
        }
    }
}