package ChapterThree;

import java.util.Scanner;

public class Exercise5_6 {
    public static void main(String[] args) {

        // 求两个非零正整数的最大公约数和最小公倍数
        System.out.println("请输入两个非零正整数, 每输入一个数字回车确认");
        Scanner scanner = new Scanner(System.in);
        int m, n, temp, gy, gb, a, b;
        a = m = scanner.nextInt();
        b = n = scanner.nextInt();
        if (m<n) {
            temp = m;
            m = n;
            n = temp;
        }
        int r = m % n;
        while (r != 0) {
            n = m;
            m = r;
            r = m % n;
        }

        gy = n;
        gb = a * b / gy;
        System.out.println("最大公约数:" + gy);
        System.out.println("最小公倍数:" + gb);

    }
}
