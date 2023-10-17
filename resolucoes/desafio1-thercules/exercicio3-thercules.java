public class Passaro {
    private String nome;
    private String cor;
    private String habitat;

    public Passaro(String nome, String cor, String habitat) {
        this.nome = nome;
        this.cor = cor;
        this.habitat = habitat;
    }

    public void voar() {
        System.out.println(nome + " está voando.");
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public String getHabitat() {
        return habitat;
    }

    @Override
    public String toString() {
        return "Passaro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", habitat='" + habitat + '\'' +
                '}';
    }
}

public class Pinguim extends Passaro {
    public Pinguim(String nome, String cor) {
        super(nome, cor, "Regiões polares");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " não voa, ele nada!");
    }
}

public class Papagaio extends Passaro {
    public Papagaio(String nome, String cor) {
        super(nome, cor, "Floresta Tropical");
    }
}

public class Calopsita extends Passaro {
    public Calopsita(String nome, String cor) {
        super(nome, cor, "Cativeiro");
    }

    public void cantar() {
        System.out.println(getNome() + " está cantando.");
    }
}

public class Main {
    public static void main(String[] args) {
        Pinguim pinguim = new Pinguim("Pinguim", "Preto e Branco");
        Papagaio papagaio = new Papagaio("Papagaio", "Vermelho");
        Calopsita calopsita = new Calopsita("Calopsita", "Cinza");

        pinguim.voar();
        papagaio.voar();
        calopsita.cantar();

        System.out.println("Informações do Pinguim: " + pinguim);
        System.out.println("Informações do Papagaio: " + papagaio);
        System.out.println("Informações da Calopsita: " + calopsita);
    }
}
