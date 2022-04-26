package ChapterThree;
public class Exercise5_1 {
    public static void main(String[] args) {

//        char cStart = 'а', cEnd = (char)1103;
        char cStart = 'а', cEnd = 'я';
        System.out.println("俄文字母表:");
        for (int i = cStart; i<= (int)cEnd; i++) {
            char c;
            c = (char)i;
            System.out.print(" " + c);
            if ((i - (int)cStart + 1) % 10 == 0){
                System.out.println();
            }
        }
    }
}
