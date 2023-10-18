import java.util.ArrayList;

public class BankAccounts {
    public static void main(String[] args) {
        ArrayList<Double> accounts = new ArrayList<>();
        accounts.add(0.12);
        accounts.add(0.90);
        accounts.add(0.89);
        accounts.add(0.076);
        accounts.add(-0.0087);
        accounts.add(0.78);
        accounts.add(0.65);

        ArrayList<Double> percentageAccounts = new ArrayList<>();
        for (double balance : accounts) {
            double percentage = balance * 100;
            percentageAccounts.add(percentage);
        }

        System.out.println(percentageAccounts);
    }
}
