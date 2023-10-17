public class Car {
    private String color;
    private String brand;
    private double price;
    private String model;
    private String country;
    private String type;

    public Car(String color, String brand, double price, String model, String country, String type) {
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.model = model;
        this.country = country;
        this.type = type;
    }

    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    public void desligar() {
        System.out.println("O carro está desligado.");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public void frear() {
        System.out.println("O carro está freando.");
    }

    public void verificarMotor() {
        System.out.println("Verificando o motor do carro.");
    }

    public void verificarFreios() {
        System.out.println("Verificando os freios do carro.");
    }

    public void verificarTransmissao() {
        System.out.println("Verificando a transmissão do carro.");
    }

    public void trocarOleo() {
        System.out.println("Troca de óleo realizada.");
    }

    public void lavarCarro() {
        System.out.println("Lavando o carro.");
    }

    public static void main(String[] args) {
        Car carro = new Car("Azul", "Toyota", 25000.0, "Corolla", "Brasil", "Sedan");

        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.verificarMotor();
        carro.trocarOleo();
        carro.lavarCarro();
        carro.desligar();
    }
}
