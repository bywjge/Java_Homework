package ThirdAssignment.TaskTwo;

public class Test {
    public static void main(String[] args) {
        Truck truck = new Truck(8, 5000, 2, 400);
        System.out.println(truck);
        Car car = new Car(4, 200, 5);
        System.out.println(car);
        Vehicle vehicle = new Vehicle(2,300);
        System.out.println(vehicle);
    }
}
