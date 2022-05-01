package ThirdAssignment.TaskTwo;

public class Car extends Vehicle{

    protected int loader;

    public Car() {
        super();
        this.loader = 5;
    }

    public Car(int wheels, double weight, int loader) {
        super(wheels, weight);
        this.loader = loader;
    }

    @Override
    public String toString() {
        return "Car{" +
                "loader=" + loader +
                ", wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}
