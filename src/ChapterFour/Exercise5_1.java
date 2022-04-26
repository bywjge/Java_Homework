package ChapterFour;

class AAA {
    static int m;
    static {
        m = 888;
    }
}

public class Exercise5_1 {
    public static void main(String[] args) {

        AAA a = null;
        System.out.printf("%d:%d", AAA.m, a.m);
    }
}
