public class Car extends Vehicle {

    public void start() {
        System.out.println("Car started");
    }
}
public class Vehicle {
    public void start() {
        System.out.println("Vehicle started");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.start(); 
        Car car = new Car();
        car.start(); 
    }
}
