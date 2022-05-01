package ThirdAssignment.TaskTwo;


public class Vehicle {

    protected int wheels;
    protected double weight;

    public Vehicle() {
        this.wheels = 4;
        this.weight = 4000;
    }

    public Vehicle(int wheels, double weight) {
        this.wheels = wheels;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", weight=" + weight +
                '}';
    }

}
