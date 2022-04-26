package ChapterThree;

public class Exercise5_2 {
    public static void main(String[] args) {

        long sum = 0, a = 1;
        long i = 1;
        while (i <= 20) {
            sum += a;
            i++;
            a *= i;
        }
        System.out.println("sum = " + sum);
    }
}
