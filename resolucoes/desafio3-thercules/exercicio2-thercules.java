public class WeatherMachine {
    public void getWeather(double temperatureFahrenheit) {
        double temperatureCelsius = (temperatureFahrenheit - 32) * 5/9;
        
        if (temperatureCelsius >= 18.33) {
            System.out.println("O clima é ideal para sair sem casaco.");
        } else {
            System.out.println("Fique em casa, está frio lá fora.");
        }
    }

    public static void main(String[] args) {
        WeatherMachine weatherMachine = new WeatherMachine();
        weatherMachine.getWeather(23);
    }
}
