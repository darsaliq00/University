abstract class Car{
    public void acc(){
        System.out.println("Moving Forward");
    }
    public void brake(){
        System.out.println("Applying Brake");
    }
    public abstract void fuel();
}
class BMW extends Car{
    public void fuel(){
        System.out.println("Filling the Petrol");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
        BMW b = new BMW();
        b.acc();
        b.brake();
        b.fuel();
    }
}
