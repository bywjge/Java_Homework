package ChapterThree;

public class Exercise5_7 {
    public static void main(String[] args) {

        int n = 1;
        long sum = 0,t = 1;
        while (true) {
            sum = sum + t;
            if (sum > 9999)
                break;
            n++;
            t = n * t;
        }
        System.out.println("满足条件的最大整数:" + (n-1));


    }
}
