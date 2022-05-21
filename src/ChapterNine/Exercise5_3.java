package ChapterNine;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise5_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入开始年的年份，月份和日期（空格分隔）:");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate dateStart = LocalDate.of(year,month,day);
        System.out.print("输入结束年的年份，月份和日期（空格分隔）:");
        year = scanner.nextInt();
        month = scanner.nextInt();
        day = scanner.nextInt();
        LocalDate dateEnd = LocalDate.of(year,month,day);
        long days = dateStart.until(dateEnd, ChronoUnit.DAYS);
        System.out.println(dateStart+"和"+dateEnd+"相隔：" + days+"天(不足一天的零头按0计算)");
    }
}
