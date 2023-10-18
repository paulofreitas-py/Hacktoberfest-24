import java.util.Scanner;

public class PedraPapelTesoura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Jogador 1: ");
        String player1 = scanner.nextLine();
        System.out.print("Jogador 2: ");
        String player2 = scanner.nextLine();
        
        if (player1.equals(player2)) {
            System.out.println("Empate!");
        } else if ((player1.equals("pedra") && (player2.equals("tesoura") || player2.equals("lagarto"))) ||
                   (player1.equals("papel") && (player2.equals("pedra") || player2.equals("Spock"))) ||
                   (player1.equals("tesoura") && (player2.equals("papel") || player2.equals("lagarto"))) ||
                   (player1.equals("lagarto") && (player2.equals("Spock") || player2.equals("papel"))) ||
                   (player1.equals("Spock") && (player2.equals("tesoura") || player2.equals("pedra"))) ) {
            System.out.println("Jogador 1 venceu!");
        } else {
            System.out.println("Jogador 2 venceu!");
        }
    }
}
