package ThirdAssignment.TaskFour;

public class Person implements Human{

    @Override
    public void breathe() {
        System.out.println("人会呼吸");
    }

    @Override
    public void eat() {
        System.out.println("人会吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("人会睡觉");
    }

    @Override
    public void think() {
        System.out.println("人会思考");
    }

    @Override
    public void learn() {
        System.out.println("人会学习");
    }

}
