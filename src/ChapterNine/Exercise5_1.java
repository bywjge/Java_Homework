package ChapterNine;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise5_1 {
    public static void main(String[] args) {
        String cost = "数学87分，物理76分，英语96分";
        Scanner scanner = new Scanner(cost);
        scanner.useDelimiter("[^0123456789.]+");
        double sum=0;
        int count =0;
        while(scanner.hasNext()){
            try {
                double score = scanner.nextDouble();
                count++;
                sum = sum+score;
                System.out.println(score);
            }
            catch(InputMismatchException exp){
                String t = scanner.next();
            }
        }
        System.out.println("总分:"+sum+"分");
        System.out.println("平均分:"+sum/count+"分");
    }
}
