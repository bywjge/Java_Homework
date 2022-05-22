package ChapterTen.Exercise5_1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Computer {
    double sum;
    double aver;
    public void setComputer(String input) {
        Pattern pattern;          //模式对象
        Matcher matcher;         //匹配对象
        String regex="-?[0-9][0-9]*[.]?[0-9]*" ;//匹配数字的正则表达式
        pattern = Pattern.compile(regex);  //初始化模式对象
        matcher = pattern.matcher(input);  //初始化匹配对象,用于检索input
        sum = 0;
        aver = 0;
        int count = 0;
        while(matcher.find()) {
            String str = matcher.group();
            count ++;
            sum += Double.parseDouble(str);
        }
        aver = sum/count;
    }
    public double getSum(){
        return sum;
    }
    public double getAver(){
        return aver;
    }
}
