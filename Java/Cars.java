class Vehicle
{
	public void start()
	{
		System.out.println("Vehicle started");
	}
}

class Car extends Vehicle
{
	public void drive()
	{
		System.out.println("Car driving");
	}
}

class SportsCar extends Car
{
	public void drive()
	{
		System.out.println("Sports Car driving fast");
	}
}

public class Cars
{
	public static void main(String[] args)
	{
		Vehicle v = new Vehicle();
		v.start();
		
		Car c = new Car();
		c.start();
		c.drive();
		
		SportsCar s = new SportsCar();
		s.start();
		s.drive();
	}
}