public class Pato {
    private String nome;
    private String cor;
    private double preco;
    private int quantidadeEmEstoque;
    private String material;
    private String som;

    public Pato(String nome, String cor, double preco, int quantidadeEmEstoque, String material, String som) {
        this.nome = nome;
        this.cor = cor;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
        this.material = material;
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public String getCor() {
        return cor;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public String getMaterial() {
        return material;
    }

    public String getSom() {
        return som;
    }

    public void vender(int quantidade) {
        if (quantidade <= quantidadeEmEstoque) {
            quantidadeEmEstoque -= quantidade;
            System.out.println(quantidade + " patos " + nome + " vendidos.");
        } else {
            System.out.println("Não há estoque suficiente de patos " + nome + " para vender " + quantidade + " unidades.");
        }
    }

    public void adicionarAoEstoque(int quantidade) {
        quantidadeEmEstoque += quantidade;
        System.out.println(quantidade + " patos " + nome + " adicionados ao estoque.");
    }

    public void fazerSom() {
        System.out.println(nome + " faz o som: " + som);
    }

    @Override
    public String toString() {
        return "Pato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", preco=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                ", material='" + material + '\'' +
                ", som='" + som + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Pato patoAmarelo = new Pato("Pato Amarelo", "Amarelo", 9.99, 100, "Borracha", "Quack Quack");

        System.out.println("Informações do Pato: " + patoAmarelo);
        patoAmarelo.vender(5);
        System.out.println("Informações do Pato após a venda: " + patoAmarelo);
        patoAmarelo.adicionarAoEstoque(20);
        System.out.println("Informações do Pato após a reposição de estoque: " + patoAmarelo);
        patoAmarelo.fazerSom();
    }
}
