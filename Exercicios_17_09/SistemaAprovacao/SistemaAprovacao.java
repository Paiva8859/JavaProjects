package SistemaAprovacao;

public class SistemaAprovacao {
    private double[] notas;
    private double media;

    public SistemaAprovacao(double[] notas) {
        this.notas = notas;
        calcularMedia();
        aplicarBonus();
    }

    private void calcularMedia() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        media = soma / notas.length;
    }

    private void aplicarBonus() {
        boolean todasNotasAcimaDeNove = true;
        for (double nota : notas) {
            if (nota <= 9) {
                todasNotasAcimaDeNove = false;
                break;
            }
        }
        if (todasNotasAcimaDeNove) {
            media *= 1.10; // Aplica o bônus de 10%
        }
    }

    public String getStatus() {
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 5) {
            return "Recuperação";
        } else {
            return "Reprovado";
        }
    }

    public double getMedia() {
        return media;
    }

    public double[] getNotas() {
        return notas;
    }
}