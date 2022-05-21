package ChapterNine;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

class GiveCalendar {
    public LocalDate[] getCalendar(LocalDate date) {
        date = date.withDayOfMonth(1);   //确保data日期的day是1，即day的值是1
        int days = date.lengthOfMonth(); //得到该月有几天
        LocalDate[] dataArrays = new LocalDate[days];
        for(int i = 0;i<days;i++){
            dataArrays[i] = date.plusDays(i);
        }
        return dataArrays;
    }
}

public class Exercise5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入年:");
        int year = scanner.nextInt();
        System.out.print("输入月:");
        int month = scanner.nextInt();
        LocalDate date = LocalDate.of(year, month, 1);
        GiveCalendar giveCalendar = new GiveCalendar();
        LocalDate[] dataArrays = giveCalendar.getCalendar(date);
        printNameHead(date); //输出日历的头
        for (int i = 0; i < dataArrays.length; i++) {
            if (i == 0) {
                printSpace(dataArrays[i].getDayOfWeek());
                System.out.printf("%4d", dataArrays[i].getDayOfMonth());
            } else {
                System.out.printf("%4d", dataArrays[i].getDayOfMonth());
            }
            if (dataArrays[i].getDayOfWeek() == DayOfWeek.SATURDAY)
                System.out.println(); //日历样式中的星期回行
        }
    }

    public static void printSpace(DayOfWeek x) { //输出空格
        switch(x) {
            case SUNDAY:printSpace(0);
                break;
            case MONDAY:printSpace(1);
                break;
            case TUESDAY:printSpace(2);
                break;
            case WEDNESDAY:printSpace(3);
                break;
            case THURSDAY: printSpace(4);
                break;
            case FRIDAY:   printSpace(5);
                break;
            case SATURDAY: printSpace(6);
                break;
        }
    }
    public static void printSpace(int n){
        for(int i = 0;i< n;i++)
            System.out.printf("%4s","");//输出4个空格
    }
    public static void printNameHead(LocalDate date){  //输出日历的头
        System.out.println(date.getYear()+"年"+date.getMonthValue()+"月日历:");
        String[] name = {"日","一","二","三","四","五","六"};
        for (String s : name) System.out.printf("%3s", s);
        System.out.println();
    }

}
