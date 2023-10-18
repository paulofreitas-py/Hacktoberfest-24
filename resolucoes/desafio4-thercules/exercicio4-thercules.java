import java.util.Scanner;

public class SecuritySystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = "!@#123";
        int verificationCode = 9898;
        int attempts = 3;

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Digite a senha: ");
            String userPassword = scanner.nextLine();
            System.out.print("Digite o código de verificação: ");
            int userVerificationCode = scanner.nextInt();
            scanner.nextLine();  // Limpar a entrada

            if (userPassword.equals(password) && userVerificationCode == verificationCode) {
                System.out.println("Seus dados foram verificados.");
                break;
            } else if (i == attempts) {
                System.out.println("Sua conta foi bloqueada.");
            } else {
                System.out.println("Tentativa " + i + " de " + attempts + " falhou. Tente novamente.");
            }
        }
    }
}
