package ChapterSix;
import java.util.*;

public class Exercise5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int m = 0;
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            assert (x<=100 && x>=0):"输入的成绩非法";
            m++;
            sum += x;
        }
        System.out.printf("%d个数的和为%f\n",m,sum);
    }
}
