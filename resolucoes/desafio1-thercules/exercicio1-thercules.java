public class Poligono {
    private double atribSide;
    private int atribNumberOfSide;
    private double atribApothem;

    public Poligono(double paramSide, int paramNumberOfSide, double paramApothem) {
        this.atribSide = paramSide;
        this.atribNumberOfSide = paramNumberOfSide;
        this.atribApothem = paramApothem;
    }

    public double calculatePerimeter() {
        double perimeter = this.atribSide * this.atribNumberOfSide;
        return perimeter;
    }

    public double calculateArea() {
        double area = (this.calculatePerimeter() * this.atribApothem) / 2;
        return area;
    }

    public static void main(String[] args) {
        Poligono triangulo = new Poligono(5, 3, 5);
        Poligono quadrado = new Poligono(4, 4, 2);
        
        System.out.println("Área do quadrado: " + quadrado.calculateArea());
    }
}
