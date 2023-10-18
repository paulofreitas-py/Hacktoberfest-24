import java.util.ArrayList;

public class Aluno {
    private String nome;
    private ArrayList<Double> notas = new ArrayList<>();

    public Aluno(String nome) {
        this.nome = nome;
    }

    public void adicionarNota(double nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.size();
    }

    public String obterStatus() {
        double media = calcularMedia();

        if (media >= 7.0) {
            return "Aprovado por média";
        } else if (media >= 5.0) {
            return "Aprovado na final";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getNotas() {
        return notas;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno("João");
        aluno.adicionarNota(6.0);
        aluno.adicionarNota(7.5);
        aluno.adicionarNota(4.0);

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Notas: " + aluno.getNotas());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Status: " + aluno.obterStatus());
    }
}
