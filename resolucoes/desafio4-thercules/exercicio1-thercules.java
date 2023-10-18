import java.util.HashMap;

public class Game {
    private HashMap<Character, Integer> scores;

    public Game() {
        scores = new HashMap<>();
        scores.put('a', 1);
        scores.put('c', 3);
        scores.put('b', 3);
        scores.put('e', 1);
        scores.put('d', 2);
        scores.put('g', 2);
        scores.put('f', 4);
        scores.put('i', 1);
        scores.put('h', 4);
        scores.put('k', 5);
        scores.put('j', 8);
        scores.put('m', 3);
        scores.put('l', 1);
        scores.put('o', 1);
        scores.put('n', 1);
        scores.put('q', 10);
        scores.put('p', 3);
        scores.put('s', 1);
        scores.put('r', 1);
        scores.put('u', 1);
        scores.put('t', 1);
        scores.put('w', 4);
        scores.put('v', 4);
        scores.put('y', 4);
        scores.put('x', 8);
        scores.put('z', 10);
    }

    public int getScore(String word) {
        int score = 0;
        word = word.toLowerCase();

        for (char letter : word.toCharArray()) {
            if (scores.containsKey(letter)) {
                score += scores.get(letter);
            }
        }

        return score;
    }

    public static void main(String[] args) {
        Game game = new Game();
        int score = game.getScore("Hello");
        System.out.println("Pontuação da palavra: " + score);
    }
}
