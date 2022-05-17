package ChapterEight.Exercise1;

public class PrintStrategyOne implements PrintCharacter{
    @Override
    public void printTable(char[] a, char[] b) {
        for (char c : a) {
            System.out.println(c + ",");
        }
        for (char c : b) {
            System.out.println(c + ",");
        }
        System.out.println();
    }
}
