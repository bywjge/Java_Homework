package ChapterEight.Exercise1;

public class PrintStrategyTwo implements PrintCharacter{
    @Override
    public void printTable(char[] a, char[] b) {
        for (int i = 0; i<a.length; i++) {
            System.out.println(b[i] + "," + a[i] + ",");
        }
    }
}
