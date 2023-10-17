public class Aluno {
    private String nome;
    private String sobrenome;
    private int idade;
    private String dataNascimento;
    private String corCabelo;
    private String numeroMatricula;

    public Aluno(String nome, String sobrenome, int idade, String dataNascimento, String corCabelo, String numeroMatricula) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
        this.corCabelo = corCabelo;
        this.numeroMatricula = numeroMatricula;
    }

    public void imprimirFichaAluno() {
        System.out.println("Ficha do Aluno");
        System.out.println("Nome: " + nome);
        System.out.println("Sobrenome: " + sobrenome);
        System.out.println("Idade: " + idade);
        System.out.println("Data de Nascimento: " + dataNascimento);
        System.out.println("Cor do Cabelo: " + corCabelo);
        System.out.println("Número de Matrícula: " + numeroMatricula);
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("João", "Silva", 16, "01/01/2007", "Castanho", "12345");
        aluno1.imprimirFichaAluno();
    }
}
