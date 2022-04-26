package ChapterFive.Exercise5_1;

public class A {

    public final void f() {
        char cStart = 'a', cEnd = 'z';
        for (char c = cStart; c<=cEnd; c++) {
            System.out.print(" " + c);
        }
    }
}

class B extends A {
    public void g() {
        char cStart = 'α', cEnd = 'ω';
        for (char c = cStart; c<=cEnd; c++) {
            System.out.print(" " + c);
        }
    }
}