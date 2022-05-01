package ThirdAssignment.TaskTwo;

public class Truck extends Car{

    protected double payload;

    public Truck() {
        super();
        this.payload = 1000;
    }

    public Truck(int wheels, double weight, int loader, double payload) {
        super(wheels, weight, loader);
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payload=" + payload +
                ", loader=" + loader +
                ", wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }
}
