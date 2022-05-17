package ChapterEight.Exercise1;

public class Application {
    public static void main(String[] args) {
        char[] a = new char[26];
        char[] b = new char[26];
        for (int i = 0; i<=25; i++) {
            a[i] = (char) ('a' + i);
        }

        for (int i = 0; i<=25; i++) {
            b[i] = (char) ('A' + i);
        }
        PrintGame game = new PrintGame();
        game.setStrategy(new PrintStrategyOne());

        System.out.println("方案1：");
        game.getPersonScore(a, b);

        game.setStrategy(new PrintStrategyTwo());
        System.out.println("方案2：");
        game.getPersonScore(a, b);
    }
}
