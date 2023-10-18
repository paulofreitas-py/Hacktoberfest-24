public class StringCheck {
    public static void main(String[] args) {
        String s = "yEs";
        String target = "YES";

        if (s.equalsIgnoreCase(target)) {
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }
    }
}
