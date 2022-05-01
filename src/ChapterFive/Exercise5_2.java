package ChapterFive;

public class Exercise5_2 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("最大公约数：" + a.f(36,26));
        a = new B();
        System.out.println("最小公倍数：" + a.f(36,26));
    }
}
class A {
    public int f(int a, int b) {
        if (b<a) {
            int temp;
            temp = a;
            a = b;
            b = temp;
        }
        int r = b % a;
        while (r != 0) {
            b = a;
            a = r;
            r = b % a;
        }
        return a;
    }
}
class B extends A {
    public int f(int a, int b) {
        int division = super.f(a, b);
        return (a * b)/division;
    }
}

