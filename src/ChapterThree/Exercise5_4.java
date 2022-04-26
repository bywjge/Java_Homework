package ChapterThree;

public class Exercise5_4 {
    public static void main(String[] args) {

        double sum=0, a=1, i=1;
        while (i <= 20) {
            sum += a;
            i++;
            a = (1.0/i) * a;
        }
        System.out.println("使用while循环计算的sum = " + sum);

        for (sum=0, i=1, a=1; i<=20; i++) {
            a *= (1.0/i);
            sum = sum + a;
        }
        System.out.println("使用for循环计算的sum = " + sum);

    }
}
