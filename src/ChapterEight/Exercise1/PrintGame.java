package ChapterEight.Exercise1;

public class PrintGame {
    PrintCharacter strategy;
    public void setStrategy(PrintCharacter strategy) {
        this.strategy = strategy;
    }
    public void getPersonScore(char[] a, char[] b) {
        if (strategy == null)
            System.out.println("sorry!");
        else
            strategy.printTable(a, b);
    }
}
