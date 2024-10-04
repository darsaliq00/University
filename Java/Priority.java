class A extends Thread
{
	public A ()
	{
		super("myFirstThread");
	}
	public void run()
	{
		System.out.println("Thread Name: " + getName());
		System.out.println("Thread Priority: " + getPriority());
		
		//
	}
}
class B extends Thread
{
	public B ()
	{
		super("mySecondThread");
	}
	public void run()
	{
		System.out.println("Thread Name: " + getName());
		System.out.println("Thread Priority: " + getPriority());
		
		//
	}
}
public class Priority
{
	public static void main(String[] args)
	{
		A t1 = new A();
		B t2 = new B();
		//custom Priority
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(3);
		
		t1.start();
		t2.start();
	}
}